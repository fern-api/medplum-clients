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
 * Immutable implementation of {@link ExplanationOfBenefit_Diagnosis}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableExplanationOfBenefit_Diagnosis.builder()}.
 */
@Generated(from = "ExplanationOfBenefit_Diagnosis", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableExplanationOfBenefit_Diagnosis
    implements ExplanationOfBenefit_Diagnosis {
  private final @Nullable CodeableConcept diagnosisCodeableConcept;
  private final @Nullable String id;
  private final @Nullable CodeableConcept packageCode;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Reference diagnosisReference;
  private final @Nullable List<CodeableConcept> type;
  private final @Nullable PositiveInt sequence;
  private final @Nullable CodeableConcept onAdmission;
  private final @Nullable List<Extension> extension;

  private ImmutableExplanationOfBenefit_Diagnosis(
      @Nullable CodeableConcept diagnosisCodeableConcept,
      @Nullable String id,
      @Nullable CodeableConcept packageCode,
      @Nullable List<Extension> modifierExtension,
      @Nullable Reference diagnosisReference,
      @Nullable List<CodeableConcept> type,
      @Nullable PositiveInt sequence,
      @Nullable CodeableConcept onAdmission,
      @Nullable List<Extension> extension) {
    this.diagnosisCodeableConcept = diagnosisCodeableConcept;
    this.id = id;
    this.packageCode = packageCode;
    this.modifierExtension = modifierExtension;
    this.diagnosisReference = diagnosisReference;
    this.type = type;
    this.sequence = sequence;
    this.onAdmission = onAdmission;
    this.extension = extension;
  }

  /**
   * @return The value of the {@code diagnosisCodeableConcept} attribute
   */
  @JsonProperty("diagnosisCodeableConcept")
  @Override
  public Optional<CodeableConcept> diagnosisCodeableConcept() {
    return Optional.ofNullable(diagnosisCodeableConcept);
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
   * @return The value of the {@code packageCode} attribute
   */
  @JsonProperty("packageCode")
  @Override
  public Optional<CodeableConcept> packageCode() {
    return Optional.ofNullable(packageCode);
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
   * @return The value of the {@code diagnosisReference} attribute
   */
  @JsonProperty("diagnosisReference")
  @Override
  public Optional<Reference> diagnosisReference() {
    return Optional.ofNullable(diagnosisReference);
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public Optional<List<CodeableConcept>> type() {
    return Optional.ofNullable(type);
  }

  /**
   * @return The value of the {@code sequence} attribute
   */
  @JsonProperty("sequence")
  @Override
  public Optional<PositiveInt> sequence() {
    return Optional.ofNullable(sequence);
  }

  /**
   * @return The value of the {@code onAdmission} attribute
   */
  @JsonProperty("onAdmission")
  @Override
  public Optional<CodeableConcept> onAdmission() {
    return Optional.ofNullable(onAdmission);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_Diagnosis#diagnosisCodeableConcept() diagnosisCodeableConcept} attribute.
   * @param value The value for diagnosisCodeableConcept
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Diagnosis withDiagnosisCodeableConcept(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "diagnosisCodeableConcept");
    if (this.diagnosisCodeableConcept == newValue) return this;
    return new ImmutableExplanationOfBenefit_Diagnosis(
        newValue,
        this.id,
        this.packageCode,
        this.modifierExtension,
        this.diagnosisReference,
        this.type,
        this.sequence,
        this.onAdmission,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_Diagnosis#diagnosisCodeableConcept() diagnosisCodeableConcept} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for diagnosisCodeableConcept
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_Diagnosis withDiagnosisCodeableConcept(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.diagnosisCodeableConcept == value) return this;
    return new ImmutableExplanationOfBenefit_Diagnosis(
        value,
        this.id,
        this.packageCode,
        this.modifierExtension,
        this.diagnosisReference,
        this.type,
        this.sequence,
        this.onAdmission,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_Diagnosis#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Diagnosis withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableExplanationOfBenefit_Diagnosis(
        this.diagnosisCodeableConcept,
        newValue,
        this.packageCode,
        this.modifierExtension,
        this.diagnosisReference,
        this.type,
        this.sequence,
        this.onAdmission,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_Diagnosis#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Diagnosis withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableExplanationOfBenefit_Diagnosis(
        this.diagnosisCodeableConcept,
        value,
        this.packageCode,
        this.modifierExtension,
        this.diagnosisReference,
        this.type,
        this.sequence,
        this.onAdmission,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_Diagnosis#packageCode() packageCode} attribute.
   * @param value The value for packageCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Diagnosis withPackageCode(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "packageCode");
    if (this.packageCode == newValue) return this;
    return new ImmutableExplanationOfBenefit_Diagnosis(
        this.diagnosisCodeableConcept,
        this.id,
        newValue,
        this.modifierExtension,
        this.diagnosisReference,
        this.type,
        this.sequence,
        this.onAdmission,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_Diagnosis#packageCode() packageCode} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for packageCode
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_Diagnosis withPackageCode(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.packageCode == value) return this;
    return new ImmutableExplanationOfBenefit_Diagnosis(
        this.diagnosisCodeableConcept,
        this.id,
        value,
        this.modifierExtension,
        this.diagnosisReference,
        this.type,
        this.sequence,
        this.onAdmission,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_Diagnosis#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Diagnosis withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableExplanationOfBenefit_Diagnosis(
        this.diagnosisCodeableConcept,
        this.id,
        this.packageCode,
        newValue,
        this.diagnosisReference,
        this.type,
        this.sequence,
        this.onAdmission,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_Diagnosis#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_Diagnosis withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableExplanationOfBenefit_Diagnosis(
        this.diagnosisCodeableConcept,
        this.id,
        this.packageCode,
        value,
        this.diagnosisReference,
        this.type,
        this.sequence,
        this.onAdmission,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_Diagnosis#diagnosisReference() diagnosisReference} attribute.
   * @param value The value for diagnosisReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Diagnosis withDiagnosisReference(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "diagnosisReference");
    if (this.diagnosisReference == newValue) return this;
    return new ImmutableExplanationOfBenefit_Diagnosis(
        this.diagnosisCodeableConcept,
        this.id,
        this.packageCode,
        this.modifierExtension,
        newValue,
        this.type,
        this.sequence,
        this.onAdmission,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_Diagnosis#diagnosisReference() diagnosisReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for diagnosisReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_Diagnosis withDiagnosisReference(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.diagnosisReference == value) return this;
    return new ImmutableExplanationOfBenefit_Diagnosis(
        this.diagnosisCodeableConcept,
        this.id,
        this.packageCode,
        this.modifierExtension,
        value,
        this.type,
        this.sequence,
        this.onAdmission,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_Diagnosis#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Diagnosis withType(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableExplanationOfBenefit_Diagnosis(
        this.diagnosisCodeableConcept,
        this.id,
        this.packageCode,
        this.modifierExtension,
        this.diagnosisReference,
        newValue,
        this.sequence,
        this.onAdmission,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_Diagnosis#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_Diagnosis withType(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableExplanationOfBenefit_Diagnosis(
        this.diagnosisCodeableConcept,
        this.id,
        this.packageCode,
        this.modifierExtension,
        this.diagnosisReference,
        value,
        this.sequence,
        this.onAdmission,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_Diagnosis#sequence() sequence} attribute.
   * @param value The value for sequence
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Diagnosis withSequence(PositiveInt value) {
    @Nullable PositiveInt newValue = Objects.requireNonNull(value, "sequence");
    if (this.sequence == newValue) return this;
    return new ImmutableExplanationOfBenefit_Diagnosis(
        this.diagnosisCodeableConcept,
        this.id,
        this.packageCode,
        this.modifierExtension,
        this.diagnosisReference,
        this.type,
        newValue,
        this.onAdmission,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_Diagnosis#sequence() sequence} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for sequence
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_Diagnosis withSequence(Optional<? extends PositiveInt> optional) {
    @Nullable PositiveInt value = optional.orElse(null);
    if (this.sequence == value) return this;
    return new ImmutableExplanationOfBenefit_Diagnosis(
        this.diagnosisCodeableConcept,
        this.id,
        this.packageCode,
        this.modifierExtension,
        this.diagnosisReference,
        this.type,
        value,
        this.onAdmission,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_Diagnosis#onAdmission() onAdmission} attribute.
   * @param value The value for onAdmission
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Diagnosis withOnAdmission(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "onAdmission");
    if (this.onAdmission == newValue) return this;
    return new ImmutableExplanationOfBenefit_Diagnosis(
        this.diagnosisCodeableConcept,
        this.id,
        this.packageCode,
        this.modifierExtension,
        this.diagnosisReference,
        this.type,
        this.sequence,
        newValue,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_Diagnosis#onAdmission() onAdmission} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for onAdmission
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_Diagnosis withOnAdmission(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.onAdmission == value) return this;
    return new ImmutableExplanationOfBenefit_Diagnosis(
        this.diagnosisCodeableConcept,
        this.id,
        this.packageCode,
        this.modifierExtension,
        this.diagnosisReference,
        this.type,
        this.sequence,
        value,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_Diagnosis#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Diagnosis withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableExplanationOfBenefit_Diagnosis(
        this.diagnosisCodeableConcept,
        this.id,
        this.packageCode,
        this.modifierExtension,
        this.diagnosisReference,
        this.type,
        this.sequence,
        this.onAdmission,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_Diagnosis#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_Diagnosis withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableExplanationOfBenefit_Diagnosis(
        this.diagnosisCodeableConcept,
        this.id,
        this.packageCode,
        this.modifierExtension,
        this.diagnosisReference,
        this.type,
        this.sequence,
        this.onAdmission,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableExplanationOfBenefit_Diagnosis} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableExplanationOfBenefit_Diagnosis
        && equalTo((ImmutableExplanationOfBenefit_Diagnosis) another);
  }

  private boolean equalTo(ImmutableExplanationOfBenefit_Diagnosis another) {
    return Objects.equals(diagnosisCodeableConcept, another.diagnosisCodeableConcept)
        && Objects.equals(id, another.id)
        && Objects.equals(packageCode, another.packageCode)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(diagnosisReference, another.diagnosisReference)
        && Objects.equals(type, another.type)
        && Objects.equals(sequence, another.sequence)
        && Objects.equals(onAdmission, another.onAdmission)
        && Objects.equals(extension, another.extension);
  }

  /**
   * Computes a hash code from attributes: {@code diagnosisCodeableConcept}, {@code id}, {@code packageCode}, {@code modifierExtension}, {@code diagnosisReference}, {@code type}, {@code sequence}, {@code onAdmission}, {@code extension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(diagnosisCodeableConcept);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(packageCode);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(diagnosisReference);
    h += (h << 5) + Objects.hashCode(type);
    h += (h << 5) + Objects.hashCode(sequence);
    h += (h << 5) + Objects.hashCode(onAdmission);
    h += (h << 5) + Objects.hashCode(extension);
    return h;
  }

  /**
   * Prints the immutable value {@code ExplanationOfBenefit_Diagnosis} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("ExplanationOfBenefit_Diagnosis{");
    if (diagnosisCodeableConcept != null) {
      builder.append("diagnosisCodeableConcept=").append(diagnosisCodeableConcept);
    }
    if (id != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (packageCode != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("packageCode=").append(packageCode);
    }
    if (modifierExtension != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (diagnosisReference != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("diagnosisReference=").append(diagnosisReference);
    }
    if (type != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("type=").append(type);
    }
    if (sequence != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("sequence=").append(sequence);
    }
    if (onAdmission != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("onAdmission=").append(onAdmission);
    }
    if (extension != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "ExplanationOfBenefit_Diagnosis", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ExplanationOfBenefit_Diagnosis {
    @Nullable Optional<CodeableConcept> diagnosisCodeableConcept = Optional.empty();
    boolean diagnosisCodeableConceptIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<CodeableConcept> packageCode = Optional.empty();
    boolean packageCodeIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Reference> diagnosisReference = Optional.empty();
    boolean diagnosisReferenceIsSet;
    @Nullable Optional<List<CodeableConcept>> type = Optional.empty();
    boolean typeIsSet;
    @Nullable Optional<PositiveInt> sequence = Optional.empty();
    boolean sequenceIsSet;
    @Nullable Optional<CodeableConcept> onAdmission = Optional.empty();
    boolean onAdmissionIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @JsonProperty("diagnosisCodeableConcept")
    public void setDiagnosisCodeableConcept(Optional<CodeableConcept> diagnosisCodeableConcept) {
      this.diagnosisCodeableConcept = diagnosisCodeableConcept;
      this.diagnosisCodeableConceptIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("packageCode")
    public void setPackageCode(Optional<CodeableConcept> packageCode) {
      this.packageCode = packageCode;
      this.packageCodeIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("diagnosisReference")
    public void setDiagnosisReference(Optional<Reference> diagnosisReference) {
      this.diagnosisReference = diagnosisReference;
      this.diagnosisReferenceIsSet = true;
    }
    @JsonProperty("type")
    public void setType(Optional<List<CodeableConcept>> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @JsonProperty("sequence")
    public void setSequence(Optional<PositiveInt> sequence) {
      this.sequence = sequence;
      this.sequenceIsSet = true;
    }
    @JsonProperty("onAdmission")
    public void setOnAdmission(Optional<CodeableConcept> onAdmission) {
      this.onAdmission = onAdmission;
      this.onAdmissionIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @Override
    public Optional<CodeableConcept> diagnosisCodeableConcept() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> packageCode() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> diagnosisReference() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<PositiveInt> sequence() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> onAdmission() { throw new UnsupportedOperationException(); }
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
  static ImmutableExplanationOfBenefit_Diagnosis fromJson(Json json) {
    ImmutableExplanationOfBenefit_Diagnosis.Builder builder = ImmutableExplanationOfBenefit_Diagnosis.builder();
    if (json.diagnosisCodeableConceptIsSet) {
      builder.diagnosisCodeableConcept(json.diagnosisCodeableConcept);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.packageCodeIsSet) {
      builder.packageCode(json.packageCode);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.diagnosisReferenceIsSet) {
      builder.diagnosisReference(json.diagnosisReference);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.sequenceIsSet) {
      builder.sequence(json.sequence);
    }
    if (json.onAdmissionIsSet) {
      builder.onAdmission(json.onAdmission);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    return (ImmutableExplanationOfBenefit_Diagnosis) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ExplanationOfBenefit_Diagnosis} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ExplanationOfBenefit_Diagnosis instance
   */
  public static ExplanationOfBenefit_Diagnosis copyOf(ExplanationOfBenefit_Diagnosis instance) {
    if (instance instanceof ImmutableExplanationOfBenefit_Diagnosis) {
      return (ImmutableExplanationOfBenefit_Diagnosis) instance;
    }
    return ImmutableExplanationOfBenefit_Diagnosis.builder()
        .diagnosisCodeableConcept(instance.diagnosisCodeableConcept())
        .id(instance.id())
        .packageCode(instance.packageCode())
        .modifierExtension(instance.modifierExtension())
        .diagnosisReference(instance.diagnosisReference())
        .type(instance.type())
        .sequence(instance.sequence())
        .onAdmission(instance.onAdmission())
        .extension(instance.extension())
        .build();
  }

  /**
   * Creates a builder for {@link ExplanationOfBenefit_Diagnosis ExplanationOfBenefit_Diagnosis}.
   * <pre>
   * ImmutableExplanationOfBenefit_Diagnosis.builder()
   *    .diagnosisCodeableConcept(com.fhir.types.fhir.CodeableConcept) // optional {@link ExplanationOfBenefit_Diagnosis#diagnosisCodeableConcept() diagnosisCodeableConcept}
   *    .id(String) // optional {@link ExplanationOfBenefit_Diagnosis#id() id}
   *    .packageCode(com.fhir.types.fhir.CodeableConcept) // optional {@link ExplanationOfBenefit_Diagnosis#packageCode() packageCode}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link ExplanationOfBenefit_Diagnosis#modifierExtension() modifierExtension}
   *    .diagnosisReference(com.fhir.types.fhir.Reference) // optional {@link ExplanationOfBenefit_Diagnosis#diagnosisReference() diagnosisReference}
   *    .type(List&amp;lt;com.fhir.types.fhir.CodeableConcept&amp;gt;) // optional {@link ExplanationOfBenefit_Diagnosis#type() type}
   *    .sequence(com.fhir.types.fhir.PositiveInt) // optional {@link ExplanationOfBenefit_Diagnosis#sequence() sequence}
   *    .onAdmission(com.fhir.types.fhir.CodeableConcept) // optional {@link ExplanationOfBenefit_Diagnosis#onAdmission() onAdmission}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link ExplanationOfBenefit_Diagnosis#extension() extension}
   *    .build();
   * </pre>
   * @return A new ExplanationOfBenefit_Diagnosis builder
   */
  public static ImmutableExplanationOfBenefit_Diagnosis.Builder builder() {
    return new ImmutableExplanationOfBenefit_Diagnosis.Builder();
  }

  /**
   * Builds instances of type {@link ExplanationOfBenefit_Diagnosis ExplanationOfBenefit_Diagnosis}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "ExplanationOfBenefit_Diagnosis", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_DIAGNOSIS_CODEABLE_CONCEPT = 0x1L;
    private static final long OPT_BIT_ID = 0x2L;
    private static final long OPT_BIT_PACKAGE_CODE = 0x4L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x8L;
    private static final long OPT_BIT_DIAGNOSIS_REFERENCE = 0x10L;
    private static final long OPT_BIT_TYPE = 0x20L;
    private static final long OPT_BIT_SEQUENCE = 0x40L;
    private static final long OPT_BIT_ON_ADMISSION = 0x80L;
    private static final long OPT_BIT_EXTENSION = 0x100L;
    private long optBits;

    private @Nullable CodeableConcept diagnosisCodeableConcept;
    private @Nullable String id;
    private @Nullable CodeableConcept packageCode;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Reference diagnosisReference;
    private @Nullable List<CodeableConcept> type;
    private @Nullable PositiveInt sequence;
    private @Nullable CodeableConcept onAdmission;
    private @Nullable List<Extension> extension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Diagnosis#diagnosisCodeableConcept() diagnosisCodeableConcept} to diagnosisCodeableConcept.
     * @param diagnosisCodeableConcept The value for diagnosisCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    public final Builder diagnosisCodeableConcept(CodeableConcept diagnosisCodeableConcept) {
      checkNotIsSet(diagnosisCodeableConceptIsSet(), "diagnosisCodeableConcept");
      this.diagnosisCodeableConcept = Objects.requireNonNull(diagnosisCodeableConcept, "diagnosisCodeableConcept");
      optBits |= OPT_BIT_DIAGNOSIS_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Diagnosis#diagnosisCodeableConcept() diagnosisCodeableConcept} to diagnosisCodeableConcept.
     * @param diagnosisCodeableConcept The value for diagnosisCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("diagnosisCodeableConcept")
    public final Builder diagnosisCodeableConcept(Optional<? extends CodeableConcept> diagnosisCodeableConcept) {
      checkNotIsSet(diagnosisCodeableConceptIsSet(), "diagnosisCodeableConcept");
      this.diagnosisCodeableConcept = diagnosisCodeableConcept.orElse(null);
      optBits |= OPT_BIT_DIAGNOSIS_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Diagnosis#id() id} to id.
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
     * Initializes the optional value {@link ExplanationOfBenefit_Diagnosis#id() id} to id.
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
     * Initializes the optional value {@link ExplanationOfBenefit_Diagnosis#packageCode() packageCode} to packageCode.
     * @param packageCode The value for packageCode
     * @return {@code this} builder for chained invocation
     */
    public final Builder packageCode(CodeableConcept packageCode) {
      checkNotIsSet(packageCodeIsSet(), "packageCode");
      this.packageCode = Objects.requireNonNull(packageCode, "packageCode");
      optBits |= OPT_BIT_PACKAGE_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Diagnosis#packageCode() packageCode} to packageCode.
     * @param packageCode The value for packageCode
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("packageCode")
    public final Builder packageCode(Optional<? extends CodeableConcept> packageCode) {
      checkNotIsSet(packageCodeIsSet(), "packageCode");
      this.packageCode = packageCode.orElse(null);
      optBits |= OPT_BIT_PACKAGE_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Diagnosis#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ExplanationOfBenefit_Diagnosis#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ExplanationOfBenefit_Diagnosis#diagnosisReference() diagnosisReference} to diagnosisReference.
     * @param diagnosisReference The value for diagnosisReference
     * @return {@code this} builder for chained invocation
     */
    public final Builder diagnosisReference(Reference diagnosisReference) {
      checkNotIsSet(diagnosisReferenceIsSet(), "diagnosisReference");
      this.diagnosisReference = Objects.requireNonNull(diagnosisReference, "diagnosisReference");
      optBits |= OPT_BIT_DIAGNOSIS_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Diagnosis#diagnosisReference() diagnosisReference} to diagnosisReference.
     * @param diagnosisReference The value for diagnosisReference
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("diagnosisReference")
    public final Builder diagnosisReference(Optional<? extends Reference> diagnosisReference) {
      checkNotIsSet(diagnosisReferenceIsSet(), "diagnosisReference");
      this.diagnosisReference = diagnosisReference.orElse(null);
      optBits |= OPT_BIT_DIAGNOSIS_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Diagnosis#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(List<CodeableConcept> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Diagnosis#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("type")
    public final Builder type(Optional<? extends List<CodeableConcept>> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Diagnosis#sequence() sequence} to sequence.
     * @param sequence The value for sequence
     * @return {@code this} builder for chained invocation
     */
    public final Builder sequence(PositiveInt sequence) {
      checkNotIsSet(sequenceIsSet(), "sequence");
      this.sequence = Objects.requireNonNull(sequence, "sequence");
      optBits |= OPT_BIT_SEQUENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Diagnosis#sequence() sequence} to sequence.
     * @param sequence The value for sequence
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("sequence")
    public final Builder sequence(Optional<? extends PositiveInt> sequence) {
      checkNotIsSet(sequenceIsSet(), "sequence");
      this.sequence = sequence.orElse(null);
      optBits |= OPT_BIT_SEQUENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Diagnosis#onAdmission() onAdmission} to onAdmission.
     * @param onAdmission The value for onAdmission
     * @return {@code this} builder for chained invocation
     */
    public final Builder onAdmission(CodeableConcept onAdmission) {
      checkNotIsSet(onAdmissionIsSet(), "onAdmission");
      this.onAdmission = Objects.requireNonNull(onAdmission, "onAdmission");
      optBits |= OPT_BIT_ON_ADMISSION;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Diagnosis#onAdmission() onAdmission} to onAdmission.
     * @param onAdmission The value for onAdmission
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("onAdmission")
    public final Builder onAdmission(Optional<? extends CodeableConcept> onAdmission) {
      checkNotIsSet(onAdmissionIsSet(), "onAdmission");
      this.onAdmission = onAdmission.orElse(null);
      optBits |= OPT_BIT_ON_ADMISSION;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Diagnosis#extension() extension} to extension.
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
     * Initializes the optional value {@link ExplanationOfBenefit_Diagnosis#extension() extension} to extension.
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
     * Builds a new {@link ExplanationOfBenefit_Diagnosis ExplanationOfBenefit_Diagnosis}.
     * @return An immutable instance of ExplanationOfBenefit_Diagnosis
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ExplanationOfBenefit_Diagnosis build() {
      return new ImmutableExplanationOfBenefit_Diagnosis(
          diagnosisCodeableConcept,
          id,
          packageCode,
          modifierExtension,
          diagnosisReference,
          type,
          sequence,
          onAdmission,
          extension);
    }

    private boolean diagnosisCodeableConceptIsSet() {
      return (optBits & OPT_BIT_DIAGNOSIS_CODEABLE_CONCEPT) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean packageCodeIsSet() {
      return (optBits & OPT_BIT_PACKAGE_CODE) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean diagnosisReferenceIsSet() {
      return (optBits & OPT_BIT_DIAGNOSIS_REFERENCE) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean sequenceIsSet() {
      return (optBits & OPT_BIT_SEQUENCE) != 0;
    }

    private boolean onAdmissionIsSet() {
      return (optBits & OPT_BIT_ON_ADMISSION) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of ExplanationOfBenefit_Diagnosis is strict, attribute is already set: ".concat(name));
    }
  }
}
