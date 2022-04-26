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
 * Immutable implementation of {@link SubstanceSpecification_Property}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSubstanceSpecification_Property.builder()}.
 */
@Generated(from = "SubstanceSpecification_Property", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableSubstanceSpecification_Property
    implements SubstanceSpecification_Property {
  private final @Nullable CodeableConcept code;
  private final @Nullable String id;
  private final @Nullable Quantity amountQuantity;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Reference definingSubstanceReference;
  private final @Nullable CodeableConcept definingSubstanceCodeableConcept;
  private final @Nullable String parameters;
  private final @Nullable String amountString;
  private final @Nullable CodeableConcept category;

  private ImmutableSubstanceSpecification_Property(
      @Nullable CodeableConcept code,
      @Nullable String id,
      @Nullable Quantity amountQuantity,
      @Nullable List<Extension> extension,
      @Nullable List<Extension> modifierExtension,
      @Nullable Reference definingSubstanceReference,
      @Nullable CodeableConcept definingSubstanceCodeableConcept,
      @Nullable String parameters,
      @Nullable String amountString,
      @Nullable CodeableConcept category) {
    this.code = code;
    this.id = id;
    this.amountQuantity = amountQuantity;
    this.extension = extension;
    this.modifierExtension = modifierExtension;
    this.definingSubstanceReference = definingSubstanceReference;
    this.definingSubstanceCodeableConcept = definingSubstanceCodeableConcept;
    this.parameters = parameters;
    this.amountString = amountString;
    this.category = category;
  }

  /**
   * @return The value of the {@code code} attribute
   */
  @JsonProperty("code")
  @Override
  public Optional<CodeableConcept> code() {
    return Optional.ofNullable(code);
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
   * @return The value of the {@code amountQuantity} attribute
   */
  @JsonProperty("amountQuantity")
  @Override
  public Optional<Quantity> amountQuantity() {
    return Optional.ofNullable(amountQuantity);
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
   * @return The value of the {@code definingSubstanceReference} attribute
   */
  @JsonProperty("definingSubstanceReference")
  @Override
  public Optional<Reference> definingSubstanceReference() {
    return Optional.ofNullable(definingSubstanceReference);
  }

  /**
   * @return The value of the {@code definingSubstanceCodeableConcept} attribute
   */
  @JsonProperty("definingSubstanceCodeableConcept")
  @Override
  public Optional<CodeableConcept> definingSubstanceCodeableConcept() {
    return Optional.ofNullable(definingSubstanceCodeableConcept);
  }

  /**
   * @return The value of the {@code parameters} attribute
   */
  @JsonProperty("parameters")
  @Override
  public Optional<String> parameters() {
    return Optional.ofNullable(parameters);
  }

  /**
   * @return The value of the {@code amountString} attribute
   */
  @JsonProperty("amountString")
  @Override
  public Optional<String> amountString() {
    return Optional.ofNullable(amountString);
  }

  /**
   * @return The value of the {@code category} attribute
   */
  @JsonProperty("category")
  @Override
  public Optional<CodeableConcept> category() {
    return Optional.ofNullable(category);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification_Property#code() code} attribute.
   * @param value The value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_Property withCode(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "code");
    if (this.code == newValue) return this;
    return new ImmutableSubstanceSpecification_Property(
        newValue,
        this.id,
        this.amountQuantity,
        this.extension,
        this.modifierExtension,
        this.definingSubstanceReference,
        this.definingSubstanceCodeableConcept,
        this.parameters,
        this.amountString,
        this.category);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification_Property#code() code} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for code
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification_Property withCode(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.code == value) return this;
    return new ImmutableSubstanceSpecification_Property(
        value,
        this.id,
        this.amountQuantity,
        this.extension,
        this.modifierExtension,
        this.definingSubstanceReference,
        this.definingSubstanceCodeableConcept,
        this.parameters,
        this.amountString,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification_Property#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_Property withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableSubstanceSpecification_Property(
        this.code,
        newValue,
        this.amountQuantity,
        this.extension,
        this.modifierExtension,
        this.definingSubstanceReference,
        this.definingSubstanceCodeableConcept,
        this.parameters,
        this.amountString,
        this.category);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification_Property#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_Property withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableSubstanceSpecification_Property(
        this.code,
        value,
        this.amountQuantity,
        this.extension,
        this.modifierExtension,
        this.definingSubstanceReference,
        this.definingSubstanceCodeableConcept,
        this.parameters,
        this.amountString,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification_Property#amountQuantity() amountQuantity} attribute.
   * @param value The value for amountQuantity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_Property withAmountQuantity(Quantity value) {
    @Nullable Quantity newValue = Objects.requireNonNull(value, "amountQuantity");
    if (this.amountQuantity == newValue) return this;
    return new ImmutableSubstanceSpecification_Property(
        this.code,
        this.id,
        newValue,
        this.extension,
        this.modifierExtension,
        this.definingSubstanceReference,
        this.definingSubstanceCodeableConcept,
        this.parameters,
        this.amountString,
        this.category);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification_Property#amountQuantity() amountQuantity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for amountQuantity
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification_Property withAmountQuantity(Optional<? extends Quantity> optional) {
    @Nullable Quantity value = optional.orElse(null);
    if (this.amountQuantity == value) return this;
    return new ImmutableSubstanceSpecification_Property(
        this.code,
        this.id,
        value,
        this.extension,
        this.modifierExtension,
        this.definingSubstanceReference,
        this.definingSubstanceCodeableConcept,
        this.parameters,
        this.amountString,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification_Property#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_Property withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableSubstanceSpecification_Property(
        this.code,
        this.id,
        this.amountQuantity,
        newValue,
        this.modifierExtension,
        this.definingSubstanceReference,
        this.definingSubstanceCodeableConcept,
        this.parameters,
        this.amountString,
        this.category);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification_Property#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification_Property withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableSubstanceSpecification_Property(
        this.code,
        this.id,
        this.amountQuantity,
        value,
        this.modifierExtension,
        this.definingSubstanceReference,
        this.definingSubstanceCodeableConcept,
        this.parameters,
        this.amountString,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification_Property#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_Property withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableSubstanceSpecification_Property(
        this.code,
        this.id,
        this.amountQuantity,
        this.extension,
        newValue,
        this.definingSubstanceReference,
        this.definingSubstanceCodeableConcept,
        this.parameters,
        this.amountString,
        this.category);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification_Property#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification_Property withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableSubstanceSpecification_Property(
        this.code,
        this.id,
        this.amountQuantity,
        this.extension,
        value,
        this.definingSubstanceReference,
        this.definingSubstanceCodeableConcept,
        this.parameters,
        this.amountString,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification_Property#definingSubstanceReference() definingSubstanceReference} attribute.
   * @param value The value for definingSubstanceReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_Property withDefiningSubstanceReference(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "definingSubstanceReference");
    if (this.definingSubstanceReference == newValue) return this;
    return new ImmutableSubstanceSpecification_Property(
        this.code,
        this.id,
        this.amountQuantity,
        this.extension,
        this.modifierExtension,
        newValue,
        this.definingSubstanceCodeableConcept,
        this.parameters,
        this.amountString,
        this.category);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification_Property#definingSubstanceReference() definingSubstanceReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for definingSubstanceReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification_Property withDefiningSubstanceReference(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.definingSubstanceReference == value) return this;
    return new ImmutableSubstanceSpecification_Property(
        this.code,
        this.id,
        this.amountQuantity,
        this.extension,
        this.modifierExtension,
        value,
        this.definingSubstanceCodeableConcept,
        this.parameters,
        this.amountString,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification_Property#definingSubstanceCodeableConcept() definingSubstanceCodeableConcept} attribute.
   * @param value The value for definingSubstanceCodeableConcept
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_Property withDefiningSubstanceCodeableConcept(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "definingSubstanceCodeableConcept");
    if (this.definingSubstanceCodeableConcept == newValue) return this;
    return new ImmutableSubstanceSpecification_Property(
        this.code,
        this.id,
        this.amountQuantity,
        this.extension,
        this.modifierExtension,
        this.definingSubstanceReference,
        newValue,
        this.parameters,
        this.amountString,
        this.category);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification_Property#definingSubstanceCodeableConcept() definingSubstanceCodeableConcept} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for definingSubstanceCodeableConcept
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification_Property withDefiningSubstanceCodeableConcept(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.definingSubstanceCodeableConcept == value) return this;
    return new ImmutableSubstanceSpecification_Property(
        this.code,
        this.id,
        this.amountQuantity,
        this.extension,
        this.modifierExtension,
        this.definingSubstanceReference,
        value,
        this.parameters,
        this.amountString,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification_Property#parameters() parameters} attribute.
   * @param value The value for parameters
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_Property withParameters(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "parameters");
    if (Objects.equals(this.parameters, newValue)) return this;
    return new ImmutableSubstanceSpecification_Property(
        this.code,
        this.id,
        this.amountQuantity,
        this.extension,
        this.modifierExtension,
        this.definingSubstanceReference,
        this.definingSubstanceCodeableConcept,
        newValue,
        this.amountString,
        this.category);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification_Property#parameters() parameters} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for parameters
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_Property withParameters(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.parameters, value)) return this;
    return new ImmutableSubstanceSpecification_Property(
        this.code,
        this.id,
        this.amountQuantity,
        this.extension,
        this.modifierExtension,
        this.definingSubstanceReference,
        this.definingSubstanceCodeableConcept,
        value,
        this.amountString,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification_Property#amountString() amountString} attribute.
   * @param value The value for amountString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_Property withAmountString(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "amountString");
    if (Objects.equals(this.amountString, newValue)) return this;
    return new ImmutableSubstanceSpecification_Property(
        this.code,
        this.id,
        this.amountQuantity,
        this.extension,
        this.modifierExtension,
        this.definingSubstanceReference,
        this.definingSubstanceCodeableConcept,
        this.parameters,
        newValue,
        this.category);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification_Property#amountString() amountString} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for amountString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_Property withAmountString(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.amountString, value)) return this;
    return new ImmutableSubstanceSpecification_Property(
        this.code,
        this.id,
        this.amountQuantity,
        this.extension,
        this.modifierExtension,
        this.definingSubstanceReference,
        this.definingSubstanceCodeableConcept,
        this.parameters,
        value,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification_Property#category() category} attribute.
   * @param value The value for category
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_Property withCategory(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "category");
    if (this.category == newValue) return this;
    return new ImmutableSubstanceSpecification_Property(
        this.code,
        this.id,
        this.amountQuantity,
        this.extension,
        this.modifierExtension,
        this.definingSubstanceReference,
        this.definingSubstanceCodeableConcept,
        this.parameters,
        this.amountString,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification_Property#category() category} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for category
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification_Property withCategory(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.category == value) return this;
    return new ImmutableSubstanceSpecification_Property(
        this.code,
        this.id,
        this.amountQuantity,
        this.extension,
        this.modifierExtension,
        this.definingSubstanceReference,
        this.definingSubstanceCodeableConcept,
        this.parameters,
        this.amountString,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSubstanceSpecification_Property} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSubstanceSpecification_Property
        && equalTo((ImmutableSubstanceSpecification_Property) another);
  }

  private boolean equalTo(ImmutableSubstanceSpecification_Property another) {
    return Objects.equals(code, another.code)
        && Objects.equals(id, another.id)
        && Objects.equals(amountQuantity, another.amountQuantity)
        && Objects.equals(extension, another.extension)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(definingSubstanceReference, another.definingSubstanceReference)
        && Objects.equals(definingSubstanceCodeableConcept, another.definingSubstanceCodeableConcept)
        && Objects.equals(parameters, another.parameters)
        && Objects.equals(amountString, another.amountString)
        && Objects.equals(category, another.category);
  }

  /**
   * Computes a hash code from attributes: {@code code}, {@code id}, {@code amountQuantity}, {@code extension}, {@code modifierExtension}, {@code definingSubstanceReference}, {@code definingSubstanceCodeableConcept}, {@code parameters}, {@code amountString}, {@code category}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(code);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(amountQuantity);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(definingSubstanceReference);
    h += (h << 5) + Objects.hashCode(definingSubstanceCodeableConcept);
    h += (h << 5) + Objects.hashCode(parameters);
    h += (h << 5) + Objects.hashCode(amountString);
    h += (h << 5) + Objects.hashCode(category);
    return h;
  }

  /**
   * Prints the immutable value {@code SubstanceSpecification_Property} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("SubstanceSpecification_Property{");
    if (code != null) {
      builder.append("code=").append(code);
    }
    if (id != null) {
      if (builder.length() > 32) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (amountQuantity != null) {
      if (builder.length() > 32) builder.append(", ");
      builder.append("amountQuantity=").append(amountQuantity);
    }
    if (extension != null) {
      if (builder.length() > 32) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (modifierExtension != null) {
      if (builder.length() > 32) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (definingSubstanceReference != null) {
      if (builder.length() > 32) builder.append(", ");
      builder.append("definingSubstanceReference=").append(definingSubstanceReference);
    }
    if (definingSubstanceCodeableConcept != null) {
      if (builder.length() > 32) builder.append(", ");
      builder.append("definingSubstanceCodeableConcept=").append(definingSubstanceCodeableConcept);
    }
    if (parameters != null) {
      if (builder.length() > 32) builder.append(", ");
      builder.append("parameters=").append(parameters);
    }
    if (amountString != null) {
      if (builder.length() > 32) builder.append(", ");
      builder.append("amountString=").append(amountString);
    }
    if (category != null) {
      if (builder.length() > 32) builder.append(", ");
      builder.append("category=").append(category);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "SubstanceSpecification_Property", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements SubstanceSpecification_Property {
    @Nullable Optional<CodeableConcept> code = Optional.empty();
    boolean codeIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Quantity> amountQuantity = Optional.empty();
    boolean amountQuantityIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Reference> definingSubstanceReference = Optional.empty();
    boolean definingSubstanceReferenceIsSet;
    @Nullable Optional<CodeableConcept> definingSubstanceCodeableConcept = Optional.empty();
    boolean definingSubstanceCodeableConceptIsSet;
    @Nullable Optional<String> parameters = Optional.empty();
    boolean parametersIsSet;
    @Nullable Optional<String> amountString = Optional.empty();
    boolean amountStringIsSet;
    @Nullable Optional<CodeableConcept> category = Optional.empty();
    boolean categoryIsSet;
    @JsonProperty("code")
    public void setCode(Optional<CodeableConcept> code) {
      this.code = code;
      this.codeIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("amountQuantity")
    public void setAmountQuantity(Optional<Quantity> amountQuantity) {
      this.amountQuantity = amountQuantity;
      this.amountQuantityIsSet = true;
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
    @JsonProperty("definingSubstanceReference")
    public void setDefiningSubstanceReference(Optional<Reference> definingSubstanceReference) {
      this.definingSubstanceReference = definingSubstanceReference;
      this.definingSubstanceReferenceIsSet = true;
    }
    @JsonProperty("definingSubstanceCodeableConcept")
    public void setDefiningSubstanceCodeableConcept(Optional<CodeableConcept> definingSubstanceCodeableConcept) {
      this.definingSubstanceCodeableConcept = definingSubstanceCodeableConcept;
      this.definingSubstanceCodeableConceptIsSet = true;
    }
    @JsonProperty("parameters")
    public void setParameters(Optional<String> parameters) {
      this.parameters = parameters;
      this.parametersIsSet = true;
    }
    @JsonProperty("amountString")
    public void setAmountString(Optional<String> amountString) {
      this.amountString = amountString;
      this.amountStringIsSet = true;
    }
    @JsonProperty("category")
    public void setCategory(Optional<CodeableConcept> category) {
      this.category = category;
      this.categoryIsSet = true;
    }
    @Override
    public Optional<CodeableConcept> code() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Quantity> amountQuantity() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> definingSubstanceReference() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> definingSubstanceCodeableConcept() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> parameters() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> amountString() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> category() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableSubstanceSpecification_Property fromJson(Json json) {
    ImmutableSubstanceSpecification_Property.Builder builder = ImmutableSubstanceSpecification_Property.builder();
    if (json.codeIsSet) {
      builder.code(json.code);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.amountQuantityIsSet) {
      builder.amountQuantity(json.amountQuantity);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.definingSubstanceReferenceIsSet) {
      builder.definingSubstanceReference(json.definingSubstanceReference);
    }
    if (json.definingSubstanceCodeableConceptIsSet) {
      builder.definingSubstanceCodeableConcept(json.definingSubstanceCodeableConcept);
    }
    if (json.parametersIsSet) {
      builder.parameters(json.parameters);
    }
    if (json.amountStringIsSet) {
      builder.amountString(json.amountString);
    }
    if (json.categoryIsSet) {
      builder.category(json.category);
    }
    return (ImmutableSubstanceSpecification_Property) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link SubstanceSpecification_Property} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable SubstanceSpecification_Property instance
   */
  public static SubstanceSpecification_Property copyOf(SubstanceSpecification_Property instance) {
    if (instance instanceof ImmutableSubstanceSpecification_Property) {
      return (ImmutableSubstanceSpecification_Property) instance;
    }
    return ImmutableSubstanceSpecification_Property.builder()
        .code(instance.code())
        .id(instance.id())
        .amountQuantity(instance.amountQuantity())
        .extension(instance.extension())
        .modifierExtension(instance.modifierExtension())
        .definingSubstanceReference(instance.definingSubstanceReference())
        .definingSubstanceCodeableConcept(instance.definingSubstanceCodeableConcept())
        .parameters(instance.parameters())
        .amountString(instance.amountString())
        .category(instance.category())
        .build();
  }

  /**
   * Creates a builder for {@link SubstanceSpecification_Property SubstanceSpecification_Property}.
   * <pre>
   * ImmutableSubstanceSpecification_Property.builder()
   *    .code(com.medplum.types.fhir.CodeableConcept) // optional {@link SubstanceSpecification_Property#code() code}
   *    .id(String) // optional {@link SubstanceSpecification_Property#id() id}
   *    .amountQuantity(com.medplum.types.fhir.Quantity) // optional {@link SubstanceSpecification_Property#amountQuantity() amountQuantity}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link SubstanceSpecification_Property#extension() extension}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link SubstanceSpecification_Property#modifierExtension() modifierExtension}
   *    .definingSubstanceReference(com.medplum.types.fhir.Reference) // optional {@link SubstanceSpecification_Property#definingSubstanceReference() definingSubstanceReference}
   *    .definingSubstanceCodeableConcept(com.medplum.types.fhir.CodeableConcept) // optional {@link SubstanceSpecification_Property#definingSubstanceCodeableConcept() definingSubstanceCodeableConcept}
   *    .parameters(String) // optional {@link SubstanceSpecification_Property#parameters() parameters}
   *    .amountString(String) // optional {@link SubstanceSpecification_Property#amountString() amountString}
   *    .category(com.medplum.types.fhir.CodeableConcept) // optional {@link SubstanceSpecification_Property#category() category}
   *    .build();
   * </pre>
   * @return A new SubstanceSpecification_Property builder
   */
  public static ImmutableSubstanceSpecification_Property.Builder builder() {
    return new ImmutableSubstanceSpecification_Property.Builder();
  }

  /**
   * Builds instances of type {@link SubstanceSpecification_Property SubstanceSpecification_Property}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "SubstanceSpecification_Property", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_CODE = 0x1L;
    private static final long OPT_BIT_ID = 0x2L;
    private static final long OPT_BIT_AMOUNT_QUANTITY = 0x4L;
    private static final long OPT_BIT_EXTENSION = 0x8L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x10L;
    private static final long OPT_BIT_DEFINING_SUBSTANCE_REFERENCE = 0x20L;
    private static final long OPT_BIT_DEFINING_SUBSTANCE_CODEABLE_CONCEPT = 0x40L;
    private static final long OPT_BIT_PARAMETERS = 0x80L;
    private static final long OPT_BIT_AMOUNT_STRING = 0x100L;
    private static final long OPT_BIT_CATEGORY = 0x200L;
    private long optBits;

    private @Nullable CodeableConcept code;
    private @Nullable String id;
    private @Nullable Quantity amountQuantity;
    private @Nullable List<Extension> extension;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Reference definingSubstanceReference;
    private @Nullable CodeableConcept definingSubstanceCodeableConcept;
    private @Nullable String parameters;
    private @Nullable String amountString;
    private @Nullable CodeableConcept category;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_Property#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    public final Builder code(CodeableConcept code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = Objects.requireNonNull(code, "code");
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_Property#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("code")
    public final Builder code(Optional<? extends CodeableConcept> code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = code.orElse(null);
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_Property#id() id} to id.
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
     * Initializes the optional value {@link SubstanceSpecification_Property#id() id} to id.
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
     * Initializes the optional value {@link SubstanceSpecification_Property#amountQuantity() amountQuantity} to amountQuantity.
     * @param amountQuantity The value for amountQuantity
     * @return {@code this} builder for chained invocation
     */
    public final Builder amountQuantity(Quantity amountQuantity) {
      checkNotIsSet(amountQuantityIsSet(), "amountQuantity");
      this.amountQuantity = Objects.requireNonNull(amountQuantity, "amountQuantity");
      optBits |= OPT_BIT_AMOUNT_QUANTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_Property#amountQuantity() amountQuantity} to amountQuantity.
     * @param amountQuantity The value for amountQuantity
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("amountQuantity")
    public final Builder amountQuantity(Optional<? extends Quantity> amountQuantity) {
      checkNotIsSet(amountQuantityIsSet(), "amountQuantity");
      this.amountQuantity = amountQuantity.orElse(null);
      optBits |= OPT_BIT_AMOUNT_QUANTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_Property#extension() extension} to extension.
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
     * Initializes the optional value {@link SubstanceSpecification_Property#extension() extension} to extension.
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
     * Initializes the optional value {@link SubstanceSpecification_Property#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link SubstanceSpecification_Property#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link SubstanceSpecification_Property#definingSubstanceReference() definingSubstanceReference} to definingSubstanceReference.
     * @param definingSubstanceReference The value for definingSubstanceReference
     * @return {@code this} builder for chained invocation
     */
    public final Builder definingSubstanceReference(Reference definingSubstanceReference) {
      checkNotIsSet(definingSubstanceReferenceIsSet(), "definingSubstanceReference");
      this.definingSubstanceReference = Objects.requireNonNull(definingSubstanceReference, "definingSubstanceReference");
      optBits |= OPT_BIT_DEFINING_SUBSTANCE_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_Property#definingSubstanceReference() definingSubstanceReference} to definingSubstanceReference.
     * @param definingSubstanceReference The value for definingSubstanceReference
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("definingSubstanceReference")
    public final Builder definingSubstanceReference(Optional<? extends Reference> definingSubstanceReference) {
      checkNotIsSet(definingSubstanceReferenceIsSet(), "definingSubstanceReference");
      this.definingSubstanceReference = definingSubstanceReference.orElse(null);
      optBits |= OPT_BIT_DEFINING_SUBSTANCE_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_Property#definingSubstanceCodeableConcept() definingSubstanceCodeableConcept} to definingSubstanceCodeableConcept.
     * @param definingSubstanceCodeableConcept The value for definingSubstanceCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    public final Builder definingSubstanceCodeableConcept(CodeableConcept definingSubstanceCodeableConcept) {
      checkNotIsSet(definingSubstanceCodeableConceptIsSet(), "definingSubstanceCodeableConcept");
      this.definingSubstanceCodeableConcept = Objects.requireNonNull(definingSubstanceCodeableConcept, "definingSubstanceCodeableConcept");
      optBits |= OPT_BIT_DEFINING_SUBSTANCE_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_Property#definingSubstanceCodeableConcept() definingSubstanceCodeableConcept} to definingSubstanceCodeableConcept.
     * @param definingSubstanceCodeableConcept The value for definingSubstanceCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("definingSubstanceCodeableConcept")
    public final Builder definingSubstanceCodeableConcept(Optional<? extends CodeableConcept> definingSubstanceCodeableConcept) {
      checkNotIsSet(definingSubstanceCodeableConceptIsSet(), "definingSubstanceCodeableConcept");
      this.definingSubstanceCodeableConcept = definingSubstanceCodeableConcept.orElse(null);
      optBits |= OPT_BIT_DEFINING_SUBSTANCE_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_Property#parameters() parameters} to parameters.
     * @param parameters The value for parameters
     * @return {@code this} builder for chained invocation
     */
    public final Builder parameters(String parameters) {
      checkNotIsSet(parametersIsSet(), "parameters");
      this.parameters = Objects.requireNonNull(parameters, "parameters");
      optBits |= OPT_BIT_PARAMETERS;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_Property#parameters() parameters} to parameters.
     * @param parameters The value for parameters
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("parameters")
    public final Builder parameters(Optional<String> parameters) {
      checkNotIsSet(parametersIsSet(), "parameters");
      this.parameters = parameters.orElse(null);
      optBits |= OPT_BIT_PARAMETERS;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_Property#amountString() amountString} to amountString.
     * @param amountString The value for amountString
     * @return {@code this} builder for chained invocation
     */
    public final Builder amountString(String amountString) {
      checkNotIsSet(amountStringIsSet(), "amountString");
      this.amountString = Objects.requireNonNull(amountString, "amountString");
      optBits |= OPT_BIT_AMOUNT_STRING;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_Property#amountString() amountString} to amountString.
     * @param amountString The value for amountString
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("amountString")
    public final Builder amountString(Optional<String> amountString) {
      checkNotIsSet(amountStringIsSet(), "amountString");
      this.amountString = amountString.orElse(null);
      optBits |= OPT_BIT_AMOUNT_STRING;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_Property#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for chained invocation
     */
    public final Builder category(CodeableConcept category) {
      checkNotIsSet(categoryIsSet(), "category");
      this.category = Objects.requireNonNull(category, "category");
      optBits |= OPT_BIT_CATEGORY;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_Property#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("category")
    public final Builder category(Optional<? extends CodeableConcept> category) {
      checkNotIsSet(categoryIsSet(), "category");
      this.category = category.orElse(null);
      optBits |= OPT_BIT_CATEGORY;
      return this;
    }

    /**
     * Builds a new {@link SubstanceSpecification_Property SubstanceSpecification_Property}.
     * @return An immutable instance of SubstanceSpecification_Property
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public SubstanceSpecification_Property build() {
      return new ImmutableSubstanceSpecification_Property(
          code,
          id,
          amountQuantity,
          extension,
          modifierExtension,
          definingSubstanceReference,
          definingSubstanceCodeableConcept,
          parameters,
          amountString,
          category);
    }

    private boolean codeIsSet() {
      return (optBits & OPT_BIT_CODE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean amountQuantityIsSet() {
      return (optBits & OPT_BIT_AMOUNT_QUANTITY) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean definingSubstanceReferenceIsSet() {
      return (optBits & OPT_BIT_DEFINING_SUBSTANCE_REFERENCE) != 0;
    }

    private boolean definingSubstanceCodeableConceptIsSet() {
      return (optBits & OPT_BIT_DEFINING_SUBSTANCE_CODEABLE_CONCEPT) != 0;
    }

    private boolean parametersIsSet() {
      return (optBits & OPT_BIT_PARAMETERS) != 0;
    }

    private boolean amountStringIsSet() {
      return (optBits & OPT_BIT_AMOUNT_STRING) != 0;
    }

    private boolean categoryIsSet() {
      return (optBits & OPT_BIT_CATEGORY) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of SubstanceSpecification_Property is strict, attribute is already set: ".concat(name));
    }
  }
}
