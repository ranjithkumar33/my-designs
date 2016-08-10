package com.mydesign.web.service.model;

public enum UserGroup{
	
	SUPER_ADMIN("Super-admin", new EPermission[] {EPermission.SuperAdmin, EPermission.Administrator, EPermission.Editor, EPermission.Author, EPermission.Reader}),
	VENDOR_ADMIN("Vendor-admin", new EPermission[] {EPermission.Administrator, EPermission.Editor, EPermission.Author, EPermission.Reader}),
	GENERAL_USER("general-user", new EPermission[] {EPermission.Author, EPermission.Reader});
	
	private EPermission[] permissions;
	
	private String roleName;
	
	UserGroup(String name, EPermission... permission){
		this.roleName=name;
		this.permissions = permission;
	}

	public EPermission[] getPermissions() {
		return permissions;
	}

	public String getRoleName() {
		return roleName;
	}
	
}
