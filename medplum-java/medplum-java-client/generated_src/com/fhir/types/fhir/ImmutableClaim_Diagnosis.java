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
 * Immutable implementation of {@link Claim_Diagnosis}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableClaim_Diagnosis.builder()}.
 */
@Generated(from = "Claim_Diagnosis", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableClaim_Diagnosis implements Claim_Diagnosis {
  private final @Nullable List<CodeableConcept> type;
  private final @Nullable CodeableConcept packageCode;
  private final @Nullable PositiveInt sequence;
  private final @Nullable CodeableConcept onAdmission;
  private final @Nullable Reference diagnosisReference;
  private final @Nullable String id;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable CodeableConcept diagnosisCodeableConcept;
  private final @Nullable List<Extension> extension;

  private ImmutableClaim_Diagnosis(
      @Nullable List<CodeableConcept> type,
      @Nullable CodeableConcept packageCode,
      @Nullable PositiveInt sequence,
      @Nullable CodeableConcept onAdmission,
      @Nullable Reference diagnosisReference,
      @Nullable String id,
      @Nullable List<Extension> modifierExtension,
      @Nullable CodeableConcept diagnosisCodeableConcept,
      @Nullable List<Extension> extension) {
    this.type = type;
    this.packageCode = packageCode;
    this.sequence = sequence;
    this.onAdmission = onAdmission;
    this.diagnosisReference = diagnosisReference;
    this.id = id;
    this.modifierExtension = modifierExtension;
    this.diagnosisCodeableConcept = diagnosisCodeableConcept;
    this.extension = extension;
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
   * @return The value of the {@code packageCode} attribute
   */
  @JsonProperty("packageCode")
  @Override
  public Optional<CodeableConcept> packageCode() {
    return Optional.ofNullable(packageCode);
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
   * @return The value of the {@code diagnosisReference} attribute
   */
  @JsonProperty("diagnosisReference")
  @Override
  public Optional<Reference> diagnosisReference() {
    return Optional.ofNullable(diagnosisReference);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
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
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim_Diagnosis#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_Diagnosis withType(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableClaim_Diagnosis(
        newValue,
        this.packageCode,
        this.sequence,
        this.onAdmission,
        this.diagnosisReference,
        this.id,
        this.modifierExtension,
        this.diagnosisCodeableConcept,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim_Diagnosis#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim_Diagnosis withType(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableClaim_Diagnosis(
        value,
        this.packageCode,
        this.sequence,
        this.onAdmission,
        this.diagnosisReference,
        this.id,
        this.modifierExtension,
        this.diagnosisCodeableConcept,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim_Diagnosis#packageCode() packageCode} attribute.
   * @param value The value for packageCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_Diagnosis withPackageCode(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "packageCode");
    if (this.packageCode == newValue) return this;
    return new ImmutableClaim_Diagnosis(
        this.type,
        newValue,
        this.sequence,
        this.onAdmission,
        this.diagnosisReference,
        this.id,
        this.modifierExtension,
        this.diagnosisCodeableConcept,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim_Diagnosis#packageCode() packageCode} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for packageCode
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim_Diagnosis withPackageCode(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.packageCode == value) return this;
    return new ImmutableClaim_Diagnosis(
        this.type,
        value,
        this.sequence,
        this.onAdmission,
        this.diagnosisReference,
        this.id,
        this.modifierExtension,
        this.diagnosisCodeableConcept,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim_Diagnosis#sequence() sequence} attribute.
   * @param value The value for sequence
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_Diagnosis withSequence(PositiveInt value) {
    @Nullable PositiveInt newValue = Objects.requireNonNull(value, "sequence");
    if (this.sequence == newValue) return this;
    return new ImmutableClaim_Diagnosis(
        this.type,
        this.packageCode,
        newValue,
        this.onAdmission,
        this.diagnosisReference,
        this.id,
        this.modifierExtension,
        this.diagnosisCodeableConcept,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim_Diagnosis#sequence() sequence} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for sequence
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim_Diagnosis withSequence(Optional<? extends PositiveInt> optional) {
    @Nullable PositiveInt value = optional.orElse(null);
    if (this.sequence == value) return this;
    return new ImmutableClaim_Diagnosis(
        this.type,
        this.packageCode,
        value,
        this.onAdmission,
        this.diagnosisReference,
        this.id,
        this.modifierExtension,
        this.diagnosisCodeableConcept,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim_Diagnosis#onAdmission() onAdmission} attribute.
   * @param value The value for onAdmission
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_Diagnosis withOnAdmission(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "onAdmission");
    if (this.onAdmission == newValue) return this;
    return new ImmutableClaim_Diagnosis(
        this.type,
        this.packageCode,
        this.sequence,
        newValue,
        this.diagnosisReference,
        this.id,
        this.modifierExtension,
        this.diagnosisCodeableConcept,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim_Diagnosis#onAdmission() onAdmission} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for onAdmission
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim_Diagnosis withOnAdmission(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.onAdmission == value) return this;
    return new ImmutableClaim_Diagnosis(
        this.type,
        this.packageCode,
        this.sequence,
        value,
        this.diagnosisReference,
        this.id,
        this.modifierExtension,
        this.diagnosisCodeableConcept,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim_Diagnosis#diagnosisReference() diagnosisReference} attribute.
   * @param value The value for diagnosisReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_Diagnosis withDiagnosisReference(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "diagnosisReference");
    if (this.diagnosisReference == newValue) return this;
    return new ImmutableClaim_Diagnosis(
        this.type,
        this.packageCode,
        this.sequence,
        this.onAdmission,
        newValue,
        this.id,
        this.modifierExtension,
        this.diagnosisCodeableConcept,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim_Diagnosis#diagnosisReference() diagnosisReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for diagnosisReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim_Diagnosis withDiagnosisReference(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.diagnosisReference == value) return this;
    return new ImmutableClaim_Diagnosis(
        this.type,
        this.packageCode,
        this.sequence,
        this.onAdmission,
        value,
        this.id,
        this.modifierExtension,
        this.diagnosisCodeableConcept,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim_Diagnosis#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_Diagnosis withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableClaim_Diagnosis(
        this.type,
        this.packageCode,
        this.sequence,
        this.onAdmission,
        this.diagnosisReference,
        newValue,
        this.modifierExtension,
        this.diagnosisCodeableConcept,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim_Diagnosis#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_Diagnosis withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableClaim_Diagnosis(
        this.type,
        this.packageCode,
        this.sequence,
        this.onAdmission,
        this.diagnosisReference,
        value,
        this.modifierExtension,
        this.diagnosisCodeableConcept,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim_Diagnosis#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_Diagnosis withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableClaim_Diagnosis(
        this.type,
        this.packageCode,
        this.sequence,
        this.onAdmission,
        this.diagnosisReference,
        this.id,
        newValue,
        this.diagnosisCodeableConcept,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim_Diagnosis#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim_Diagnosis withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableClaim_Diagnosis(
        this.type,
        this.packageCode,
        this.sequence,
        this.onAdmission,
        this.diagnosisReference,
        this.id,
        value,
        this.diagnosisCodeableConcept,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim_Diagnosis#diagnosisCodeableConcept() diagnosisCodeableConcept} attribute.
   * @param value The value for diagnosisCodeableConcept
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_Diagnosis withDiagnosisCodeableConcept(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "diagnosisCodeableConcept");
    if (this.diagnosisCodeableConcept == newValue) return this;
    return new ImmutableClaim_Diagnosis(
        this.type,
        this.packageCode,
        this.sequence,
        this.onAdmission,
        this.diagnosisReference,
        this.id,
        this.modifierExtension,
        newValue,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim_Diagnosis#diagnosisCodeableConcept() diagnosisCodeableConcept} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for diagnosisCodeableConcept
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim_Diagnosis withDiagnosisCodeableConcept(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.diagnosisCodeableConcept == value) return this;
    return new ImmutableClaim_Diagnosis(
        this.type,
        this.packageCode,
        this.sequence,
        this.onAdmission,
        this.diagnosisReference,
        this.id,
        this.modifierExtension,
        value,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim_Diagnosis#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_Diagnosis withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableClaim_Diagnosis(
        this.type,
        this.packageCode,
        this.sequence,
        this.onAdmission,
        this.diagnosisReference,
        this.id,
        this.modifierExtension,
        this.diagnosisCodeableConcept,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim_Diagnosis#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim_Diagnosis withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableClaim_Diagnosis(
        this.type,
        this.packageCode,
        this.sequence,
        this.onAdmission,
        this.diagnosisReference,
        this.id,
        this.modifierExtension,
        this.diagnosisCodeableConcept,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableClaim_Diagnosis} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableClaim_Diagnosis
        && equalTo((ImmutableClaim_Diagnosis) another);
  }

  private boolean equalTo(ImmutableClaim_Diagnosis another) {
    return Objects.equals(type, another.type)
        && Objects.equals(packageCode, another.packageCode)
        && Objects.equals(sequence, another.sequence)
        && Objects.equals(onAdmission, another.onAdmission)
        && Objects.equals(diagnosisReference, another.diagnosisReference)
        && Objects.equals(id, another.id)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(diagnosisCodeableConcept, another.diagnosisCodeableConcept)
        && Objects.equals(extension, another.extension);
  }

  /**
   * Computes a hash code from attributes: {@code type}, {@code packageCode}, {@code sequence}, {@code onAdmission}, {@code diagnosisReference}, {@code id}, {@code modifierExtension}, {@code diagnosisCodeableConcept}, {@code extension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(type);
    h += (h << 5) + Objects.hashCode(packageCode);
    h += (h << 5) + Objects.hashCode(sequence);
    h += (h << 5) + Objects.hashCode(onAdmission);
    h += (h << 5) + Objects.hashCode(diagnosisReference);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(diagnosisCodeableConcept);
    h += (h << 5) + Objects.hashCode(extension);
    return h;
  }

  /**
   * Prints the immutable value {@code Claim_Diagnosis} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Claim_Diagnosis{");
    if (type != null) {
      builder.append("type=").append(type);
    }
    if (packageCode != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("packageCode=").append(packageCode);
    }
    if (sequence != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("sequence=").append(sequence);
    }
    if (onAdmission != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("onAdmission=").append(onAdmission);
    }
    if (diagnosisReference != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("diagnosisReference=").append(diagnosisReference);
    }
    if (id != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (modifierExtension != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (diagnosisCodeableConcept != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("diagnosisCodeableConcept=").append(diagnosisCodeableConcept);
    }
    if (extension != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Claim_Diagnosis", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Claim_Diagnosis {
    @Nullable Optional<List<CodeableConcept>> type = Optional.empty();
    boolean typeIsSet;
    @Nullable Optional<CodeableConcept> packageCode = Optional.empty();
    boolean packageCodeIsSet;
    @Nullable Optional<PositiveInt> sequence = Optional.empty();
    boolean sequenceIsSet;
    @Nullable Optional<CodeableConcept> onAdmission = Optional.empty();
    boolean onAdmissionIsSet;
    @Nullable Optional<Reference> diagnosisReference = Optional.empty();
    boolean diagnosisReferenceIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<CodeableConcept> diagnosisCodeableConcept = Optional.empty();
    boolean diagnosisCodeableConceptIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @JsonProperty("type")
    public void setType(Optional<List<CodeableConcept>> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @JsonProperty("packageCode")
    public void setPackageCode(Optional<CodeableConcept> packageCode) {
      this.packageCode = packageCode;
      this.packageCodeIsSet = true;
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
    @JsonProperty("diagnosisReference")
    public void setDiagnosisReference(Optional<Reference> diagnosisReference) {
      this.diagnosisReference = diagnosisReference;
      this.diagnosisReferenceIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("diagnosisCodeableConcept")
    public void setDiagnosisCodeableConcept(Optional<CodeableConcept> diagnosisCodeableConcept) {
      this.diagnosisCodeableConcept = diagnosisCodeableConcept;
      this.diagnosisCodeableConceptIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @Override
    public Optional<List<CodeableConcept>> type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> packageCode() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<PositiveInt> sequence() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> onAdmission() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> diagnosisReference() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> diagnosisCodeableConcept() { throw new UnsupportedOperationException(); }
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
  static ImmutableClaim_Diagnosis fromJson(Json json) {
    ImmutableClaim_Diagnosis.Builder builder = ImmutableClaim_Diagnosis.builder();
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.packageCodeIsSet) {
      builder.packageCode(json.packageCode);
    }
    if (json.sequenceIsSet) {
      builder.sequence(json.sequence);
    }
    if (json.onAdmissionIsSet) {
      builder.onAdmission(json.onAdmission);
    }
    if (json.diagnosisReferenceIsSet) {
      builder.diagnosisReference(json.diagnosisReference);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.diagnosisCodeableConceptIsSet) {
      builder.diagnosisCodeableConcept(json.diagnosisCodeableConcept);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    return (ImmutableClaim_Diagnosis) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Claim_Diagnosis} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Claim_Diagnosis instance
   */
  public static Claim_Diagnosis copyOf(Claim_Diagnosis instance) {
    if (instance instanceof ImmutableClaim_Diagnosis) {
      return (ImmutableClaim_Diagnosis) instance;
    }
    return ImmutableClaim_Diagnosis.builder()
        .type(instance.type())
        .packageCode(instance.packageCode())
        .sequence(instance.sequence())
        .onAdmission(instance.onAdmission())
        .diagnosisReference(instance.diagnosisReference())
        .id(instance.id())
        .modifierExtension(instance.modifierExtension())
        .diagnosisCodeableConcept(instance.diagnosisCodeableConcept())
        .extension(instance.extension())
        .build();
  }

  /**
   * Creates a builder for {@link Claim_Diagnosis Claim_Diagnosis}.
   * <pre>
   * ImmutableClaim_Diagnosis.builder()
   *    .type(List&amp;lt;com.fhir.types.fhir.CodeableConcept&amp;gt;) // optional {@link Claim_Diagnosis#type() type}
   *    .packageCode(com.fhir.types.fhir.CodeableConcept) // optional {@link Claim_Diagnosis#packageCode() packageCode}
   *    .sequence(com.fhir.types.fhir.PositiveInt) // optional {@link Claim_Diagnosis#sequence() sequence}
   *    .onAdmission(com.fhir.types.fhir.CodeableConcept) // optional {@link Claim_Diagnosis#onAdmission() onAdmission}
   *    .diagnosisReference(com.fhir.types.fhir.Reference) // optional {@link Claim_Diagnosis#diagnosisReference() diagnosisReference}
   *    .id(String) // optional {@link Claim_Diagnosis#id() id}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Claim_Diagnosis#modifierExtension() modifierExtension}
   *    .diagnosisCodeableConcept(com.fhir.types.fhir.CodeableConcept) // optional {@link Claim_Diagnosis#diagnosisCodeableConcept() diagnosisCodeableConcept}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Claim_Diagnosis#extension() extension}
   *    .build();
   * </pre>
   * @return A new Claim_Diagnosis builder
   */
  public static ImmutableClaim_Diagnosis.Builder builder() {
    return new ImmutableClaim_Diagnosis.Builder();
  }

  /**
   * Builds instances of type {@link Claim_Diagnosis Claim_Diagnosis}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Claim_Diagnosis", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_TYPE = 0x1L;
    private static final long OPT_BIT_PACKAGE_CODE = 0x2L;
    private static final long OPT_BIT_SEQUENCE = 0x4L;
    private static final long OPT_BIT_ON_ADMISSION = 0x8L;
    private static final long OPT_BIT_DIAGNOSIS_REFERENCE = 0x10L;
    private static final long OPT_BIT_ID = 0x20L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x40L;
    private static final long OPT_BIT_DIAGNOSIS_CODEABLE_CONCEPT = 0x80L;
    private static final long OPT_BIT_EXTENSION = 0x100L;
    private long optBits;

    private @Nullable List<CodeableConcept> type;
    private @Nullable CodeableConcept packageCode;
    private @Nullable PositiveInt sequence;
    private @Nullable CodeableConcept onAdmission;
    private @Nullable Reference diagnosisReference;
    private @Nullable String id;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable CodeableConcept diagnosisCodeableConcept;
    private @Nullable List<Extension> extension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Claim_Diagnosis#type() type} to type.
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
     * Initializes the optional value {@link Claim_Diagnosis#type() type} to type.
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
     * Initializes the optional value {@link Claim_Diagnosis#packageCode() packageCode} to packageCode.
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
     * Initializes the optional value {@link Claim_Diagnosis#packageCode() packageCode} to packageCode.
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
     * Initializes the optional value {@link Claim_Diagnosis#sequence() sequence} to sequence.
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
     * Initializes the optional value {@link Claim_Diagnosis#sequence() sequence} to sequence.
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
     * Initializes the optional value {@link Claim_Diagnosis#onAdmission() onAdmission} to onAdmission.
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
     * Initializes the optional value {@link Claim_Diagnosis#onAdmission() onAdmission} to onAdmission.
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
     * Initializes the optional value {@link Claim_Diagnosis#diagnosisReference() diagnosisReference} to diagnosisReference.
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
     * Initializes the optional value {@link Claim_Diagnosis#diagnosisReference() diagnosisReference} to diagnosisReference.
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
     * Initializes the optional value {@link Claim_Diagnosis#id() id} to id.
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
     * Initializes the optional value {@link Claim_Diagnosis#id() id} to id.
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
     * Initializes the optional value {@link Claim_Diagnosis#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Claim_Diagnosis#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Claim_Diagnosis#diagnosisCodeableConcept() diagnosisCodeableConcept} to diagnosisCodeableConcept.
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
     * Initializes the optional value {@link Claim_Diagnosis#diagnosisCodeableConcept() diagnosisCodeableConcept} to diagnosisCodeableConcept.
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
     * Initializes the optional value {@link Claim_Diagnosis#extension() extension} to extension.
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
     * Initializes the optional value {@link Claim_Diagnosis#extension() extension} to extension.
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
     * Builds a new {@link Claim_Diagnosis Claim_Diagnosis}.
     * @return An immutable instance of Claim_Diagnosis
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Claim_Diagnosis build() {
      return new ImmutableClaim_Diagnosis(
          type,
          packageCode,
          sequence,
          onAdmission,
          diagnosisReference,
          id,
          modifierExtension,
          diagnosisCodeableConcept,
          extension);
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean packageCodeIsSet() {
      return (optBits & OPT_BIT_PACKAGE_CODE) != 0;
    }

    private boolean sequenceIsSet() {
      return (optBits & OPT_BIT_SEQUENCE) != 0;
    }

    private boolean onAdmissionIsSet() {
      return (optBits & OPT_BIT_ON_ADMISSION) != 0;
    }

    private boolean diagnosisReferenceIsSet() {
      return (optBits & OPT_BIT_DIAGNOSIS_REFERENCE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean diagnosisCodeableConceptIsSet() {
      return (optBits & OPT_BIT_DIAGNOSIS_CODEABLE_CONCEPT) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Claim_Diagnosis is strict, attribute is already set: ".concat(name));
    }
  }
}
