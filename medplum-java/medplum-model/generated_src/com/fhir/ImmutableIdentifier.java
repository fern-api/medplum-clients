//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link Identifier}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableIdentifier.builder()}.
 */
@org.immutables.value.Generated(from = "Identifier", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableIdentifier implements com.fhir.Identifier {
  private final @javax.annotation.Nullable com.fhir.CodeableConcept type;
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable com.fhir.Period period;
  private final @javax.annotation.Nullable com.fhir.Reference assigner;
  private final @javax.annotation.Nullable com.fhir.uri system;
  private final @javax.annotation.Nullable com.fhir.IdentifierUse use;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable java.lang.String value;

  private ImmutableIdentifier(
      @javax.annotation.Nullable com.fhir.CodeableConcept type,
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable com.fhir.Period period,
      @javax.annotation.Nullable com.fhir.Reference assigner,
      @javax.annotation.Nullable com.fhir.uri system,
      @javax.annotation.Nullable com.fhir.IdentifierUse use,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable java.lang.String value) {
    this.type = type;
    this.id = id;
    this.period = period;
    this.assigner = assigner;
    this.system = system;
    this.use = use;
    this.extension = extension;
    this.value = value;
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
   * @return The value of the {@code id} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("id")
  @Override
  public java.util.Optional<java.lang.String> id() {
    return java.util.Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code period} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("period")
  @Override
  public java.util.Optional<com.fhir.Period> period() {
    return java.util.Optional.ofNullable(period);
  }

  /**
   * @return The value of the {@code assigner} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("assigner")
  @Override
  public java.util.Optional<com.fhir.Reference> assigner() {
    return java.util.Optional.ofNullable(assigner);
  }

  /**
   * @return The value of the {@code system} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("system")
  @Override
  public java.util.Optional<com.fhir.uri> system() {
    return java.util.Optional.ofNullable(system);
  }

  /**
   * @return The value of the {@code use} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("use")
  @Override
  public java.util.Optional<com.fhir.IdentifierUse> use() {
    return java.util.Optional.ofNullable(use);
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
   * @return The value of the {@code value} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("value")
  @Override
  public java.util.Optional<java.lang.String> value() {
    return java.util.Optional.ofNullable(value);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Identifier#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableIdentifier withType(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableIdentifier(
        newValue,
        this.id,
        this.period,
        this.assigner,
        this.system,
        this.use,
        this.extension,
        this.value);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Identifier#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableIdentifier withType(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableIdentifier(value, this.id, this.period, this.assigner, this.system, this.use, this.extension, this.value);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Identifier#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableIdentifier withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableIdentifier(
        this.type,
        newValue,
        this.period,
        this.assigner,
        this.system,
        this.use,
        this.extension,
        this.value);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Identifier#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableIdentifier withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableIdentifier(this.type, value, this.period, this.assigner, this.system, this.use, this.extension, this.value);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Identifier#period() period} attribute.
   * @param value The value for period
   * @return A modified copy of {@code this} object
   */
  public final ImmutableIdentifier withPeriod(com.fhir.Period value) {
    @javax.annotation.Nullable com.fhir.Period newValue = java.util.Objects.requireNonNull(value, "period");
    if (this.period == newValue) return this;
    return new ImmutableIdentifier(this.type, this.id, newValue, this.assigner, this.system, this.use, this.extension, this.value);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Identifier#period() period} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for period
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableIdentifier withPeriod(java.util.Optional<? extends com.fhir.Period> optional) {
    @javax.annotation.Nullable com.fhir.Period value = optional.orElse(null);
    if (this.period == value) return this;
    return new ImmutableIdentifier(this.type, this.id, value, this.assigner, this.system, this.use, this.extension, this.value);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Identifier#assigner() assigner} attribute.
   * @param value The value for assigner
   * @return A modified copy of {@code this} object
   */
  public final ImmutableIdentifier withAssigner(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "assigner");
    if (this.assigner == newValue) return this;
    return new ImmutableIdentifier(this.type, this.id, this.period, newValue, this.system, this.use, this.extension, this.value);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Identifier#assigner() assigner} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for assigner
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableIdentifier withAssigner(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.assigner == value) return this;
    return new ImmutableIdentifier(this.type, this.id, this.period, value, this.system, this.use, this.extension, this.value);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Identifier#system() system} attribute.
   * @param value The value for system
   * @return A modified copy of {@code this} object
   */
  public final ImmutableIdentifier withSystem(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "system");
    if (this.system == newValue) return this;
    return new ImmutableIdentifier(this.type, this.id, this.period, this.assigner, newValue, this.use, this.extension, this.value);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Identifier#system() system} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for system
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableIdentifier withSystem(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.system == value) return this;
    return new ImmutableIdentifier(this.type, this.id, this.period, this.assigner, value, this.use, this.extension, this.value);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Identifier#use() use} attribute.
   * @param value The value for use
   * @return A modified copy of {@code this} object
   */
  public final ImmutableIdentifier withUse(com.fhir.IdentifierUse value) {
    @javax.annotation.Nullable com.fhir.IdentifierUse newValue = java.util.Objects.requireNonNull(value, "use");
    if (this.use == newValue) return this;
    return new ImmutableIdentifier(
        this.type,
        this.id,
        this.period,
        this.assigner,
        this.system,
        newValue,
        this.extension,
        this.value);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Identifier#use() use} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for use
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableIdentifier withUse(java.util.Optional<? extends com.fhir.IdentifierUse> optional) {
    @javax.annotation.Nullable com.fhir.IdentifierUse value = optional.orElse(null);
    if (this.use == value) return this;
    return new ImmutableIdentifier(this.type, this.id, this.period, this.assigner, this.system, value, this.extension, this.value);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Identifier#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableIdentifier withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableIdentifier(this.type, this.id, this.period, this.assigner, this.system, this.use, newValue, this.value);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Identifier#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableIdentifier withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableIdentifier(this.type, this.id, this.period, this.assigner, this.system, this.use, value, this.value);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Identifier#value() value} attribute.
   * @param value The value for value
   * @return A modified copy of {@code this} object
   */
  public final ImmutableIdentifier withValue(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "value");
    if (java.util.Objects.equals(this.value, newValue)) return this;
    return new ImmutableIdentifier(this.type, this.id, this.period, this.assigner, this.system, this.use, this.extension, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Identifier#value() value} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for value
   * @return A modified copy of {@code this} object
   */
  public final ImmutableIdentifier withValue(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.value, value)) return this;
    return new ImmutableIdentifier(this.type, this.id, this.period, this.assigner, this.system, this.use, this.extension, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableIdentifier} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableIdentifier
        && equalTo((ImmutableIdentifier) another);
  }

  private boolean equalTo(ImmutableIdentifier another) {
    return java.util.Objects.equals(type, another.type)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(period, another.period)
        && java.util.Objects.equals(assigner, another.assigner)
        && java.util.Objects.equals(system, another.system)
        && java.util.Objects.equals(use, another.use)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(value, another.value);
  }

  /**
   * Computes a hash code from attributes: {@code type}, {@code id}, {@code period}, {@code assigner}, {@code system}, {@code use}, {@code extension}, {@code value}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(type);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(period);
    h += (h << 5) + java.util.Objects.hashCode(assigner);
    h += (h << 5) + java.util.Objects.hashCode(system);
    h += (h << 5) + java.util.Objects.hashCode(use);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(value);
    return h;
  }

  /**
   * Prints the immutable value {@code Identifier} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("Identifier{");
    if (type != null) {
      builder.append("type=").append(type);
    }
    if (id != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (period != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("period=").append(period);
    }
    if (assigner != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("assigner=").append(assigner);
    }
    if (system != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("system=").append(system);
    }
    if (use != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("use=").append(use);
    }
    if (extension != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (value != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("value=").append(value);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "Identifier", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.Identifier {
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> type = java.util.Optional.empty();
    boolean typeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Period> period = java.util.Optional.empty();
    boolean periodIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> assigner = java.util.Optional.empty();
    boolean assignerIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> system = java.util.Optional.empty();
    boolean systemIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.IdentifierUse> use = java.util.Optional.empty();
    boolean useIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> value = java.util.Optional.empty();
    boolean valueIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public void setType(java.util.Optional<com.fhir.CodeableConcept> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("period")
    public void setPeriod(java.util.Optional<com.fhir.Period> period) {
      this.period = period;
      this.periodIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("assigner")
    public void setAssigner(java.util.Optional<com.fhir.Reference> assigner) {
      this.assigner = assigner;
      this.assignerIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("system")
    public void setSystem(java.util.Optional<com.fhir.uri> system) {
      this.system = system;
      this.systemIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("use")
    public void setUse(java.util.Optional<com.fhir.IdentifierUse> use) {
      this.use = use;
      this.useIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    public void setValue(java.util.Optional<java.lang.String> value) {
      this.value = value;
      this.valueIsSet = true;
    }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> type() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Period> period() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> assigner() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> system() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.IdentifierUse> use() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> value() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableIdentifier fromJson(Json json) {
    ImmutableIdentifier.Builder builder = ImmutableIdentifier.builder();
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.periodIsSet) {
      builder.period(json.period);
    }
    if (json.assignerIsSet) {
      builder.assigner(json.assigner);
    }
    if (json.systemIsSet) {
      builder.system(json.system);
    }
    if (json.useIsSet) {
      builder.use(json.use);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.valueIsSet) {
      builder.value(json.value);
    }
    return (ImmutableIdentifier) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Identifier} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Identifier instance
   */
  public static Identifier copyOf(Identifier instance) {
    if (instance instanceof ImmutableIdentifier) {
      return (ImmutableIdentifier) instance;
    }
    return ImmutableIdentifier.builder()
        .type(instance.type())
        .id(instance.id())
        .period(instance.period())
        .assigner(instance.assigner())
        .system(instance.system())
        .use(instance.use())
        .extension(instance.extension())
        .value(instance.value())
        .build();
  }

  /**
   * Creates a builder for {@link Identifier Identifier}.
   * <pre>
   * ImmutableIdentifier.builder()
   *    .type(com.fhir.CodeableConcept) // optional {@link Identifier#type() type}
   *    .id(String) // optional {@link Identifier#id() id}
   *    .period(com.fhir.Period) // optional {@link Identifier#period() period}
   *    .assigner(com.fhir.Reference) // optional {@link Identifier#assigner() assigner}
   *    .system(com.fhir.uri) // optional {@link Identifier#system() system}
   *    .use(com.fhir.IdentifierUse) // optional {@link Identifier#use() use}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Identifier#extension() extension}
   *    .value(String) // optional {@link Identifier#value() value}
   *    .build();
   * </pre>
   * @return A new Identifier builder
   */
  public static ImmutableIdentifier.Builder builder() {
    return new ImmutableIdentifier.Builder();
  }

  /**
   * Builds instances of type {@link Identifier Identifier}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "Identifier", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_TYPE = 0x1L;
    private static final long OPT_BIT_ID = 0x2L;
    private static final long OPT_BIT_PERIOD = 0x4L;
    private static final long OPT_BIT_ASSIGNER = 0x8L;
    private static final long OPT_BIT_SYSTEM = 0x10L;
    private static final long OPT_BIT_USE = 0x20L;
    private static final long OPT_BIT_EXTENSION = 0x40L;
    private static final long OPT_BIT_VALUE = 0x80L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.CodeableConcept type;
    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable com.fhir.Period period;
    private @javax.annotation.Nullable com.fhir.Reference assigner;
    private @javax.annotation.Nullable com.fhir.uri system;
    private @javax.annotation.Nullable com.fhir.IdentifierUse use;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable java.lang.String value;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Identifier#type() type} to type.
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
     * Initializes the optional value {@link Identifier#type() type} to type.
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
     * Initializes the optional value {@link Identifier#id() id} to id.
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
     * Initializes the optional value {@link Identifier#id() id} to id.
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
     * Initializes the optional value {@link Identifier#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for chained invocation
     */
    public final Builder period(com.fhir.Period period) {
      checkNotIsSet(periodIsSet(), "period");
      this.period = java.util.Objects.requireNonNull(period, "period");
      optBits |= OPT_BIT_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link Identifier#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("period")
    public final Builder period(java.util.Optional<? extends com.fhir.Period> period) {
      checkNotIsSet(periodIsSet(), "period");
      this.period = period.orElse(null);
      optBits |= OPT_BIT_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link Identifier#assigner() assigner} to assigner.
     * @param assigner The value for assigner
     * @return {@code this} builder for chained invocation
     */
    public final Builder assigner(com.fhir.Reference assigner) {
      checkNotIsSet(assignerIsSet(), "assigner");
      this.assigner = java.util.Objects.requireNonNull(assigner, "assigner");
      optBits |= OPT_BIT_ASSIGNER;
      return this;
    }

    /**
     * Initializes the optional value {@link Identifier#assigner() assigner} to assigner.
     * @param assigner The value for assigner
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("assigner")
    public final Builder assigner(java.util.Optional<? extends com.fhir.Reference> assigner) {
      checkNotIsSet(assignerIsSet(), "assigner");
      this.assigner = assigner.orElse(null);
      optBits |= OPT_BIT_ASSIGNER;
      return this;
    }

    /**
     * Initializes the optional value {@link Identifier#system() system} to system.
     * @param system The value for system
     * @return {@code this} builder for chained invocation
     */
    public final Builder system(com.fhir.uri system) {
      checkNotIsSet(systemIsSet(), "system");
      this.system = java.util.Objects.requireNonNull(system, "system");
      optBits |= OPT_BIT_SYSTEM;
      return this;
    }

    /**
     * Initializes the optional value {@link Identifier#system() system} to system.
     * @param system The value for system
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("system")
    public final Builder system(java.util.Optional<? extends com.fhir.uri> system) {
      checkNotIsSet(systemIsSet(), "system");
      this.system = system.orElse(null);
      optBits |= OPT_BIT_SYSTEM;
      return this;
    }

    /**
     * Initializes the optional value {@link Identifier#use() use} to use.
     * @param use The value for use
     * @return {@code this} builder for chained invocation
     */
    public final Builder use(com.fhir.IdentifierUse use) {
      checkNotIsSet(useIsSet(), "use");
      this.use = java.util.Objects.requireNonNull(use, "use");
      optBits |= OPT_BIT_USE;
      return this;
    }

    /**
     * Initializes the optional value {@link Identifier#use() use} to use.
     * @param use The value for use
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("use")
    public final Builder use(java.util.Optional<? extends com.fhir.IdentifierUse> use) {
      checkNotIsSet(useIsSet(), "use");
      this.use = use.orElse(null);
      optBits |= OPT_BIT_USE;
      return this;
    }

    /**
     * Initializes the optional value {@link Identifier#extension() extension} to extension.
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
     * Initializes the optional value {@link Identifier#extension() extension} to extension.
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
     * Initializes the optional value {@link Identifier#value() value} to value.
     * @param value The value for value
     * @return {@code this} builder for chained invocation
     */
    public final Builder value(java.lang.String value) {
      checkNotIsSet(valueIsSet(), "value");
      this.value = java.util.Objects.requireNonNull(value, "value");
      optBits |= OPT_BIT_VALUE;
      return this;
    }

    /**
     * Initializes the optional value {@link Identifier#value() value} to value.
     * @param value The value for value
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    public final Builder value(java.util.Optional<java.lang.String> value) {
      checkNotIsSet(valueIsSet(), "value");
      this.value = value.orElse(null);
      optBits |= OPT_BIT_VALUE;
      return this;
    }

    /**
     * Builds a new {@link Identifier Identifier}.
     * @return An immutable instance of Identifier
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.Identifier build() {
      return new ImmutableIdentifier(type, id, period, assigner, system, use, extension, value);
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean periodIsSet() {
      return (optBits & OPT_BIT_PERIOD) != 0;
    }

    private boolean assignerIsSet() {
      return (optBits & OPT_BIT_ASSIGNER) != 0;
    }

    private boolean systemIsSet() {
      return (optBits & OPT_BIT_SYSTEM) != 0;
    }

    private boolean useIsSet() {
      return (optBits & OPT_BIT_USE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean valueIsSet() {
      return (optBits & OPT_BIT_VALUE) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of Identifier is strict, attribute is already set: ".concat(name));
    }
  }
}
