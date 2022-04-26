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
 * Immutable implementation of {@link MedicinalProduct_ManufacturingBusinessOperation}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMedicinalProduct_ManufacturingBusinessOperation.builder()}.
 */
@Generated(from = "MedicinalProduct_ManufacturingBusinessOperation", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableMedicinalProduct_ManufacturingBusinessOperation
    implements MedicinalProduct_ManufacturingBusinessOperation {
  private final @Nullable String id;
  private final @Nullable CodeableConcept operationType;
  private final @Nullable List<Extension> extension;
  private final @Nullable Reference regulator;
  private final @Nullable Identifier authorisationReferenceNumber;
  private final @Nullable List<Reference> manufacturer;
  private final @Nullable DateTime effectiveDate;
  private final @Nullable CodeableConcept confidentialityIndicator;
  private final @Nullable List<Extension> modifierExtension;

  private ImmutableMedicinalProduct_ManufacturingBusinessOperation(
      @Nullable String id,
      @Nullable CodeableConcept operationType,
      @Nullable List<Extension> extension,
      @Nullable Reference regulator,
      @Nullable Identifier authorisationReferenceNumber,
      @Nullable List<Reference> manufacturer,
      @Nullable DateTime effectiveDate,
      @Nullable CodeableConcept confidentialityIndicator,
      @Nullable List<Extension> modifierExtension) {
    this.id = id;
    this.operationType = operationType;
    this.extension = extension;
    this.regulator = regulator;
    this.authorisationReferenceNumber = authorisationReferenceNumber;
    this.manufacturer = manufacturer;
    this.effectiveDate = effectiveDate;
    this.confidentialityIndicator = confidentialityIndicator;
    this.modifierExtension = modifierExtension;
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
   * @return The value of the {@code operationType} attribute
   */
  @JsonProperty("operationType")
  @Override
  public Optional<CodeableConcept> operationType() {
    return Optional.ofNullable(operationType);
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
   * @return The value of the {@code regulator} attribute
   */
  @JsonProperty("regulator")
  @Override
  public Optional<Reference> regulator() {
    return Optional.ofNullable(regulator);
  }

  /**
   * @return The value of the {@code authorisationReferenceNumber} attribute
   */
  @JsonProperty("authorisationReferenceNumber")
  @Override
  public Optional<Identifier> authorisationReferenceNumber() {
    return Optional.ofNullable(authorisationReferenceNumber);
  }

  /**
   * @return The value of the {@code manufacturer} attribute
   */
  @JsonProperty("manufacturer")
  @Override
  public Optional<List<Reference>> manufacturer() {
    return Optional.ofNullable(manufacturer);
  }

  /**
   * @return The value of the {@code effectiveDate} attribute
   */
  @JsonProperty("effectiveDate")
  @Override
  public Optional<DateTime> effectiveDate() {
    return Optional.ofNullable(effectiveDate);
  }

  /**
   * @return The value of the {@code confidentialityIndicator} attribute
   */
  @JsonProperty("confidentialityIndicator")
  @Override
  public Optional<CodeableConcept> confidentialityIndicator() {
    return Optional.ofNullable(confidentialityIndicator);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProduct_ManufacturingBusinessOperation#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct_ManufacturingBusinessOperation withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableMedicinalProduct_ManufacturingBusinessOperation(
        newValue,
        this.operationType,
        this.extension,
        this.regulator,
        this.authorisationReferenceNumber,
        this.manufacturer,
        this.effectiveDate,
        this.confidentialityIndicator,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProduct_ManufacturingBusinessOperation#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct_ManufacturingBusinessOperation withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableMedicinalProduct_ManufacturingBusinessOperation(
        value,
        this.operationType,
        this.extension,
        this.regulator,
        this.authorisationReferenceNumber,
        this.manufacturer,
        this.effectiveDate,
        this.confidentialityIndicator,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProduct_ManufacturingBusinessOperation#operationType() operationType} attribute.
   * @param value The value for operationType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct_ManufacturingBusinessOperation withOperationType(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "operationType");
    if (this.operationType == newValue) return this;
    return new ImmutableMedicinalProduct_ManufacturingBusinessOperation(
        this.id,
        newValue,
        this.extension,
        this.regulator,
        this.authorisationReferenceNumber,
        this.manufacturer,
        this.effectiveDate,
        this.confidentialityIndicator,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProduct_ManufacturingBusinessOperation#operationType() operationType} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for operationType
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProduct_ManufacturingBusinessOperation withOperationType(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.operationType == value) return this;
    return new ImmutableMedicinalProduct_ManufacturingBusinessOperation(
        this.id,
        value,
        this.extension,
        this.regulator,
        this.authorisationReferenceNumber,
        this.manufacturer,
        this.effectiveDate,
        this.confidentialityIndicator,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProduct_ManufacturingBusinessOperation#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct_ManufacturingBusinessOperation withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableMedicinalProduct_ManufacturingBusinessOperation(
        this.id,
        this.operationType,
        newValue,
        this.regulator,
        this.authorisationReferenceNumber,
        this.manufacturer,
        this.effectiveDate,
        this.confidentialityIndicator,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProduct_ManufacturingBusinessOperation#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProduct_ManufacturingBusinessOperation withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableMedicinalProduct_ManufacturingBusinessOperation(
        this.id,
        this.operationType,
        value,
        this.regulator,
        this.authorisationReferenceNumber,
        this.manufacturer,
        this.effectiveDate,
        this.confidentialityIndicator,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProduct_ManufacturingBusinessOperation#regulator() regulator} attribute.
   * @param value The value for regulator
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct_ManufacturingBusinessOperation withRegulator(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "regulator");
    if (this.regulator == newValue) return this;
    return new ImmutableMedicinalProduct_ManufacturingBusinessOperation(
        this.id,
        this.operationType,
        this.extension,
        newValue,
        this.authorisationReferenceNumber,
        this.manufacturer,
        this.effectiveDate,
        this.confidentialityIndicator,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProduct_ManufacturingBusinessOperation#regulator() regulator} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for regulator
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProduct_ManufacturingBusinessOperation withRegulator(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.regulator == value) return this;
    return new ImmutableMedicinalProduct_ManufacturingBusinessOperation(
        this.id,
        this.operationType,
        this.extension,
        value,
        this.authorisationReferenceNumber,
        this.manufacturer,
        this.effectiveDate,
        this.confidentialityIndicator,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProduct_ManufacturingBusinessOperation#authorisationReferenceNumber() authorisationReferenceNumber} attribute.
   * @param value The value for authorisationReferenceNumber
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct_ManufacturingBusinessOperation withAuthorisationReferenceNumber(Identifier value) {
    @Nullable Identifier newValue = Objects.requireNonNull(value, "authorisationReferenceNumber");
    if (this.authorisationReferenceNumber == newValue) return this;
    return new ImmutableMedicinalProduct_ManufacturingBusinessOperation(
        this.id,
        this.operationType,
        this.extension,
        this.regulator,
        newValue,
        this.manufacturer,
        this.effectiveDate,
        this.confidentialityIndicator,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProduct_ManufacturingBusinessOperation#authorisationReferenceNumber() authorisationReferenceNumber} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for authorisationReferenceNumber
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProduct_ManufacturingBusinessOperation withAuthorisationReferenceNumber(Optional<? extends Identifier> optional) {
    @Nullable Identifier value = optional.orElse(null);
    if (this.authorisationReferenceNumber == value) return this;
    return new ImmutableMedicinalProduct_ManufacturingBusinessOperation(
        this.id,
        this.operationType,
        this.extension,
        this.regulator,
        value,
        this.manufacturer,
        this.effectiveDate,
        this.confidentialityIndicator,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProduct_ManufacturingBusinessOperation#manufacturer() manufacturer} attribute.
   * @param value The value for manufacturer
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct_ManufacturingBusinessOperation withManufacturer(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "manufacturer");
    if (this.manufacturer == newValue) return this;
    return new ImmutableMedicinalProduct_ManufacturingBusinessOperation(
        this.id,
        this.operationType,
        this.extension,
        this.regulator,
        this.authorisationReferenceNumber,
        newValue,
        this.effectiveDate,
        this.confidentialityIndicator,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProduct_ManufacturingBusinessOperation#manufacturer() manufacturer} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for manufacturer
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProduct_ManufacturingBusinessOperation withManufacturer(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.manufacturer == value) return this;
    return new ImmutableMedicinalProduct_ManufacturingBusinessOperation(
        this.id,
        this.operationType,
        this.extension,
        this.regulator,
        this.authorisationReferenceNumber,
        value,
        this.effectiveDate,
        this.confidentialityIndicator,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProduct_ManufacturingBusinessOperation#effectiveDate() effectiveDate} attribute.
   * @param value The value for effectiveDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct_ManufacturingBusinessOperation withEffectiveDate(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "effectiveDate");
    if (this.effectiveDate == newValue) return this;
    return new ImmutableMedicinalProduct_ManufacturingBusinessOperation(
        this.id,
        this.operationType,
        this.extension,
        this.regulator,
        this.authorisationReferenceNumber,
        this.manufacturer,
        newValue,
        this.confidentialityIndicator,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProduct_ManufacturingBusinessOperation#effectiveDate() effectiveDate} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for effectiveDate
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProduct_ManufacturingBusinessOperation withEffectiveDate(Optional<? extends DateTime> optional) {
    @Nullable DateTime value = optional.orElse(null);
    if (this.effectiveDate == value) return this;
    return new ImmutableMedicinalProduct_ManufacturingBusinessOperation(
        this.id,
        this.operationType,
        this.extension,
        this.regulator,
        this.authorisationReferenceNumber,
        this.manufacturer,
        value,
        this.confidentialityIndicator,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProduct_ManufacturingBusinessOperation#confidentialityIndicator() confidentialityIndicator} attribute.
   * @param value The value for confidentialityIndicator
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct_ManufacturingBusinessOperation withConfidentialityIndicator(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "confidentialityIndicator");
    if (this.confidentialityIndicator == newValue) return this;
    return new ImmutableMedicinalProduct_ManufacturingBusinessOperation(
        this.id,
        this.operationType,
        this.extension,
        this.regulator,
        this.authorisationReferenceNumber,
        this.manufacturer,
        this.effectiveDate,
        newValue,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProduct_ManufacturingBusinessOperation#confidentialityIndicator() confidentialityIndicator} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for confidentialityIndicator
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProduct_ManufacturingBusinessOperation withConfidentialityIndicator(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.confidentialityIndicator == value) return this;
    return new ImmutableMedicinalProduct_ManufacturingBusinessOperation(
        this.id,
        this.operationType,
        this.extension,
        this.regulator,
        this.authorisationReferenceNumber,
        this.manufacturer,
        this.effectiveDate,
        value,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProduct_ManufacturingBusinessOperation#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct_ManufacturingBusinessOperation withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableMedicinalProduct_ManufacturingBusinessOperation(
        this.id,
        this.operationType,
        this.extension,
        this.regulator,
        this.authorisationReferenceNumber,
        this.manufacturer,
        this.effectiveDate,
        this.confidentialityIndicator,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProduct_ManufacturingBusinessOperation#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProduct_ManufacturingBusinessOperation withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableMedicinalProduct_ManufacturingBusinessOperation(
        this.id,
        this.operationType,
        this.extension,
        this.regulator,
        this.authorisationReferenceNumber,
        this.manufacturer,
        this.effectiveDate,
        this.confidentialityIndicator,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMedicinalProduct_ManufacturingBusinessOperation} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMedicinalProduct_ManufacturingBusinessOperation
        && equalTo((ImmutableMedicinalProduct_ManufacturingBusinessOperation) another);
  }

  private boolean equalTo(ImmutableMedicinalProduct_ManufacturingBusinessOperation another) {
    return Objects.equals(id, another.id)
        && Objects.equals(operationType, another.operationType)
        && Objects.equals(extension, another.extension)
        && Objects.equals(regulator, another.regulator)
        && Objects.equals(authorisationReferenceNumber, another.authorisationReferenceNumber)
        && Objects.equals(manufacturer, another.manufacturer)
        && Objects.equals(effectiveDate, another.effectiveDate)
        && Objects.equals(confidentialityIndicator, another.confidentialityIndicator)
        && Objects.equals(modifierExtension, another.modifierExtension);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code operationType}, {@code extension}, {@code regulator}, {@code authorisationReferenceNumber}, {@code manufacturer}, {@code effectiveDate}, {@code confidentialityIndicator}, {@code modifierExtension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(operationType);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(regulator);
    h += (h << 5) + Objects.hashCode(authorisationReferenceNumber);
    h += (h << 5) + Objects.hashCode(manufacturer);
    h += (h << 5) + Objects.hashCode(effectiveDate);
    h += (h << 5) + Objects.hashCode(confidentialityIndicator);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    return h;
  }

  /**
   * Prints the immutable value {@code MedicinalProduct_ManufacturingBusinessOperation} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("MedicinalProduct_ManufacturingBusinessOperation{");
    if (id != null) {
      builder.append("id=").append(id);
    }
    if (operationType != null) {
      if (builder.length() > 48) builder.append(", ");
      builder.append("operationType=").append(operationType);
    }
    if (extension != null) {
      if (builder.length() > 48) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (regulator != null) {
      if (builder.length() > 48) builder.append(", ");
      builder.append("regulator=").append(regulator);
    }
    if (authorisationReferenceNumber != null) {
      if (builder.length() > 48) builder.append(", ");
      builder.append("authorisationReferenceNumber=").append(authorisationReferenceNumber);
    }
    if (manufacturer != null) {
      if (builder.length() > 48) builder.append(", ");
      builder.append("manufacturer=").append(manufacturer);
    }
    if (effectiveDate != null) {
      if (builder.length() > 48) builder.append(", ");
      builder.append("effectiveDate=").append(effectiveDate);
    }
    if (confidentialityIndicator != null) {
      if (builder.length() > 48) builder.append(", ");
      builder.append("confidentialityIndicator=").append(confidentialityIndicator);
    }
    if (modifierExtension != null) {
      if (builder.length() > 48) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "MedicinalProduct_ManufacturingBusinessOperation", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements MedicinalProduct_ManufacturingBusinessOperation {
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<CodeableConcept> operationType = Optional.empty();
    boolean operationTypeIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Reference> regulator = Optional.empty();
    boolean regulatorIsSet;
    @Nullable Optional<Identifier> authorisationReferenceNumber = Optional.empty();
    boolean authorisationReferenceNumberIsSet;
    @Nullable Optional<List<Reference>> manufacturer = Optional.empty();
    boolean manufacturerIsSet;
    @Nullable Optional<DateTime> effectiveDate = Optional.empty();
    boolean effectiveDateIsSet;
    @Nullable Optional<CodeableConcept> confidentialityIndicator = Optional.empty();
    boolean confidentialityIndicatorIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("operationType")
    public void setOperationType(Optional<CodeableConcept> operationType) {
      this.operationType = operationType;
      this.operationTypeIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("regulator")
    public void setRegulator(Optional<Reference> regulator) {
      this.regulator = regulator;
      this.regulatorIsSet = true;
    }
    @JsonProperty("authorisationReferenceNumber")
    public void setAuthorisationReferenceNumber(Optional<Identifier> authorisationReferenceNumber) {
      this.authorisationReferenceNumber = authorisationReferenceNumber;
      this.authorisationReferenceNumberIsSet = true;
    }
    @JsonProperty("manufacturer")
    public void setManufacturer(Optional<List<Reference>> manufacturer) {
      this.manufacturer = manufacturer;
      this.manufacturerIsSet = true;
    }
    @JsonProperty("effectiveDate")
    public void setEffectiveDate(Optional<DateTime> effectiveDate) {
      this.effectiveDate = effectiveDate;
      this.effectiveDateIsSet = true;
    }
    @JsonProperty("confidentialityIndicator")
    public void setConfidentialityIndicator(Optional<CodeableConcept> confidentialityIndicator) {
      this.confidentialityIndicator = confidentialityIndicator;
      this.confidentialityIndicatorIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> operationType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> regulator() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Identifier> authorisationReferenceNumber() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> manufacturer() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DateTime> effectiveDate() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> confidentialityIndicator() { throw new UnsupportedOperationException(); }
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
  static ImmutableMedicinalProduct_ManufacturingBusinessOperation fromJson(Json json) {
    ImmutableMedicinalProduct_ManufacturingBusinessOperation.Builder builder = ImmutableMedicinalProduct_ManufacturingBusinessOperation.builder();
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.operationTypeIsSet) {
      builder.operationType(json.operationType);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.regulatorIsSet) {
      builder.regulator(json.regulator);
    }
    if (json.authorisationReferenceNumberIsSet) {
      builder.authorisationReferenceNumber(json.authorisationReferenceNumber);
    }
    if (json.manufacturerIsSet) {
      builder.manufacturer(json.manufacturer);
    }
    if (json.effectiveDateIsSet) {
      builder.effectiveDate(json.effectiveDate);
    }
    if (json.confidentialityIndicatorIsSet) {
      builder.confidentialityIndicator(json.confidentialityIndicator);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    return (ImmutableMedicinalProduct_ManufacturingBusinessOperation) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link MedicinalProduct_ManufacturingBusinessOperation} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable MedicinalProduct_ManufacturingBusinessOperation instance
   */
  public static MedicinalProduct_ManufacturingBusinessOperation copyOf(MedicinalProduct_ManufacturingBusinessOperation instance) {
    if (instance instanceof ImmutableMedicinalProduct_ManufacturingBusinessOperation) {
      return (ImmutableMedicinalProduct_ManufacturingBusinessOperation) instance;
    }
    return ImmutableMedicinalProduct_ManufacturingBusinessOperation.builder()
        .id(instance.id())
        .operationType(instance.operationType())
        .extension(instance.extension())
        .regulator(instance.regulator())
        .authorisationReferenceNumber(instance.authorisationReferenceNumber())
        .manufacturer(instance.manufacturer())
        .effectiveDate(instance.effectiveDate())
        .confidentialityIndicator(instance.confidentialityIndicator())
        .modifierExtension(instance.modifierExtension())
        .build();
  }

  /**
   * Creates a builder for {@link MedicinalProduct_ManufacturingBusinessOperation MedicinalProduct_ManufacturingBusinessOperation}.
   * <pre>
   * ImmutableMedicinalProduct_ManufacturingBusinessOperation.builder()
   *    .id(String) // optional {@link MedicinalProduct_ManufacturingBusinessOperation#id() id}
   *    .operationType(com.medplum.types.fhir.CodeableConcept) // optional {@link MedicinalProduct_ManufacturingBusinessOperation#operationType() operationType}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link MedicinalProduct_ManufacturingBusinessOperation#extension() extension}
   *    .regulator(com.medplum.types.fhir.Reference) // optional {@link MedicinalProduct_ManufacturingBusinessOperation#regulator() regulator}
   *    .authorisationReferenceNumber(com.medplum.types.fhir.Identifier) // optional {@link MedicinalProduct_ManufacturingBusinessOperation#authorisationReferenceNumber() authorisationReferenceNumber}
   *    .manufacturer(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link MedicinalProduct_ManufacturingBusinessOperation#manufacturer() manufacturer}
   *    .effectiveDate(com.medplum.types.fhir.DateTime) // optional {@link MedicinalProduct_ManufacturingBusinessOperation#effectiveDate() effectiveDate}
   *    .confidentialityIndicator(com.medplum.types.fhir.CodeableConcept) // optional {@link MedicinalProduct_ManufacturingBusinessOperation#confidentialityIndicator() confidentialityIndicator}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link MedicinalProduct_ManufacturingBusinessOperation#modifierExtension() modifierExtension}
   *    .build();
   * </pre>
   * @return A new MedicinalProduct_ManufacturingBusinessOperation builder
   */
  public static ImmutableMedicinalProduct_ManufacturingBusinessOperation.Builder builder() {
    return new ImmutableMedicinalProduct_ManufacturingBusinessOperation.Builder();
  }

  /**
   * Builds instances of type {@link MedicinalProduct_ManufacturingBusinessOperation MedicinalProduct_ManufacturingBusinessOperation}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "MedicinalProduct_ManufacturingBusinessOperation", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_ID = 0x1L;
    private static final long OPT_BIT_OPERATION_TYPE = 0x2L;
    private static final long OPT_BIT_EXTENSION = 0x4L;
    private static final long OPT_BIT_REGULATOR = 0x8L;
    private static final long OPT_BIT_AUTHORISATION_REFERENCE_NUMBER = 0x10L;
    private static final long OPT_BIT_MANUFACTURER = 0x20L;
    private static final long OPT_BIT_EFFECTIVE_DATE = 0x40L;
    private static final long OPT_BIT_CONFIDENTIALITY_INDICATOR = 0x80L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x100L;
    private long optBits;

    private @Nullable String id;
    private @Nullable CodeableConcept operationType;
    private @Nullable List<Extension> extension;
    private @Nullable Reference regulator;
    private @Nullable Identifier authorisationReferenceNumber;
    private @Nullable List<Reference> manufacturer;
    private @Nullable DateTime effectiveDate;
    private @Nullable CodeableConcept confidentialityIndicator;
    private @Nullable List<Extension> modifierExtension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link MedicinalProduct_ManufacturingBusinessOperation#id() id} to id.
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
     * Initializes the optional value {@link MedicinalProduct_ManufacturingBusinessOperation#id() id} to id.
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
     * Initializes the optional value {@link MedicinalProduct_ManufacturingBusinessOperation#operationType() operationType} to operationType.
     * @param operationType The value for operationType
     * @return {@code this} builder for chained invocation
     */
    public final Builder operationType(CodeableConcept operationType) {
      checkNotIsSet(operationTypeIsSet(), "operationType");
      this.operationType = Objects.requireNonNull(operationType, "operationType");
      optBits |= OPT_BIT_OPERATION_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct_ManufacturingBusinessOperation#operationType() operationType} to operationType.
     * @param operationType The value for operationType
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("operationType")
    public final Builder operationType(Optional<? extends CodeableConcept> operationType) {
      checkNotIsSet(operationTypeIsSet(), "operationType");
      this.operationType = operationType.orElse(null);
      optBits |= OPT_BIT_OPERATION_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct_ManufacturingBusinessOperation#extension() extension} to extension.
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
     * Initializes the optional value {@link MedicinalProduct_ManufacturingBusinessOperation#extension() extension} to extension.
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
     * Initializes the optional value {@link MedicinalProduct_ManufacturingBusinessOperation#regulator() regulator} to regulator.
     * @param regulator The value for regulator
     * @return {@code this} builder for chained invocation
     */
    public final Builder regulator(Reference regulator) {
      checkNotIsSet(regulatorIsSet(), "regulator");
      this.regulator = Objects.requireNonNull(regulator, "regulator");
      optBits |= OPT_BIT_REGULATOR;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct_ManufacturingBusinessOperation#regulator() regulator} to regulator.
     * @param regulator The value for regulator
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("regulator")
    public final Builder regulator(Optional<? extends Reference> regulator) {
      checkNotIsSet(regulatorIsSet(), "regulator");
      this.regulator = regulator.orElse(null);
      optBits |= OPT_BIT_REGULATOR;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct_ManufacturingBusinessOperation#authorisationReferenceNumber() authorisationReferenceNumber} to authorisationReferenceNumber.
     * @param authorisationReferenceNumber The value for authorisationReferenceNumber
     * @return {@code this} builder for chained invocation
     */
    public final Builder authorisationReferenceNumber(Identifier authorisationReferenceNumber) {
      checkNotIsSet(authorisationReferenceNumberIsSet(), "authorisationReferenceNumber");
      this.authorisationReferenceNumber = Objects.requireNonNull(authorisationReferenceNumber, "authorisationReferenceNumber");
      optBits |= OPT_BIT_AUTHORISATION_REFERENCE_NUMBER;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct_ManufacturingBusinessOperation#authorisationReferenceNumber() authorisationReferenceNumber} to authorisationReferenceNumber.
     * @param authorisationReferenceNumber The value for authorisationReferenceNumber
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("authorisationReferenceNumber")
    public final Builder authorisationReferenceNumber(Optional<? extends Identifier> authorisationReferenceNumber) {
      checkNotIsSet(authorisationReferenceNumberIsSet(), "authorisationReferenceNumber");
      this.authorisationReferenceNumber = authorisationReferenceNumber.orElse(null);
      optBits |= OPT_BIT_AUTHORISATION_REFERENCE_NUMBER;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct_ManufacturingBusinessOperation#manufacturer() manufacturer} to manufacturer.
     * @param manufacturer The value for manufacturer
     * @return {@code this} builder for chained invocation
     */
    public final Builder manufacturer(List<Reference> manufacturer) {
      checkNotIsSet(manufacturerIsSet(), "manufacturer");
      this.manufacturer = Objects.requireNonNull(manufacturer, "manufacturer");
      optBits |= OPT_BIT_MANUFACTURER;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct_ManufacturingBusinessOperation#manufacturer() manufacturer} to manufacturer.
     * @param manufacturer The value for manufacturer
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("manufacturer")
    public final Builder manufacturer(Optional<? extends List<Reference>> manufacturer) {
      checkNotIsSet(manufacturerIsSet(), "manufacturer");
      this.manufacturer = manufacturer.orElse(null);
      optBits |= OPT_BIT_MANUFACTURER;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct_ManufacturingBusinessOperation#effectiveDate() effectiveDate} to effectiveDate.
     * @param effectiveDate The value for effectiveDate
     * @return {@code this} builder for chained invocation
     */
    public final Builder effectiveDate(DateTime effectiveDate) {
      checkNotIsSet(effectiveDateIsSet(), "effectiveDate");
      this.effectiveDate = Objects.requireNonNull(effectiveDate, "effectiveDate");
      optBits |= OPT_BIT_EFFECTIVE_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct_ManufacturingBusinessOperation#effectiveDate() effectiveDate} to effectiveDate.
     * @param effectiveDate The value for effectiveDate
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("effectiveDate")
    public final Builder effectiveDate(Optional<? extends DateTime> effectiveDate) {
      checkNotIsSet(effectiveDateIsSet(), "effectiveDate");
      this.effectiveDate = effectiveDate.orElse(null);
      optBits |= OPT_BIT_EFFECTIVE_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct_ManufacturingBusinessOperation#confidentialityIndicator() confidentialityIndicator} to confidentialityIndicator.
     * @param confidentialityIndicator The value for confidentialityIndicator
     * @return {@code this} builder for chained invocation
     */
    public final Builder confidentialityIndicator(CodeableConcept confidentialityIndicator) {
      checkNotIsSet(confidentialityIndicatorIsSet(), "confidentialityIndicator");
      this.confidentialityIndicator = Objects.requireNonNull(confidentialityIndicator, "confidentialityIndicator");
      optBits |= OPT_BIT_CONFIDENTIALITY_INDICATOR;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct_ManufacturingBusinessOperation#confidentialityIndicator() confidentialityIndicator} to confidentialityIndicator.
     * @param confidentialityIndicator The value for confidentialityIndicator
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("confidentialityIndicator")
    public final Builder confidentialityIndicator(Optional<? extends CodeableConcept> confidentialityIndicator) {
      checkNotIsSet(confidentialityIndicatorIsSet(), "confidentialityIndicator");
      this.confidentialityIndicator = confidentialityIndicator.orElse(null);
      optBits |= OPT_BIT_CONFIDENTIALITY_INDICATOR;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct_ManufacturingBusinessOperation#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MedicinalProduct_ManufacturingBusinessOperation#modifierExtension() modifierExtension} to modifierExtension.
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
     * Builds a new {@link MedicinalProduct_ManufacturingBusinessOperation MedicinalProduct_ManufacturingBusinessOperation}.
     * @return An immutable instance of MedicinalProduct_ManufacturingBusinessOperation
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public MedicinalProduct_ManufacturingBusinessOperation build() {
      return new ImmutableMedicinalProduct_ManufacturingBusinessOperation(
          id,
          operationType,
          extension,
          regulator,
          authorisationReferenceNumber,
          manufacturer,
          effectiveDate,
          confidentialityIndicator,
          modifierExtension);
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean operationTypeIsSet() {
      return (optBits & OPT_BIT_OPERATION_TYPE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean regulatorIsSet() {
      return (optBits & OPT_BIT_REGULATOR) != 0;
    }

    private boolean authorisationReferenceNumberIsSet() {
      return (optBits & OPT_BIT_AUTHORISATION_REFERENCE_NUMBER) != 0;
    }

    private boolean manufacturerIsSet() {
      return (optBits & OPT_BIT_MANUFACTURER) != 0;
    }

    private boolean effectiveDateIsSet() {
      return (optBits & OPT_BIT_EFFECTIVE_DATE) != 0;
    }

    private boolean confidentialityIndicatorIsSet() {
      return (optBits & OPT_BIT_CONFIDENTIALITY_INDICATOR) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of MedicinalProduct_ManufacturingBusinessOperation is strict, attribute is already set: ".concat(name));
    }
  }
}
