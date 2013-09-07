package cn.itcast.oa.view.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.itcast.oa.domain.Role;
import cn.itcast.oa.service.RoleService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

@Controller
@Scope("prototype")
public class RoleAction extends ActionSupport {

	@Resource
	private RoleService roleService;

	private Long id;
	private String name;
	private String description;

	/** 列表 */
	public String list() {
		List<Role> list = roleService.findAll();
		ActionContext.getContext().put("list", list);
		return "list";
	}

	/** 删除 */
	public String delete() {
		roleService.delete(id);
		return "toList";
	}

	/** 添加页面 */
	public String addUI() {
		return "saveUI";
	}

	/** 添加 */
	public String add() {
		// 1，创建新对象并设置属性
		Role role = new Role();
		role.setName(name);
		role.setDescription(description);

		// 2，保存
		roleService.save(role);

		return "toList";
	}

	/** 修改页面 */
	public String editUI() {
		// 准备回显的数据
		Role role = roleService.getById(id);
		ActionContext.getContext().getValueStack().push(role);
		return "saveUI";
	}

	/** 修改 */
	public String edit() {
		// 1，从数据库获取原对象
		Role role = roleService.getById(id);

		// 2，设置要修改的属性
		role.setName(name);
		role.setDescription(description);

		// 3，更新到数据库
		roleService.update(role);

		return "toList";
	}

	// --------------------

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
