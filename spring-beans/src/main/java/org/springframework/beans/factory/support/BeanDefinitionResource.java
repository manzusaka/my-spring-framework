/*
 * Copyright 2002-2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.beans.factory.support;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.core.io.AbstractResource;
import org.springframework.util.Assert;

/**
 * Descriptive {@link org.springframework.core.io.Resource} wrapper for
 * a {@link org.springframework.beans.factory.config.BeanDefinition}.
 * Bean定义的源
 *
 * @author Juergen Hoeller
 * @since 2.5.2
 * @see org.springframework.core.io.DescriptiveResource
 */
class BeanDefinitionResource extends AbstractResource {

	private final BeanDefinition beanDefinition;


	/**
	 * Create a new BeanDefinitionResource.
	 * @param beanDefinition the BeanDefinition objectto wrap
	 * 构造
	 */
	public BeanDefinitionResource(BeanDefinition beanDefinition) {
		Assert.notNull(beanDefinition, "BeanDefinition must not be null");
		this.beanDefinition = beanDefinition;
	}

	/**
	 * Return the wrapped BeanDefinition object.
	 * 返回BeanDefinition对象包装类
	 * 
	 */
	public final BeanDefinition getBeanDefinition() {
		return this.beanDefinition;
	}

	/**
	 * 是否存在--默认false(估计是给File属性用的)
	 */
	@Override
	public boolean exists() {
		return false;
	}
	/**
	 * 是否可读，估计也是给File用的
	 * 
	 */
	@Override
	public boolean isReadable() {
		return false;
	}
	/**
	 * 获取输入流，也是给资源用的 这里直接返回未找到文件的异常
	 */
	@Override
	public InputStream getInputStream() throws IOException {
		throw new FileNotFoundException(
				"Resource cannot be opened because it points to " + getDescription());
	}
	/**
	 * beanDefinition.getResourceDescription
	 */
	@Override
	public String getDescription() {
		return "BeanDefinition defined in " + this.beanDefinition.getResourceDescription();
	}


	/**
	 * This implementation compares the underlying BeanDefinition.
	 * 两个BeanDefinition的比较实现，比较两个BeanDefinition是否是同一个对象
	 */
	@Override
	public boolean equals(Object obj) {
		return (obj == this ||
			(obj instanceof BeanDefinitionResource &&
						((BeanDefinitionResource) obj).beanDefinition.equals(this.beanDefinition)));
	}

	/**
	 * This implementation returns the hash code of the underlying BeanDefinition.
	 */
	@Override
	public int hashCode() {
		return this.beanDefinition.hashCode();
	}

}
