//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link RiskEvidenceSynthesis_PrecisionEstimate}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableRiskEvidenceSynthesis_PrecisionEstimate.builder()}.
 */
@org.immutables.value.Generated(from = "RiskEvidenceSynthesis_PrecisionEstimate", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableRiskEvidenceSynthesis_PrecisionEstimate
    implements com.fhir.RiskEvidenceSynthesis_PrecisionEstimate {
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable com.fhir.decimal from;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept type;
  private final @javax.annotation.Nullable com.fhir.decimal to;
  private final @javax.annotation.Nullable com.fhir.decimal level;

  private ImmutableRiskEvidenceSynthesis_PrecisionEstimate(
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable com.fhir.decimal from,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.CodeableConcept type,
      @javax.annotation.Nullable com.fhir.decimal to,
      @javax.annotation.Nullable com.fhir.decimal level) {
    this.extension = extension;
    this.id = id;
    this.from = from;
    this.modifierExtension = modifierExtension;
    this.type = type;
    this.to = to;
    this.level = level;
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
   * @return The value of the {@code id} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("id")
  @Override
  public java.util.Optional<java.lang.String> id() {
    return java.util.Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code from} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("from")
  @Override
  public java.util.Optional<com.fhir.decimal> from() {
    return java.util.Optional.ofNullable(from);
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
   * @return The value of the {@code type} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("type")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> type() {
    return java.util.Optional.ofNullable(type);
  }

  /**
   * @return The value of the {@code to} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("to")
  @Override
  public java.util.Optional<com.fhir.decimal> to() {
    return java.util.Optional.ofNullable(to);
  }

  /**
   * @return The value of the {@code level} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("level")
  @Override
  public java.util.Optional<com.fhir.decimal> level() {
    return java.util.Optional.ofNullable(level);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis_PrecisionEstimate#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis_PrecisionEstimate withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableRiskEvidenceSynthesis_PrecisionEstimate(newValue, this.id, this.from, this.modifierExtension, this.type, this.to, this.level);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis_PrecisionEstimate#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskEvidenceSynthesis_PrecisionEstimate withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableRiskEvidenceSynthesis_PrecisionEstimate(value, this.id, this.from, this.modifierExtension, this.type, this.to, this.level);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis_PrecisionEstimate#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis_PrecisionEstimate withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableRiskEvidenceSynthesis_PrecisionEstimate(this.extension, newValue, this.from, this.modifierExtension, this.type, this.to, this.level);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis_PrecisionEstimate#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis_PrecisionEstimate withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableRiskEvidenceSynthesis_PrecisionEstimate(this.extension, value, this.from, this.modifierExtension, this.type, this.to, this.level);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis_PrecisionEstimate#from() from} attribute.
   * @param value The value for from
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis_PrecisionEstimate withFrom(com.fhir.decimal value) {
    @javax.annotation.Nullable com.fhir.decimal newValue = java.util.Objects.requireNonNull(value, "from");
    if (this.from == newValue) return this;
    return new ImmutableRiskEvidenceSynthesis_PrecisionEstimate(this.extension, this.id, newValue, this.modifierExtension, this.type, this.to, this.level);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis_PrecisionEstimate#from() from} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for from
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskEvidenceSynthesis_PrecisionEstimate withFrom(java.util.Optional<? extends com.fhir.decimal> optional) {
    @javax.annotation.Nullable com.fhir.decimal value = optional.orElse(null);
    if (this.from == value) return this;
    return new ImmutableRiskEvidenceSynthesis_PrecisionEstimate(this.extension, this.id, value, this.modifierExtension, this.type, this.to, this.level);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis_PrecisionEstimate#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis_PrecisionEstimate withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableRiskEvidenceSynthesis_PrecisionEstimate(this.extension, this.id, this.from, newValue, this.type, this.to, this.level);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis_PrecisionEstimate#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskEvidenceSynthesis_PrecisionEstimate withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableRiskEvidenceSynthesis_PrecisionEstimate(this.extension, this.id, this.from, value, this.type, this.to, this.level);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis_PrecisionEstimate#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis_PrecisionEstimate withType(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableRiskEvidenceSynthesis_PrecisionEstimate(this.extension, this.id, this.from, this.modifierExtension, newValue, this.to, this.level);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis_PrecisionEstimate#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskEvidenceSynthesis_PrecisionEstimate withType(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableRiskEvidenceSynthesis_PrecisionEstimate(this.extension, this.id, this.from, this.modifierExtension, value, this.to, this.level);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis_PrecisionEstimate#to() to} attribute.
   * @param value The value for to
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis_PrecisionEstimate withTo(com.fhir.decimal value) {
    @javax.annotation.Nullable com.fhir.decimal newValue = java.util.Objects.requireNonNull(value, "to");
    if (this.to == newValue) return this;
    return new ImmutableRiskEvidenceSynthesis_PrecisionEstimate(this.extension, this.id, this.from, this.modifierExtension, this.type, newValue, this.level);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis_PrecisionEstimate#to() to} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for to
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskEvidenceSynthesis_PrecisionEstimate withTo(java.util.Optional<? extends com.fhir.decimal> optional) {
    @javax.annotation.Nullable com.fhir.decimal value = optional.orElse(null);
    if (this.to == value) return this;
    return new ImmutableRiskEvidenceSynthesis_PrecisionEstimate(this.extension, this.id, this.from, this.modifierExtension, this.type, value, this.level);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis_PrecisionEstimate#level() level} attribute.
   * @param value The value for level
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis_PrecisionEstimate withLevel(com.fhir.decimal value) {
    @javax.annotation.Nullable com.fhir.decimal newValue = java.util.Objects.requireNonNull(value, "level");
    if (this.level == newValue) return this;
    return new ImmutableRiskEvidenceSynthesis_PrecisionEstimate(this.extension, this.id, this.from, this.modifierExtension, this.type, this.to, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis_PrecisionEstimate#level() level} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for level
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskEvidenceSynthesis_PrecisionEstimate withLevel(java.util.Optional<? extends com.fhir.decimal> optional) {
    @javax.annotation.Nullable com.fhir.decimal value = optional.orElse(null);
    if (this.level == value) return this;
    return new ImmutableRiskEvidenceSynthesis_PrecisionEstimate(this.extension, this.id, this.from, this.modifierExtension, this.type, this.to, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableRiskEvidenceSynthesis_PrecisionEstimate} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableRiskEvidenceSynthesis_PrecisionEstimate
        && equalTo((ImmutableRiskEvidenceSynthesis_PrecisionEstimate) another);
  }

  private boolean equalTo(ImmutableRiskEvidenceSynthesis_PrecisionEstimate another) {
    return java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(from, another.from)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(type, another.type)
        && java.util.Objects.equals(to, another.to)
        && java.util.Objects.equals(level, another.level);
  }

  /**
   * Computes a hash code from attributes: {@code extension}, {@code id}, {@code from}, {@code modifierExtension}, {@code type}, {@code to}, {@code level}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(from);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(type);
    h += (h << 5) + java.util.Objects.hashCode(to);
    h += (h << 5) + java.util.Objects.hashCode(level);
    return h;
  }

  /**
   * Prints the immutable value {@code RiskEvidenceSynthesis_PrecisionEstimate} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("RiskEvidenceSynthesis_PrecisionEstimate{");
    if (extension != null) {
      builder.append("extension=").append(extension);
    }
    if (id != null) {
      if (builder.length() > 40) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (from != null) {
      if (builder.length() > 40) builder.append(", ");
      builder.append("from=").append(from);
    }
    if (modifierExtension != null) {
      if (builder.length() > 40) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (type != null) {
      if (builder.length() > 40) builder.append(", ");
      builder.append("type=").append(type);
    }
    if (to != null) {
      if (builder.length() > 40) builder.append(", ");
      builder.append("to=").append(to);
    }
    if (level != null) {
      if (builder.length() > 40) builder.append(", ");
      builder.append("level=").append(level);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "RiskEvidenceSynthesis_PrecisionEstimate", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.RiskEvidenceSynthesis_PrecisionEstimate {
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.decimal> from = java.util.Optional.empty();
    boolean fromIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> type = java.util.Optional.empty();
    boolean typeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.decimal> to = java.util.Optional.empty();
    boolean toIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.decimal> level = java.util.Optional.empty();
    boolean levelIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("from")
    public void setFrom(java.util.Optional<com.fhir.decimal> from) {
      this.from = from;
      this.fromIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public void setType(java.util.Optional<com.fhir.CodeableConcept> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("to")
    public void setTo(java.util.Optional<com.fhir.decimal> to) {
      this.to = to;
      this.toIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("level")
    public void setLevel(java.util.Optional<com.fhir.decimal> level) {
      this.level = level;
      this.levelIsSet = true;
    }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.decimal> from() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> type() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.decimal> to() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.decimal> level() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableRiskEvidenceSynthesis_PrecisionEstimate fromJson(Json json) {
    ImmutableRiskEvidenceSynthesis_PrecisionEstimate.Builder builder = ImmutableRiskEvidenceSynthesis_PrecisionEstimate.builder();
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.fromIsSet) {
      builder.from(json.from);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.toIsSet) {
      builder.to(json.to);
    }
    if (json.levelIsSet) {
      builder.level(json.level);
    }
    return (ImmutableRiskEvidenceSynthesis_PrecisionEstimate) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link RiskEvidenceSynthesis_PrecisionEstimate} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable RiskEvidenceSynthesis_PrecisionEstimate instance
   */
  public static RiskEvidenceSynthesis_PrecisionEstimate copyOf(RiskEvidenceSynthesis_PrecisionEstimate instance) {
    if (instance instanceof ImmutableRiskEvidenceSynthesis_PrecisionEstimate) {
      return (ImmutableRiskEvidenceSynthesis_PrecisionEstimate) instance;
    }
    return ImmutableRiskEvidenceSynthesis_PrecisionEstimate.builder()
        .extension(instance.extension())
        .id(instance.id())
        .from(instance.from())
        .modifierExtension(instance.modifierExtension())
        .type(instance.type())
        .to(instance.to())
        .level(instance.level())
        .build();
  }

  /**
   * Creates a builder for {@link RiskEvidenceSynthesis_PrecisionEstimate RiskEvidenceSynthesis_PrecisionEstimate}.
   * <pre>
   * ImmutableRiskEvidenceSynthesis_PrecisionEstimate.builder()
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link RiskEvidenceSynthesis_PrecisionEstimate#extension() extension}
   *    .id(String) // optional {@link RiskEvidenceSynthesis_PrecisionEstimate#id() id}
   *    .from(com.fhir.decimal) // optional {@link RiskEvidenceSynthesis_PrecisionEstimate#from() from}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link RiskEvidenceSynthesis_PrecisionEstimate#modifierExtension() modifierExtension}
   *    .type(com.fhir.CodeableConcept) // optional {@link RiskEvidenceSynthesis_PrecisionEstimate#type() type}
   *    .to(com.fhir.decimal) // optional {@link RiskEvidenceSynthesis_PrecisionEstimate#to() to}
   *    .level(com.fhir.decimal) // optional {@link RiskEvidenceSynthesis_PrecisionEstimate#level() level}
   *    .build();
   * </pre>
   * @return A new RiskEvidenceSynthesis_PrecisionEstimate builder
   */
  public static ImmutableRiskEvidenceSynthesis_PrecisionEstimate.Builder builder() {
    return new ImmutableRiskEvidenceSynthesis_PrecisionEstimate.Builder();
  }

  /**
   * Builds instances of type {@link RiskEvidenceSynthesis_PrecisionEstimate RiskEvidenceSynthesis_PrecisionEstimate}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "RiskEvidenceSynthesis_PrecisionEstimate", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_EXTENSION = 0x1L;
    private static final long OPT_BIT_ID = 0x2L;
    private static final long OPT_BIT_FROM = 0x4L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x8L;
    private static final long OPT_BIT_TYPE = 0x10L;
    private static final long OPT_BIT_TO = 0x20L;
    private static final long OPT_BIT_LEVEL = 0x40L;
    private long optBits;

    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable com.fhir.decimal from;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.CodeableConcept type;
    private @javax.annotation.Nullable com.fhir.decimal to;
    private @javax.annotation.Nullable com.fhir.decimal level;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis_PrecisionEstimate#extension() extension} to extension.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis_PrecisionEstimate#extension() extension} to extension.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis_PrecisionEstimate#id() id} to id.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis_PrecisionEstimate#id() id} to id.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis_PrecisionEstimate#from() from} to from.
     * @param from The value for from
     * @return {@code this} builder for chained invocation
     */
    public final Builder from(com.fhir.decimal from) {
      checkNotIsSet(fromIsSet(), "from");
      this.from = java.util.Objects.requireNonNull(from, "from");
      optBits |= OPT_BIT_FROM;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis_PrecisionEstimate#from() from} to from.
     * @param from The value for from
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("from")
    public final Builder from(java.util.Optional<? extends com.fhir.decimal> from) {
      checkNotIsSet(fromIsSet(), "from");
      this.from = from.orElse(null);
      optBits |= OPT_BIT_FROM;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis_PrecisionEstimate#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis_PrecisionEstimate#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis_PrecisionEstimate#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(com.fhir.CodeableConcept type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = java.util.Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis_PrecisionEstimate#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public final Builder type(java.util.Optional<? extends com.fhir.CodeableConcept> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis_PrecisionEstimate#to() to} to to.
     * @param to The value for to
     * @return {@code this} builder for chained invocation
     */
    public final Builder to(com.fhir.decimal to) {
      checkNotIsSet(toIsSet(), "to");
      this.to = java.util.Objects.requireNonNull(to, "to");
      optBits |= OPT_BIT_TO;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis_PrecisionEstimate#to() to} to to.
     * @param to The value for to
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("to")
    public final Builder to(java.util.Optional<? extends com.fhir.decimal> to) {
      checkNotIsSet(toIsSet(), "to");
      this.to = to.orElse(null);
      optBits |= OPT_BIT_TO;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis_PrecisionEstimate#level() level} to level.
     * @param level The value for level
     * @return {@code this} builder for chained invocation
     */
    public final Builder level(com.fhir.decimal level) {
      checkNotIsSet(levelIsSet(), "level");
      this.level = java.util.Objects.requireNonNull(level, "level");
      optBits |= OPT_BIT_LEVEL;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis_PrecisionEstimate#level() level} to level.
     * @param level The value for level
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("level")
    public final Builder level(java.util.Optional<? extends com.fhir.decimal> level) {
      checkNotIsSet(levelIsSet(), "level");
      this.level = level.orElse(null);
      optBits |= OPT_BIT_LEVEL;
      return this;
    }

    /**
     * Builds a new {@link RiskEvidenceSynthesis_PrecisionEstimate RiskEvidenceSynthesis_PrecisionEstimate}.
     * @return An immutable instance of RiskEvidenceSynthesis_PrecisionEstimate
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.RiskEvidenceSynthesis_PrecisionEstimate build() {
      return new ImmutableRiskEvidenceSynthesis_PrecisionEstimate(extension, id, from, modifierExtension, type, to, level);
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean fromIsSet() {
      return (optBits & OPT_BIT_FROM) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean toIsSet() {
      return (optBits & OPT_BIT_TO) != 0;
    }

    private boolean levelIsSet() {
      return (optBits & OPT_BIT_LEVEL) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of RiskEvidenceSynthesis_PrecisionEstimate is strict, attribute is already set: ".concat(name));
    }
  }
}
