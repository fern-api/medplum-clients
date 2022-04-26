package com.fhir.types.fhir;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link Encounter_Location}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableEncounter_Location.builder()}.
 */
@Generated(from = "Encounter_Location", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableEncounter_Location implements Encounter_Location {
  private final @Nullable Encounter_LocationStatus status;
  private final @Nullable CodeableConcept physicalType;
  private final @Nullable Period period;
  private final Reference location;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable String id;
  private final @Nullable List<Extension> extension;

  private ImmutableEncounter_Location(
      @Nullable Encounter_LocationStatus status,
      @Nullable CodeableConcept physicalType,
      @Nullable Period period,
      Reference location,
      @Nullable List<Extension> modifierExtension,
      @Nullable String id,
      @Nullable List<Extension> extension) {
    this.status = status;
    this.physicalType = physicalType;
    this.period = period;
    this.location = location;
    this.modifierExtension = modifierExtension;
    this.id = id;
    this.extension = extension;
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @JsonProperty("status")
  @Override
  public Optional<Encounter_LocationStatus> status() {
    return Optional.ofNullable(status);
  }

  /**
   * @return The value of the {@code physicalType} attribute
   */
  @JsonProperty("physicalType")
  @Override
  public Optional<CodeableConcept> physicalType() {
    return Optional.ofNullable(physicalType);
  }

  /**
   * @return The value of the {@code period} attribute
   */
  @JsonProperty("period")
  @Override
  public Optional<Period> period() {
    return Optional.ofNullable(period);
  }

  /**
   * @return The value of the {@code location} attribute
   */
  @JsonProperty("location")
  @Override
  public Reference location() {
    return location;
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Encounter_Location#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEncounter_Location withStatus(Encounter_LocationStatus value) {
    @Nullable Encounter_LocationStatus newValue = Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableEncounter_Location(
        newValue,
        this.physicalType,
        this.period,
        this.location,
        this.modifierExtension,
        this.id,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Encounter_Location#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEncounter_Location withStatus(Optional<? extends Encounter_LocationStatus> optional) {
    @Nullable Encounter_LocationStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableEncounter_Location(
        value,
        this.physicalType,
        this.period,
        this.location,
        this.modifierExtension,
        this.id,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Encounter_Location#physicalType() physicalType} attribute.
   * @param value The value for physicalType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEncounter_Location withPhysicalType(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "physicalType");
    if (this.physicalType == newValue) return this;
    return new ImmutableEncounter_Location(
        this.status,
        newValue,
        this.period,
        this.location,
        this.modifierExtension,
        this.id,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Encounter_Location#physicalType() physicalType} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for physicalType
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEncounter_Location withPhysicalType(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.physicalType == value) return this;
    return new ImmutableEncounter_Location(this.status, value, this.period, this.location, this.modifierExtension, this.id, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Encounter_Location#period() period} attribute.
   * @param value The value for period
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEncounter_Location withPeriod(Period value) {
    @Nullable Period newValue = Objects.requireNonNull(value, "period");
    if (this.period == newValue) return this;
    return new ImmutableEncounter_Location(
        this.status,
        this.physicalType,
        newValue,
        this.location,
        this.modifierExtension,
        this.id,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Encounter_Location#period() period} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for period
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEncounter_Location withPeriod(Optional<? extends Period> optional) {
    @Nullable Period value = optional.orElse(null);
    if (this.period == value) return this;
    return new ImmutableEncounter_Location(
        this.status,
        this.physicalType,
        value,
        this.location,
        this.modifierExtension,
        this.id,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Encounter_Location#location() location} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for location
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEncounter_Location withLocation(Reference value) {
    if (this.location == value) return this;
    Reference newValue = Objects.requireNonNull(value, "location");
    return new ImmutableEncounter_Location(
        this.status,
        this.physicalType,
        this.period,
        newValue,
        this.modifierExtension,
        this.id,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Encounter_Location#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEncounter_Location withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableEncounter_Location(this.status, this.physicalType, this.period, this.location, newValue, this.id, this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Encounter_Location#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEncounter_Location withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableEncounter_Location(this.status, this.physicalType, this.period, this.location, value, this.id, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Encounter_Location#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEncounter_Location withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableEncounter_Location(
        this.status,
        this.physicalType,
        this.period,
        this.location,
        this.modifierExtension,
        newValue,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Encounter_Location#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEncounter_Location withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableEncounter_Location(
        this.status,
        this.physicalType,
        this.period,
        this.location,
        this.modifierExtension,
        value,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Encounter_Location#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEncounter_Location withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableEncounter_Location(
        this.status,
        this.physicalType,
        this.period,
        this.location,
        this.modifierExtension,
        this.id,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Encounter_Location#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEncounter_Location withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableEncounter_Location(
        this.status,
        this.physicalType,
        this.period,
        this.location,
        this.modifierExtension,
        this.id,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableEncounter_Location} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableEncounter_Location
        && equalTo((ImmutableEncounter_Location) another);
  }

  private boolean equalTo(ImmutableEncounter_Location another) {
    return Objects.equals(status, another.status)
        && Objects.equals(physicalType, another.physicalType)
        && Objects.equals(period, another.period)
        && location.equals(another.location)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(id, another.id)
        && Objects.equals(extension, another.extension);
  }

  /**
   * Computes a hash code from attributes: {@code status}, {@code physicalType}, {@code period}, {@code location}, {@code modifierExtension}, {@code id}, {@code extension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(status);
    h += (h << 5) + Objects.hashCode(physicalType);
    h += (h << 5) + Objects.hashCode(period);
    h += (h << 5) + location.hashCode();
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(extension);
    return h;
  }

  /**
   * Prints the immutable value {@code Encounter_Location} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Encounter_Location{");
    if (status != null) {
      builder.append("status=").append(status);
    }
    if (physicalType != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("physicalType=").append(physicalType);
    }
    if (period != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("period=").append(period);
    }
    if (builder.length() > 19) builder.append(", ");
    builder.append("location=").append(location);
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Encounter_Location", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Encounter_Location {
    @Nullable Optional<Encounter_LocationStatus> status = Optional.empty();
    boolean statusIsSet;
    @Nullable Optional<CodeableConcept> physicalType = Optional.empty();
    boolean physicalTypeIsSet;
    @Nullable Optional<Period> period = Optional.empty();
    boolean periodIsSet;
    @Nullable Reference location;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @JsonProperty("status")
    public void setStatus(Optional<Encounter_LocationStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @JsonProperty("physicalType")
    public void setPhysicalType(Optional<CodeableConcept> physicalType) {
      this.physicalType = physicalType;
      this.physicalTypeIsSet = true;
    }
    @JsonProperty("period")
    public void setPeriod(Optional<Period> period) {
      this.period = period;
      this.periodIsSet = true;
    }
    @JsonProperty("location")
    public void setLocation(Reference location) {
      this.location = location;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
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
    @Override
    public Optional<Encounter_LocationStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> physicalType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Period> period() { throw new UnsupportedOperationException(); }
    @Override
    public Reference location() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableEncounter_Location fromJson(Json json) {
    ImmutableEncounter_Location.Builder builder = ((ImmutableEncounter_Location.Builder) ImmutableEncounter_Location.builder());
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.physicalTypeIsSet) {
      builder.physicalType(json.physicalType);
    }
    if (json.periodIsSet) {
      builder.period(json.period);
    }
    if (json.location != null) {
      builder.location(json.location);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    return (ImmutableEncounter_Location) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Encounter_Location} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Encounter_Location instance
   */
  public static Encounter_Location copyOf(Encounter_Location instance) {
    if (instance instanceof ImmutableEncounter_Location) {
      return (ImmutableEncounter_Location) instance;
    }
    return ((ImmutableEncounter_Location.Builder) ImmutableEncounter_Location.builder())
        .status(instance.status())
        .physicalType(instance.physicalType())
        .period(instance.period())
        .location(instance.location())
        .modifierExtension(instance.modifierExtension())
        .id(instance.id())
        .extension(instance.extension())
        .build();
  }

  /**
   * Creates a builder for {@link Encounter_Location Encounter_Location}.
   * <pre>
   * ImmutableEncounter_Location.builder()
   *    .status(Encounter_LocationStatus) // optional {@link Encounter_Location#status() status}
   *    .physicalType(com.fhir.types.fhir.CodeableConcept) // optional {@link Encounter_Location#physicalType() physicalType}
   *    .period(com.fhir.types.fhir.Period) // optional {@link Encounter_Location#period() period}
   *    .location(com.fhir.types.fhir.Reference) // required {@link Encounter_Location#location() location}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Encounter_Location#modifierExtension() modifierExtension}
   *    .id(String) // optional {@link Encounter_Location#id() id}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Encounter_Location#extension() extension}
   *    .build();
   * </pre>
   * @return A new Encounter_Location builder
   */
  public static LocationBuildStage builder() {
    return new ImmutableEncounter_Location.Builder();
  }

  /**
   * Builds instances of type {@link Encounter_Location Encounter_Location}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Encounter_Location", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements LocationBuildStage, BuildFinal {
    private static final long INIT_BIT_LOCATION = 0x1L;
    private static final long OPT_BIT_STATUS = 0x1L;
    private static final long OPT_BIT_PHYSICAL_TYPE = 0x2L;
    private static final long OPT_BIT_PERIOD = 0x4L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x8L;
    private static final long OPT_BIT_ID = 0x10L;
    private static final long OPT_BIT_EXTENSION = 0x20L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable Encounter_LocationStatus status;
    private @Nullable CodeableConcept physicalType;
    private @Nullable Period period;
    private @Nullable Reference location;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable String id;
    private @Nullable List<Extension> extension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Encounter_Location#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(Encounter_LocationStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Encounter_Location#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("status")
    public final Builder status(Optional<? extends Encounter_LocationStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Encounter_Location#physicalType() physicalType} to physicalType.
     * @param physicalType The value for physicalType
     * @return {@code this} builder for chained invocation
     */
    public final Builder physicalType(CodeableConcept physicalType) {
      checkNotIsSet(physicalTypeIsSet(), "physicalType");
      this.physicalType = Objects.requireNonNull(physicalType, "physicalType");
      optBits |= OPT_BIT_PHYSICAL_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Encounter_Location#physicalType() physicalType} to physicalType.
     * @param physicalType The value for physicalType
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("physicalType")
    public final Builder physicalType(Optional<? extends CodeableConcept> physicalType) {
      checkNotIsSet(physicalTypeIsSet(), "physicalType");
      this.physicalType = physicalType.orElse(null);
      optBits |= OPT_BIT_PHYSICAL_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Encounter_Location#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for chained invocation
     */
    public final Builder period(Period period) {
      checkNotIsSet(periodIsSet(), "period");
      this.period = Objects.requireNonNull(period, "period");
      optBits |= OPT_BIT_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link Encounter_Location#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("period")
    public final Builder period(Optional<? extends Period> period) {
      checkNotIsSet(periodIsSet(), "period");
      this.period = period.orElse(null);
      optBits |= OPT_BIT_PERIOD;
      return this;
    }

    /**
     * Initializes the value for the {@link Encounter_Location#location() location} attribute.
     * @param location The value for location 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("location")
    public final Builder location(Reference location) {
      checkNotIsSet(locationIsSet(), "location");
      this.location = Objects.requireNonNull(location, "location");
      initBits &= ~INIT_BIT_LOCATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Encounter_Location#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Encounter_Location#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Encounter_Location#id() id} to id.
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
     * Initializes the optional value {@link Encounter_Location#id() id} to id.
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
     * Initializes the optional value {@link Encounter_Location#extension() extension} to extension.
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
     * Initializes the optional value {@link Encounter_Location#extension() extension} to extension.
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
     * Builds a new {@link Encounter_Location Encounter_Location}.
     * @return An immutable instance of Encounter_Location
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Encounter_Location build() {
      checkRequiredAttributes();
      return new ImmutableEncounter_Location(status, physicalType, period, location, modifierExtension, id, extension);
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean physicalTypeIsSet() {
      return (optBits & OPT_BIT_PHYSICAL_TYPE) != 0;
    }

    private boolean periodIsSet() {
      return (optBits & OPT_BIT_PERIOD) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean locationIsSet() {
      return (initBits & INIT_BIT_LOCATION) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Encounter_Location is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!locationIsSet()) attributes.add("location");
      return "Cannot build Encounter_Location, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "Encounter_Location", generator = "Immutables")
  public interface LocationBuildStage {
    /**
     * Initializes the value for the {@link Encounter_Location#location() location} attribute.
     * @param location The value for location 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal location(Reference location);
  }

  @Generated(from = "Encounter_Location", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Encounter_Location#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(Encounter_LocationStatus status);

    /**
     * Initializes the optional value {@link Encounter_Location#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(Optional<? extends Encounter_LocationStatus> status);

    /**
     * Initializes the optional value {@link Encounter_Location#physicalType() physicalType} to physicalType.
     * @param physicalType The value for physicalType
     * @return {@code this} builder for chained invocation
     */
    BuildFinal physicalType(CodeableConcept physicalType);

    /**
     * Initializes the optional value {@link Encounter_Location#physicalType() physicalType} to physicalType.
     * @param physicalType The value for physicalType
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal physicalType(Optional<? extends CodeableConcept> physicalType);

    /**
     * Initializes the optional value {@link Encounter_Location#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for chained invocation
     */
    BuildFinal period(Period period);

    /**
     * Initializes the optional value {@link Encounter_Location#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal period(Optional<? extends Period> period);

    /**
     * Initializes the optional value {@link Encounter_Location#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link Encounter_Location#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link Encounter_Location#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(String id);

    /**
     * Initializes the optional value {@link Encounter_Location#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<String> id);

    /**
     * Initializes the optional value {@link Encounter_Location#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link Encounter_Location#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Builds a new {@link Encounter_Location Encounter_Location}.
     * @return An immutable instance of Encounter_Location
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Encounter_Location build();
  }
}
