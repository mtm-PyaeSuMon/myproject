package com.scm.test.bl.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.scm.test.bl.dto.StudentDto;


@Service("myUserDetailsService")
public class MyUserDetailsService implements UserDetailsService{
	
	@Autowired
	private StudentService studentService;
	
	@Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        StudentDto studentDto = studentService.findByEmail(email);

        if (studentDto == null) {
            throw new UsernameNotFoundException("Student not found");
        }

        System.out.println("---student found----");
        System.out.println("---student found----" + studentDto.getEmail());
        System.out.println("---student found----" + studentDto.getPassword());
        System.out.println("---student found----" + studentDto.getType());

        UserDetails user = new User(studentDto.getEmail(), studentDto.getPassword(), authorities(studentDto.getType()));
        return user;
    }

    private List<GrantedAuthority> authorities(String i) {
        List<GrantedAuthority> setAuths = new ArrayList<GrantedAuthority>();

        if (Integer.parseInt(i) == 0) {
            setAuths.add(new SimpleGrantedAuthority("ROLE_USER"));
        } else if (Integer.parseInt(i) == 1) {
            setAuths.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
        }

        return setAuths;
    }

}
