//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link BiologicallyDerivedProduct_Storage}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableBiologicallyDerivedProduct_Storage.builder()}.
 */
@org.immutables.value.Generated(from = "BiologicallyDerivedProduct_Storage", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableBiologicallyDerivedProduct_Storage
    implements com.fhir.BiologicallyDerivedProduct_Storage {
  private final @javax.annotation.Nullable com.fhir.decimal temperature;
  private final @javax.annotation.Nullable com.fhir.Biologicallyderivedproduct_storageScale scale;
  private final @javax.annotation.Nullable java.lang.String description;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.Period duration;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable java.lang.String id;

  private ImmutableBiologicallyDerivedProduct_Storage(
      @javax.annotation.Nullable com.fhir.decimal temperature,
      @javax.annotation.Nullable com.fhir.Biologicallyderivedproduct_storageScale scale,
      @javax.annotation.Nullable java.lang.String description,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.Period duration,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable java.lang.String id) {
    this.temperature = temperature;
    this.scale = scale;
    this.description = description;
    this.extension = extension;
    this.duration = duration;
    this.modifierExtension = modifierExtension;
    this.id = id;
  }

  /**
   * @return The value of the {@code temperature} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("temperature")
  @Override
  public java.util.Optional<com.fhir.decimal> temperature() {
    return java.util.Optional.ofNullable(temperature);
  }

  /**
   * @return The value of the {@code scale} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("scale")
  @Override
  public java.util.Optional<com.fhir.Biologicallyderivedproduct_storageScale> scale() {
    return java.util.Optional.ofNullable(scale);
  }

  /**
   * @return The value of the {@code description} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("description")
  @Override
  public java.util.Optional<java.lang.String> description() {
    return java.util.Optional.ofNullable(description);
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
   * @return The value of the {@code duration} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("duration")
  @Override
  public java.util.Optional<com.fhir.Period> duration() {
    return java.util.Optional.ofNullable(duration);
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
   * @return The value of the {@code id} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("id")
  @Override
  public java.util.Optional<java.lang.String> id() {
    return java.util.Optional.ofNullable(id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link BiologicallyDerivedProduct_Storage#temperature() temperature} attribute.
   * @param value The value for temperature
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBiologicallyDerivedProduct_Storage withTemperature(com.fhir.decimal value) {
    @javax.annotation.Nullable com.fhir.decimal newValue = java.util.Objects.requireNonNull(value, "temperature");
    if (this.temperature == newValue) return this;
    return new ImmutableBiologicallyDerivedProduct_Storage(
        newValue,
        this.scale,
        this.description,
        this.extension,
        this.duration,
        this.modifierExtension,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link BiologicallyDerivedProduct_Storage#temperature() temperature} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for temperature
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBiologicallyDerivedProduct_Storage withTemperature(java.util.Optional<? extends com.fhir.decimal> optional) {
    @javax.annotation.Nullable com.fhir.decimal value = optional.orElse(null);
    if (this.temperature == value) return this;
    return new ImmutableBiologicallyDerivedProduct_Storage(
        value,
        this.scale,
        this.description,
        this.extension,
        this.duration,
        this.modifierExtension,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link BiologicallyDerivedProduct_Storage#scale() scale} attribute.
   * @param value The value for scale
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBiologicallyDerivedProduct_Storage withScale(com.fhir.Biologicallyderivedproduct_storageScale value) {
    @javax.annotation.Nullable com.fhir.Biologicallyderivedproduct_storageScale newValue = java.util.Objects.requireNonNull(value, "scale");
    if (this.scale == newValue) return this;
    return new ImmutableBiologicallyDerivedProduct_Storage(
        this.temperature,
        newValue,
        this.description,
        this.extension,
        this.duration,
        this.modifierExtension,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link BiologicallyDerivedProduct_Storage#scale() scale} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for scale
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBiologicallyDerivedProduct_Storage withScale(java.util.Optional<? extends com.fhir.Biologicallyderivedproduct_storageScale> optional) {
    @javax.annotation.Nullable com.fhir.Biologicallyderivedproduct_storageScale value = optional.orElse(null);
    if (this.scale == value) return this;
    return new ImmutableBiologicallyDerivedProduct_Storage(
        this.temperature,
        value,
        this.description,
        this.extension,
        this.duration,
        this.modifierExtension,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link BiologicallyDerivedProduct_Storage#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBiologicallyDerivedProduct_Storage withDescription(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "description");
    if (java.util.Objects.equals(this.description, newValue)) return this;
    return new ImmutableBiologicallyDerivedProduct_Storage(
        this.temperature,
        this.scale,
        newValue,
        this.extension,
        this.duration,
        this.modifierExtension,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link BiologicallyDerivedProduct_Storage#description() description} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBiologicallyDerivedProduct_Storage withDescription(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.description, value)) return this;
    return new ImmutableBiologicallyDerivedProduct_Storage(
        this.temperature,
        this.scale,
        value,
        this.extension,
        this.duration,
        this.modifierExtension,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link BiologicallyDerivedProduct_Storage#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBiologicallyDerivedProduct_Storage withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableBiologicallyDerivedProduct_Storage(
        this.temperature,
        this.scale,
        this.description,
        newValue,
        this.duration,
        this.modifierExtension,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link BiologicallyDerivedProduct_Storage#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBiologicallyDerivedProduct_Storage withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableBiologicallyDerivedProduct_Storage(
        this.temperature,
        this.scale,
        this.description,
        value,
        this.duration,
        this.modifierExtension,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link BiologicallyDerivedProduct_Storage#duration() duration} attribute.
   * @param value The value for duration
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBiologicallyDerivedProduct_Storage withDuration(com.fhir.Period value) {
    @javax.annotation.Nullable com.fhir.Period newValue = java.util.Objects.requireNonNull(value, "duration");
    if (this.duration == newValue) return this;
    return new ImmutableBiologicallyDerivedProduct_Storage(
        this.temperature,
        this.scale,
        this.description,
        this.extension,
        newValue,
        this.modifierExtension,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link BiologicallyDerivedProduct_Storage#duration() duration} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for duration
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBiologicallyDerivedProduct_Storage withDuration(java.util.Optional<? extends com.fhir.Period> optional) {
    @javax.annotation.Nullable com.fhir.Period value = optional.orElse(null);
    if (this.duration == value) return this;
    return new ImmutableBiologicallyDerivedProduct_Storage(
        this.temperature,
        this.scale,
        this.description,
        this.extension,
        value,
        this.modifierExtension,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link BiologicallyDerivedProduct_Storage#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBiologicallyDerivedProduct_Storage withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableBiologicallyDerivedProduct_Storage(
        this.temperature,
        this.scale,
        this.description,
        this.extension,
        this.duration,
        newValue,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link BiologicallyDerivedProduct_Storage#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBiologicallyDerivedProduct_Storage withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableBiologicallyDerivedProduct_Storage(this.temperature, this.scale, this.description, this.extension, this.duration, value, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link BiologicallyDerivedProduct_Storage#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBiologicallyDerivedProduct_Storage withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableBiologicallyDerivedProduct_Storage(
        this.temperature,
        this.scale,
        this.description,
        this.extension,
        this.duration,
        this.modifierExtension,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link BiologicallyDerivedProduct_Storage#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBiologicallyDerivedProduct_Storage withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableBiologicallyDerivedProduct_Storage(
        this.temperature,
        this.scale,
        this.description,
        this.extension,
        this.duration,
        this.modifierExtension,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableBiologicallyDerivedProduct_Storage} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableBiologicallyDerivedProduct_Storage
        && equalTo((ImmutableBiologicallyDerivedProduct_Storage) another);
  }

  private boolean equalTo(ImmutableBiologicallyDerivedProduct_Storage another) {
    return java.util.Objects.equals(temperature, another.temperature)
        && java.util.Objects.equals(scale, another.scale)
        && java.util.Objects.equals(description, another.description)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(duration, another.duration)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(id, another.id);
  }

  /**
   * Computes a hash code from attributes: {@code temperature}, {@code scale}, {@code description}, {@code extension}, {@code duration}, {@code modifierExtension}, {@code id}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(temperature);
    h += (h << 5) + java.util.Objects.hashCode(scale);
    h += (h << 5) + java.util.Objects.hashCode(description);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(duration);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(id);
    return h;
  }

  /**
   * Prints the immutable value {@code BiologicallyDerivedProduct_Storage} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("BiologicallyDerivedProduct_Storage{");
    if (temperature != null) {
      builder.append("temperature=").append(temperature);
    }
    if (scale != null) {
      if (builder.length() > 35) builder.append(", ");
      builder.append("scale=").append(scale);
    }
    if (description != null) {
      if (builder.length() > 35) builder.append(", ");
      builder.append("description=").append(description);
    }
    if (extension != null) {
      if (builder.length() > 35) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (duration != null) {
      if (builder.length() > 35) builder.append(", ");
      builder.append("duration=").append(duration);
    }
    if (modifierExtension != null) {
      if (builder.length() > 35) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (id != null) {
      if (builder.length() > 35) builder.append(", ");
      builder.append("id=").append(id);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "BiologicallyDerivedProduct_Storage", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.BiologicallyDerivedProduct_Storage {
    @javax.annotation.Nullable java.util.Optional<com.fhir.decimal> temperature = java.util.Optional.empty();
    boolean temperatureIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Biologicallyderivedproduct_storageScale> scale = java.util.Optional.empty();
    boolean scaleIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> description = java.util.Optional.empty();
    boolean descriptionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Period> duration = java.util.Optional.empty();
    boolean durationIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("temperature")
    public void setTemperature(java.util.Optional<com.fhir.decimal> temperature) {
      this.temperature = temperature;
      this.temperatureIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("scale")
    public void setScale(java.util.Optional<com.fhir.Biologicallyderivedproduct_storageScale> scale) {
      this.scale = scale;
      this.scaleIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    public void setDescription(java.util.Optional<java.lang.String> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("duration")
    public void setDuration(java.util.Optional<com.fhir.Period> duration) {
      this.duration = duration;
      this.durationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @Override
    public java.util.Optional<com.fhir.decimal> temperature() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Biologicallyderivedproduct_storageScale> scale() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> description() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Period> duration() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableBiologicallyDerivedProduct_Storage fromJson(Json json) {
    ImmutableBiologicallyDerivedProduct_Storage.Builder builder = ImmutableBiologicallyDerivedProduct_Storage.builder();
    if (json.temperatureIsSet) {
      builder.temperature(json.temperature);
    }
    if (json.scaleIsSet) {
      builder.scale(json.scale);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.durationIsSet) {
      builder.duration(json.duration);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    return (ImmutableBiologicallyDerivedProduct_Storage) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link BiologicallyDerivedProduct_Storage} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable BiologicallyDerivedProduct_Storage instance
   */
  public static BiologicallyDerivedProduct_Storage copyOf(BiologicallyDerivedProduct_Storage instance) {
    if (instance instanceof ImmutableBiologicallyDerivedProduct_Storage) {
      return (ImmutableBiologicallyDerivedProduct_Storage) instance;
    }
    return ImmutableBiologicallyDerivedProduct_Storage.builder()
        .temperature(instance.temperature())
        .scale(instance.scale())
        .description(instance.description())
        .extension(instance.extension())
        .duration(instance.duration())
        .modifierExtension(instance.modifierExtension())
        .id(instance.id())
        .build();
  }

  /**
   * Creates a builder for {@link BiologicallyDerivedProduct_Storage BiologicallyDerivedProduct_Storage}.
   * <pre>
   * ImmutableBiologicallyDerivedProduct_Storage.builder()
   *    .temperature(com.fhir.decimal) // optional {@link BiologicallyDerivedProduct_Storage#temperature() temperature}
   *    .scale(com.fhir.Biologicallyderivedproduct_storageScale) // optional {@link BiologicallyDerivedProduct_Storage#scale() scale}
   *    .description(String) // optional {@link BiologicallyDerivedProduct_Storage#description() description}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link BiologicallyDerivedProduct_Storage#extension() extension}
   *    .duration(com.fhir.Period) // optional {@link BiologicallyDerivedProduct_Storage#duration() duration}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link BiologicallyDerivedProduct_Storage#modifierExtension() modifierExtension}
   *    .id(String) // optional {@link BiologicallyDerivedProduct_Storage#id() id}
   *    .build();
   * </pre>
   * @return A new BiologicallyDerivedProduct_Storage builder
   */
  public static ImmutableBiologicallyDerivedProduct_Storage.Builder builder() {
    return new ImmutableBiologicallyDerivedProduct_Storage.Builder();
  }

  /**
   * Builds instances of type {@link BiologicallyDerivedProduct_Storage BiologicallyDerivedProduct_Storage}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "BiologicallyDerivedProduct_Storage", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_TEMPERATURE = 0x1L;
    private static final long OPT_BIT_SCALE = 0x2L;
    private static final long OPT_BIT_DESCRIPTION = 0x4L;
    private static final long OPT_BIT_EXTENSION = 0x8L;
    private static final long OPT_BIT_DURATION = 0x10L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x20L;
    private static final long OPT_BIT_ID = 0x40L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.decimal temperature;
    private @javax.annotation.Nullable com.fhir.Biologicallyderivedproduct_storageScale scale;
    private @javax.annotation.Nullable java.lang.String description;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.Period duration;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable java.lang.String id;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct_Storage#temperature() temperature} to temperature.
     * @param temperature The value for temperature
     * @return {@code this} builder for chained invocation
     */
    public final Builder temperature(com.fhir.decimal temperature) {
      checkNotIsSet(temperatureIsSet(), "temperature");
      this.temperature = java.util.Objects.requireNonNull(temperature, "temperature");
      optBits |= OPT_BIT_TEMPERATURE;
      return this;
    }

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct_Storage#temperature() temperature} to temperature.
     * @param temperature The value for temperature
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("temperature")
    public final Builder temperature(java.util.Optional<? extends com.fhir.decimal> temperature) {
      checkNotIsSet(temperatureIsSet(), "temperature");
      this.temperature = temperature.orElse(null);
      optBits |= OPT_BIT_TEMPERATURE;
      return this;
    }

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct_Storage#scale() scale} to scale.
     * @param scale The value for scale
     * @return {@code this} builder for chained invocation
     */
    public final Builder scale(com.fhir.Biologicallyderivedproduct_storageScale scale) {
      checkNotIsSet(scaleIsSet(), "scale");
      this.scale = java.util.Objects.requireNonNull(scale, "scale");
      optBits |= OPT_BIT_SCALE;
      return this;
    }

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct_Storage#scale() scale} to scale.
     * @param scale The value for scale
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("scale")
    public final Builder scale(java.util.Optional<? extends com.fhir.Biologicallyderivedproduct_storageScale> scale) {
      checkNotIsSet(scaleIsSet(), "scale");
      this.scale = scale.orElse(null);
      optBits |= OPT_BIT_SCALE;
      return this;
    }

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct_Storage#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    public final Builder description(java.lang.String description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = java.util.Objects.requireNonNull(description, "description");
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct_Storage#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    public final Builder description(java.util.Optional<java.lang.String> description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = description.orElse(null);
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct_Storage#extension() extension} to extension.
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
     * Initializes the optional value {@link BiologicallyDerivedProduct_Storage#extension() extension} to extension.
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
     * Initializes the optional value {@link BiologicallyDerivedProduct_Storage#duration() duration} to duration.
     * @param duration The value for duration
     * @return {@code this} builder for chained invocation
     */
    public final Builder duration(com.fhir.Period duration) {
      checkNotIsSet(durationIsSet(), "duration");
      this.duration = java.util.Objects.requireNonNull(duration, "duration");
      optBits |= OPT_BIT_DURATION;
      return this;
    }

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct_Storage#duration() duration} to duration.
     * @param duration The value for duration
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("duration")
    public final Builder duration(java.util.Optional<? extends com.fhir.Period> duration) {
      checkNotIsSet(durationIsSet(), "duration");
      this.duration = duration.orElse(null);
      optBits |= OPT_BIT_DURATION;
      return this;
    }

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct_Storage#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link BiologicallyDerivedProduct_Storage#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link BiologicallyDerivedProduct_Storage#id() id} to id.
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
     * Initializes the optional value {@link BiologicallyDerivedProduct_Storage#id() id} to id.
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
     * Builds a new {@link BiologicallyDerivedProduct_Storage BiologicallyDerivedProduct_Storage}.
     * @return An immutable instance of BiologicallyDerivedProduct_Storage
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.BiologicallyDerivedProduct_Storage build() {
      return new ImmutableBiologicallyDerivedProduct_Storage(temperature, scale, description, extension, duration, modifierExtension, id);
    }

    private boolean temperatureIsSet() {
      return (optBits & OPT_BIT_TEMPERATURE) != 0;
    }

    private boolean scaleIsSet() {
      return (optBits & OPT_BIT_SCALE) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean durationIsSet() {
      return (optBits & OPT_BIT_DURATION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of BiologicallyDerivedProduct_Storage is strict, attribute is already set: ".concat(name));
    }
  }
}
