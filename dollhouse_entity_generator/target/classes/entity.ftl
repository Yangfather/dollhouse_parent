package ${entity.packageName};

<#list entity.importList as import>
import ${import};
</#list>
 
/**
 * This code is generated by FreeMarker
 */
 @Table(name="${entity.tableName}"<#if entity.mapper?has_content>, mapper="${entity.mapper}"</#if>)
public class ${entity.className}<#if entity.superclass?has_content> extends ${entity.superclass}</#if> {
    private static final long serialVersionUID = 1L;
<#list entity.properties as property>
    
    @Column(name="${property.columnName}")
    private ${property.propertyType} ${property.propertyName};
</#list>
<#list entity.extraProperties as property>
    
    private ${property.propertyType} ${property.propertyName};
</#list>
<#list entity.properties as property>

    public ${property.propertyType} get${property.propertyName?cap_first}() {
        return ${property.propertyName};
    }
 
    public void set${property.propertyName?cap_first}(${property.propertyType} ${property.propertyName}) {
        this.${property.propertyName} = ${property.propertyName};
    }
</#list>
<#list entity.extraProperties as property>

    public ${property.propertyType} get${property.propertyName?cap_first}() {
        return ${property.propertyName};
    }
 
    public void set${property.propertyName?cap_first}(${property.propertyType} ${property.propertyName}) {
        this.${property.propertyName} = ${property.propertyName};
    }
</#list>
}