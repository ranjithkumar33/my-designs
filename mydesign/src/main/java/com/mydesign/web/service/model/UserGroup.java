package com.mydesign.web.service.model;

public enum UserGroup{
	
	SUPER_ADMIN("Super-admin", new Permission[] {Permission.SuperAdmin, Permission.Administrator, Permission.Editor, Permission.Author, Permission.Reader}),
	VENDOR_ADMIN("Vendor-admin", new Permission[] {Permission.Administrator, Permission.Editor, Permission.Author, Permission.Reader}),
	GENERAL_USER("general-user", new Permission[] {Permission.Author, Permission.Reader});
	
	private Permission[] permissions;
	
	private String roleName;
	
	UserGroup(String name, Permission... permission){
		this.roleName=name;
		this.permissions = permission;
	}

	public Permission[] getPermissions() {
		return permissions;
	}

	public String getRoleName() {
		return roleName;
	}
	
}
