//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link ImmunizationRecommendation_DateCriterion}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableImmunizationRecommendation_DateCriterion.builder()}.
 */
@org.immutables.value.Generated(from = "ImmunizationRecommendation_DateCriterion", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableImmunizationRecommendation_DateCriterion
    implements com.fhir.ImmunizationRecommendation_DateCriterion {
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable com.fhir.dateTime value;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final com.fhir.CodeableConcept code;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;

  private ImmutableImmunizationRecommendation_DateCriterion(
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable com.fhir.dateTime value,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      com.fhir.CodeableConcept code,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension) {
    this.id = id;
    this.value = value;
    this.extension = extension;
    this.code = code;
    this.modifierExtension = modifierExtension;
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("id")
  @Override
  public java.util.Optional<java.lang.String> id() {
    return java.util.Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code value} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("value")
  @Override
  public java.util.Optional<com.fhir.dateTime> value() {
    return java.util.Optional.ofNullable(value);
  }

  /**
   * @return The value of the {@code extension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("extension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> extension() {
    return java.util.Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code code} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("code")
  @Override
  public com.fhir.CodeableConcept code() {
    return code;
  }

  /**
   * @return The value of the {@code modifierExtension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() {
    return java.util.Optional.ofNullable(modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImmunizationRecommendation_DateCriterion#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunizationRecommendation_DateCriterion withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableImmunizationRecommendation_DateCriterion(newValue, this.value, this.extension, this.code, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImmunizationRecommendation_DateCriterion#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunizationRecommendation_DateCriterion withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableImmunizationRecommendation_DateCriterion(value, this.value, this.extension, this.code, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImmunizationRecommendation_DateCriterion#value() value} attribute.
   * @param value The value for value
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunizationRecommendation_DateCriterion withValue(com.fhir.dateTime value) {
    @javax.annotation.Nullable com.fhir.dateTime newValue = java.util.Objects.requireNonNull(value, "value");
    if (this.value == newValue) return this;
    return new ImmutableImmunizationRecommendation_DateCriterion(this.id, newValue, this.extension, this.code, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImmunizationRecommendation_DateCriterion#value() value} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for value
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunizationRecommendation_DateCriterion withValue(java.util.Optional<? extends com.fhir.dateTime> optional) {
    @javax.annotation.Nullable com.fhir.dateTime value = optional.orElse(null);
    if (this.value == value) return this;
    return new ImmutableImmunizationRecommendation_DateCriterion(this.id, value, this.extension, this.code, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImmunizationRecommendation_DateCriterion#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunizationRecommendation_DateCriterion withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableImmunizationRecommendation_DateCriterion(this.id, this.value, newValue, this.code, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImmunizationRecommendation_DateCriterion#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunizationRecommendation_DateCriterion withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableImmunizationRecommendation_DateCriterion(this.id, this.value, value, this.code, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ImmunizationRecommendation_DateCriterion#code() code} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for code
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableImmunizationRecommendation_DateCriterion withCode(com.fhir.CodeableConcept value) {
    if (this.code == value) return this;
    com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "code");
    return new ImmutableImmunizationRecommendation_DateCriterion(this.id, this.value, this.extension, newValue, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImmunizationRecommendation_DateCriterion#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunizationRecommendation_DateCriterion withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableImmunizationRecommendation_DateCriterion(this.id, this.value, this.extension, this.code, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImmunizationRecommendation_DateCriterion#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunizationRecommendation_DateCriterion withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableImmunizationRecommendation_DateCriterion(this.id, this.value, this.extension, this.code, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableImmunizationRecommendation_DateCriterion} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableImmunizationRecommendation_DateCriterion
        && equalTo((ImmutableImmunizationRecommendation_DateCriterion) another);
  }

  private boolean equalTo(ImmutableImmunizationRecommendation_DateCriterion another) {
    return java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(value, another.value)
        && java.util.Objects.equals(extension, another.extension)
        && code.equals(another.code)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code value}, {@code extension}, {@code code}, {@code modifierExtension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(value);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + code.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    return h;
  }

  /**
   * Prints the immutable value {@code ImmunizationRecommendation_DateCriterion} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("ImmunizationRecommendation_DateCriterion{");
    if (id != null) {
      builder.append("id=").append(id);
    }
    if (value != null) {
      if (builder.length() > 41) builder.append(", ");
      builder.append("value=").append(value);
    }
    if (extension != null) {
      if (builder.length() > 41) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (builder.length() > 41) builder.append(", ");
    builder.append("code=").append(code);
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "ImmunizationRecommendation_DateCriterion", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.ImmunizationRecommendation_DateCriterion {
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.dateTime> value = java.util.Optional.empty();
    boolean valueIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable com.fhir.CodeableConcept code;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    public void setValue(java.util.Optional<com.fhir.dateTime> value) {
      this.value = value;
      this.valueIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("code")
    public void setCode(com.fhir.CodeableConcept code) {
      this.code = code;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.dateTime> value() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.CodeableConcept code() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableImmunizationRecommendation_DateCriterion fromJson(Json json) {
    ImmutableImmunizationRecommendation_DateCriterion.Builder builder = ((ImmutableImmunizationRecommendation_DateCriterion.Builder) ImmutableImmunizationRecommendation_DateCriterion.builder());
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.valueIsSet) {
      builder.value(json.value);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.code != null) {
      builder.code(json.code);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    return (ImmutableImmunizationRecommendation_DateCriterion) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ImmunizationRecommendation_DateCriterion} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ImmunizationRecommendation_DateCriterion instance
   */
  public static ImmunizationRecommendation_DateCriterion copyOf(ImmunizationRecommendation_DateCriterion instance) {
    if (instance instanceof ImmutableImmunizationRecommendation_DateCriterion) {
      return (ImmutableImmunizationRecommendation_DateCriterion) instance;
    }
    return ((ImmutableImmunizationRecommendation_DateCriterion.Builder) ImmutableImmunizationRecommendation_DateCriterion.builder())
        .id(instance.id())
        .value(instance.value())
        .extension(instance.extension())
        .code(instance.code())
        .modifierExtension(instance.modifierExtension())
        .build();
  }

  /**
   * Creates a builder for {@link ImmunizationRecommendation_DateCriterion ImmunizationRecommendation_DateCriterion}.
   * <pre>
   * ImmutableImmunizationRecommendation_DateCriterion.builder()
   *    .id(String) // optional {@link ImmunizationRecommendation_DateCriterion#id() id}
   *    .value(com.fhir.dateTime) // optional {@link ImmunizationRecommendation_DateCriterion#value() value}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link ImmunizationRecommendation_DateCriterion#extension() extension}
   *    .code(com.fhir.CodeableConcept) // required {@link ImmunizationRecommendation_DateCriterion#code() code}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link ImmunizationRecommendation_DateCriterion#modifierExtension() modifierExtension}
   *    .build();
   * </pre>
   * @return A new ImmunizationRecommendation_DateCriterion builder
   */
  public static CodeBuildStage builder() {
    return new ImmutableImmunizationRecommendation_DateCriterion.Builder();
  }

  /**
   * Builds instances of type {@link ImmunizationRecommendation_DateCriterion ImmunizationRecommendation_DateCriterion}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "ImmunizationRecommendation_DateCriterion", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements CodeBuildStage, BuildFinal {
    private static final long INIT_BIT_CODE = 0x1L;
    private static final long OPT_BIT_ID = 0x1L;
    private static final long OPT_BIT_VALUE = 0x2L;
    private static final long OPT_BIT_EXTENSION = 0x4L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x8L;
    private long initBits = 0x1L;
    private long optBits;

    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable com.fhir.dateTime value;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.CodeableConcept code;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ImmunizationRecommendation_DateCriterion#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(java.lang.String id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = java.util.Objects.requireNonNull(id, "id");
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link ImmunizationRecommendation_DateCriterion#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public final Builder id(java.util.Optional<java.lang.String> id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = id.orElse(null);
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link ImmunizationRecommendation_DateCriterion#value() value} to value.
     * @param value The value for value
     * @return {@code this} builder for chained invocation
     */
    public final Builder value(com.fhir.dateTime value) {
      checkNotIsSet(valueIsSet(), "value");
      this.value = java.util.Objects.requireNonNull(value, "value");
      optBits |= OPT_BIT_VALUE;
      return this;
    }

    /**
     * Initializes the optional value {@link ImmunizationRecommendation_DateCriterion#value() value} to value.
     * @param value The value for value
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    public final Builder value(java.util.Optional<? extends com.fhir.dateTime> value) {
      checkNotIsSet(valueIsSet(), "value");
      this.value = value.orElse(null);
      optBits |= OPT_BIT_VALUE;
      return this;
    }

    /**
     * Initializes the optional value {@link ImmunizationRecommendation_DateCriterion#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    public final Builder extension(java.util.List<com.fhir.Extension> extension) {
      checkNotIsSet(extensionIsSet(), "extension");
      this.extension = java.util.Objects.requireNonNull(extension, "extension");
      optBits |= OPT_BIT_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link ImmunizationRecommendation_DateCriterion#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public final Builder extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension) {
      checkNotIsSet(extensionIsSet(), "extension");
      this.extension = extension.orElse(null);
      optBits |= OPT_BIT_EXTENSION;
      return this;
    }

    /**
     * Initializes the value for the {@link ImmunizationRecommendation_DateCriterion#code() code} attribute.
     * @param code The value for code 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("code")
    public final Builder code(com.fhir.CodeableConcept code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = java.util.Objects.requireNonNull(code, "code");
      initBits &= ~INIT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link ImmunizationRecommendation_DateCriterion#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    public final Builder modifierExtension(java.util.List<com.fhir.Extension> modifierExtension) {
      checkNotIsSet(modifierExtensionIsSet(), "modifierExtension");
      this.modifierExtension = java.util.Objects.requireNonNull(modifierExtension, "modifierExtension");
      optBits |= OPT_BIT_MODIFIER_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link ImmunizationRecommendation_DateCriterion#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public final Builder modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension) {
      checkNotIsSet(modifierExtensionIsSet(), "modifierExtension");
      this.modifierExtension = modifierExtension.orElse(null);
      optBits |= OPT_BIT_MODIFIER_EXTENSION;
      return this;
    }

    /**
     * Builds a new {@link ImmunizationRecommendation_DateCriterion ImmunizationRecommendation_DateCriterion}.
     * @return An immutable instance of ImmunizationRecommendation_DateCriterion
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.ImmunizationRecommendation_DateCriterion build() {
      checkRequiredAttributes();
      return new ImmutableImmunizationRecommendation_DateCriterion(id, value, extension, code, modifierExtension);
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean valueIsSet() {
      return (optBits & OPT_BIT_VALUE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean codeIsSet() {
      return (initBits & INIT_BIT_CODE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of ImmunizationRecommendation_DateCriterion is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!codeIsSet()) attributes.add("code");
      return "Cannot build ImmunizationRecommendation_DateCriterion, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "ImmunizationRecommendation_DateCriterion", generator = "Immutables")
  public interface CodeBuildStage {
    /**
     * Initializes the value for the {@link ImmunizationRecommendation_DateCriterion#code() code} attribute.
     * @param code The value for code 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal code(com.fhir.CodeableConcept code);
  }

  @org.immutables.value.Generated(from = "ImmunizationRecommendation_DateCriterion", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link ImmunizationRecommendation_DateCriterion#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(java.lang.String id);

    /**
     * Initializes the optional value {@link ImmunizationRecommendation_DateCriterion#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<java.lang.String> id);

    /**
     * Initializes the optional value {@link ImmunizationRecommendation_DateCriterion#value() value} to value.
     * @param value The value for value
     * @return {@code this} builder for chained invocation
     */
    BuildFinal value(com.fhir.dateTime value);

    /**
     * Initializes the optional value {@link ImmunizationRecommendation_DateCriterion#value() value} to value.
     * @param value The value for value
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal value(java.util.Optional<? extends com.fhir.dateTime> value);

    /**
     * Initializes the optional value {@link ImmunizationRecommendation_DateCriterion#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link ImmunizationRecommendation_DateCriterion#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link ImmunizationRecommendation_DateCriterion#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link ImmunizationRecommendation_DateCriterion#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Builds a new {@link ImmunizationRecommendation_DateCriterion ImmunizationRecommendation_DateCriterion}.
     * @return An immutable instance of ImmunizationRecommendation_DateCriterion
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    ImmunizationRecommendation_DateCriterion build();
  }
}
