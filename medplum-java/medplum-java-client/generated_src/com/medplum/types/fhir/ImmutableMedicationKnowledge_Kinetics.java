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
 * Immutable implementation of {@link MedicationKnowledge_Kinetics}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMedicationKnowledge_Kinetics.builder()}.
 */
@Generated(from = "MedicationKnowledge_Kinetics", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableMedicationKnowledge_Kinetics
    implements MedicationKnowledge_Kinetics {
  private final @Nullable List<Quantity> areaUnderCurve;
  private final @Nullable String id;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Duration halfLifePeriod;
  private final @Nullable List<Quantity> lethalDose50;

  private ImmutableMedicationKnowledge_Kinetics(
      @Nullable List<Quantity> areaUnderCurve,
      @Nullable String id,
      @Nullable List<Extension> extension,
      @Nullable List<Extension> modifierExtension,
      @Nullable Duration halfLifePeriod,
      @Nullable List<Quantity> lethalDose50) {
    this.areaUnderCurve = areaUnderCurve;
    this.id = id;
    this.extension = extension;
    this.modifierExtension = modifierExtension;
    this.halfLifePeriod = halfLifePeriod;
    this.lethalDose50 = lethalDose50;
  }

  /**
   * @return The value of the {@code areaUnderCurve} attribute
   */
  @JsonProperty("areaUnderCurve")
  @Override
  public Optional<List<Quantity>> areaUnderCurve() {
    return Optional.ofNullable(areaUnderCurve);
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
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
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
   * @return The value of the {@code halfLifePeriod} attribute
   */
  @JsonProperty("halfLifePeriod")
  @Override
  public Optional<Duration> halfLifePeriod() {
    return Optional.ofNullable(halfLifePeriod);
  }

  /**
   * @return The value of the {@code lethalDose50} attribute
   */
  @JsonProperty("lethalDose50")
  @Override
  public Optional<List<Quantity>> lethalDose50() {
    return Optional.ofNullable(lethalDose50);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge_Kinetics#areaUnderCurve() areaUnderCurve} attribute.
   * @param value The value for areaUnderCurve
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge_Kinetics withAreaUnderCurve(List<Quantity> value) {
    @Nullable List<Quantity> newValue = Objects.requireNonNull(value, "areaUnderCurve");
    if (this.areaUnderCurve == newValue) return this;
    return new ImmutableMedicationKnowledge_Kinetics(
        newValue,
        this.id,
        this.extension,
        this.modifierExtension,
        this.halfLifePeriod,
        this.lethalDose50);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge_Kinetics#areaUnderCurve() areaUnderCurve} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for areaUnderCurve
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationKnowledge_Kinetics withAreaUnderCurve(Optional<? extends List<Quantity>> optional) {
    @Nullable List<Quantity> value = optional.orElse(null);
    if (this.areaUnderCurve == value) return this;
    return new ImmutableMedicationKnowledge_Kinetics(value, this.id, this.extension, this.modifierExtension, this.halfLifePeriod, this.lethalDose50);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge_Kinetics#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge_Kinetics withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableMedicationKnowledge_Kinetics(
        this.areaUnderCurve,
        newValue,
        this.extension,
        this.modifierExtension,
        this.halfLifePeriod,
        this.lethalDose50);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge_Kinetics#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge_Kinetics withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableMedicationKnowledge_Kinetics(
        this.areaUnderCurve,
        value,
        this.extension,
        this.modifierExtension,
        this.halfLifePeriod,
        this.lethalDose50);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge_Kinetics#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge_Kinetics withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableMedicationKnowledge_Kinetics(
        this.areaUnderCurve,
        this.id,
        newValue,
        this.modifierExtension,
        this.halfLifePeriod,
        this.lethalDose50);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge_Kinetics#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationKnowledge_Kinetics withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableMedicationKnowledge_Kinetics(
        this.areaUnderCurve,
        this.id,
        value,
        this.modifierExtension,
        this.halfLifePeriod,
        this.lethalDose50);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge_Kinetics#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge_Kinetics withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableMedicationKnowledge_Kinetics(this.areaUnderCurve, this.id, this.extension, newValue, this.halfLifePeriod, this.lethalDose50);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge_Kinetics#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationKnowledge_Kinetics withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableMedicationKnowledge_Kinetics(this.areaUnderCurve, this.id, this.extension, value, this.halfLifePeriod, this.lethalDose50);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge_Kinetics#halfLifePeriod() halfLifePeriod} attribute.
   * @param value The value for halfLifePeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge_Kinetics withHalfLifePeriod(Duration value) {
    @Nullable Duration newValue = Objects.requireNonNull(value, "halfLifePeriod");
    if (this.halfLifePeriod == newValue) return this;
    return new ImmutableMedicationKnowledge_Kinetics(
        this.areaUnderCurve,
        this.id,
        this.extension,
        this.modifierExtension,
        newValue,
        this.lethalDose50);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge_Kinetics#halfLifePeriod() halfLifePeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for halfLifePeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationKnowledge_Kinetics withHalfLifePeriod(Optional<? extends Duration> optional) {
    @Nullable Duration value = optional.orElse(null);
    if (this.halfLifePeriod == value) return this;
    return new ImmutableMedicationKnowledge_Kinetics(this.areaUnderCurve, this.id, this.extension, this.modifierExtension, value, this.lethalDose50);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge_Kinetics#lethalDose50() lethalDose50} attribute.
   * @param value The value for lethalDose50
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge_Kinetics withLethalDose50(List<Quantity> value) {
    @Nullable List<Quantity> newValue = Objects.requireNonNull(value, "lethalDose50");
    if (this.lethalDose50 == newValue) return this;
    return new ImmutableMedicationKnowledge_Kinetics(
        this.areaUnderCurve,
        this.id,
        this.extension,
        this.modifierExtension,
        this.halfLifePeriod,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge_Kinetics#lethalDose50() lethalDose50} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for lethalDose50
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationKnowledge_Kinetics withLethalDose50(Optional<? extends List<Quantity>> optional) {
    @Nullable List<Quantity> value = optional.orElse(null);
    if (this.lethalDose50 == value) return this;
    return new ImmutableMedicationKnowledge_Kinetics(
        this.areaUnderCurve,
        this.id,
        this.extension,
        this.modifierExtension,
        this.halfLifePeriod,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMedicationKnowledge_Kinetics} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMedicationKnowledge_Kinetics
        && equalTo((ImmutableMedicationKnowledge_Kinetics) another);
  }

  private boolean equalTo(ImmutableMedicationKnowledge_Kinetics another) {
    return Objects.equals(areaUnderCurve, another.areaUnderCurve)
        && Objects.equals(id, another.id)
        && Objects.equals(extension, another.extension)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(halfLifePeriod, another.halfLifePeriod)
        && Objects.equals(lethalDose50, another.lethalDose50);
  }

  /**
   * Computes a hash code from attributes: {@code areaUnderCurve}, {@code id}, {@code extension}, {@code modifierExtension}, {@code halfLifePeriod}, {@code lethalDose50}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(areaUnderCurve);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(halfLifePeriod);
    h += (h << 5) + Objects.hashCode(lethalDose50);
    return h;
  }

  /**
   * Prints the immutable value {@code MedicationKnowledge_Kinetics} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("MedicationKnowledge_Kinetics{");
    if (areaUnderCurve != null) {
      builder.append("areaUnderCurve=").append(areaUnderCurve);
    }
    if (id != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (extension != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (modifierExtension != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (halfLifePeriod != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("halfLifePeriod=").append(halfLifePeriod);
    }
    if (lethalDose50 != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("lethalDose50=").append(lethalDose50);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "MedicationKnowledge_Kinetics", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements MedicationKnowledge_Kinetics {
    @Nullable Optional<List<Quantity>> areaUnderCurve = Optional.empty();
    boolean areaUnderCurveIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Duration> halfLifePeriod = Optional.empty();
    boolean halfLifePeriodIsSet;
    @Nullable Optional<List<Quantity>> lethalDose50 = Optional.empty();
    boolean lethalDose50IsSet;
    @JsonProperty("areaUnderCurve")
    public void setAreaUnderCurve(Optional<List<Quantity>> areaUnderCurve) {
      this.areaUnderCurve = areaUnderCurve;
      this.areaUnderCurveIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("halfLifePeriod")
    public void setHalfLifePeriod(Optional<Duration> halfLifePeriod) {
      this.halfLifePeriod = halfLifePeriod;
      this.halfLifePeriodIsSet = true;
    }
    @JsonProperty("lethalDose50")
    public void setLethalDose50(Optional<List<Quantity>> lethalDose50) {
      this.lethalDose50 = lethalDose50;
      this.lethalDose50IsSet = true;
    }
    @Override
    public Optional<List<Quantity>> areaUnderCurve() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Duration> halfLifePeriod() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Quantity>> lethalDose50() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableMedicationKnowledge_Kinetics fromJson(Json json) {
    ImmutableMedicationKnowledge_Kinetics.Builder builder = ImmutableMedicationKnowledge_Kinetics.builder();
    if (json.areaUnderCurveIsSet) {
      builder.areaUnderCurve(json.areaUnderCurve);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.halfLifePeriodIsSet) {
      builder.halfLifePeriod(json.halfLifePeriod);
    }
    if (json.lethalDose50IsSet) {
      builder.lethalDose50(json.lethalDose50);
    }
    return (ImmutableMedicationKnowledge_Kinetics) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link MedicationKnowledge_Kinetics} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable MedicationKnowledge_Kinetics instance
   */
  public static MedicationKnowledge_Kinetics copyOf(MedicationKnowledge_Kinetics instance) {
    if (instance instanceof ImmutableMedicationKnowledge_Kinetics) {
      return (ImmutableMedicationKnowledge_Kinetics) instance;
    }
    return ImmutableMedicationKnowledge_Kinetics.builder()
        .areaUnderCurve(instance.areaUnderCurve())
        .id(instance.id())
        .extension(instance.extension())
        .modifierExtension(instance.modifierExtension())
        .halfLifePeriod(instance.halfLifePeriod())
        .lethalDose50(instance.lethalDose50())
        .build();
  }

  /**
   * Creates a builder for {@link MedicationKnowledge_Kinetics MedicationKnowledge_Kinetics}.
   * <pre>
   * ImmutableMedicationKnowledge_Kinetics.builder()
   *    .areaUnderCurve(List&amp;lt;com.medplum.types.fhir.Quantity&amp;gt;) // optional {@link MedicationKnowledge_Kinetics#areaUnderCurve() areaUnderCurve}
   *    .id(String) // optional {@link MedicationKnowledge_Kinetics#id() id}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link MedicationKnowledge_Kinetics#extension() extension}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link MedicationKnowledge_Kinetics#modifierExtension() modifierExtension}
   *    .halfLifePeriod(com.medplum.types.fhir.Duration) // optional {@link MedicationKnowledge_Kinetics#halfLifePeriod() halfLifePeriod}
   *    .lethalDose50(List&amp;lt;com.medplum.types.fhir.Quantity&amp;gt;) // optional {@link MedicationKnowledge_Kinetics#lethalDose50() lethalDose50}
   *    .build();
   * </pre>
   * @return A new MedicationKnowledge_Kinetics builder
   */
  public static ImmutableMedicationKnowledge_Kinetics.Builder builder() {
    return new ImmutableMedicationKnowledge_Kinetics.Builder();
  }

  /**
   * Builds instances of type {@link MedicationKnowledge_Kinetics MedicationKnowledge_Kinetics}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "MedicationKnowledge_Kinetics", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_AREA_UNDER_CURVE = 0x1L;
    private static final long OPT_BIT_ID = 0x2L;
    private static final long OPT_BIT_EXTENSION = 0x4L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x8L;
    private static final long OPT_BIT_HALF_LIFE_PERIOD = 0x10L;
    private static final long OPT_BIT_LETHAL_DOSE50 = 0x20L;
    private long optBits;

    private @Nullable List<Quantity> areaUnderCurve;
    private @Nullable String id;
    private @Nullable List<Extension> extension;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Duration halfLifePeriod;
    private @Nullable List<Quantity> lethalDose50;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge_Kinetics#areaUnderCurve() areaUnderCurve} to areaUnderCurve.
     * @param areaUnderCurve The value for areaUnderCurve
     * @return {@code this} builder for chained invocation
     */
    public final Builder areaUnderCurve(List<Quantity> areaUnderCurve) {
      checkNotIsSet(areaUnderCurveIsSet(), "areaUnderCurve");
      this.areaUnderCurve = Objects.requireNonNull(areaUnderCurve, "areaUnderCurve");
      optBits |= OPT_BIT_AREA_UNDER_CURVE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge_Kinetics#areaUnderCurve() areaUnderCurve} to areaUnderCurve.
     * @param areaUnderCurve The value for areaUnderCurve
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("areaUnderCurve")
    public final Builder areaUnderCurve(Optional<? extends List<Quantity>> areaUnderCurve) {
      checkNotIsSet(areaUnderCurveIsSet(), "areaUnderCurve");
      this.areaUnderCurve = areaUnderCurve.orElse(null);
      optBits |= OPT_BIT_AREA_UNDER_CURVE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge_Kinetics#id() id} to id.
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
     * Initializes the optional value {@link MedicationKnowledge_Kinetics#id() id} to id.
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
     * Initializes the optional value {@link MedicationKnowledge_Kinetics#extension() extension} to extension.
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
     * Initializes the optional value {@link MedicationKnowledge_Kinetics#extension() extension} to extension.
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
     * Initializes the optional value {@link MedicationKnowledge_Kinetics#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MedicationKnowledge_Kinetics#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MedicationKnowledge_Kinetics#halfLifePeriod() halfLifePeriod} to halfLifePeriod.
     * @param halfLifePeriod The value for halfLifePeriod
     * @return {@code this} builder for chained invocation
     */
    public final Builder halfLifePeriod(Duration halfLifePeriod) {
      checkNotIsSet(halfLifePeriodIsSet(), "halfLifePeriod");
      this.halfLifePeriod = Objects.requireNonNull(halfLifePeriod, "halfLifePeriod");
      optBits |= OPT_BIT_HALF_LIFE_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge_Kinetics#halfLifePeriod() halfLifePeriod} to halfLifePeriod.
     * @param halfLifePeriod The value for halfLifePeriod
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("halfLifePeriod")
    public final Builder halfLifePeriod(Optional<? extends Duration> halfLifePeriod) {
      checkNotIsSet(halfLifePeriodIsSet(), "halfLifePeriod");
      this.halfLifePeriod = halfLifePeriod.orElse(null);
      optBits |= OPT_BIT_HALF_LIFE_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge_Kinetics#lethalDose50() lethalDose50} to lethalDose50.
     * @param lethalDose50 The value for lethalDose50
     * @return {@code this} builder for chained invocation
     */
    public final Builder lethalDose50(List<Quantity> lethalDose50) {
      checkNotIsSet(lethalDose50IsSet(), "lethalDose50");
      this.lethalDose50 = Objects.requireNonNull(lethalDose50, "lethalDose50");
      optBits |= OPT_BIT_LETHAL_DOSE50;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge_Kinetics#lethalDose50() lethalDose50} to lethalDose50.
     * @param lethalDose50 The value for lethalDose50
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("lethalDose50")
    public final Builder lethalDose50(Optional<? extends List<Quantity>> lethalDose50) {
      checkNotIsSet(lethalDose50IsSet(), "lethalDose50");
      this.lethalDose50 = lethalDose50.orElse(null);
      optBits |= OPT_BIT_LETHAL_DOSE50;
      return this;
    }

    /**
     * Builds a new {@link MedicationKnowledge_Kinetics MedicationKnowledge_Kinetics}.
     * @return An immutable instance of MedicationKnowledge_Kinetics
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public MedicationKnowledge_Kinetics build() {
      return new ImmutableMedicationKnowledge_Kinetics(areaUnderCurve, id, extension, modifierExtension, halfLifePeriod, lethalDose50);
    }

    private boolean areaUnderCurveIsSet() {
      return (optBits & OPT_BIT_AREA_UNDER_CURVE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean halfLifePeriodIsSet() {
      return (optBits & OPT_BIT_HALF_LIFE_PERIOD) != 0;
    }

    private boolean lethalDose50IsSet() {
      return (optBits & OPT_BIT_LETHAL_DOSE50) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of MedicationKnowledge_Kinetics is strict, attribute is already set: ".concat(name));
    }
  }
}
