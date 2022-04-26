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
 * Immutable implementation of {@link ExplanationOfBenefit_Procedure}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableExplanationOfBenefit_Procedure.builder()}.
 */
@Generated(from = "ExplanationOfBenefit_Procedure", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableExplanationOfBenefit_Procedure
    implements ExplanationOfBenefit_Procedure {
  private final @Nullable PositiveInt sequence;
  private final @Nullable Reference procedureReference;
  private final @Nullable List<CodeableConcept> type;
  private final @Nullable CodeableConcept procedureCodeableConcept;
  private final @Nullable List<Reference> udi;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable DateTime date;
  private final @Nullable List<Extension> extension;
  private final @Nullable String id;

  private ImmutableExplanationOfBenefit_Procedure(
      @Nullable PositiveInt sequence,
      @Nullable Reference procedureReference,
      @Nullable List<CodeableConcept> type,
      @Nullable CodeableConcept procedureCodeableConcept,
      @Nullable List<Reference> udi,
      @Nullable List<Extension> modifierExtension,
      @Nullable DateTime date,
      @Nullable List<Extension> extension,
      @Nullable String id) {
    this.sequence = sequence;
    this.procedureReference = procedureReference;
    this.type = type;
    this.procedureCodeableConcept = procedureCodeableConcept;
    this.udi = udi;
    this.modifierExtension = modifierExtension;
    this.date = date;
    this.extension = extension;
    this.id = id;
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
   * @return The value of the {@code procedureReference} attribute
   */
  @JsonProperty("procedureReference")
  @Override
  public Optional<Reference> procedureReference() {
    return Optional.ofNullable(procedureReference);
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
   * @return The value of the {@code procedureCodeableConcept} attribute
   */
  @JsonProperty("procedureCodeableConcept")
  @Override
  public Optional<CodeableConcept> procedureCodeableConcept() {
    return Optional.ofNullable(procedureCodeableConcept);
  }

  /**
   * @return The value of the {@code udi} attribute
   */
  @JsonProperty("udi")
  @Override
  public Optional<List<Reference>> udi() {
    return Optional.ofNullable(udi);
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
   * @return The value of the {@code date} attribute
   */
  @JsonProperty("date")
  @Override
  public Optional<DateTime> date() {
    return Optional.ofNullable(date);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_Procedure#sequence() sequence} attribute.
   * @param value The value for sequence
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Procedure withSequence(PositiveInt value) {
    @Nullable PositiveInt newValue = Objects.requireNonNull(value, "sequence");
    if (this.sequence == newValue) return this;
    return new ImmutableExplanationOfBenefit_Procedure(
        newValue,
        this.procedureReference,
        this.type,
        this.procedureCodeableConcept,
        this.udi,
        this.modifierExtension,
        this.date,
        this.extension,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_Procedure#sequence() sequence} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for sequence
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_Procedure withSequence(Optional<? extends PositiveInt> optional) {
    @Nullable PositiveInt value = optional.orElse(null);
    if (this.sequence == value) return this;
    return new ImmutableExplanationOfBenefit_Procedure(
        value,
        this.procedureReference,
        this.type,
        this.procedureCodeableConcept,
        this.udi,
        this.modifierExtension,
        this.date,
        this.extension,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_Procedure#procedureReference() procedureReference} attribute.
   * @param value The value for procedureReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Procedure withProcedureReference(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "procedureReference");
    if (this.procedureReference == newValue) return this;
    return new ImmutableExplanationOfBenefit_Procedure(
        this.sequence,
        newValue,
        this.type,
        this.procedureCodeableConcept,
        this.udi,
        this.modifierExtension,
        this.date,
        this.extension,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_Procedure#procedureReference() procedureReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for procedureReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_Procedure withProcedureReference(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.procedureReference == value) return this;
    return new ImmutableExplanationOfBenefit_Procedure(
        this.sequence,
        value,
        this.type,
        this.procedureCodeableConcept,
        this.udi,
        this.modifierExtension,
        this.date,
        this.extension,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_Procedure#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Procedure withType(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableExplanationOfBenefit_Procedure(
        this.sequence,
        this.procedureReference,
        newValue,
        this.procedureCodeableConcept,
        this.udi,
        this.modifierExtension,
        this.date,
        this.extension,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_Procedure#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_Procedure withType(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableExplanationOfBenefit_Procedure(
        this.sequence,
        this.procedureReference,
        value,
        this.procedureCodeableConcept,
        this.udi,
        this.modifierExtension,
        this.date,
        this.extension,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_Procedure#procedureCodeableConcept() procedureCodeableConcept} attribute.
   * @param value The value for procedureCodeableConcept
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Procedure withProcedureCodeableConcept(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "procedureCodeableConcept");
    if (this.procedureCodeableConcept == newValue) return this;
    return new ImmutableExplanationOfBenefit_Procedure(
        this.sequence,
        this.procedureReference,
        this.type,
        newValue,
        this.udi,
        this.modifierExtension,
        this.date,
        this.extension,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_Procedure#procedureCodeableConcept() procedureCodeableConcept} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for procedureCodeableConcept
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_Procedure withProcedureCodeableConcept(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.procedureCodeableConcept == value) return this;
    return new ImmutableExplanationOfBenefit_Procedure(
        this.sequence,
        this.procedureReference,
        this.type,
        value,
        this.udi,
        this.modifierExtension,
        this.date,
        this.extension,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_Procedure#udi() udi} attribute.
   * @param value The value for udi
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Procedure withUdi(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "udi");
    if (this.udi == newValue) return this;
    return new ImmutableExplanationOfBenefit_Procedure(
        this.sequence,
        this.procedureReference,
        this.type,
        this.procedureCodeableConcept,
        newValue,
        this.modifierExtension,
        this.date,
        this.extension,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_Procedure#udi() udi} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for udi
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_Procedure withUdi(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.udi == value) return this;
    return new ImmutableExplanationOfBenefit_Procedure(
        this.sequence,
        this.procedureReference,
        this.type,
        this.procedureCodeableConcept,
        value,
        this.modifierExtension,
        this.date,
        this.extension,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_Procedure#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Procedure withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableExplanationOfBenefit_Procedure(
        this.sequence,
        this.procedureReference,
        this.type,
        this.procedureCodeableConcept,
        this.udi,
        newValue,
        this.date,
        this.extension,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_Procedure#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_Procedure withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableExplanationOfBenefit_Procedure(
        this.sequence,
        this.procedureReference,
        this.type,
        this.procedureCodeableConcept,
        this.udi,
        value,
        this.date,
        this.extension,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_Procedure#date() date} attribute.
   * @param value The value for date
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Procedure withDate(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "date");
    if (this.date == newValue) return this;
    return new ImmutableExplanationOfBenefit_Procedure(
        this.sequence,
        this.procedureReference,
        this.type,
        this.procedureCodeableConcept,
        this.udi,
        this.modifierExtension,
        newValue,
        this.extension,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_Procedure#date() date} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for date
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_Procedure withDate(Optional<? extends DateTime> optional) {
    @Nullable DateTime value = optional.orElse(null);
    if (this.date == value) return this;
    return new ImmutableExplanationOfBenefit_Procedure(
        this.sequence,
        this.procedureReference,
        this.type,
        this.procedureCodeableConcept,
        this.udi,
        this.modifierExtension,
        value,
        this.extension,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_Procedure#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Procedure withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableExplanationOfBenefit_Procedure(
        this.sequence,
        this.procedureReference,
        this.type,
        this.procedureCodeableConcept,
        this.udi,
        this.modifierExtension,
        this.date,
        newValue,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_Procedure#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_Procedure withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableExplanationOfBenefit_Procedure(
        this.sequence,
        this.procedureReference,
        this.type,
        this.procedureCodeableConcept,
        this.udi,
        this.modifierExtension,
        this.date,
        value,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_Procedure#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Procedure withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableExplanationOfBenefit_Procedure(
        this.sequence,
        this.procedureReference,
        this.type,
        this.procedureCodeableConcept,
        this.udi,
        this.modifierExtension,
        this.date,
        this.extension,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_Procedure#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Procedure withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableExplanationOfBenefit_Procedure(
        this.sequence,
        this.procedureReference,
        this.type,
        this.procedureCodeableConcept,
        this.udi,
        this.modifierExtension,
        this.date,
        this.extension,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableExplanationOfBenefit_Procedure} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableExplanationOfBenefit_Procedure
        && equalTo((ImmutableExplanationOfBenefit_Procedure) another);
  }

  private boolean equalTo(ImmutableExplanationOfBenefit_Procedure another) {
    return Objects.equals(sequence, another.sequence)
        && Objects.equals(procedureReference, another.procedureReference)
        && Objects.equals(type, another.type)
        && Objects.equals(procedureCodeableConcept, another.procedureCodeableConcept)
        && Objects.equals(udi, another.udi)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(date, another.date)
        && Objects.equals(extension, another.extension)
        && Objects.equals(id, another.id);
  }

  /**
   * Computes a hash code from attributes: {@code sequence}, {@code procedureReference}, {@code type}, {@code procedureCodeableConcept}, {@code udi}, {@code modifierExtension}, {@code date}, {@code extension}, {@code id}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(sequence);
    h += (h << 5) + Objects.hashCode(procedureReference);
    h += (h << 5) + Objects.hashCode(type);
    h += (h << 5) + Objects.hashCode(procedureCodeableConcept);
    h += (h << 5) + Objects.hashCode(udi);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(date);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(id);
    return h;
  }

  /**
   * Prints the immutable value {@code ExplanationOfBenefit_Procedure} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("ExplanationOfBenefit_Procedure{");
    if (sequence != null) {
      builder.append("sequence=").append(sequence);
    }
    if (procedureReference != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("procedureReference=").append(procedureReference);
    }
    if (type != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("type=").append(type);
    }
    if (procedureCodeableConcept != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("procedureCodeableConcept=").append(procedureCodeableConcept);
    }
    if (udi != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("udi=").append(udi);
    }
    if (modifierExtension != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (date != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("date=").append(date);
    }
    if (extension != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (id != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("id=").append(id);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "ExplanationOfBenefit_Procedure", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ExplanationOfBenefit_Procedure {
    @Nullable Optional<PositiveInt> sequence = Optional.empty();
    boolean sequenceIsSet;
    @Nullable Optional<Reference> procedureReference = Optional.empty();
    boolean procedureReferenceIsSet;
    @Nullable Optional<List<CodeableConcept>> type = Optional.empty();
    boolean typeIsSet;
    @Nullable Optional<CodeableConcept> procedureCodeableConcept = Optional.empty();
    boolean procedureCodeableConceptIsSet;
    @Nullable Optional<List<Reference>> udi = Optional.empty();
    boolean udiIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<DateTime> date = Optional.empty();
    boolean dateIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @JsonProperty("sequence")
    public void setSequence(Optional<PositiveInt> sequence) {
      this.sequence = sequence;
      this.sequenceIsSet = true;
    }
    @JsonProperty("procedureReference")
    public void setProcedureReference(Optional<Reference> procedureReference) {
      this.procedureReference = procedureReference;
      this.procedureReferenceIsSet = true;
    }
    @JsonProperty("type")
    public void setType(Optional<List<CodeableConcept>> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @JsonProperty("procedureCodeableConcept")
    public void setProcedureCodeableConcept(Optional<CodeableConcept> procedureCodeableConcept) {
      this.procedureCodeableConcept = procedureCodeableConcept;
      this.procedureCodeableConceptIsSet = true;
    }
    @JsonProperty("udi")
    public void setUdi(Optional<List<Reference>> udi) {
      this.udi = udi;
      this.udiIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("date")
    public void setDate(Optional<DateTime> date) {
      this.date = date;
      this.dateIsSet = true;
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
    @Override
    public Optional<PositiveInt> sequence() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> procedureReference() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> procedureCodeableConcept() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> udi() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DateTime> date() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableExplanationOfBenefit_Procedure fromJson(Json json) {
    ImmutableExplanationOfBenefit_Procedure.Builder builder = ImmutableExplanationOfBenefit_Procedure.builder();
    if (json.sequenceIsSet) {
      builder.sequence(json.sequence);
    }
    if (json.procedureReferenceIsSet) {
      builder.procedureReference(json.procedureReference);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.procedureCodeableConceptIsSet) {
      builder.procedureCodeableConcept(json.procedureCodeableConcept);
    }
    if (json.udiIsSet) {
      builder.udi(json.udi);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.dateIsSet) {
      builder.date(json.date);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    return (ImmutableExplanationOfBenefit_Procedure) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ExplanationOfBenefit_Procedure} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ExplanationOfBenefit_Procedure instance
   */
  public static ExplanationOfBenefit_Procedure copyOf(ExplanationOfBenefit_Procedure instance) {
    if (instance instanceof ImmutableExplanationOfBenefit_Procedure) {
      return (ImmutableExplanationOfBenefit_Procedure) instance;
    }
    return ImmutableExplanationOfBenefit_Procedure.builder()
        .sequence(instance.sequence())
        .procedureReference(instance.procedureReference())
        .type(instance.type())
        .procedureCodeableConcept(instance.procedureCodeableConcept())
        .udi(instance.udi())
        .modifierExtension(instance.modifierExtension())
        .date(instance.date())
        .extension(instance.extension())
        .id(instance.id())
        .build();
  }

  /**
   * Creates a builder for {@link ExplanationOfBenefit_Procedure ExplanationOfBenefit_Procedure}.
   * <pre>
   * ImmutableExplanationOfBenefit_Procedure.builder()
   *    .sequence(com.fhir.types.fhir.PositiveInt) // optional {@link ExplanationOfBenefit_Procedure#sequence() sequence}
   *    .procedureReference(com.fhir.types.fhir.Reference) // optional {@link ExplanationOfBenefit_Procedure#procedureReference() procedureReference}
   *    .type(List&amp;lt;com.fhir.types.fhir.CodeableConcept&amp;gt;) // optional {@link ExplanationOfBenefit_Procedure#type() type}
   *    .procedureCodeableConcept(com.fhir.types.fhir.CodeableConcept) // optional {@link ExplanationOfBenefit_Procedure#procedureCodeableConcept() procedureCodeableConcept}
   *    .udi(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link ExplanationOfBenefit_Procedure#udi() udi}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link ExplanationOfBenefit_Procedure#modifierExtension() modifierExtension}
   *    .date(com.fhir.types.fhir.DateTime) // optional {@link ExplanationOfBenefit_Procedure#date() date}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link ExplanationOfBenefit_Procedure#extension() extension}
   *    .id(String) // optional {@link ExplanationOfBenefit_Procedure#id() id}
   *    .build();
   * </pre>
   * @return A new ExplanationOfBenefit_Procedure builder
   */
  public static ImmutableExplanationOfBenefit_Procedure.Builder builder() {
    return new ImmutableExplanationOfBenefit_Procedure.Builder();
  }

  /**
   * Builds instances of type {@link ExplanationOfBenefit_Procedure ExplanationOfBenefit_Procedure}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "ExplanationOfBenefit_Procedure", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_SEQUENCE = 0x1L;
    private static final long OPT_BIT_PROCEDURE_REFERENCE = 0x2L;
    private static final long OPT_BIT_TYPE = 0x4L;
    private static final long OPT_BIT_PROCEDURE_CODEABLE_CONCEPT = 0x8L;
    private static final long OPT_BIT_UDI = 0x10L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x20L;
    private static final long OPT_BIT_DATE = 0x40L;
    private static final long OPT_BIT_EXTENSION = 0x80L;
    private static final long OPT_BIT_ID = 0x100L;
    private long optBits;

    private @Nullable PositiveInt sequence;
    private @Nullable Reference procedureReference;
    private @Nullable List<CodeableConcept> type;
    private @Nullable CodeableConcept procedureCodeableConcept;
    private @Nullable List<Reference> udi;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable DateTime date;
    private @Nullable List<Extension> extension;
    private @Nullable String id;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Procedure#sequence() sequence} to sequence.
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
     * Initializes the optional value {@link ExplanationOfBenefit_Procedure#sequence() sequence} to sequence.
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
     * Initializes the optional value {@link ExplanationOfBenefit_Procedure#procedureReference() procedureReference} to procedureReference.
     * @param procedureReference The value for procedureReference
     * @return {@code this} builder for chained invocation
     */
    public final Builder procedureReference(Reference procedureReference) {
      checkNotIsSet(procedureReferenceIsSet(), "procedureReference");
      this.procedureReference = Objects.requireNonNull(procedureReference, "procedureReference");
      optBits |= OPT_BIT_PROCEDURE_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Procedure#procedureReference() procedureReference} to procedureReference.
     * @param procedureReference The value for procedureReference
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("procedureReference")
    public final Builder procedureReference(Optional<? extends Reference> procedureReference) {
      checkNotIsSet(procedureReferenceIsSet(), "procedureReference");
      this.procedureReference = procedureReference.orElse(null);
      optBits |= OPT_BIT_PROCEDURE_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Procedure#type() type} to type.
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
     * Initializes the optional value {@link ExplanationOfBenefit_Procedure#type() type} to type.
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
     * Initializes the optional value {@link ExplanationOfBenefit_Procedure#procedureCodeableConcept() procedureCodeableConcept} to procedureCodeableConcept.
     * @param procedureCodeableConcept The value for procedureCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    public final Builder procedureCodeableConcept(CodeableConcept procedureCodeableConcept) {
      checkNotIsSet(procedureCodeableConceptIsSet(), "procedureCodeableConcept");
      this.procedureCodeableConcept = Objects.requireNonNull(procedureCodeableConcept, "procedureCodeableConcept");
      optBits |= OPT_BIT_PROCEDURE_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Procedure#procedureCodeableConcept() procedureCodeableConcept} to procedureCodeableConcept.
     * @param procedureCodeableConcept The value for procedureCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("procedureCodeableConcept")
    public final Builder procedureCodeableConcept(Optional<? extends CodeableConcept> procedureCodeableConcept) {
      checkNotIsSet(procedureCodeableConceptIsSet(), "procedureCodeableConcept");
      this.procedureCodeableConcept = procedureCodeableConcept.orElse(null);
      optBits |= OPT_BIT_PROCEDURE_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Procedure#udi() udi} to udi.
     * @param udi The value for udi
     * @return {@code this} builder for chained invocation
     */
    public final Builder udi(List<Reference> udi) {
      checkNotIsSet(udiIsSet(), "udi");
      this.udi = Objects.requireNonNull(udi, "udi");
      optBits |= OPT_BIT_UDI;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Procedure#udi() udi} to udi.
     * @param udi The value for udi
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("udi")
    public final Builder udi(Optional<? extends List<Reference>> udi) {
      checkNotIsSet(udiIsSet(), "udi");
      this.udi = udi.orElse(null);
      optBits |= OPT_BIT_UDI;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Procedure#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ExplanationOfBenefit_Procedure#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ExplanationOfBenefit_Procedure#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for chained invocation
     */
    public final Builder date(DateTime date) {
      checkNotIsSet(dateIsSet(), "date");
      this.date = Objects.requireNonNull(date, "date");
      optBits |= OPT_BIT_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Procedure#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("date")
    public final Builder date(Optional<? extends DateTime> date) {
      checkNotIsSet(dateIsSet(), "date");
      this.date = date.orElse(null);
      optBits |= OPT_BIT_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Procedure#extension() extension} to extension.
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
     * Initializes the optional value {@link ExplanationOfBenefit_Procedure#extension() extension} to extension.
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
     * Initializes the optional value {@link ExplanationOfBenefit_Procedure#id() id} to id.
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
     * Initializes the optional value {@link ExplanationOfBenefit_Procedure#id() id} to id.
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
     * Builds a new {@link ExplanationOfBenefit_Procedure ExplanationOfBenefit_Procedure}.
     * @return An immutable instance of ExplanationOfBenefit_Procedure
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ExplanationOfBenefit_Procedure build() {
      return new ImmutableExplanationOfBenefit_Procedure(
          sequence,
          procedureReference,
          type,
          procedureCodeableConcept,
          udi,
          modifierExtension,
          date,
          extension,
          id);
    }

    private boolean sequenceIsSet() {
      return (optBits & OPT_BIT_SEQUENCE) != 0;
    }

    private boolean procedureReferenceIsSet() {
      return (optBits & OPT_BIT_PROCEDURE_REFERENCE) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean procedureCodeableConceptIsSet() {
      return (optBits & OPT_BIT_PROCEDURE_CODEABLE_CONCEPT) != 0;
    }

    private boolean udiIsSet() {
      return (optBits & OPT_BIT_UDI) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean dateIsSet() {
      return (optBits & OPT_BIT_DATE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of ExplanationOfBenefit_Procedure is strict, attribute is already set: ".concat(name));
    }
  }
}
