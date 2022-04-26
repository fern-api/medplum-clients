package com.medplum.types.fhir;

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
 * Immutable implementation of {@link BiologicallyDerivedProduct_Storage}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableBiologicallyDerivedProduct_Storage.builder()}.
 */
@Generated(from = "BiologicallyDerivedProduct_Storage", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableBiologicallyDerivedProduct_Storage
    implements BiologicallyDerivedProduct_Storage {
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable String description;
  private final @Nullable Biologicallyderivedproduct_storageScale scale;
  private final @Nullable Period duration;
  private final @Nullable List<Extension> extension;
  private final @Nullable String id;
  private final @Nullable Decimal temperature;

  private ImmutableBiologicallyDerivedProduct_Storage(
      @Nullable List<Extension> modifierExtension,
      @Nullable String description,
      @Nullable Biologicallyderivedproduct_storageScale scale,
      @Nullable Period duration,
      @Nullable List<Extension> extension,
      @Nullable String id,
      @Nullable Decimal temperature) {
    this.modifierExtension = modifierExtension;
    this.description = description;
    this.scale = scale;
    this.duration = duration;
    this.extension = extension;
    this.id = id;
    this.temperature = temperature;
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
   * @return The value of the {@code description} attribute
   */
  @JsonProperty("description")
  @Override
  public Optional<String> description() {
    return Optional.ofNullable(description);
  }

  /**
   * @return The value of the {@code scale} attribute
   */
  @JsonProperty("scale")
  @Override
  public Optional<Biologicallyderivedproduct_storageScale> scale() {
    return Optional.ofNullable(scale);
  }

  /**
   * @return The value of the {@code duration} attribute
   */
  @JsonProperty("duration")
  @Override
  public Optional<Period> duration() {
    return Optional.ofNullable(duration);
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
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<String> id() {
    return Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code temperature} attribute
   */
  @JsonProperty("temperature")
  @Override
  public Optional<Decimal> temperature() {
    return Optional.ofNullable(temperature);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link BiologicallyDerivedProduct_Storage#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBiologicallyDerivedProduct_Storage withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableBiologicallyDerivedProduct_Storage(
        newValue,
        this.description,
        this.scale,
        this.duration,
        this.extension,
        this.id,
        this.temperature);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link BiologicallyDerivedProduct_Storage#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBiologicallyDerivedProduct_Storage withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableBiologicallyDerivedProduct_Storage(value, this.description, this.scale, this.duration, this.extension, this.id, this.temperature);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link BiologicallyDerivedProduct_Storage#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBiologicallyDerivedProduct_Storage withDescription(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "description");
    if (Objects.equals(this.description, newValue)) return this;
    return new ImmutableBiologicallyDerivedProduct_Storage(
        this.modifierExtension,
        newValue,
        this.scale,
        this.duration,
        this.extension,
        this.id,
        this.temperature);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link BiologicallyDerivedProduct_Storage#description() description} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBiologicallyDerivedProduct_Storage withDescription(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.description, value)) return this;
    return new ImmutableBiologicallyDerivedProduct_Storage(
        this.modifierExtension,
        value,
        this.scale,
        this.duration,
        this.extension,
        this.id,
        this.temperature);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link BiologicallyDerivedProduct_Storage#scale() scale} attribute.
   * @param value The value for scale
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBiologicallyDerivedProduct_Storage withScale(Biologicallyderivedproduct_storageScale value) {
    @Nullable Biologicallyderivedproduct_storageScale newValue = Objects.requireNonNull(value, "scale");
    if (this.scale == newValue) return this;
    return new ImmutableBiologicallyDerivedProduct_Storage(
        this.modifierExtension,
        this.description,
        newValue,
        this.duration,
        this.extension,
        this.id,
        this.temperature);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link BiologicallyDerivedProduct_Storage#scale() scale} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for scale
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBiologicallyDerivedProduct_Storage withScale(Optional<? extends Biologicallyderivedproduct_storageScale> optional) {
    @Nullable Biologicallyderivedproduct_storageScale value = optional.orElse(null);
    if (this.scale == value) return this;
    return new ImmutableBiologicallyDerivedProduct_Storage(
        this.modifierExtension,
        this.description,
        value,
        this.duration,
        this.extension,
        this.id,
        this.temperature);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link BiologicallyDerivedProduct_Storage#duration() duration} attribute.
   * @param value The value for duration
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBiologicallyDerivedProduct_Storage withDuration(Period value) {
    @Nullable Period newValue = Objects.requireNonNull(value, "duration");
    if (this.duration == newValue) return this;
    return new ImmutableBiologicallyDerivedProduct_Storage(
        this.modifierExtension,
        this.description,
        this.scale,
        newValue,
        this.extension,
        this.id,
        this.temperature);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link BiologicallyDerivedProduct_Storage#duration() duration} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for duration
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBiologicallyDerivedProduct_Storage withDuration(Optional<? extends Period> optional) {
    @Nullable Period value = optional.orElse(null);
    if (this.duration == value) return this;
    return new ImmutableBiologicallyDerivedProduct_Storage(
        this.modifierExtension,
        this.description,
        this.scale,
        value,
        this.extension,
        this.id,
        this.temperature);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link BiologicallyDerivedProduct_Storage#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBiologicallyDerivedProduct_Storage withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableBiologicallyDerivedProduct_Storage(
        this.modifierExtension,
        this.description,
        this.scale,
        this.duration,
        newValue,
        this.id,
        this.temperature);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link BiologicallyDerivedProduct_Storage#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBiologicallyDerivedProduct_Storage withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableBiologicallyDerivedProduct_Storage(
        this.modifierExtension,
        this.description,
        this.scale,
        this.duration,
        value,
        this.id,
        this.temperature);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link BiologicallyDerivedProduct_Storage#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBiologicallyDerivedProduct_Storage withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableBiologicallyDerivedProduct_Storage(
        this.modifierExtension,
        this.description,
        this.scale,
        this.duration,
        this.extension,
        newValue,
        this.temperature);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link BiologicallyDerivedProduct_Storage#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBiologicallyDerivedProduct_Storage withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableBiologicallyDerivedProduct_Storage(
        this.modifierExtension,
        this.description,
        this.scale,
        this.duration,
        this.extension,
        value,
        this.temperature);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link BiologicallyDerivedProduct_Storage#temperature() temperature} attribute.
   * @param value The value for temperature
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBiologicallyDerivedProduct_Storage withTemperature(Decimal value) {
    @Nullable Decimal newValue = Objects.requireNonNull(value, "temperature");
    if (this.temperature == newValue) return this;
    return new ImmutableBiologicallyDerivedProduct_Storage(
        this.modifierExtension,
        this.description,
        this.scale,
        this.duration,
        this.extension,
        this.id,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link BiologicallyDerivedProduct_Storage#temperature() temperature} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for temperature
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBiologicallyDerivedProduct_Storage withTemperature(Optional<? extends Decimal> optional) {
    @Nullable Decimal value = optional.orElse(null);
    if (this.temperature == value) return this;
    return new ImmutableBiologicallyDerivedProduct_Storage(
        this.modifierExtension,
        this.description,
        this.scale,
        this.duration,
        this.extension,
        this.id,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableBiologicallyDerivedProduct_Storage} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableBiologicallyDerivedProduct_Storage
        && equalTo((ImmutableBiologicallyDerivedProduct_Storage) another);
  }

  private boolean equalTo(ImmutableBiologicallyDerivedProduct_Storage another) {
    return Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(description, another.description)
        && Objects.equals(scale, another.scale)
        && Objects.equals(duration, another.duration)
        && Objects.equals(extension, another.extension)
        && Objects.equals(id, another.id)
        && Objects.equals(temperature, another.temperature);
  }

  /**
   * Computes a hash code from attributes: {@code modifierExtension}, {@code description}, {@code scale}, {@code duration}, {@code extension}, {@code id}, {@code temperature}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + Objects.hashCode(scale);
    h += (h << 5) + Objects.hashCode(duration);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(temperature);
    return h;
  }

  /**
   * Prints the immutable value {@code BiologicallyDerivedProduct_Storage} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("BiologicallyDerivedProduct_Storage{");
    if (modifierExtension != null) {
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (description != null) {
      if (builder.length() > 35) builder.append(", ");
      builder.append("description=").append(description);
    }
    if (scale != null) {
      if (builder.length() > 35) builder.append(", ");
      builder.append("scale=").append(scale);
    }
    if (duration != null) {
      if (builder.length() > 35) builder.append(", ");
      builder.append("duration=").append(duration);
    }
    if (extension != null) {
      if (builder.length() > 35) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (id != null) {
      if (builder.length() > 35) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (temperature != null) {
      if (builder.length() > 35) builder.append(", ");
      builder.append("temperature=").append(temperature);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "BiologicallyDerivedProduct_Storage", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements BiologicallyDerivedProduct_Storage {
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<String> description = Optional.empty();
    boolean descriptionIsSet;
    @Nullable Optional<Biologicallyderivedproduct_storageScale> scale = Optional.empty();
    boolean scaleIsSet;
    @Nullable Optional<Period> duration = Optional.empty();
    boolean durationIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Decimal> temperature = Optional.empty();
    boolean temperatureIsSet;
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("description")
    public void setDescription(Optional<String> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @JsonProperty("scale")
    public void setScale(Optional<Biologicallyderivedproduct_storageScale> scale) {
      this.scale = scale;
      this.scaleIsSet = true;
    }
    @JsonProperty("duration")
    public void setDuration(Optional<Period> duration) {
      this.duration = duration;
      this.durationIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("temperature")
    public void setTemperature(Optional<Decimal> temperature) {
      this.temperature = temperature;
      this.temperatureIsSet = true;
    }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> description() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Biologicallyderivedproduct_storageScale> scale() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Period> duration() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Decimal> temperature() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableBiologicallyDerivedProduct_Storage fromJson(Json json) {
    ImmutableBiologicallyDerivedProduct_Storage.Builder builder = ImmutableBiologicallyDerivedProduct_Storage.builder();
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.scaleIsSet) {
      builder.scale(json.scale);
    }
    if (json.durationIsSet) {
      builder.duration(json.duration);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.temperatureIsSet) {
      builder.temperature(json.temperature);
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
        .modifierExtension(instance.modifierExtension())
        .description(instance.description())
        .scale(instance.scale())
        .duration(instance.duration())
        .extension(instance.extension())
        .id(instance.id())
        .temperature(instance.temperature())
        .build();
  }

  /**
   * Creates a builder for {@link BiologicallyDerivedProduct_Storage BiologicallyDerivedProduct_Storage}.
   * <pre>
   * ImmutableBiologicallyDerivedProduct_Storage.builder()
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link BiologicallyDerivedProduct_Storage#modifierExtension() modifierExtension}
   *    .description(String) // optional {@link BiologicallyDerivedProduct_Storage#description() description}
   *    .scale(com.medplum.types.fhir.Biologicallyderivedproduct_storageScale) // optional {@link BiologicallyDerivedProduct_Storage#scale() scale}
   *    .duration(com.medplum.types.fhir.Period) // optional {@link BiologicallyDerivedProduct_Storage#duration() duration}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link BiologicallyDerivedProduct_Storage#extension() extension}
   *    .id(String) // optional {@link BiologicallyDerivedProduct_Storage#id() id}
   *    .temperature(com.medplum.types.fhir.Decimal) // optional {@link BiologicallyDerivedProduct_Storage#temperature() temperature}
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
  @Generated(from = "BiologicallyDerivedProduct_Storage", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1L;
    private static final long OPT_BIT_DESCRIPTION = 0x2L;
    private static final long OPT_BIT_SCALE = 0x4L;
    private static final long OPT_BIT_DURATION = 0x8L;
    private static final long OPT_BIT_EXTENSION = 0x10L;
    private static final long OPT_BIT_ID = 0x20L;
    private static final long OPT_BIT_TEMPERATURE = 0x40L;
    private long optBits;

    private @Nullable List<Extension> modifierExtension;
    private @Nullable String description;
    private @Nullable Biologicallyderivedproduct_storageScale scale;
    private @Nullable Period duration;
    private @Nullable List<Extension> extension;
    private @Nullable String id;
    private @Nullable Decimal temperature;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct_Storage#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link BiologicallyDerivedProduct_Storage#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link BiologicallyDerivedProduct_Storage#description() description} to description.
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
     * Initializes the optional value {@link BiologicallyDerivedProduct_Storage#description() description} to description.
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
     * Initializes the optional value {@link BiologicallyDerivedProduct_Storage#scale() scale} to scale.
     * @param scale The value for scale
     * @return {@code this} builder for chained invocation
     */
    public final Builder scale(Biologicallyderivedproduct_storageScale scale) {
      checkNotIsSet(scaleIsSet(), "scale");
      this.scale = Objects.requireNonNull(scale, "scale");
      optBits |= OPT_BIT_SCALE;
      return this;
    }

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct_Storage#scale() scale} to scale.
     * @param scale The value for scale
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("scale")
    public final Builder scale(Optional<? extends Biologicallyderivedproduct_storageScale> scale) {
      checkNotIsSet(scaleIsSet(), "scale");
      this.scale = scale.orElse(null);
      optBits |= OPT_BIT_SCALE;
      return this;
    }

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct_Storage#duration() duration} to duration.
     * @param duration The value for duration
     * @return {@code this} builder for chained invocation
     */
    public final Builder duration(Period duration) {
      checkNotIsSet(durationIsSet(), "duration");
      this.duration = Objects.requireNonNull(duration, "duration");
      optBits |= OPT_BIT_DURATION;
      return this;
    }

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct_Storage#duration() duration} to duration.
     * @param duration The value for duration
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("duration")
    public final Builder duration(Optional<? extends Period> duration) {
      checkNotIsSet(durationIsSet(), "duration");
      this.duration = duration.orElse(null);
      optBits |= OPT_BIT_DURATION;
      return this;
    }

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct_Storage#extension() extension} to extension.
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
     * Initializes the optional value {@link BiologicallyDerivedProduct_Storage#extension() extension} to extension.
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
     * Initializes the optional value {@link BiologicallyDerivedProduct_Storage#id() id} to id.
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
     * Initializes the optional value {@link BiologicallyDerivedProduct_Storage#id() id} to id.
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
     * Initializes the optional value {@link BiologicallyDerivedProduct_Storage#temperature() temperature} to temperature.
     * @param temperature The value for temperature
     * @return {@code this} builder for chained invocation
     */
    public final Builder temperature(Decimal temperature) {
      checkNotIsSet(temperatureIsSet(), "temperature");
      this.temperature = Objects.requireNonNull(temperature, "temperature");
      optBits |= OPT_BIT_TEMPERATURE;
      return this;
    }

    /**
     * Initializes the optional value {@link BiologicallyDerivedProduct_Storage#temperature() temperature} to temperature.
     * @param temperature The value for temperature
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("temperature")
    public final Builder temperature(Optional<? extends Decimal> temperature) {
      checkNotIsSet(temperatureIsSet(), "temperature");
      this.temperature = temperature.orElse(null);
      optBits |= OPT_BIT_TEMPERATURE;
      return this;
    }

    /**
     * Builds a new {@link BiologicallyDerivedProduct_Storage BiologicallyDerivedProduct_Storage}.
     * @return An immutable instance of BiologicallyDerivedProduct_Storage
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public BiologicallyDerivedProduct_Storage build() {
      return new ImmutableBiologicallyDerivedProduct_Storage(modifierExtension, description, scale, duration, extension, id, temperature);
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean scaleIsSet() {
      return (optBits & OPT_BIT_SCALE) != 0;
    }

    private boolean durationIsSet() {
      return (optBits & OPT_BIT_DURATION) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean temperatureIsSet() {
      return (optBits & OPT_BIT_TEMPERATURE) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of BiologicallyDerivedProduct_Storage is strict, attribute is already set: ".concat(name));
    }
  }
}
