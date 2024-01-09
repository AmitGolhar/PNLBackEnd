package com.punenightlife.services;

import com.punenightlife.models.Role;

public interface RoleService {
    Role findByName(String name);
}
