package com.geeky.springmvc.domain;

import java.io.Serializable;

public interface DomainObject extends Serializable {
	String getKey();
	String getObjectKey();
}
