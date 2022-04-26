package com.fhir.types.fhir;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link Measure_Stratifier}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMeasure_Stratifier.builder()}.
 */
@Generated(from = "Measure_Stratifier", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableMeasure_Stratifier implements Measure_Stratifier {
  private final @Nullable List<Extension> extension;
  private final @Nullable List<Measure_Component> component;
  private final @Nullable String description;
  private final @Nullable CodeableConcept code;
  private final @Nullable Expression criteria;
  private final @Nullable String id;
  private final @Nullable List<Extension> modifierExtension;

  private ImmutableMeasure_Stratifier(
      @Nullable List<Extension> extension,
      @Nullable List<Measure_Component> component,
      @Nullable String description,
      @Nullable CodeableConcept code,
      @Nullable Expression criteria,
      @Nullable String id,
      @Nullable List<Extension> modifierExtension) {
    this.extension = extension;
    this.component = component;
    this.description = description;
    this.code = code;
    this.criteria = criteria;
    this.id = id;
    this.modifierExtension = modifierExtension;
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
   * @return The value of the {@code component} attribute
   */
  @JsonProperty("component")
  @Override
  public Optional<List<Measure_Component>> component() {
    return Optional.ofNullable(component);
  }

  /**
   * @return The value of the {@code description} attribute
   */
  @JsonProperty("description")
  @Override
  public Optional<String> description() {
    return Optional.ofNullable(description);
  }

  /**
   * @return The value of the {@code code} attribute
   */
  @JsonProperty("code")
  @Override
  public Optional<CodeableConcept> code() {
    return Optional.ofNullable(code);
  }

  /**
   * @return The value of the {@code criteria} attribute
   */
  @JsonProperty("criteria")
  @Override
  public Optional<Expression> criteria() {
    return Optional.ofNullable(criteria);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Measure_Stratifier#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasure_Stratifier withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableMeasure_Stratifier(
        newValue,
        this.component,
        this.description,
        this.code,
        this.criteria,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Measure_Stratifier#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeasure_Stratifier withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableMeasure_Stratifier(
        value,
        this.component,
        this.description,
        this.code,
        this.criteria,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Measure_Stratifier#component() component} attribute.
   * @param value The value for component
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasure_Stratifier withComponent(List<Measure_Component> value) {
    @Nullable List<Measure_Component> newValue = Objects.requireNonNull(value, "component");
    if (this.component == newValue) return this;
    return new ImmutableMeasure_Stratifier(
        this.extension,
        newValue,
        this.description,
        this.code,
        this.criteria,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Measure_Stratifier#component() component} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for component
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeasure_Stratifier withComponent(Optional<? extends List<Measure_Component>> optional) {
    @Nullable List<Measure_Component> value = optional.orElse(null);
    if (this.component == value) return this;
    return new ImmutableMeasure_Stratifier(
        this.extension,
        value,
        this.description,
        this.code,
        this.criteria,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Measure_Stratifier#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasure_Stratifier withDescription(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "description");
    if (Objects.equals(this.description, newValue)) return this;
    return new ImmutableMeasure_Stratifier(
        this.extension,
        this.component,
        newValue,
        this.code,
        this.criteria,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Measure_Stratifier#description() description} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasure_Stratifier withDescription(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.description, value)) return this;
    return new ImmutableMeasure_Stratifier(
        this.extension,
        this.component,
        value,
        this.code,
        this.criteria,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Measure_Stratifier#code() code} attribute.
   * @param value The value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasure_Stratifier withCode(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "code");
    if (this.code == newValue) return this;
    return new ImmutableMeasure_Stratifier(
        this.extension,
        this.component,
        this.description,
        newValue,
        this.criteria,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Measure_Stratifier#code() code} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for code
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeasure_Stratifier withCode(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.code == value) return this;
    return new ImmutableMeasure_Stratifier(
        this.extension,
        this.component,
        this.description,
        value,
        this.criteria,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Measure_Stratifier#criteria() criteria} attribute.
   * @param value The value for criteria
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasure_Stratifier withCriteria(Expression value) {
    @Nullable Expression newValue = Objects.requireNonNull(value, "criteria");
    if (this.criteria == newValue) return this;
    return new ImmutableMeasure_Stratifier(
        this.extension,
        this.component,
        this.description,
        this.code,
        newValue,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Measure_Stratifier#criteria() criteria} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for criteria
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeasure_Stratifier withCriteria(Optional<? extends Expression> optional) {
    @Nullable Expression value = optional.orElse(null);
    if (this.criteria == value) return this;
    return new ImmutableMeasure_Stratifier(
        this.extension,
        this.component,
        this.description,
        this.code,
        value,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Measure_Stratifier#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasure_Stratifier withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableMeasure_Stratifier(
        this.extension,
        this.component,
        this.description,
        this.code,
        this.criteria,
        newValue,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Measure_Stratifier#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasure_Stratifier withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableMeasure_Stratifier(
        this.extension,
        this.component,
        this.description,
        this.code,
        this.criteria,
        value,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Measure_Stratifier#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasure_Stratifier withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableMeasure_Stratifier(this.extension, this.component, this.description, this.code, this.criteria, this.id, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Measure_Stratifier#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeasure_Stratifier withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableMeasure_Stratifier(this.extension, this.component, this.description, this.code, this.criteria, this.id, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMeasure_Stratifier} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMeasure_Stratifier
        && equalTo((ImmutableMeasure_Stratifier) another);
  }

  private boolean equalTo(ImmutableMeasure_Stratifier another) {
    return Objects.equals(extension, another.extension)
        && Objects.equals(component, another.component)
        && Objects.equals(description, another.description)
        && Objects.equals(code, another.code)
        && Objects.equals(criteria, another.criteria)
        && Objects.equals(id, another.id)
        && Objects.equals(modifierExtension, another.modifierExtension);
  }

  /**
   * Computes a hash code from attributes: {@code extension}, {@code component}, {@code description}, {@code code}, {@code criteria}, {@code id}, {@code modifierExtension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(component);
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + Objects.hashCode(code);
    h += (h << 5) + Objects.hashCode(criteria);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    return h;
  }

  /**
   * Prints the immutable value {@code Measure_Stratifier} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Measure_Stratifier{");
    if (extension != null) {
      builder.append("extension=").append(extension);
    }
    if (component != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("component=").append(component);
    }
    if (description != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("description=").append(description);
    }
    if (code != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("code=").append(code);
    }
    if (criteria != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("criteria=").append(criteria);
    }
    if (id != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (modifierExtension != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Measure_Stratifier", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Measure_Stratifier {
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<Measure_Component>> component = Optional.empty();
    boolean componentIsSet;
    @Nullable Optional<String> description = Optional.empty();
    boolean descriptionIsSet;
    @Nullable Optional<CodeableConcept> code = Optional.empty();
    boolean codeIsSet;
    @Nullable Optional<Expression> criteria = Optional.empty();
    boolean criteriaIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("component")
    public void setComponent(Optional<List<Measure_Component>> component) {
      this.component = component;
      this.componentIsSet = true;
    }
    @JsonProperty("description")
    public void setDescription(Optional<String> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @JsonProperty("code")
    public void setCode(Optional<CodeableConcept> code) {
      this.code = code;
      this.codeIsSet = true;
    }
    @JsonProperty("criteria")
    public void setCriteria(Optional<Expression> criteria) {
      this.criteria = criteria;
      this.criteriaIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Measure_Component>> component() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> description() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> code() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Expression> criteria() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableMeasure_Stratifier fromJson(Json json) {
    ImmutableMeasure_Stratifier.Builder builder = ImmutableMeasure_Stratifier.builder();
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.componentIsSet) {
      builder.component(json.component);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.codeIsSet) {
      builder.code(json.code);
    }
    if (json.criteriaIsSet) {
      builder.criteria(json.criteria);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    return (ImmutableMeasure_Stratifier) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Measure_Stratifier} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Measure_Stratifier instance
   */
  public static Measure_Stratifier copyOf(Measure_Stratifier instance) {
    if (instance instanceof ImmutableMeasure_Stratifier) {
      return (ImmutableMeasure_Stratifier) instance;
    }
    return ImmutableMeasure_Stratifier.builder()
        .extension(instance.extension())
        .component(instance.component())
        .description(instance.description())
        .code(instance.code())
        .criteria(instance.criteria())
        .id(instance.id())
        .modifierExtension(instance.modifierExtension())
        .build();
  }

  /**
   * Creates a builder for {@link Measure_Stratifier Measure_Stratifier}.
   * <pre>
   * ImmutableMeasure_Stratifier.builder()
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Measure_Stratifier#extension() extension}
   *    .component(List&amp;lt;com.fhir.types.fhir.Measure_Component&amp;gt;) // optional {@link Measure_Stratifier#component() component}
   *    .description(String) // optional {@link Measure_Stratifier#description() description}
   *    .code(com.fhir.types.fhir.CodeableConcept) // optional {@link Measure_Stratifier#code() code}
   *    .criteria(com.fhir.types.fhir.Expression) // optional {@link Measure_Stratifier#criteria() criteria}
   *    .id(String) // optional {@link Measure_Stratifier#id() id}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Measure_Stratifier#modifierExtension() modifierExtension}
   *    .build();
   * </pre>
   * @return A new Measure_Stratifier builder
   */
  public static ImmutableMeasure_Stratifier.Builder builder() {
    return new ImmutableMeasure_Stratifier.Builder();
  }

  /**
   * Builds instances of type {@link Measure_Stratifier Measure_Stratifier}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Measure_Stratifier", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_EXTENSION = 0x1L;
    private static final long OPT_BIT_COMPONENT = 0x2L;
    private static final long OPT_BIT_DESCRIPTION = 0x4L;
    private static final long OPT_BIT_CODE = 0x8L;
    private static final long OPT_BIT_CRITERIA = 0x10L;
    private static final long OPT_BIT_ID = 0x20L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x40L;
    private long optBits;

    private @Nullable List<Extension> extension;
    private @Nullable List<Measure_Component> component;
    private @Nullable String description;
    private @Nullable CodeableConcept code;
    private @Nullable Expression criteria;
    private @Nullable String id;
    private @Nullable List<Extension> modifierExtension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Measure_Stratifier#extension() extension} to extension.
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
     * Initializes the optional value {@link Measure_Stratifier#extension() extension} to extension.
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
     * Initializes the optional value {@link Measure_Stratifier#component() component} to component.
     * @param component The value for component
     * @return {@code this} builder for chained invocation
     */
    public final Builder component(List<Measure_Component> component) {
      checkNotIsSet(componentIsSet(), "component");
      this.component = Objects.requireNonNull(component, "component");
      optBits |= OPT_BIT_COMPONENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Measure_Stratifier#component() component} to component.
     * @param component The value for component
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("component")
    public final Builder component(Optional<? extends List<Measure_Component>> component) {
      checkNotIsSet(componentIsSet(), "component");
      this.component = component.orElse(null);
      optBits |= OPT_BIT_COMPONENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Measure_Stratifier#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    public final Builder description(String description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = Objects.requireNonNull(description, "description");
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link Measure_Stratifier#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("description")
    public final Builder description(Optional<String> description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = description.orElse(null);
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link Measure_Stratifier#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    public final Builder code(CodeableConcept code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = Objects.requireNonNull(code, "code");
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link Measure_Stratifier#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("code")
    public final Builder code(Optional<? extends CodeableConcept> code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = code.orElse(null);
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link Measure_Stratifier#criteria() criteria} to criteria.
     * @param criteria The value for criteria
     * @return {@code this} builder for chained invocation
     */
    public final Builder criteria(Expression criteria) {
      checkNotIsSet(criteriaIsSet(), "criteria");
      this.criteria = Objects.requireNonNull(criteria, "criteria");
      optBits |= OPT_BIT_CRITERIA;
      return this;
    }

    /**
     * Initializes the optional value {@link Measure_Stratifier#criteria() criteria} to criteria.
     * @param criteria The value for criteria
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("criteria")
    public final Builder criteria(Optional<? extends Expression> criteria) {
      checkNotIsSet(criteriaIsSet(), "criteria");
      this.criteria = criteria.orElse(null);
      optBits |= OPT_BIT_CRITERIA;
      return this;
    }

    /**
     * Initializes the optional value {@link Measure_Stratifier#id() id} to id.
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
     * Initializes the optional value {@link Measure_Stratifier#id() id} to id.
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
     * Initializes the optional value {@link Measure_Stratifier#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Measure_Stratifier#modifierExtension() modifierExtension} to modifierExtension.
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
     * Builds a new {@link Measure_Stratifier Measure_Stratifier}.
     * @return An immutable instance of Measure_Stratifier
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Measure_Stratifier build() {
      return new ImmutableMeasure_Stratifier(extension, component, description, code, criteria, id, modifierExtension);
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean componentIsSet() {
      return (optBits & OPT_BIT_COMPONENT) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean codeIsSet() {
      return (optBits & OPT_BIT_CODE) != 0;
    }

    private boolean criteriaIsSet() {
      return (optBits & OPT_BIT_CRITERIA) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Measure_Stratifier is strict, attribute is already set: ".concat(name));
    }
  }
}
