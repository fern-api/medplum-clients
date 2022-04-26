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
 * Immutable implementation of {@link MedicationRequest_DispenseRequest}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMedicationRequest_DispenseRequest.builder()}.
 */
@Generated(from = "MedicationRequest_DispenseRequest", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableMedicationRequest_DispenseRequest
    implements MedicationRequest_DispenseRequest {
  private final @Nullable String id;
  private final @Nullable MedicationRequest_InitialFill initialFill;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Reference performer;
  private final @Nullable Duration expectedSupplyDuration;
  private final @Nullable UnsignedInt numberOfRepeatsAllowed;
  private final @Nullable Duration dispenseInterval;
  private final @Nullable Period validityPeriod;
  private final @Nullable Quantity quantity;
  private final @Nullable List<Extension> extension;

  private ImmutableMedicationRequest_DispenseRequest(
      @Nullable String id,
      @Nullable MedicationRequest_InitialFill initialFill,
      @Nullable List<Extension> modifierExtension,
      @Nullable Reference performer,
      @Nullable Duration expectedSupplyDuration,
      @Nullable UnsignedInt numberOfRepeatsAllowed,
      @Nullable Duration dispenseInterval,
      @Nullable Period validityPeriod,
      @Nullable Quantity quantity,
      @Nullable List<Extension> extension) {
    this.id = id;
    this.initialFill = initialFill;
    this.modifierExtension = modifierExtension;
    this.performer = performer;
    this.expectedSupplyDuration = expectedSupplyDuration;
    this.numberOfRepeatsAllowed = numberOfRepeatsAllowed;
    this.dispenseInterval = dispenseInterval;
    this.validityPeriod = validityPeriod;
    this.quantity = quantity;
    this.extension = extension;
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
   * @return The value of the {@code initialFill} attribute
   */
  @JsonProperty("initialFill")
  @Override
  public Optional<MedicationRequest_InitialFill> initialFill() {
    return Optional.ofNullable(initialFill);
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
   * @return The value of the {@code performer} attribute
   */
  @JsonProperty("performer")
  @Override
  public Optional<Reference> performer() {
    return Optional.ofNullable(performer);
  }

  /**
   * @return The value of the {@code expectedSupplyDuration} attribute
   */
  @JsonProperty("expectedSupplyDuration")
  @Override
  public Optional<Duration> expectedSupplyDuration() {
    return Optional.ofNullable(expectedSupplyDuration);
  }

  /**
   * @return The value of the {@code numberOfRepeatsAllowed} attribute
   */
  @JsonProperty("numberOfRepeatsAllowed")
  @Override
  public Optional<UnsignedInt> numberOfRepeatsAllowed() {
    return Optional.ofNullable(numberOfRepeatsAllowed);
  }

  /**
   * @return The value of the {@code dispenseInterval} attribute
   */
  @JsonProperty("dispenseInterval")
  @Override
  public Optional<Duration> dispenseInterval() {
    return Optional.ofNullable(dispenseInterval);
  }

  /**
   * @return The value of the {@code validityPeriod} attribute
   */
  @JsonProperty("validityPeriod")
  @Override
  public Optional<Period> validityPeriod() {
    return Optional.ofNullable(validityPeriod);
  }

  /**
   * @return The value of the {@code quantity} attribute
   */
  @JsonProperty("quantity")
  @Override
  public Optional<Quantity> quantity() {
    return Optional.ofNullable(quantity);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationRequest_DispenseRequest#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest_DispenseRequest withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableMedicationRequest_DispenseRequest(
        newValue,
        this.initialFill,
        this.modifierExtension,
        this.performer,
        this.expectedSupplyDuration,
        this.numberOfRepeatsAllowed,
        this.dispenseInterval,
        this.validityPeriod,
        this.quantity,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationRequest_DispenseRequest#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest_DispenseRequest withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableMedicationRequest_DispenseRequest(
        value,
        this.initialFill,
        this.modifierExtension,
        this.performer,
        this.expectedSupplyDuration,
        this.numberOfRepeatsAllowed,
        this.dispenseInterval,
        this.validityPeriod,
        this.quantity,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationRequest_DispenseRequest#initialFill() initialFill} attribute.
   * @param value The value for initialFill
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest_DispenseRequest withInitialFill(MedicationRequest_InitialFill value) {
    @Nullable MedicationRequest_InitialFill newValue = Objects.requireNonNull(value, "initialFill");
    if (this.initialFill == newValue) return this;
    return new ImmutableMedicationRequest_DispenseRequest(
        this.id,
        newValue,
        this.modifierExtension,
        this.performer,
        this.expectedSupplyDuration,
        this.numberOfRepeatsAllowed,
        this.dispenseInterval,
        this.validityPeriod,
        this.quantity,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationRequest_DispenseRequest#initialFill() initialFill} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for initialFill
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationRequest_DispenseRequest withInitialFill(Optional<? extends MedicationRequest_InitialFill> optional) {
    @Nullable MedicationRequest_InitialFill value = optional.orElse(null);
    if (this.initialFill == value) return this;
    return new ImmutableMedicationRequest_DispenseRequest(
        this.id,
        value,
        this.modifierExtension,
        this.performer,
        this.expectedSupplyDuration,
        this.numberOfRepeatsAllowed,
        this.dispenseInterval,
        this.validityPeriod,
        this.quantity,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationRequest_DispenseRequest#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest_DispenseRequest withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableMedicationRequest_DispenseRequest(
        this.id,
        this.initialFill,
        newValue,
        this.performer,
        this.expectedSupplyDuration,
        this.numberOfRepeatsAllowed,
        this.dispenseInterval,
        this.validityPeriod,
        this.quantity,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationRequest_DispenseRequest#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationRequest_DispenseRequest withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableMedicationRequest_DispenseRequest(
        this.id,
        this.initialFill,
        value,
        this.performer,
        this.expectedSupplyDuration,
        this.numberOfRepeatsAllowed,
        this.dispenseInterval,
        this.validityPeriod,
        this.quantity,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationRequest_DispenseRequest#performer() performer} attribute.
   * @param value The value for performer
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest_DispenseRequest withPerformer(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "performer");
    if (this.performer == newValue) return this;
    return new ImmutableMedicationRequest_DispenseRequest(
        this.id,
        this.initialFill,
        this.modifierExtension,
        newValue,
        this.expectedSupplyDuration,
        this.numberOfRepeatsAllowed,
        this.dispenseInterval,
        this.validityPeriod,
        this.quantity,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationRequest_DispenseRequest#performer() performer} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for performer
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationRequest_DispenseRequest withPerformer(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.performer == value) return this;
    return new ImmutableMedicationRequest_DispenseRequest(
        this.id,
        this.initialFill,
        this.modifierExtension,
        value,
        this.expectedSupplyDuration,
        this.numberOfRepeatsAllowed,
        this.dispenseInterval,
        this.validityPeriod,
        this.quantity,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationRequest_DispenseRequest#expectedSupplyDuration() expectedSupplyDuration} attribute.
   * @param value The value for expectedSupplyDuration
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest_DispenseRequest withExpectedSupplyDuration(Duration value) {
    @Nullable Duration newValue = Objects.requireNonNull(value, "expectedSupplyDuration");
    if (this.expectedSupplyDuration == newValue) return this;
    return new ImmutableMedicationRequest_DispenseRequest(
        this.id,
        this.initialFill,
        this.modifierExtension,
        this.performer,
        newValue,
        this.numberOfRepeatsAllowed,
        this.dispenseInterval,
        this.validityPeriod,
        this.quantity,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationRequest_DispenseRequest#expectedSupplyDuration() expectedSupplyDuration} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for expectedSupplyDuration
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationRequest_DispenseRequest withExpectedSupplyDuration(Optional<? extends Duration> optional) {
    @Nullable Duration value = optional.orElse(null);
    if (this.expectedSupplyDuration == value) return this;
    return new ImmutableMedicationRequest_DispenseRequest(
        this.id,
        this.initialFill,
        this.modifierExtension,
        this.performer,
        value,
        this.numberOfRepeatsAllowed,
        this.dispenseInterval,
        this.validityPeriod,
        this.quantity,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationRequest_DispenseRequest#numberOfRepeatsAllowed() numberOfRepeatsAllowed} attribute.
   * @param value The value for numberOfRepeatsAllowed
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest_DispenseRequest withNumberOfRepeatsAllowed(UnsignedInt value) {
    @Nullable UnsignedInt newValue = Objects.requireNonNull(value, "numberOfRepeatsAllowed");
    if (this.numberOfRepeatsAllowed == newValue) return this;
    return new ImmutableMedicationRequest_DispenseRequest(
        this.id,
        this.initialFill,
        this.modifierExtension,
        this.performer,
        this.expectedSupplyDuration,
        newValue,
        this.dispenseInterval,
        this.validityPeriod,
        this.quantity,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationRequest_DispenseRequest#numberOfRepeatsAllowed() numberOfRepeatsAllowed} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for numberOfRepeatsAllowed
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationRequest_DispenseRequest withNumberOfRepeatsAllowed(Optional<? extends UnsignedInt> optional) {
    @Nullable UnsignedInt value = optional.orElse(null);
    if (this.numberOfRepeatsAllowed == value) return this;
    return new ImmutableMedicationRequest_DispenseRequest(
        this.id,
        this.initialFill,
        this.modifierExtension,
        this.performer,
        this.expectedSupplyDuration,
        value,
        this.dispenseInterval,
        this.validityPeriod,
        this.quantity,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationRequest_DispenseRequest#dispenseInterval() dispenseInterval} attribute.
   * @param value The value for dispenseInterval
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest_DispenseRequest withDispenseInterval(Duration value) {
    @Nullable Duration newValue = Objects.requireNonNull(value, "dispenseInterval");
    if (this.dispenseInterval == newValue) return this;
    return new ImmutableMedicationRequest_DispenseRequest(
        this.id,
        this.initialFill,
        this.modifierExtension,
        this.performer,
        this.expectedSupplyDuration,
        this.numberOfRepeatsAllowed,
        newValue,
        this.validityPeriod,
        this.quantity,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationRequest_DispenseRequest#dispenseInterval() dispenseInterval} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for dispenseInterval
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationRequest_DispenseRequest withDispenseInterval(Optional<? extends Duration> optional) {
    @Nullable Duration value = optional.orElse(null);
    if (this.dispenseInterval == value) return this;
    return new ImmutableMedicationRequest_DispenseRequest(
        this.id,
        this.initialFill,
        this.modifierExtension,
        this.performer,
        this.expectedSupplyDuration,
        this.numberOfRepeatsAllowed,
        value,
        this.validityPeriod,
        this.quantity,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationRequest_DispenseRequest#validityPeriod() validityPeriod} attribute.
   * @param value The value for validityPeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest_DispenseRequest withValidityPeriod(Period value) {
    @Nullable Period newValue = Objects.requireNonNull(value, "validityPeriod");
    if (this.validityPeriod == newValue) return this;
    return new ImmutableMedicationRequest_DispenseRequest(
        this.id,
        this.initialFill,
        this.modifierExtension,
        this.performer,
        this.expectedSupplyDuration,
        this.numberOfRepeatsAllowed,
        this.dispenseInterval,
        newValue,
        this.quantity,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationRequest_DispenseRequest#validityPeriod() validityPeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for validityPeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationRequest_DispenseRequest withValidityPeriod(Optional<? extends Period> optional) {
    @Nullable Period value = optional.orElse(null);
    if (this.validityPeriod == value) return this;
    return new ImmutableMedicationRequest_DispenseRequest(
        this.id,
        this.initialFill,
        this.modifierExtension,
        this.performer,
        this.expectedSupplyDuration,
        this.numberOfRepeatsAllowed,
        this.dispenseInterval,
        value,
        this.quantity,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationRequest_DispenseRequest#quantity() quantity} attribute.
   * @param value The value for quantity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest_DispenseRequest withQuantity(Quantity value) {
    @Nullable Quantity newValue = Objects.requireNonNull(value, "quantity");
    if (this.quantity == newValue) return this;
    return new ImmutableMedicationRequest_DispenseRequest(
        this.id,
        this.initialFill,
        this.modifierExtension,
        this.performer,
        this.expectedSupplyDuration,
        this.numberOfRepeatsAllowed,
        this.dispenseInterval,
        this.validityPeriod,
        newValue,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationRequest_DispenseRequest#quantity() quantity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for quantity
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationRequest_DispenseRequest withQuantity(Optional<? extends Quantity> optional) {
    @Nullable Quantity value = optional.orElse(null);
    if (this.quantity == value) return this;
    return new ImmutableMedicationRequest_DispenseRequest(
        this.id,
        this.initialFill,
        this.modifierExtension,
        this.performer,
        this.expectedSupplyDuration,
        this.numberOfRepeatsAllowed,
        this.dispenseInterval,
        this.validityPeriod,
        value,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationRequest_DispenseRequest#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationRequest_DispenseRequest withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableMedicationRequest_DispenseRequest(
        this.id,
        this.initialFill,
        this.modifierExtension,
        this.performer,
        this.expectedSupplyDuration,
        this.numberOfRepeatsAllowed,
        this.dispenseInterval,
        this.validityPeriod,
        this.quantity,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationRequest_DispenseRequest#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationRequest_DispenseRequest withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableMedicationRequest_DispenseRequest(
        this.id,
        this.initialFill,
        this.modifierExtension,
        this.performer,
        this.expectedSupplyDuration,
        this.numberOfRepeatsAllowed,
        this.dispenseInterval,
        this.validityPeriod,
        this.quantity,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMedicationRequest_DispenseRequest} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMedicationRequest_DispenseRequest
        && equalTo((ImmutableMedicationRequest_DispenseRequest) another);
  }

  private boolean equalTo(ImmutableMedicationRequest_DispenseRequest another) {
    return Objects.equals(id, another.id)
        && Objects.equals(initialFill, another.initialFill)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(performer, another.performer)
        && Objects.equals(expectedSupplyDuration, another.expectedSupplyDuration)
        && Objects.equals(numberOfRepeatsAllowed, another.numberOfRepeatsAllowed)
        && Objects.equals(dispenseInterval, another.dispenseInterval)
        && Objects.equals(validityPeriod, another.validityPeriod)
        && Objects.equals(quantity, another.quantity)
        && Objects.equals(extension, another.extension);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code initialFill}, {@code modifierExtension}, {@code performer}, {@code expectedSupplyDuration}, {@code numberOfRepeatsAllowed}, {@code dispenseInterval}, {@code validityPeriod}, {@code quantity}, {@code extension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(initialFill);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(performer);
    h += (h << 5) + Objects.hashCode(expectedSupplyDuration);
    h += (h << 5) + Objects.hashCode(numberOfRepeatsAllowed);
    h += (h << 5) + Objects.hashCode(dispenseInterval);
    h += (h << 5) + Objects.hashCode(validityPeriod);
    h += (h << 5) + Objects.hashCode(quantity);
    h += (h << 5) + Objects.hashCode(extension);
    return h;
  }

  /**
   * Prints the immutable value {@code MedicationRequest_DispenseRequest} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("MedicationRequest_DispenseRequest{");
    if (id != null) {
      builder.append("id=").append(id);
    }
    if (initialFill != null) {
      if (builder.length() > 34) builder.append(", ");
      builder.append("initialFill=").append(initialFill);
    }
    if (modifierExtension != null) {
      if (builder.length() > 34) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (performer != null) {
      if (builder.length() > 34) builder.append(", ");
      builder.append("performer=").append(performer);
    }
    if (expectedSupplyDuration != null) {
      if (builder.length() > 34) builder.append(", ");
      builder.append("expectedSupplyDuration=").append(expectedSupplyDuration);
    }
    if (numberOfRepeatsAllowed != null) {
      if (builder.length() > 34) builder.append(", ");
      builder.append("numberOfRepeatsAllowed=").append(numberOfRepeatsAllowed);
    }
    if (dispenseInterval != null) {
      if (builder.length() > 34) builder.append(", ");
      builder.append("dispenseInterval=").append(dispenseInterval);
    }
    if (validityPeriod != null) {
      if (builder.length() > 34) builder.append(", ");
      builder.append("validityPeriod=").append(validityPeriod);
    }
    if (quantity != null) {
      if (builder.length() > 34) builder.append(", ");
      builder.append("quantity=").append(quantity);
    }
    if (extension != null) {
      if (builder.length() > 34) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "MedicationRequest_DispenseRequest", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements MedicationRequest_DispenseRequest {
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<MedicationRequest_InitialFill> initialFill = Optional.empty();
    boolean initialFillIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Reference> performer = Optional.empty();
    boolean performerIsSet;
    @Nullable Optional<Duration> expectedSupplyDuration = Optional.empty();
    boolean expectedSupplyDurationIsSet;
    @Nullable Optional<UnsignedInt> numberOfRepeatsAllowed = Optional.empty();
    boolean numberOfRepeatsAllowedIsSet;
    @Nullable Optional<Duration> dispenseInterval = Optional.empty();
    boolean dispenseIntervalIsSet;
    @Nullable Optional<Period> validityPeriod = Optional.empty();
    boolean validityPeriodIsSet;
    @Nullable Optional<Quantity> quantity = Optional.empty();
    boolean quantityIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("initialFill")
    public void setInitialFill(Optional<MedicationRequest_InitialFill> initialFill) {
      this.initialFill = initialFill;
      this.initialFillIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("performer")
    public void setPerformer(Optional<Reference> performer) {
      this.performer = performer;
      this.performerIsSet = true;
    }
    @JsonProperty("expectedSupplyDuration")
    public void setExpectedSupplyDuration(Optional<Duration> expectedSupplyDuration) {
      this.expectedSupplyDuration = expectedSupplyDuration;
      this.expectedSupplyDurationIsSet = true;
    }
    @JsonProperty("numberOfRepeatsAllowed")
    public void setNumberOfRepeatsAllowed(Optional<UnsignedInt> numberOfRepeatsAllowed) {
      this.numberOfRepeatsAllowed = numberOfRepeatsAllowed;
      this.numberOfRepeatsAllowedIsSet = true;
    }
    @JsonProperty("dispenseInterval")
    public void setDispenseInterval(Optional<Duration> dispenseInterval) {
      this.dispenseInterval = dispenseInterval;
      this.dispenseIntervalIsSet = true;
    }
    @JsonProperty("validityPeriod")
    public void setValidityPeriod(Optional<Period> validityPeriod) {
      this.validityPeriod = validityPeriod;
      this.validityPeriodIsSet = true;
    }
    @JsonProperty("quantity")
    public void setQuantity(Optional<Quantity> quantity) {
      this.quantity = quantity;
      this.quantityIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<MedicationRequest_InitialFill> initialFill() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> performer() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Duration> expectedSupplyDuration() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<UnsignedInt> numberOfRepeatsAllowed() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Duration> dispenseInterval() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Period> validityPeriod() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Quantity> quantity() { throw new UnsupportedOperationException(); }
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
  static ImmutableMedicationRequest_DispenseRequest fromJson(Json json) {
    ImmutableMedicationRequest_DispenseRequest.Builder builder = ImmutableMedicationRequest_DispenseRequest.builder();
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.initialFillIsSet) {
      builder.initialFill(json.initialFill);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.performerIsSet) {
      builder.performer(json.performer);
    }
    if (json.expectedSupplyDurationIsSet) {
      builder.expectedSupplyDuration(json.expectedSupplyDuration);
    }
    if (json.numberOfRepeatsAllowedIsSet) {
      builder.numberOfRepeatsAllowed(json.numberOfRepeatsAllowed);
    }
    if (json.dispenseIntervalIsSet) {
      builder.dispenseInterval(json.dispenseInterval);
    }
    if (json.validityPeriodIsSet) {
      builder.validityPeriod(json.validityPeriod);
    }
    if (json.quantityIsSet) {
      builder.quantity(json.quantity);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    return (ImmutableMedicationRequest_DispenseRequest) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link MedicationRequest_DispenseRequest} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable MedicationRequest_DispenseRequest instance
   */
  public static MedicationRequest_DispenseRequest copyOf(MedicationRequest_DispenseRequest instance) {
    if (instance instanceof ImmutableMedicationRequest_DispenseRequest) {
      return (ImmutableMedicationRequest_DispenseRequest) instance;
    }
    return ImmutableMedicationRequest_DispenseRequest.builder()
        .id(instance.id())
        .initialFill(instance.initialFill())
        .modifierExtension(instance.modifierExtension())
        .performer(instance.performer())
        .expectedSupplyDuration(instance.expectedSupplyDuration())
        .numberOfRepeatsAllowed(instance.numberOfRepeatsAllowed())
        .dispenseInterval(instance.dispenseInterval())
        .validityPeriod(instance.validityPeriod())
        .quantity(instance.quantity())
        .extension(instance.extension())
        .build();
  }

  /**
   * Creates a builder for {@link MedicationRequest_DispenseRequest MedicationRequest_DispenseRequest}.
   * <pre>
   * ImmutableMedicationRequest_DispenseRequest.builder()
   *    .id(String) // optional {@link MedicationRequest_DispenseRequest#id() id}
   *    .initialFill(com.medplum.types.fhir.MedicationRequest_InitialFill) // optional {@link MedicationRequest_DispenseRequest#initialFill() initialFill}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link MedicationRequest_DispenseRequest#modifierExtension() modifierExtension}
   *    .performer(com.medplum.types.fhir.Reference) // optional {@link MedicationRequest_DispenseRequest#performer() performer}
   *    .expectedSupplyDuration(com.medplum.types.fhir.Duration) // optional {@link MedicationRequest_DispenseRequest#expectedSupplyDuration() expectedSupplyDuration}
   *    .numberOfRepeatsAllowed(com.medplum.types.fhir.UnsignedInt) // optional {@link MedicationRequest_DispenseRequest#numberOfRepeatsAllowed() numberOfRepeatsAllowed}
   *    .dispenseInterval(com.medplum.types.fhir.Duration) // optional {@link MedicationRequest_DispenseRequest#dispenseInterval() dispenseInterval}
   *    .validityPeriod(com.medplum.types.fhir.Period) // optional {@link MedicationRequest_DispenseRequest#validityPeriod() validityPeriod}
   *    .quantity(com.medplum.types.fhir.Quantity) // optional {@link MedicationRequest_DispenseRequest#quantity() quantity}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link MedicationRequest_DispenseRequest#extension() extension}
   *    .build();
   * </pre>
   * @return A new MedicationRequest_DispenseRequest builder
   */
  public static ImmutableMedicationRequest_DispenseRequest.Builder builder() {
    return new ImmutableMedicationRequest_DispenseRequest.Builder();
  }

  /**
   * Builds instances of type {@link MedicationRequest_DispenseRequest MedicationRequest_DispenseRequest}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "MedicationRequest_DispenseRequest", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_ID = 0x1L;
    private static final long OPT_BIT_INITIAL_FILL = 0x2L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x4L;
    private static final long OPT_BIT_PERFORMER = 0x8L;
    private static final long OPT_BIT_EXPECTED_SUPPLY_DURATION = 0x10L;
    private static final long OPT_BIT_NUMBER_OF_REPEATS_ALLOWED = 0x20L;
    private static final long OPT_BIT_DISPENSE_INTERVAL = 0x40L;
    private static final long OPT_BIT_VALIDITY_PERIOD = 0x80L;
    private static final long OPT_BIT_QUANTITY = 0x100L;
    private static final long OPT_BIT_EXTENSION = 0x200L;
    private long optBits;

    private @Nullable String id;
    private @Nullable MedicationRequest_InitialFill initialFill;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Reference performer;
    private @Nullable Duration expectedSupplyDuration;
    private @Nullable UnsignedInt numberOfRepeatsAllowed;
    private @Nullable Duration dispenseInterval;
    private @Nullable Period validityPeriod;
    private @Nullable Quantity quantity;
    private @Nullable List<Extension> extension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link MedicationRequest_DispenseRequest#id() id} to id.
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
     * Initializes the optional value {@link MedicationRequest_DispenseRequest#id() id} to id.
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
     * Initializes the optional value {@link MedicationRequest_DispenseRequest#initialFill() initialFill} to initialFill.
     * @param initialFill The value for initialFill
     * @return {@code this} builder for chained invocation
     */
    public final Builder initialFill(MedicationRequest_InitialFill initialFill) {
      checkNotIsSet(initialFillIsSet(), "initialFill");
      this.initialFill = Objects.requireNonNull(initialFill, "initialFill");
      optBits |= OPT_BIT_INITIAL_FILL;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest_DispenseRequest#initialFill() initialFill} to initialFill.
     * @param initialFill The value for initialFill
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("initialFill")
    public final Builder initialFill(Optional<? extends MedicationRequest_InitialFill> initialFill) {
      checkNotIsSet(initialFillIsSet(), "initialFill");
      this.initialFill = initialFill.orElse(null);
      optBits |= OPT_BIT_INITIAL_FILL;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest_DispenseRequest#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MedicationRequest_DispenseRequest#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MedicationRequest_DispenseRequest#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for chained invocation
     */
    public final Builder performer(Reference performer) {
      checkNotIsSet(performerIsSet(), "performer");
      this.performer = Objects.requireNonNull(performer, "performer");
      optBits |= OPT_BIT_PERFORMER;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest_DispenseRequest#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("performer")
    public final Builder performer(Optional<? extends Reference> performer) {
      checkNotIsSet(performerIsSet(), "performer");
      this.performer = performer.orElse(null);
      optBits |= OPT_BIT_PERFORMER;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest_DispenseRequest#expectedSupplyDuration() expectedSupplyDuration} to expectedSupplyDuration.
     * @param expectedSupplyDuration The value for expectedSupplyDuration
     * @return {@code this} builder for chained invocation
     */
    public final Builder expectedSupplyDuration(Duration expectedSupplyDuration) {
      checkNotIsSet(expectedSupplyDurationIsSet(), "expectedSupplyDuration");
      this.expectedSupplyDuration = Objects.requireNonNull(expectedSupplyDuration, "expectedSupplyDuration");
      optBits |= OPT_BIT_EXPECTED_SUPPLY_DURATION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest_DispenseRequest#expectedSupplyDuration() expectedSupplyDuration} to expectedSupplyDuration.
     * @param expectedSupplyDuration The value for expectedSupplyDuration
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("expectedSupplyDuration")
    public final Builder expectedSupplyDuration(Optional<? extends Duration> expectedSupplyDuration) {
      checkNotIsSet(expectedSupplyDurationIsSet(), "expectedSupplyDuration");
      this.expectedSupplyDuration = expectedSupplyDuration.orElse(null);
      optBits |= OPT_BIT_EXPECTED_SUPPLY_DURATION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest_DispenseRequest#numberOfRepeatsAllowed() numberOfRepeatsAllowed} to numberOfRepeatsAllowed.
     * @param numberOfRepeatsAllowed The value for numberOfRepeatsAllowed
     * @return {@code this} builder for chained invocation
     */
    public final Builder numberOfRepeatsAllowed(UnsignedInt numberOfRepeatsAllowed) {
      checkNotIsSet(numberOfRepeatsAllowedIsSet(), "numberOfRepeatsAllowed");
      this.numberOfRepeatsAllowed = Objects.requireNonNull(numberOfRepeatsAllowed, "numberOfRepeatsAllowed");
      optBits |= OPT_BIT_NUMBER_OF_REPEATS_ALLOWED;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest_DispenseRequest#numberOfRepeatsAllowed() numberOfRepeatsAllowed} to numberOfRepeatsAllowed.
     * @param numberOfRepeatsAllowed The value for numberOfRepeatsAllowed
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("numberOfRepeatsAllowed")
    public final Builder numberOfRepeatsAllowed(Optional<? extends UnsignedInt> numberOfRepeatsAllowed) {
      checkNotIsSet(numberOfRepeatsAllowedIsSet(), "numberOfRepeatsAllowed");
      this.numberOfRepeatsAllowed = numberOfRepeatsAllowed.orElse(null);
      optBits |= OPT_BIT_NUMBER_OF_REPEATS_ALLOWED;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest_DispenseRequest#dispenseInterval() dispenseInterval} to dispenseInterval.
     * @param dispenseInterval The value for dispenseInterval
     * @return {@code this} builder for chained invocation
     */
    public final Builder dispenseInterval(Duration dispenseInterval) {
      checkNotIsSet(dispenseIntervalIsSet(), "dispenseInterval");
      this.dispenseInterval = Objects.requireNonNull(dispenseInterval, "dispenseInterval");
      optBits |= OPT_BIT_DISPENSE_INTERVAL;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest_DispenseRequest#dispenseInterval() dispenseInterval} to dispenseInterval.
     * @param dispenseInterval The value for dispenseInterval
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("dispenseInterval")
    public final Builder dispenseInterval(Optional<? extends Duration> dispenseInterval) {
      checkNotIsSet(dispenseIntervalIsSet(), "dispenseInterval");
      this.dispenseInterval = dispenseInterval.orElse(null);
      optBits |= OPT_BIT_DISPENSE_INTERVAL;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest_DispenseRequest#validityPeriod() validityPeriod} to validityPeriod.
     * @param validityPeriod The value for validityPeriod
     * @return {@code this} builder for chained invocation
     */
    public final Builder validityPeriod(Period validityPeriod) {
      checkNotIsSet(validityPeriodIsSet(), "validityPeriod");
      this.validityPeriod = Objects.requireNonNull(validityPeriod, "validityPeriod");
      optBits |= OPT_BIT_VALIDITY_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest_DispenseRequest#validityPeriod() validityPeriod} to validityPeriod.
     * @param validityPeriod The value for validityPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("validityPeriod")
    public final Builder validityPeriod(Optional<? extends Period> validityPeriod) {
      checkNotIsSet(validityPeriodIsSet(), "validityPeriod");
      this.validityPeriod = validityPeriod.orElse(null);
      optBits |= OPT_BIT_VALIDITY_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest_DispenseRequest#quantity() quantity} to quantity.
     * @param quantity The value for quantity
     * @return {@code this} builder for chained invocation
     */
    public final Builder quantity(Quantity quantity) {
      checkNotIsSet(quantityIsSet(), "quantity");
      this.quantity = Objects.requireNonNull(quantity, "quantity");
      optBits |= OPT_BIT_QUANTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest_DispenseRequest#quantity() quantity} to quantity.
     * @param quantity The value for quantity
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("quantity")
    public final Builder quantity(Optional<? extends Quantity> quantity) {
      checkNotIsSet(quantityIsSet(), "quantity");
      this.quantity = quantity.orElse(null);
      optBits |= OPT_BIT_QUANTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationRequest_DispenseRequest#extension() extension} to extension.
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
     * Initializes the optional value {@link MedicationRequest_DispenseRequest#extension() extension} to extension.
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
     * Builds a new {@link MedicationRequest_DispenseRequest MedicationRequest_DispenseRequest}.
     * @return An immutable instance of MedicationRequest_DispenseRequest
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public MedicationRequest_DispenseRequest build() {
      return new ImmutableMedicationRequest_DispenseRequest(
          id,
          initialFill,
          modifierExtension,
          performer,
          expectedSupplyDuration,
          numberOfRepeatsAllowed,
          dispenseInterval,
          validityPeriod,
          quantity,
          extension);
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean initialFillIsSet() {
      return (optBits & OPT_BIT_INITIAL_FILL) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean performerIsSet() {
      return (optBits & OPT_BIT_PERFORMER) != 0;
    }

    private boolean expectedSupplyDurationIsSet() {
      return (optBits & OPT_BIT_EXPECTED_SUPPLY_DURATION) != 0;
    }

    private boolean numberOfRepeatsAllowedIsSet() {
      return (optBits & OPT_BIT_NUMBER_OF_REPEATS_ALLOWED) != 0;
    }

    private boolean dispenseIntervalIsSet() {
      return (optBits & OPT_BIT_DISPENSE_INTERVAL) != 0;
    }

    private boolean validityPeriodIsSet() {
      return (optBits & OPT_BIT_VALIDITY_PERIOD) != 0;
    }

    private boolean quantityIsSet() {
      return (optBits & OPT_BIT_QUANTITY) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of MedicationRequest_DispenseRequest is strict, attribute is already set: ".concat(name));
    }
  }
}
