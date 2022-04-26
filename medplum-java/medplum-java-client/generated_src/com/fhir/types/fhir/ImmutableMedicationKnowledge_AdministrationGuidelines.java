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
 * Immutable implementation of {@link MedicationKnowledge_AdministrationGuidelines}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMedicationKnowledge_AdministrationGuidelines.builder()}.
 */
@Generated(from = "MedicationKnowledge_AdministrationGuidelines", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableMedicationKnowledge_AdministrationGuidelines
    implements MedicationKnowledge_AdministrationGuidelines {
  private final @Nullable Reference indicationReference;
  private final @Nullable CodeableConcept indicationCodeableConcept;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable String id;
  private final @Nullable List<MedicationKnowledge_Dosage> dosage;
  private final @Nullable List<MedicationKnowledge_PatientCharacteristics> patientCharacteristics;

  private ImmutableMedicationKnowledge_AdministrationGuidelines(
      @Nullable Reference indicationReference,
      @Nullable CodeableConcept indicationCodeableConcept,
      @Nullable List<Extension> extension,
      @Nullable List<Extension> modifierExtension,
      @Nullable String id,
      @Nullable List<MedicationKnowledge_Dosage> dosage,
      @Nullable List<MedicationKnowledge_PatientCharacteristics> patientCharacteristics) {
    this.indicationReference = indicationReference;
    this.indicationCodeableConcept = indicationCodeableConcept;
    this.extension = extension;
    this.modifierExtension = modifierExtension;
    this.id = id;
    this.dosage = dosage;
    this.patientCharacteristics = patientCharacteristics;
  }

  /**
   * @return The value of the {@code indicationReference} attribute
   */
  @JsonProperty("indicationReference")
  @Override
  public Optional<Reference> indicationReference() {
    return Optional.ofNullable(indicationReference);
  }

  /**
   * @return The value of the {@code indicationCodeableConcept} attribute
   */
  @JsonProperty("indicationCodeableConcept")
  @Override
  public Optional<CodeableConcept> indicationCodeableConcept() {
    return Optional.ofNullable(indicationCodeableConcept);
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
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<String> id() {
    return Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code dosage} attribute
   */
  @JsonProperty("dosage")
  @Override
  public Optional<List<MedicationKnowledge_Dosage>> dosage() {
    return Optional.ofNullable(dosage);
  }

  /**
   * @return The value of the {@code patientCharacteristics} attribute
   */
  @JsonProperty("patientCharacteristics")
  @Override
  public Optional<List<MedicationKnowledge_PatientCharacteristics>> patientCharacteristics() {
    return Optional.ofNullable(patientCharacteristics);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge_AdministrationGuidelines#indicationReference() indicationReference} attribute.
   * @param value The value for indicationReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge_AdministrationGuidelines withIndicationReference(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "indicationReference");
    if (this.indicationReference == newValue) return this;
    return new ImmutableMedicationKnowledge_AdministrationGuidelines(
        newValue,
        this.indicationCodeableConcept,
        this.extension,
        this.modifierExtension,
        this.id,
        this.dosage,
        this.patientCharacteristics);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge_AdministrationGuidelines#indicationReference() indicationReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for indicationReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationKnowledge_AdministrationGuidelines withIndicationReference(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.indicationReference == value) return this;
    return new ImmutableMedicationKnowledge_AdministrationGuidelines(
        value,
        this.indicationCodeableConcept,
        this.extension,
        this.modifierExtension,
        this.id,
        this.dosage,
        this.patientCharacteristics);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge_AdministrationGuidelines#indicationCodeableConcept() indicationCodeableConcept} attribute.
   * @param value The value for indicationCodeableConcept
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge_AdministrationGuidelines withIndicationCodeableConcept(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "indicationCodeableConcept");
    if (this.indicationCodeableConcept == newValue) return this;
    return new ImmutableMedicationKnowledge_AdministrationGuidelines(
        this.indicationReference,
        newValue,
        this.extension,
        this.modifierExtension,
        this.id,
        this.dosage,
        this.patientCharacteristics);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge_AdministrationGuidelines#indicationCodeableConcept() indicationCodeableConcept} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for indicationCodeableConcept
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationKnowledge_AdministrationGuidelines withIndicationCodeableConcept(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.indicationCodeableConcept == value) return this;
    return new ImmutableMedicationKnowledge_AdministrationGuidelines(
        this.indicationReference,
        value,
        this.extension,
        this.modifierExtension,
        this.id,
        this.dosage,
        this.patientCharacteristics);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge_AdministrationGuidelines#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge_AdministrationGuidelines withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableMedicationKnowledge_AdministrationGuidelines(
        this.indicationReference,
        this.indicationCodeableConcept,
        newValue,
        this.modifierExtension,
        this.id,
        this.dosage,
        this.patientCharacteristics);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge_AdministrationGuidelines#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationKnowledge_AdministrationGuidelines withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableMedicationKnowledge_AdministrationGuidelines(
        this.indicationReference,
        this.indicationCodeableConcept,
        value,
        this.modifierExtension,
        this.id,
        this.dosage,
        this.patientCharacteristics);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge_AdministrationGuidelines#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge_AdministrationGuidelines withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableMedicationKnowledge_AdministrationGuidelines(
        this.indicationReference,
        this.indicationCodeableConcept,
        this.extension,
        newValue,
        this.id,
        this.dosage,
        this.patientCharacteristics);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge_AdministrationGuidelines#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationKnowledge_AdministrationGuidelines withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableMedicationKnowledge_AdministrationGuidelines(
        this.indicationReference,
        this.indicationCodeableConcept,
        this.extension,
        value,
        this.id,
        this.dosage,
        this.patientCharacteristics);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge_AdministrationGuidelines#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge_AdministrationGuidelines withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableMedicationKnowledge_AdministrationGuidelines(
        this.indicationReference,
        this.indicationCodeableConcept,
        this.extension,
        this.modifierExtension,
        newValue,
        this.dosage,
        this.patientCharacteristics);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge_AdministrationGuidelines#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge_AdministrationGuidelines withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableMedicationKnowledge_AdministrationGuidelines(
        this.indicationReference,
        this.indicationCodeableConcept,
        this.extension,
        this.modifierExtension,
        value,
        this.dosage,
        this.patientCharacteristics);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge_AdministrationGuidelines#dosage() dosage} attribute.
   * @param value The value for dosage
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge_AdministrationGuidelines withDosage(List<MedicationKnowledge_Dosage> value) {
    @Nullable List<MedicationKnowledge_Dosage> newValue = Objects.requireNonNull(value, "dosage");
    if (this.dosage == newValue) return this;
    return new ImmutableMedicationKnowledge_AdministrationGuidelines(
        this.indicationReference,
        this.indicationCodeableConcept,
        this.extension,
        this.modifierExtension,
        this.id,
        newValue,
        this.patientCharacteristics);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge_AdministrationGuidelines#dosage() dosage} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for dosage
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationKnowledge_AdministrationGuidelines withDosage(Optional<? extends List<MedicationKnowledge_Dosage>> optional) {
    @Nullable List<MedicationKnowledge_Dosage> value = optional.orElse(null);
    if (this.dosage == value) return this;
    return new ImmutableMedicationKnowledge_AdministrationGuidelines(
        this.indicationReference,
        this.indicationCodeableConcept,
        this.extension,
        this.modifierExtension,
        this.id,
        value,
        this.patientCharacteristics);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge_AdministrationGuidelines#patientCharacteristics() patientCharacteristics} attribute.
   * @param value The value for patientCharacteristics
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge_AdministrationGuidelines withPatientCharacteristics(List<MedicationKnowledge_PatientCharacteristics> value) {
    @Nullable List<MedicationKnowledge_PatientCharacteristics> newValue = Objects.requireNonNull(value, "patientCharacteristics");
    if (this.patientCharacteristics == newValue) return this;
    return new ImmutableMedicationKnowledge_AdministrationGuidelines(
        this.indicationReference,
        this.indicationCodeableConcept,
        this.extension,
        this.modifierExtension,
        this.id,
        this.dosage,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge_AdministrationGuidelines#patientCharacteristics() patientCharacteristics} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for patientCharacteristics
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationKnowledge_AdministrationGuidelines withPatientCharacteristics(Optional<? extends List<MedicationKnowledge_PatientCharacteristics>> optional) {
    @Nullable List<MedicationKnowledge_PatientCharacteristics> value = optional.orElse(null);
    if (this.patientCharacteristics == value) return this;
    return new ImmutableMedicationKnowledge_AdministrationGuidelines(
        this.indicationReference,
        this.indicationCodeableConcept,
        this.extension,
        this.modifierExtension,
        this.id,
        this.dosage,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMedicationKnowledge_AdministrationGuidelines} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMedicationKnowledge_AdministrationGuidelines
        && equalTo((ImmutableMedicationKnowledge_AdministrationGuidelines) another);
  }

  private boolean equalTo(ImmutableMedicationKnowledge_AdministrationGuidelines another) {
    return Objects.equals(indicationReference, another.indicationReference)
        && Objects.equals(indicationCodeableConcept, another.indicationCodeableConcept)
        && Objects.equals(extension, another.extension)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(id, another.id)
        && Objects.equals(dosage, another.dosage)
        && Objects.equals(patientCharacteristics, another.patientCharacteristics);
  }

  /**
   * Computes a hash code from attributes: {@code indicationReference}, {@code indicationCodeableConcept}, {@code extension}, {@code modifierExtension}, {@code id}, {@code dosage}, {@code patientCharacteristics}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(indicationReference);
    h += (h << 5) + Objects.hashCode(indicationCodeableConcept);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(dosage);
    h += (h << 5) + Objects.hashCode(patientCharacteristics);
    return h;
  }

  /**
   * Prints the immutable value {@code MedicationKnowledge_AdministrationGuidelines} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("MedicationKnowledge_AdministrationGuidelines{");
    if (indicationReference != null) {
      builder.append("indicationReference=").append(indicationReference);
    }
    if (indicationCodeableConcept != null) {
      if (builder.length() > 45) builder.append(", ");
      builder.append("indicationCodeableConcept=").append(indicationCodeableConcept);
    }
    if (extension != null) {
      if (builder.length() > 45) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (modifierExtension != null) {
      if (builder.length() > 45) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (id != null) {
      if (builder.length() > 45) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (dosage != null) {
      if (builder.length() > 45) builder.append(", ");
      builder.append("dosage=").append(dosage);
    }
    if (patientCharacteristics != null) {
      if (builder.length() > 45) builder.append(", ");
      builder.append("patientCharacteristics=").append(patientCharacteristics);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "MedicationKnowledge_AdministrationGuidelines", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements MedicationKnowledge_AdministrationGuidelines {
    @Nullable Optional<Reference> indicationReference = Optional.empty();
    boolean indicationReferenceIsSet;
    @Nullable Optional<CodeableConcept> indicationCodeableConcept = Optional.empty();
    boolean indicationCodeableConceptIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<MedicationKnowledge_Dosage>> dosage = Optional.empty();
    boolean dosageIsSet;
    @Nullable Optional<List<MedicationKnowledge_PatientCharacteristics>> patientCharacteristics = Optional.empty();
    boolean patientCharacteristicsIsSet;
    @JsonProperty("indicationReference")
    public void setIndicationReference(Optional<Reference> indicationReference) {
      this.indicationReference = indicationReference;
      this.indicationReferenceIsSet = true;
    }
    @JsonProperty("indicationCodeableConcept")
    public void setIndicationCodeableConcept(Optional<CodeableConcept> indicationCodeableConcept) {
      this.indicationCodeableConcept = indicationCodeableConcept;
      this.indicationCodeableConceptIsSet = true;
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
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("dosage")
    public void setDosage(Optional<List<MedicationKnowledge_Dosage>> dosage) {
      this.dosage = dosage;
      this.dosageIsSet = true;
    }
    @JsonProperty("patientCharacteristics")
    public void setPatientCharacteristics(Optional<List<MedicationKnowledge_PatientCharacteristics>> patientCharacteristics) {
      this.patientCharacteristics = patientCharacteristics;
      this.patientCharacteristicsIsSet = true;
    }
    @Override
    public Optional<Reference> indicationReference() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> indicationCodeableConcept() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<MedicationKnowledge_Dosage>> dosage() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<MedicationKnowledge_PatientCharacteristics>> patientCharacteristics() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableMedicationKnowledge_AdministrationGuidelines fromJson(Json json) {
    ImmutableMedicationKnowledge_AdministrationGuidelines.Builder builder = ImmutableMedicationKnowledge_AdministrationGuidelines.builder();
    if (json.indicationReferenceIsSet) {
      builder.indicationReference(json.indicationReference);
    }
    if (json.indicationCodeableConceptIsSet) {
      builder.indicationCodeableConcept(json.indicationCodeableConcept);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.dosageIsSet) {
      builder.dosage(json.dosage);
    }
    if (json.patientCharacteristicsIsSet) {
      builder.patientCharacteristics(json.patientCharacteristics);
    }
    return (ImmutableMedicationKnowledge_AdministrationGuidelines) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link MedicationKnowledge_AdministrationGuidelines} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable MedicationKnowledge_AdministrationGuidelines instance
   */
  public static MedicationKnowledge_AdministrationGuidelines copyOf(MedicationKnowledge_AdministrationGuidelines instance) {
    if (instance instanceof ImmutableMedicationKnowledge_AdministrationGuidelines) {
      return (ImmutableMedicationKnowledge_AdministrationGuidelines) instance;
    }
    return ImmutableMedicationKnowledge_AdministrationGuidelines.builder()
        .indicationReference(instance.indicationReference())
        .indicationCodeableConcept(instance.indicationCodeableConcept())
        .extension(instance.extension())
        .modifierExtension(instance.modifierExtension())
        .id(instance.id())
        .dosage(instance.dosage())
        .patientCharacteristics(instance.patientCharacteristics())
        .build();
  }

  /**
   * Creates a builder for {@link MedicationKnowledge_AdministrationGuidelines MedicationKnowledge_AdministrationGuidelines}.
   * <pre>
   * ImmutableMedicationKnowledge_AdministrationGuidelines.builder()
   *    .indicationReference(com.fhir.types.fhir.Reference) // optional {@link MedicationKnowledge_AdministrationGuidelines#indicationReference() indicationReference}
   *    .indicationCodeableConcept(com.fhir.types.fhir.CodeableConcept) // optional {@link MedicationKnowledge_AdministrationGuidelines#indicationCodeableConcept() indicationCodeableConcept}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link MedicationKnowledge_AdministrationGuidelines#extension() extension}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link MedicationKnowledge_AdministrationGuidelines#modifierExtension() modifierExtension}
   *    .id(String) // optional {@link MedicationKnowledge_AdministrationGuidelines#id() id}
   *    .dosage(List&amp;lt;com.fhir.types.fhir.MedicationKnowledge_Dosage&amp;gt;) // optional {@link MedicationKnowledge_AdministrationGuidelines#dosage() dosage}
   *    .patientCharacteristics(List&amp;lt;com.fhir.types.fhir.MedicationKnowledge_PatientCharacteristics&amp;gt;) // optional {@link MedicationKnowledge_AdministrationGuidelines#patientCharacteristics() patientCharacteristics}
   *    .build();
   * </pre>
   * @return A new MedicationKnowledge_AdministrationGuidelines builder
   */
  public static ImmutableMedicationKnowledge_AdministrationGuidelines.Builder builder() {
    return new ImmutableMedicationKnowledge_AdministrationGuidelines.Builder();
  }

  /**
   * Builds instances of type {@link MedicationKnowledge_AdministrationGuidelines MedicationKnowledge_AdministrationGuidelines}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "MedicationKnowledge_AdministrationGuidelines", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_INDICATION_REFERENCE = 0x1L;
    private static final long OPT_BIT_INDICATION_CODEABLE_CONCEPT = 0x2L;
    private static final long OPT_BIT_EXTENSION = 0x4L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x8L;
    private static final long OPT_BIT_ID = 0x10L;
    private static final long OPT_BIT_DOSAGE = 0x20L;
    private static final long OPT_BIT_PATIENT_CHARACTERISTICS = 0x40L;
    private long optBits;

    private @Nullable Reference indicationReference;
    private @Nullable CodeableConcept indicationCodeableConcept;
    private @Nullable List<Extension> extension;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable String id;
    private @Nullable List<MedicationKnowledge_Dosage> dosage;
    private @Nullable List<MedicationKnowledge_PatientCharacteristics> patientCharacteristics;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge_AdministrationGuidelines#indicationReference() indicationReference} to indicationReference.
     * @param indicationReference The value for indicationReference
     * @return {@code this} builder for chained invocation
     */
    public final Builder indicationReference(Reference indicationReference) {
      checkNotIsSet(indicationReferenceIsSet(), "indicationReference");
      this.indicationReference = Objects.requireNonNull(indicationReference, "indicationReference");
      optBits |= OPT_BIT_INDICATION_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge_AdministrationGuidelines#indicationReference() indicationReference} to indicationReference.
     * @param indicationReference The value for indicationReference
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("indicationReference")
    public final Builder indicationReference(Optional<? extends Reference> indicationReference) {
      checkNotIsSet(indicationReferenceIsSet(), "indicationReference");
      this.indicationReference = indicationReference.orElse(null);
      optBits |= OPT_BIT_INDICATION_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge_AdministrationGuidelines#indicationCodeableConcept() indicationCodeableConcept} to indicationCodeableConcept.
     * @param indicationCodeableConcept The value for indicationCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    public final Builder indicationCodeableConcept(CodeableConcept indicationCodeableConcept) {
      checkNotIsSet(indicationCodeableConceptIsSet(), "indicationCodeableConcept");
      this.indicationCodeableConcept = Objects.requireNonNull(indicationCodeableConcept, "indicationCodeableConcept");
      optBits |= OPT_BIT_INDICATION_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge_AdministrationGuidelines#indicationCodeableConcept() indicationCodeableConcept} to indicationCodeableConcept.
     * @param indicationCodeableConcept The value for indicationCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("indicationCodeableConcept")
    public final Builder indicationCodeableConcept(Optional<? extends CodeableConcept> indicationCodeableConcept) {
      checkNotIsSet(indicationCodeableConceptIsSet(), "indicationCodeableConcept");
      this.indicationCodeableConcept = indicationCodeableConcept.orElse(null);
      optBits |= OPT_BIT_INDICATION_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge_AdministrationGuidelines#extension() extension} to extension.
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
     * Initializes the optional value {@link MedicationKnowledge_AdministrationGuidelines#extension() extension} to extension.
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
     * Initializes the optional value {@link MedicationKnowledge_AdministrationGuidelines#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MedicationKnowledge_AdministrationGuidelines#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MedicationKnowledge_AdministrationGuidelines#id() id} to id.
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
     * Initializes the optional value {@link MedicationKnowledge_AdministrationGuidelines#id() id} to id.
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
     * Initializes the optional value {@link MedicationKnowledge_AdministrationGuidelines#dosage() dosage} to dosage.
     * @param dosage The value for dosage
     * @return {@code this} builder for chained invocation
     */
    public final Builder dosage(List<MedicationKnowledge_Dosage> dosage) {
      checkNotIsSet(dosageIsSet(), "dosage");
      this.dosage = Objects.requireNonNull(dosage, "dosage");
      optBits |= OPT_BIT_DOSAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge_AdministrationGuidelines#dosage() dosage} to dosage.
     * @param dosage The value for dosage
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("dosage")
    public final Builder dosage(Optional<? extends List<MedicationKnowledge_Dosage>> dosage) {
      checkNotIsSet(dosageIsSet(), "dosage");
      this.dosage = dosage.orElse(null);
      optBits |= OPT_BIT_DOSAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge_AdministrationGuidelines#patientCharacteristics() patientCharacteristics} to patientCharacteristics.
     * @param patientCharacteristics The value for patientCharacteristics
     * @return {@code this} builder for chained invocation
     */
    public final Builder patientCharacteristics(List<MedicationKnowledge_PatientCharacteristics> patientCharacteristics) {
      checkNotIsSet(patientCharacteristicsIsSet(), "patientCharacteristics");
      this.patientCharacteristics = Objects.requireNonNull(patientCharacteristics, "patientCharacteristics");
      optBits |= OPT_BIT_PATIENT_CHARACTERISTICS;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge_AdministrationGuidelines#patientCharacteristics() patientCharacteristics} to patientCharacteristics.
     * @param patientCharacteristics The value for patientCharacteristics
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("patientCharacteristics")
    public final Builder patientCharacteristics(Optional<? extends List<MedicationKnowledge_PatientCharacteristics>> patientCharacteristics) {
      checkNotIsSet(patientCharacteristicsIsSet(), "patientCharacteristics");
      this.patientCharacteristics = patientCharacteristics.orElse(null);
      optBits |= OPT_BIT_PATIENT_CHARACTERISTICS;
      return this;
    }

    /**
     * Builds a new {@link MedicationKnowledge_AdministrationGuidelines MedicationKnowledge_AdministrationGuidelines}.
     * @return An immutable instance of MedicationKnowledge_AdministrationGuidelines
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public MedicationKnowledge_AdministrationGuidelines build() {
      return new ImmutableMedicationKnowledge_AdministrationGuidelines(
          indicationReference,
          indicationCodeableConcept,
          extension,
          modifierExtension,
          id,
          dosage,
          patientCharacteristics);
    }

    private boolean indicationReferenceIsSet() {
      return (optBits & OPT_BIT_INDICATION_REFERENCE) != 0;
    }

    private boolean indicationCodeableConceptIsSet() {
      return (optBits & OPT_BIT_INDICATION_CODEABLE_CONCEPT) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean dosageIsSet() {
      return (optBits & OPT_BIT_DOSAGE) != 0;
    }

    private boolean patientCharacteristicsIsSet() {
      return (optBits & OPT_BIT_PATIENT_CHARACTERISTICS) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of MedicationKnowledge_AdministrationGuidelines is strict, attribute is already set: ".concat(name));
    }
  }
}
