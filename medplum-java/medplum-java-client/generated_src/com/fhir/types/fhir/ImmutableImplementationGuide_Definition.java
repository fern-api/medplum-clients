package com.fhir.types.fhir;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link ImplementationGuide_Definition}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableImplementationGuide_Definition.builder()}.
 */
@Generated(from = "ImplementationGuide_Definition", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableImplementationGuide_Definition
    implements ImplementationGuide_Definition {
  private final @Nullable List<ImplementationGuide_Grouping> grouping;
  private final List<ImplementationGuide_Resource> resource;
  private final @Nullable String id;
  private final @Nullable ImplementationGuide_Page page;
  private final @Nullable List<ImplementationGuide_Template> template;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<ImplementationGuide_Parameter> parameter;

  private ImmutableImplementationGuide_Definition(
      @Nullable List<ImplementationGuide_Grouping> grouping,
      List<ImplementationGuide_Resource> resource,
      @Nullable String id,
      @Nullable ImplementationGuide_Page page,
      @Nullable List<ImplementationGuide_Template> template,
      @Nullable List<Extension> modifierExtension,
      @Nullable List<Extension> extension,
      @Nullable List<ImplementationGuide_Parameter> parameter) {
    this.grouping = grouping;
    this.resource = resource;
    this.id = id;
    this.page = page;
    this.template = template;
    this.modifierExtension = modifierExtension;
    this.extension = extension;
    this.parameter = parameter;
  }

  /**
   * @return The value of the {@code grouping} attribute
   */
  @JsonProperty("grouping")
  @Override
  public Optional<List<ImplementationGuide_Grouping>> grouping() {
    return Optional.ofNullable(grouping);
  }

  /**
   * @return The value of the {@code resource} attribute
   */
  @JsonProperty("resource")
  @Override
  public List<ImplementationGuide_Resource> resource() {
    return resource;
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<String> id() {
    return Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code page} attribute
   */
  @JsonProperty("page")
  @Override
  public Optional<ImplementationGuide_Page> page() {
    return Optional.ofNullable(page);
  }

  /**
   * @return The value of the {@code template} attribute
   */
  @JsonProperty("template")
  @Override
  public Optional<List<ImplementationGuide_Template>> template() {
    return Optional.ofNullable(template);
  }

  /**
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code parameter} attribute
   */
  @JsonProperty("parameter")
  @Override
  public Optional<List<ImplementationGuide_Parameter>> parameter() {
    return Optional.ofNullable(parameter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide_Definition#grouping() grouping} attribute.
   * @param value The value for grouping
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_Definition withGrouping(List<ImplementationGuide_Grouping> value) {
    @Nullable List<ImplementationGuide_Grouping> newValue = Objects.requireNonNull(value, "grouping");
    if (this.grouping == newValue) return this;
    return new ImmutableImplementationGuide_Definition(
        newValue,
        this.resource,
        this.id,
        this.page,
        this.template,
        this.modifierExtension,
        this.extension,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide_Definition#grouping() grouping} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for grouping
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImplementationGuide_Definition withGrouping(Optional<? extends List<ImplementationGuide_Grouping>> optional) {
    @Nullable List<ImplementationGuide_Grouping> value = optional.orElse(null);
    if (this.grouping == value) return this;
    return new ImmutableImplementationGuide_Definition(
        value,
        this.resource,
        this.id,
        this.page,
        this.template,
        this.modifierExtension,
        this.extension,
        this.parameter);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link ImplementationGuide_Definition#resource() resource}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_Definition withResource(ImplementationGuide_Resource... elements) {
    List<ImplementationGuide_Resource> newValue = createUnmodifiableList(false, createSafeList(Arrays.asList(elements), true, false));
    return new ImmutableImplementationGuide_Definition(
        this.grouping,
        newValue,
        this.id,
        this.page,
        this.template,
        this.modifierExtension,
        this.extension,
        this.parameter);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link ImplementationGuide_Definition#resource() resource}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of resource elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_Definition withResource(Iterable<? extends ImplementationGuide_Resource> elements) {
    if (this.resource == elements) return this;
    List<ImplementationGuide_Resource> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableImplementationGuide_Definition(
        this.grouping,
        newValue,
        this.id,
        this.page,
        this.template,
        this.modifierExtension,
        this.extension,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide_Definition#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_Definition withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableImplementationGuide_Definition(
        this.grouping,
        this.resource,
        newValue,
        this.page,
        this.template,
        this.modifierExtension,
        this.extension,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide_Definition#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_Definition withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableImplementationGuide_Definition(
        this.grouping,
        this.resource,
        value,
        this.page,
        this.template,
        this.modifierExtension,
        this.extension,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide_Definition#page() page} attribute.
   * @param value The value for page
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_Definition withPage(ImplementationGuide_Page value) {
    @Nullable ImplementationGuide_Page newValue = Objects.requireNonNull(value, "page");
    if (this.page == newValue) return this;
    return new ImmutableImplementationGuide_Definition(
        this.grouping,
        this.resource,
        this.id,
        newValue,
        this.template,
        this.modifierExtension,
        this.extension,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide_Definition#page() page} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for page
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImplementationGuide_Definition withPage(Optional<? extends ImplementationGuide_Page> optional) {
    @Nullable ImplementationGuide_Page value = optional.orElse(null);
    if (this.page == value) return this;
    return new ImmutableImplementationGuide_Definition(
        this.grouping,
        this.resource,
        this.id,
        value,
        this.template,
        this.modifierExtension,
        this.extension,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide_Definition#template() template} attribute.
   * @param value The value for template
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_Definition withTemplate(List<ImplementationGuide_Template> value) {
    @Nullable List<ImplementationGuide_Template> newValue = Objects.requireNonNull(value, "template");
    if (this.template == newValue) return this;
    return new ImmutableImplementationGuide_Definition(
        this.grouping,
        this.resource,
        this.id,
        this.page,
        newValue,
        this.modifierExtension,
        this.extension,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide_Definition#template() template} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for template
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImplementationGuide_Definition withTemplate(Optional<? extends List<ImplementationGuide_Template>> optional) {
    @Nullable List<ImplementationGuide_Template> value = optional.orElse(null);
    if (this.template == value) return this;
    return new ImmutableImplementationGuide_Definition(
        this.grouping,
        this.resource,
        this.id,
        this.page,
        value,
        this.modifierExtension,
        this.extension,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide_Definition#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_Definition withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableImplementationGuide_Definition(
        this.grouping,
        this.resource,
        this.id,
        this.page,
        this.template,
        newValue,
        this.extension,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide_Definition#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImplementationGuide_Definition withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableImplementationGuide_Definition(
        this.grouping,
        this.resource,
        this.id,
        this.page,
        this.template,
        value,
        this.extension,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide_Definition#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_Definition withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableImplementationGuide_Definition(
        this.grouping,
        this.resource,
        this.id,
        this.page,
        this.template,
        this.modifierExtension,
        newValue,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide_Definition#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImplementationGuide_Definition withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableImplementationGuide_Definition(
        this.grouping,
        this.resource,
        this.id,
        this.page,
        this.template,
        this.modifierExtension,
        value,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide_Definition#parameter() parameter} attribute.
   * @param value The value for parameter
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_Definition withParameter(List<ImplementationGuide_Parameter> value) {
    @Nullable List<ImplementationGuide_Parameter> newValue = Objects.requireNonNull(value, "parameter");
    if (this.parameter == newValue) return this;
    return new ImmutableImplementationGuide_Definition(
        this.grouping,
        this.resource,
        this.id,
        this.page,
        this.template,
        this.modifierExtension,
        this.extension,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide_Definition#parameter() parameter} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for parameter
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImplementationGuide_Definition withParameter(Optional<? extends List<ImplementationGuide_Parameter>> optional) {
    @Nullable List<ImplementationGuide_Parameter> value = optional.orElse(null);
    if (this.parameter == value) return this;
    return new ImmutableImplementationGuide_Definition(
        this.grouping,
        this.resource,
        this.id,
        this.page,
        this.template,
        this.modifierExtension,
        this.extension,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableImplementationGuide_Definition} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableImplementationGuide_Definition
        && equalTo((ImmutableImplementationGuide_Definition) another);
  }

  private boolean equalTo(ImmutableImplementationGuide_Definition another) {
    return Objects.equals(grouping, another.grouping)
        && resource.equals(another.resource)
        && Objects.equals(id, another.id)
        && Objects.equals(page, another.page)
        && Objects.equals(template, another.template)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(extension, another.extension)
        && Objects.equals(parameter, another.parameter);
  }

  /**
   * Computes a hash code from attributes: {@code grouping}, {@code resource}, {@code id}, {@code page}, {@code template}, {@code modifierExtension}, {@code extension}, {@code parameter}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(grouping);
    h += (h << 5) + resource.hashCode();
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(page);
    h += (h << 5) + Objects.hashCode(template);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(parameter);
    return h;
  }

  /**
   * Prints the immutable value {@code ImplementationGuide_Definition} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("ImplementationGuide_Definition{");
    if (grouping != null) {
      builder.append("grouping=").append(grouping);
    }
    if (builder.length() > 31) builder.append(", ");
    builder.append("resource=").append(resource);
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (page != null) {
      builder.append(", ");
      builder.append("page=").append(page);
    }
    if (template != null) {
      builder.append(", ");
      builder.append("template=").append(template);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (parameter != null) {
      builder.append(", ");
      builder.append("parameter=").append(parameter);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "ImplementationGuide_Definition", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ImplementationGuide_Definition {
    @Nullable Optional<List<ImplementationGuide_Grouping>> grouping = Optional.empty();
    boolean groupingIsSet;
    @Nullable List<ImplementationGuide_Resource> resource = Collections.emptyList();
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<ImplementationGuide_Page> page = Optional.empty();
    boolean pageIsSet;
    @Nullable Optional<List<ImplementationGuide_Template>> template = Optional.empty();
    boolean templateIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<ImplementationGuide_Parameter>> parameter = Optional.empty();
    boolean parameterIsSet;
    @JsonProperty("grouping")
    public void setGrouping(Optional<List<ImplementationGuide_Grouping>> grouping) {
      this.grouping = grouping;
      this.groupingIsSet = true;
    }
    @JsonProperty("resource")
    public void setResource(List<ImplementationGuide_Resource> resource) {
      this.resource = resource;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("page")
    public void setPage(Optional<ImplementationGuide_Page> page) {
      this.page = page;
      this.pageIsSet = true;
    }
    @JsonProperty("template")
    public void setTemplate(Optional<List<ImplementationGuide_Template>> template) {
      this.template = template;
      this.templateIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("parameter")
    public void setParameter(Optional<List<ImplementationGuide_Parameter>> parameter) {
      this.parameter = parameter;
      this.parameterIsSet = true;
    }
    @Override
    public Optional<List<ImplementationGuide_Grouping>> grouping() { throw new UnsupportedOperationException(); }
    @Override
    public List<ImplementationGuide_Resource> resource() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<ImplementationGuide_Page> page() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ImplementationGuide_Template>> template() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ImplementationGuide_Parameter>> parameter() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableImplementationGuide_Definition fromJson(Json json) {
    ImmutableImplementationGuide_Definition.Builder builder = ImmutableImplementationGuide_Definition.builder();
    if (json.groupingIsSet) {
      builder.grouping(json.grouping);
    }
    if (json.resource != null) {
      builder.addAllResource(json.resource);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.pageIsSet) {
      builder.page(json.page);
    }
    if (json.templateIsSet) {
      builder.template(json.template);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.parameterIsSet) {
      builder.parameter(json.parameter);
    }
    return (ImmutableImplementationGuide_Definition) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ImplementationGuide_Definition} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ImplementationGuide_Definition instance
   */
  public static ImplementationGuide_Definition copyOf(ImplementationGuide_Definition instance) {
    if (instance instanceof ImmutableImplementationGuide_Definition) {
      return (ImmutableImplementationGuide_Definition) instance;
    }
    return ImmutableImplementationGuide_Definition.builder()
        .grouping(instance.grouping())
        .addAllResource(instance.resource())
        .id(instance.id())
        .page(instance.page())
        .template(instance.template())
        .modifierExtension(instance.modifierExtension())
        .extension(instance.extension())
        .parameter(instance.parameter())
        .build();
  }

  /**
   * Creates a builder for {@link ImplementationGuide_Definition ImplementationGuide_Definition}.
   * <pre>
   * ImmutableImplementationGuide_Definition.builder()
   *    .grouping(List&amp;lt;com.fhir.types.fhir.ImplementationGuide_Grouping&amp;gt;) // optional {@link ImplementationGuide_Definition#grouping() grouping}
   *    .addResource|addAllResource(com.fhir.types.fhir.ImplementationGuide_Resource) // {@link ImplementationGuide_Definition#resource() resource} elements
   *    .id(String) // optional {@link ImplementationGuide_Definition#id() id}
   *    .page(com.fhir.types.fhir.ImplementationGuide_Page) // optional {@link ImplementationGuide_Definition#page() page}
   *    .template(List&amp;lt;com.fhir.types.fhir.ImplementationGuide_Template&amp;gt;) // optional {@link ImplementationGuide_Definition#template() template}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link ImplementationGuide_Definition#modifierExtension() modifierExtension}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link ImplementationGuide_Definition#extension() extension}
   *    .parameter(List&amp;lt;com.fhir.types.fhir.ImplementationGuide_Parameter&amp;gt;) // optional {@link ImplementationGuide_Definition#parameter() parameter}
   *    .build();
   * </pre>
   * @return A new ImplementationGuide_Definition builder
   */
  public static ImmutableImplementationGuide_Definition.Builder builder() {
    return new ImmutableImplementationGuide_Definition.Builder();
  }

  /**
   * Builds instances of type {@link ImplementationGuide_Definition ImplementationGuide_Definition}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "ImplementationGuide_Definition", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_GROUPING = 0x1L;
    private static final long OPT_BIT_ID = 0x2L;
    private static final long OPT_BIT_PAGE = 0x4L;
    private static final long OPT_BIT_TEMPLATE = 0x8L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x10L;
    private static final long OPT_BIT_EXTENSION = 0x20L;
    private static final long OPT_BIT_PARAMETER = 0x40L;
    private long optBits;

    private @Nullable List<ImplementationGuide_Grouping> grouping;
    private final List<ImplementationGuide_Resource> resource = new ArrayList<ImplementationGuide_Resource>();
    private @Nullable String id;
    private @Nullable ImplementationGuide_Page page;
    private @Nullable List<ImplementationGuide_Template> template;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable List<Extension> extension;
    private @Nullable List<ImplementationGuide_Parameter> parameter;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ImplementationGuide_Definition#grouping() grouping} to grouping.
     * @param grouping The value for grouping
     * @return {@code this} builder for chained invocation
     */
    public final Builder grouping(List<ImplementationGuide_Grouping> grouping) {
      checkNotIsSet(groupingIsSet(), "grouping");
      this.grouping = Objects.requireNonNull(grouping, "grouping");
      optBits |= OPT_BIT_GROUPING;
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide_Definition#grouping() grouping} to grouping.
     * @param grouping The value for grouping
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("grouping")
    public final Builder grouping(Optional<? extends List<ImplementationGuide_Grouping>> grouping) {
      checkNotIsSet(groupingIsSet(), "grouping");
      this.grouping = grouping.orElse(null);
      optBits |= OPT_BIT_GROUPING;
      return this;
    }

    /**
     * Adds one element to {@link ImplementationGuide_Definition#resource() resource} list.
     * @param element A resource element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addResource(ImplementationGuide_Resource element) {
      this.resource.add(Objects.requireNonNull(element, "resource element"));
      return this;
    }

    /**
     * Adds elements to {@link ImplementationGuide_Definition#resource() resource} list.
     * @param elements An array of resource elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addResource(ImplementationGuide_Resource... elements) {
      for (ImplementationGuide_Resource element : elements) {
        this.resource.add(Objects.requireNonNull(element, "resource element"));
      }
      return this;
    }


    /**
     * Adds elements to {@link ImplementationGuide_Definition#resource() resource} list.
     * @param elements An iterable of resource elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllResource(Iterable<? extends ImplementationGuide_Resource> elements) {
      for (ImplementationGuide_Resource element : elements) {
        this.resource.add(Objects.requireNonNull(element, "resource element"));
      }
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide_Definition#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(String id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = Objects.requireNonNull(id, "id");
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide_Definition#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(Optional<String> id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = id.orElse(null);
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide_Definition#page() page} to page.
     * @param page The value for page
     * @return {@code this} builder for chained invocation
     */
    public final Builder page(ImplementationGuide_Page page) {
      checkNotIsSet(pageIsSet(), "page");
      this.page = Objects.requireNonNull(page, "page");
      optBits |= OPT_BIT_PAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide_Definition#page() page} to page.
     * @param page The value for page
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("page")
    public final Builder page(Optional<? extends ImplementationGuide_Page> page) {
      checkNotIsSet(pageIsSet(), "page");
      this.page = page.orElse(null);
      optBits |= OPT_BIT_PAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide_Definition#template() template} to template.
     * @param template The value for template
     * @return {@code this} builder for chained invocation
     */
    public final Builder template(List<ImplementationGuide_Template> template) {
      checkNotIsSet(templateIsSet(), "template");
      this.template = Objects.requireNonNull(template, "template");
      optBits |= OPT_BIT_TEMPLATE;
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide_Definition#template() template} to template.
     * @param template The value for template
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("template")
    public final Builder template(Optional<? extends List<ImplementationGuide_Template>> template) {
      checkNotIsSet(templateIsSet(), "template");
      this.template = template.orElse(null);
      optBits |= OPT_BIT_TEMPLATE;
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide_Definition#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    public final Builder modifierExtension(List<Extension> modifierExtension) {
      checkNotIsSet(modifierExtensionIsSet(), "modifierExtension");
      this.modifierExtension = Objects.requireNonNull(modifierExtension, "modifierExtension");
      optBits |= OPT_BIT_MODIFIER_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide_Definition#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("modifierExtension")
    public final Builder modifierExtension(Optional<? extends List<Extension>> modifierExtension) {
      checkNotIsSet(modifierExtensionIsSet(), "modifierExtension");
      this.modifierExtension = modifierExtension.orElse(null);
      optBits |= OPT_BIT_MODIFIER_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide_Definition#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    public final Builder extension(List<Extension> extension) {
      checkNotIsSet(extensionIsSet(), "extension");
      this.extension = Objects.requireNonNull(extension, "extension");
      optBits |= OPT_BIT_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide_Definition#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("extension")
    public final Builder extension(Optional<? extends List<Extension>> extension) {
      checkNotIsSet(extensionIsSet(), "extension");
      this.extension = extension.orElse(null);
      optBits |= OPT_BIT_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide_Definition#parameter() parameter} to parameter.
     * @param parameter The value for parameter
     * @return {@code this} builder for chained invocation
     */
    public final Builder parameter(List<ImplementationGuide_Parameter> parameter) {
      checkNotIsSet(parameterIsSet(), "parameter");
      this.parameter = Objects.requireNonNull(parameter, "parameter");
      optBits |= OPT_BIT_PARAMETER;
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide_Definition#parameter() parameter} to parameter.
     * @param parameter The value for parameter
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("parameter")
    public final Builder parameter(Optional<? extends List<ImplementationGuide_Parameter>> parameter) {
      checkNotIsSet(parameterIsSet(), "parameter");
      this.parameter = parameter.orElse(null);
      optBits |= OPT_BIT_PARAMETER;
      return this;
    }

    /**
     * Builds a new {@link ImplementationGuide_Definition ImplementationGuide_Definition}.
     * @return An immutable instance of ImplementationGuide_Definition
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImplementationGuide_Definition build() {
      return new ImmutableImplementationGuide_Definition(
          grouping,
          createUnmodifiableList(true, resource),
          id,
          page,
          template,
          modifierExtension,
          extension,
          parameter);
    }

    private boolean groupingIsSet() {
      return (optBits & OPT_BIT_GROUPING) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean pageIsSet() {
      return (optBits & OPT_BIT_PAGE) != 0;
    }

    private boolean templateIsSet() {
      return (optBits & OPT_BIT_TEMPLATE) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean parameterIsSet() {
      return (optBits & OPT_BIT_PARAMETER) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of ImplementationGuide_Definition is strict, attribute is already set: ".concat(name));
    }
  }

  private static <T> List<T> createSafeList(Iterable<? extends T> iterable, boolean checkNulls, boolean skipNulls) {
    ArrayList<T> list;
    if (iterable instanceof Collection<?>) {
      int size = ((Collection<?>) iterable).size();
      if (size == 0) return Collections.emptyList();
      list = new ArrayList<>();
    } else {
      list = new ArrayList<>();
    }
    for (T element : iterable) {
      if (skipNulls && element == null) continue;
      if (checkNulls) Objects.requireNonNull(element, "element");
      list.add(element);
    }
    return list;
  }

  private static <T> List<T> createUnmodifiableList(boolean clone, List<T> list) {
    switch(list.size()) {
    case 0: return Collections.emptyList();
    case 1: return Collections.singletonList(list.get(0));
    default:
      if (clone) {
        return Collections.unmodifiableList(new ArrayList<>(list));
      } else {
        if (list instanceof ArrayList<?>) {
          ((ArrayList<?>) list).trimToSize();
        }
        return Collections.unmodifiableList(list);
      }
    }
  }
}
