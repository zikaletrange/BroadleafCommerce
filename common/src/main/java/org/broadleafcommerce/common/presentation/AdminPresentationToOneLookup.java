package org.broadleafcommerce.common.presentation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Jeff Fischer
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
public @interface AdminPresentationToOneLookup {

    /**
     * <p>Optional - only required if the display property is other than "name"</p>
     *
     * <p>Specify the property on a lookup class that should be used as the value to display to the user in
     * a form in the admin tool UI</p>
     *
     * @return the property on the lookup class containing the displayable value
     */
    String lookupDisplayProperty() default "name";

    /**
     * <p>Optional - only required if the parent datasource from the admin tool used to bind this lookup
     * is other than the default top-level datasource. Can only be used in conjunction with SupportedFieldType.ADDITIONAL_FOREIGN_KEY.</p>
     *
     * <p>Specify an alternate datasource to bind the lookup to. This is an advanced setting.</p>
     *
     * @return alternate datasource for lookup binding
     */
    String lookupParentDataSourceName() default "";

    /**
     * <p>Optional - only required if the dynamic form used to display the lookup in the admin tool is other
     * than the default top-level form. Can only be used in conjunction with SupportedFieldType.ADDITIONAL_FOREIGN_KEY.</p>
     *
     * <p>Specify an alternate DynamicFormDisplay instance in which to show the lookup form item. This is an advanced setting.</p>
     *
     * @return alternate DynamicFormDisplay for lookup display
     */
    String targetDynamicFormDisplayId() default "";

}