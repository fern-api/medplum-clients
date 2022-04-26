package com.medplum.types.fhir;

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
 * Immutable implementation of {@link ExplanationOfBenefit_BenefitBalance}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableExplanationOfBenefit_BenefitBalance.builder()}.
 */
@Generated(from = "ExplanationOfBenefit_BenefitBalance", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableExplanationOfBenefit_BenefitBalance
    implements ExplanationOfBenefit_BenefitBalance {
  private final @Nullable CodeableConcept unit;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable String name;
  private final @Nullable List<ExplanationOfBenefit_Financial> financial;
  private final @Nullable CodeableConcept term;
  private final @Nullable String id;
  private final @Nullable CodeableConcept network;
  private final CodeableConcept category;
  private final @Nullable Boolean excluded;
  private final @Nullable String description;

  private ImmutableExplanationOfBenefit_BenefitBalance(
      @Nullable CodeableConcept unit,
      @Nullable List<Extension> extension,
      @Nullable List<Extension> modifierExtension,
      @Nullable String name,
      @Nullable List<ExplanationOfBenefit_Financial> financial,
      @Nullable CodeableConcept term,
      @Nullable String id,
      @Nullable CodeableConcept network,
      CodeableConcept category,
      @Nullable Boolean excluded,
      @Nullable String description) {
    this.unit = unit;
    this.extension = extension;
    this.modifierExtension = modifierExtension;
    this.name = name;
    this.financial = financial;
    this.term = term;
    this.id = id;
    this.network = network;
    this.category = category;
    this.excluded = excluded;
    this.description = description;
  }

  /**
   * @return The value of the {@code unit} attribute
   */
  @JsonProperty("unit")
  @Override
  public Optional<CodeableConcept> unit() {
    return Optional.ofNullable(unit);
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
   * @return The value of the {@code name} attribute
   */
  @JsonProperty("name")
  @Override
  public Optional<String> name() {
    return Optional.ofNullable(name);
  }

  /**
   * @return The value of the {@code financial} attribute
   */
  @JsonProperty("financial")
  @Override
  public Optional<List<ExplanationOfBenefit_Financial>> financial() {
    return Optional.ofNullable(financial);
  }

  /**
   * @return The value of the {@code term} attribute
   */
  @JsonProperty("term")
  @Override
  public Optional<CodeableConcept> term() {
    return Optional.ofNullable(term);
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
   * @return The value of the {@code network} attribute
   */
  @JsonProperty("network")
  @Override
  public Optional<CodeableConcept> network() {
    return Optional.ofNullable(network);
  }

  /**
   * @return The value of the {@code category} attribute
   */
  @JsonProperty("category")
  @Override
  public CodeableConcept category() {
    return category;
  }

  /**
   * @return The value of the {@code excluded} attribute
   */
  @JsonProperty("excluded")
  @Override
  public Optional<Boolean> excluded() {
    return Optional.ofNullable(excluded);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_BenefitBalance#unit() unit} attribute.
   * @param value The value for unit
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_BenefitBalance withUnit(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "unit");
    if (this.unit == newValue) return this;
    return new ImmutableExplanationOfBenefit_BenefitBalance(
        newValue,
        this.extension,
        this.modifierExtension,
        this.name,
        this.financial,
        this.term,
        this.id,
        this.network,
        this.category,
        this.excluded,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_BenefitBalance#unit() unit} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for unit
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_BenefitBalance withUnit(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.unit == value) return this;
    return new ImmutableExplanationOfBenefit_BenefitBalance(
        value,
        this.extension,
        this.modifierExtension,
        this.name,
        this.financial,
        this.term,
        this.id,
        this.network,
        this.category,
        this.excluded,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_BenefitBalance#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_BenefitBalance withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableExplanationOfBenefit_BenefitBalance(
        this.unit,
        newValue,
        this.modifierExtension,
        this.name,
        this.financial,
        this.term,
        this.id,
        this.network,
        this.category,
        this.excluded,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_BenefitBalance#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_BenefitBalance withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableExplanationOfBenefit_BenefitBalance(
        this.unit,
        value,
        this.modifierExtension,
        this.name,
        this.financial,
        this.term,
        this.id,
        this.network,
        this.category,
        this.excluded,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_BenefitBalance#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_BenefitBalance withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableExplanationOfBenefit_BenefitBalance(
        this.unit,
        this.extension,
        newValue,
        this.name,
        this.financial,
        this.term,
        this.id,
        this.network,
        this.category,
        this.excluded,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_BenefitBalance#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_BenefitBalance withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableExplanationOfBenefit_BenefitBalance(
        this.unit,
        this.extension,
        value,
        this.name,
        this.financial,
        this.term,
        this.id,
        this.network,
        this.category,
        this.excluded,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_BenefitBalance#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_BenefitBalance withName(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "name");
    if (Objects.equals(this.name, newValue)) return this;
    return new ImmutableExplanationOfBenefit_BenefitBalance(
        this.unit,
        this.extension,
        this.modifierExtension,
        newValue,
        this.financial,
        this.term,
        this.id,
        this.network,
        this.category,
        this.excluded,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_BenefitBalance#name() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_BenefitBalance withName(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.name, value)) return this;
    return new ImmutableExplanationOfBenefit_BenefitBalance(
        this.unit,
        this.extension,
        this.modifierExtension,
        value,
        this.financial,
        this.term,
        this.id,
        this.network,
        this.category,
        this.excluded,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_BenefitBalance#financial() financial} attribute.
   * @param value The value for financial
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_BenefitBalance withFinancial(List<ExplanationOfBenefit_Financial> value) {
    @Nullable List<ExplanationOfBenefit_Financial> newValue = Objects.requireNonNull(value, "financial");
    if (this.financial == newValue) return this;
    return new ImmutableExplanationOfBenefit_BenefitBalance(
        this.unit,
        this.extension,
        this.modifierExtension,
        this.name,
        newValue,
        this.term,
        this.id,
        this.network,
        this.category,
        this.excluded,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_BenefitBalance#financial() financial} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for financial
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_BenefitBalance withFinancial(Optional<? extends List<ExplanationOfBenefit_Financial>> optional) {
    @Nullable List<ExplanationOfBenefit_Financial> value = optional.orElse(null);
    if (this.financial == value) return this;
    return new ImmutableExplanationOfBenefit_BenefitBalance(
        this.unit,
        this.extension,
        this.modifierExtension,
        this.name,
        value,
        this.term,
        this.id,
        this.network,
        this.category,
        this.excluded,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_BenefitBalance#term() term} attribute.
   * @param value The value for term
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_BenefitBalance withTerm(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "term");
    if (this.term == newValue) return this;
    return new ImmutableExplanationOfBenefit_BenefitBalance(
        this.unit,
        this.extension,
        this.modifierExtension,
        this.name,
        this.financial,
        newValue,
        this.id,
        this.network,
        this.category,
        this.excluded,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_BenefitBalance#term() term} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for term
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_BenefitBalance withTerm(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.term == value) return this;
    return new ImmutableExplanationOfBenefit_BenefitBalance(
        this.unit,
        this.extension,
        this.modifierExtension,
        this.name,
        this.financial,
        value,
        this.id,
        this.network,
        this.category,
        this.excluded,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_BenefitBalance#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_BenefitBalance withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableExplanationOfBenefit_BenefitBalance(
        this.unit,
        this.extension,
        this.modifierExtension,
        this.name,
        this.financial,
        this.term,
        newValue,
        this.network,
        this.category,
        this.excluded,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_BenefitBalance#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_BenefitBalance withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableExplanationOfBenefit_BenefitBalance(
        this.unit,
        this.extension,
        this.modifierExtension,
        this.name,
        this.financial,
        this.term,
        value,
        this.network,
        this.category,
        this.excluded,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_BenefitBalance#network() network} attribute.
   * @param value The value for network
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_BenefitBalance withNetwork(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "network");
    if (this.network == newValue) return this;
    return new ImmutableExplanationOfBenefit_BenefitBalance(
        this.unit,
        this.extension,
        this.modifierExtension,
        this.name,
        this.financial,
        this.term,
        this.id,
        newValue,
        this.category,
        this.excluded,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_BenefitBalance#network() network} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for network
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_BenefitBalance withNetwork(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.network == value) return this;
    return new ImmutableExplanationOfBenefit_BenefitBalance(
        this.unit,
        this.extension,
        this.modifierExtension,
        this.name,
        this.financial,
        this.term,
        this.id,
        value,
        this.category,
        this.excluded,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ExplanationOfBenefit_BenefitBalance#category() category} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for category
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableExplanationOfBenefit_BenefitBalance withCategory(CodeableConcept value) {
    if (this.category == value) return this;
    CodeableConcept newValue = Objects.requireNonNull(value, "category");
    return new ImmutableExplanationOfBenefit_BenefitBalance(
        this.unit,
        this.extension,
        this.modifierExtension,
        this.name,
        this.financial,
        this.term,
        this.id,
        this.network,
        newValue,
        this.excluded,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_BenefitBalance#excluded() excluded} attribute.
   * @param value The value for excluded
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_BenefitBalance withExcluded(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.excluded, newValue)) return this;
    return new ImmutableExplanationOfBenefit_BenefitBalance(
        this.unit,
        this.extension,
        this.modifierExtension,
        this.name,
        this.financial,
        this.term,
        this.id,
        this.network,
        this.category,
        newValue,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_BenefitBalance#excluded() excluded} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for excluded
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_BenefitBalance withExcluded(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.excluded, value)) return this;
    return new ImmutableExplanationOfBenefit_BenefitBalance(
        this.unit,
        this.extension,
        this.modifierExtension,
        this.name,
        this.financial,
        this.term,
        this.id,
        this.network,
        this.category,
        value,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_BenefitBalance#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_BenefitBalance withDescription(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "description");
    if (Objects.equals(this.description, newValue)) return this;
    return new ImmutableExplanationOfBenefit_BenefitBalance(
        this.unit,
        this.extension,
        this.modifierExtension,
        this.name,
        this.financial,
        this.term,
        this.id,
        this.network,
        this.category,
        this.excluded,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_BenefitBalance#description() description} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_BenefitBalance withDescription(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.description, value)) return this;
    return new ImmutableExplanationOfBenefit_BenefitBalance(
        this.unit,
        this.extension,
        this.modifierExtension,
        this.name,
        this.financial,
        this.term,
        this.id,
        this.network,
        this.category,
        this.excluded,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableExplanationOfBenefit_BenefitBalance} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableExplanationOfBenefit_BenefitBalance
        && equalTo((ImmutableExplanationOfBenefit_BenefitBalance) another);
  }

  private boolean equalTo(ImmutableExplanationOfBenefit_BenefitBalance another) {
    return Objects.equals(unit, another.unit)
        && Objects.equals(extension, another.extension)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(name, another.name)
        && Objects.equals(financial, another.financial)
        && Objects.equals(term, another.term)
        && Objects.equals(id, another.id)
        && Objects.equals(network, another.network)
        && category.equals(another.category)
        && Objects.equals(excluded, another.excluded)
        && Objects.equals(description, another.description);
  }

  /**
   * Computes a hash code from attributes: {@code unit}, {@code extension}, {@code modifierExtension}, {@code name}, {@code financial}, {@code term}, {@code id}, {@code network}, {@code category}, {@code excluded}, {@code description}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(unit);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(name);
    h += (h << 5) + Objects.hashCode(financial);
    h += (h << 5) + Objects.hashCode(term);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(network);
    h += (h << 5) + category.hashCode();
    h += (h << 5) + Objects.hashCode(excluded);
    h += (h << 5) + Objects.hashCode(description);
    return h;
  }

  /**
   * Prints the immutable value {@code ExplanationOfBenefit_BenefitBalance} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("ExplanationOfBenefit_BenefitBalance{");
    if (unit != null) {
      builder.append("unit=").append(unit);
    }
    if (extension != null) {
      if (builder.length() > 36) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (modifierExtension != null) {
      if (builder.length() > 36) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (name != null) {
      if (builder.length() > 36) builder.append(", ");
      builder.append("name=").append(name);
    }
    if (financial != null) {
      if (builder.length() > 36) builder.append(", ");
      builder.append("financial=").append(financial);
    }
    if (term != null) {
      if (builder.length() > 36) builder.append(", ");
      builder.append("term=").append(term);
    }
    if (id != null) {
      if (builder.length() > 36) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (network != null) {
      if (builder.length() > 36) builder.append(", ");
      builder.append("network=").append(network);
    }
    if (builder.length() > 36) builder.append(", ");
    builder.append("category=").append(category);
    if (excluded != null) {
      builder.append(", ");
      builder.append("excluded=").append(excluded);
    }
    if (description != null) {
      builder.append(", ");
      builder.append("description=").append(description);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "ExplanationOfBenefit_BenefitBalance", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ExplanationOfBenefit_BenefitBalance {
    @Nullable Optional<CodeableConcept> unit = Optional.empty();
    boolean unitIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<String> name = Optional.empty();
    boolean nameIsSet;
    @Nullable Optional<List<ExplanationOfBenefit_Financial>> financial = Optional.empty();
    boolean financialIsSet;
    @Nullable Optional<CodeableConcept> term = Optional.empty();
    boolean termIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<CodeableConcept> network = Optional.empty();
    boolean networkIsSet;
    @Nullable CodeableConcept category;
    @Nullable Optional<Boolean> excluded = Optional.empty();
    boolean excludedIsSet;
    @Nullable Optional<String> description = Optional.empty();
    boolean descriptionIsSet;
    @JsonProperty("unit")
    public void setUnit(Optional<CodeableConcept> unit) {
      this.unit = unit;
      this.unitIsSet = true;
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
    @JsonProperty("name")
    public void setName(Optional<String> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @JsonProperty("financial")
    public void setFinancial(Optional<List<ExplanationOfBenefit_Financial>> financial) {
      this.financial = financial;
      this.financialIsSet = true;
    }
    @JsonProperty("term")
    public void setTerm(Optional<CodeableConcept> term) {
      this.term = term;
      this.termIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("network")
    public void setNetwork(Optional<CodeableConcept> network) {
      this.network = network;
      this.networkIsSet = true;
    }
    @JsonProperty("category")
    public void setCategory(CodeableConcept category) {
      this.category = category;
    }
    @JsonProperty("excluded")
    public void setExcluded(Optional<Boolean> excluded) {
      this.excluded = excluded;
      this.excludedIsSet = true;
    }
    @JsonProperty("description")
    public void setDescription(Optional<String> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @Override
    public Optional<CodeableConcept> unit() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> name() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ExplanationOfBenefit_Financial>> financial() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> term() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> network() { throw new UnsupportedOperationException(); }
    @Override
    public CodeableConcept category() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> excluded() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> description() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableExplanationOfBenefit_BenefitBalance fromJson(Json json) {
    ImmutableExplanationOfBenefit_BenefitBalance.Builder builder = ((ImmutableExplanationOfBenefit_BenefitBalance.Builder) ImmutableExplanationOfBenefit_BenefitBalance.builder());
    if (json.unitIsSet) {
      builder.unit(json.unit);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.financialIsSet) {
      builder.financial(json.financial);
    }
    if (json.termIsSet) {
      builder.term(json.term);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.networkIsSet) {
      builder.network(json.network);
    }
    if (json.category != null) {
      builder.category(json.category);
    }
    if (json.excludedIsSet) {
      builder.excluded(json.excluded);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    return (ImmutableExplanationOfBenefit_BenefitBalance) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ExplanationOfBenefit_BenefitBalance} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ExplanationOfBenefit_BenefitBalance instance
   */
  public static ExplanationOfBenefit_BenefitBalance copyOf(ExplanationOfBenefit_BenefitBalance instance) {
    if (instance instanceof ImmutableExplanationOfBenefit_BenefitBalance) {
      return (ImmutableExplanationOfBenefit_BenefitBalance) instance;
    }
    return ((ImmutableExplanationOfBenefit_BenefitBalance.Builder) ImmutableExplanationOfBenefit_BenefitBalance.builder())
        .unit(instance.unit())
        .extension(instance.extension())
        .modifierExtension(instance.modifierExtension())
        .name(instance.name())
        .financial(instance.financial())
        .term(instance.term())
        .id(instance.id())
        .network(instance.network())
        .category(instance.category())
        .excluded(instance.excluded())
        .description(instance.description())
        .build();
  }

  /**
   * Creates a builder for {@link ExplanationOfBenefit_BenefitBalance ExplanationOfBenefit_BenefitBalance}.
   * <pre>
   * ImmutableExplanationOfBenefit_BenefitBalance.builder()
   *    .unit(com.medplum.types.fhir.CodeableConcept) // optional {@link ExplanationOfBenefit_BenefitBalance#unit() unit}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link ExplanationOfBenefit_BenefitBalance#extension() extension}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link ExplanationOfBenefit_BenefitBalance#modifierExtension() modifierExtension}
   *    .name(String) // optional {@link ExplanationOfBenefit_BenefitBalance#name() name}
   *    .financial(List&amp;lt;com.medplum.types.fhir.ExplanationOfBenefit_Financial&amp;gt;) // optional {@link ExplanationOfBenefit_BenefitBalance#financial() financial}
   *    .term(com.medplum.types.fhir.CodeableConcept) // optional {@link ExplanationOfBenefit_BenefitBalance#term() term}
   *    .id(String) // optional {@link ExplanationOfBenefit_BenefitBalance#id() id}
   *    .network(com.medplum.types.fhir.CodeableConcept) // optional {@link ExplanationOfBenefit_BenefitBalance#network() network}
   *    .category(com.medplum.types.fhir.CodeableConcept) // required {@link ExplanationOfBenefit_BenefitBalance#category() category}
   *    .excluded(Boolean) // optional {@link ExplanationOfBenefit_BenefitBalance#excluded() excluded}
   *    .description(String) // optional {@link ExplanationOfBenefit_BenefitBalance#description() description}
   *    .build();
   * </pre>
   * @return A new ExplanationOfBenefit_BenefitBalance builder
   */
  public static CategoryBuildStage builder() {
    return new ImmutableExplanationOfBenefit_BenefitBalance.Builder();
  }

  /**
   * Builds instances of type {@link ExplanationOfBenefit_BenefitBalance ExplanationOfBenefit_BenefitBalance}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "ExplanationOfBenefit_BenefitBalance", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements CategoryBuildStage, BuildFinal {
    private static final long INIT_BIT_CATEGORY = 0x1L;
    private static final long OPT_BIT_UNIT = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x2L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x4L;
    private static final long OPT_BIT_NAME = 0x8L;
    private static final long OPT_BIT_FINANCIAL = 0x10L;
    private static final long OPT_BIT_TERM = 0x20L;
    private static final long OPT_BIT_ID = 0x40L;
    private static final long OPT_BIT_NETWORK = 0x80L;
    private static final long OPT_BIT_EXCLUDED = 0x100L;
    private static final long OPT_BIT_DESCRIPTION = 0x200L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable CodeableConcept unit;
    private @Nullable List<Extension> extension;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable String name;
    private @Nullable List<ExplanationOfBenefit_Financial> financial;
    private @Nullable CodeableConcept term;
    private @Nullable String id;
    private @Nullable CodeableConcept network;
    private @Nullable CodeableConcept category;
    private @Nullable Boolean excluded;
    private @Nullable String description;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_BenefitBalance#unit() unit} to unit.
     * @param unit The value for unit
     * @return {@code this} builder for chained invocation
     */
    public final Builder unit(CodeableConcept unit) {
      checkNotIsSet(unitIsSet(), "unit");
      this.unit = Objects.requireNonNull(unit, "unit");
      optBits |= OPT_BIT_UNIT;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_BenefitBalance#unit() unit} to unit.
     * @param unit The value for unit
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("unit")
    public final Builder unit(Optional<? extends CodeableConcept> unit) {
      checkNotIsSet(unitIsSet(), "unit");
      this.unit = unit.orElse(null);
      optBits |= OPT_BIT_UNIT;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_BenefitBalance#extension() extension} to extension.
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
     * Initializes the optional value {@link ExplanationOfBenefit_BenefitBalance#extension() extension} to extension.
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
     * Initializes the optional value {@link ExplanationOfBenefit_BenefitBalance#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ExplanationOfBenefit_BenefitBalance#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ExplanationOfBenefit_BenefitBalance#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    public final Builder name(String name) {
      checkNotIsSet(nameIsSet(), "name");
      this.name = Objects.requireNonNull(name, "name");
      optBits |= OPT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_BenefitBalance#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("name")
    public final Builder name(Optional<String> name) {
      checkNotIsSet(nameIsSet(), "name");
      this.name = name.orElse(null);
      optBits |= OPT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_BenefitBalance#financial() financial} to financial.
     * @param financial The value for financial
     * @return {@code this} builder for chained invocation
     */
    public final Builder financial(List<ExplanationOfBenefit_Financial> financial) {
      checkNotIsSet(financialIsSet(), "financial");
      this.financial = Objects.requireNonNull(financial, "financial");
      optBits |= OPT_BIT_FINANCIAL;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_BenefitBalance#financial() financial} to financial.
     * @param financial The value for financial
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("financial")
    public final Builder financial(Optional<? extends List<ExplanationOfBenefit_Financial>> financial) {
      checkNotIsSet(financialIsSet(), "financial");
      this.financial = financial.orElse(null);
      optBits |= OPT_BIT_FINANCIAL;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_BenefitBalance#term() term} to term.
     * @param term The value for term
     * @return {@code this} builder for chained invocation
     */
    public final Builder term(CodeableConcept term) {
      checkNotIsSet(termIsSet(), "term");
      this.term = Objects.requireNonNull(term, "term");
      optBits |= OPT_BIT_TERM;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_BenefitBalance#term() term} to term.
     * @param term The value for term
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("term")
    public final Builder term(Optional<? extends CodeableConcept> term) {
      checkNotIsSet(termIsSet(), "term");
      this.term = term.orElse(null);
      optBits |= OPT_BIT_TERM;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_BenefitBalance#id() id} to id.
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
     * Initializes the optional value {@link ExplanationOfBenefit_BenefitBalance#id() id} to id.
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
     * Initializes the optional value {@link ExplanationOfBenefit_BenefitBalance#network() network} to network.
     * @param network The value for network
     * @return {@code this} builder for chained invocation
     */
    public final Builder network(CodeableConcept network) {
      checkNotIsSet(networkIsSet(), "network");
      this.network = Objects.requireNonNull(network, "network");
      optBits |= OPT_BIT_NETWORK;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_BenefitBalance#network() network} to network.
     * @param network The value for network
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("network")
    public final Builder network(Optional<? extends CodeableConcept> network) {
      checkNotIsSet(networkIsSet(), "network");
      this.network = network.orElse(null);
      optBits |= OPT_BIT_NETWORK;
      return this;
    }

    /**
     * Initializes the value for the {@link ExplanationOfBenefit_BenefitBalance#category() category} attribute.
     * @param category The value for category 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("category")
    public final Builder category(CodeableConcept category) {
      checkNotIsSet(categoryIsSet(), "category");
      this.category = Objects.requireNonNull(category, "category");
      initBits &= ~INIT_BIT_CATEGORY;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_BenefitBalance#excluded() excluded} to excluded.
     * @param excluded The value for excluded
     * @return {@code this} builder for chained invocation
     */
    public final Builder excluded(boolean excluded) {
      checkNotIsSet(excludedIsSet(), "excluded");
      this.excluded = excluded;
      optBits |= OPT_BIT_EXCLUDED;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_BenefitBalance#excluded() excluded} to excluded.
     * @param excluded The value for excluded
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("excluded")
    public final Builder excluded(Optional<Boolean> excluded) {
      checkNotIsSet(excludedIsSet(), "excluded");
      this.excluded = excluded.orElse(null);
      optBits |= OPT_BIT_EXCLUDED;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_BenefitBalance#description() description} to description.
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
     * Initializes the optional value {@link ExplanationOfBenefit_BenefitBalance#description() description} to description.
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
     * Builds a new {@link ExplanationOfBenefit_BenefitBalance ExplanationOfBenefit_BenefitBalance}.
     * @return An immutable instance of ExplanationOfBenefit_BenefitBalance
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ExplanationOfBenefit_BenefitBalance build() {
      checkRequiredAttributes();
      return new ImmutableExplanationOfBenefit_BenefitBalance(
          unit,
          extension,
          modifierExtension,
          name,
          financial,
          term,
          id,
          network,
          category,
          excluded,
          description);
    }

    private boolean unitIsSet() {
      return (optBits & OPT_BIT_UNIT) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean financialIsSet() {
      return (optBits & OPT_BIT_FINANCIAL) != 0;
    }

    private boolean termIsSet() {
      return (optBits & OPT_BIT_TERM) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean networkIsSet() {
      return (optBits & OPT_BIT_NETWORK) != 0;
    }

    private boolean excludedIsSet() {
      return (optBits & OPT_BIT_EXCLUDED) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean categoryIsSet() {
      return (initBits & INIT_BIT_CATEGORY) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of ExplanationOfBenefit_BenefitBalance is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!categoryIsSet()) attributes.add("category");
      return "Cannot build ExplanationOfBenefit_BenefitBalance, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "ExplanationOfBenefit_BenefitBalance", generator = "Immutables")
  public interface CategoryBuildStage {
    /**
     * Initializes the value for the {@link ExplanationOfBenefit_BenefitBalance#category() category} attribute.
     * @param category The value for category 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal category(CodeableConcept category);
  }

  @Generated(from = "ExplanationOfBenefit_BenefitBalance", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_BenefitBalance#unit() unit} to unit.
     * @param unit The value for unit
     * @return {@code this} builder for chained invocation
     */
    BuildFinal unit(CodeableConcept unit);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_BenefitBalance#unit() unit} to unit.
     * @param unit The value for unit
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal unit(Optional<? extends CodeableConcept> unit);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_BenefitBalance#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_BenefitBalance#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_BenefitBalance#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_BenefitBalance#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_BenefitBalance#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    BuildFinal name(String name);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_BenefitBalance#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal name(Optional<String> name);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_BenefitBalance#financial() financial} to financial.
     * @param financial The value for financial
     * @return {@code this} builder for chained invocation
     */
    BuildFinal financial(List<ExplanationOfBenefit_Financial> financial);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_BenefitBalance#financial() financial} to financial.
     * @param financial The value for financial
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal financial(Optional<? extends List<ExplanationOfBenefit_Financial>> financial);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_BenefitBalance#term() term} to term.
     * @param term The value for term
     * @return {@code this} builder for chained invocation
     */
    BuildFinal term(CodeableConcept term);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_BenefitBalance#term() term} to term.
     * @param term The value for term
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal term(Optional<? extends CodeableConcept> term);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_BenefitBalance#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(String id);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_BenefitBalance#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<String> id);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_BenefitBalance#network() network} to network.
     * @param network The value for network
     * @return {@code this} builder for chained invocation
     */
    BuildFinal network(CodeableConcept network);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_BenefitBalance#network() network} to network.
     * @param network The value for network
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal network(Optional<? extends CodeableConcept> network);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_BenefitBalance#excluded() excluded} to excluded.
     * @param excluded The value for excluded
     * @return {@code this} builder for chained invocation
     */
    BuildFinal excluded(boolean excluded);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_BenefitBalance#excluded() excluded} to excluded.
     * @param excluded The value for excluded
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal excluded(Optional<Boolean> excluded);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_BenefitBalance#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    BuildFinal description(String description);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_BenefitBalance#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal description(Optional<String> description);

    /**
     * Builds a new {@link ExplanationOfBenefit_BenefitBalance ExplanationOfBenefit_BenefitBalance}.
     * @return An immutable instance of ExplanationOfBenefit_BenefitBalance
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    ExplanationOfBenefit_BenefitBalance build();
  }
}
