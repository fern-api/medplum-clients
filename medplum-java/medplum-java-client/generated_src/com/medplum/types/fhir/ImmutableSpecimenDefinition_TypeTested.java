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
 * Immutable implementation of {@link SpecimenDefinition_TypeTested}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSpecimenDefinition_TypeTested.builder()}.
 */
@Generated(from = "SpecimenDefinition_TypeTested", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableSpecimenDefinition_TypeTested
    implements SpecimenDefinition_TypeTested {
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable SpecimenDefinition_Container container;
  private final @Nullable Duration retentionTime;
  private final @Nullable Specimendefinition_typetestedPreference preference;
  private final @Nullable String requirement;
  private final @Nullable List<Extension> extension;
  private final @Nullable Boolean isDerived;
  private final @Nullable String id;
  private final @Nullable CodeableConcept type;
  private final @Nullable List<SpecimenDefinition_Handling> handling;
  private final @Nullable List<CodeableConcept> rejectionCriterion;

  private ImmutableSpecimenDefinition_TypeTested(
      @Nullable List<Extension> modifierExtension,
      @Nullable SpecimenDefinition_Container container,
      @Nullable Duration retentionTime,
      @Nullable Specimendefinition_typetestedPreference preference,
      @Nullable String requirement,
      @Nullable List<Extension> extension,
      @Nullable Boolean isDerived,
      @Nullable String id,
      @Nullable CodeableConcept type,
      @Nullable List<SpecimenDefinition_Handling> handling,
      @Nullable List<CodeableConcept> rejectionCriterion) {
    this.modifierExtension = modifierExtension;
    this.container = container;
    this.retentionTime = retentionTime;
    this.preference = preference;
    this.requirement = requirement;
    this.extension = extension;
    this.isDerived = isDerived;
    this.id = id;
    this.type = type;
    this.handling = handling;
    this.rejectionCriterion = rejectionCriterion;
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
   * @return The value of the {@code container} attribute
   */
  @JsonProperty("container")
  @Override
  public Optional<SpecimenDefinition_Container> container() {
    return Optional.ofNullable(container);
  }

  /**
   * @return The value of the {@code retentionTime} attribute
   */
  @JsonProperty("retentionTime")
  @Override
  public Optional<Duration> retentionTime() {
    return Optional.ofNullable(retentionTime);
  }

  /**
   * @return The value of the {@code preference} attribute
   */
  @JsonProperty("preference")
  @Override
  public Optional<Specimendefinition_typetestedPreference> preference() {
    return Optional.ofNullable(preference);
  }

  /**
   * @return The value of the {@code requirement} attribute
   */
  @JsonProperty("requirement")
  @Override
  public Optional<String> requirement() {
    return Optional.ofNullable(requirement);
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
   * @return The value of the {@code isDerived} attribute
   */
  @JsonProperty("isDerived")
  @Override
  public Optional<Boolean> isDerived() {
    return Optional.ofNullable(isDerived);
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
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public Optional<CodeableConcept> type() {
    return Optional.ofNullable(type);
  }

  /**
   * @return The value of the {@code handling} attribute
   */
  @JsonProperty("handling")
  @Override
  public Optional<List<SpecimenDefinition_Handling>> handling() {
    return Optional.ofNullable(handling);
  }

  /**
   * @return The value of the {@code rejectionCriterion} attribute
   */
  @JsonProperty("rejectionCriterion")
  @Override
  public Optional<List<CodeableConcept>> rejectionCriterion() {
    return Optional.ofNullable(rejectionCriterion);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SpecimenDefinition_TypeTested#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimenDefinition_TypeTested withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableSpecimenDefinition_TypeTested(
        newValue,
        this.container,
        this.retentionTime,
        this.preference,
        this.requirement,
        this.extension,
        this.isDerived,
        this.id,
        this.type,
        this.handling,
        this.rejectionCriterion);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SpecimenDefinition_TypeTested#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimenDefinition_TypeTested withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableSpecimenDefinition_TypeTested(
        value,
        this.container,
        this.retentionTime,
        this.preference,
        this.requirement,
        this.extension,
        this.isDerived,
        this.id,
        this.type,
        this.handling,
        this.rejectionCriterion);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SpecimenDefinition_TypeTested#container() container} attribute.
   * @param value The value for container
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimenDefinition_TypeTested withContainer(SpecimenDefinition_Container value) {
    @Nullable SpecimenDefinition_Container newValue = Objects.requireNonNull(value, "container");
    if (this.container == newValue) return this;
    return new ImmutableSpecimenDefinition_TypeTested(
        this.modifierExtension,
        newValue,
        this.retentionTime,
        this.preference,
        this.requirement,
        this.extension,
        this.isDerived,
        this.id,
        this.type,
        this.handling,
        this.rejectionCriterion);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SpecimenDefinition_TypeTested#container() container} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for container
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimenDefinition_TypeTested withContainer(Optional<? extends SpecimenDefinition_Container> optional) {
    @Nullable SpecimenDefinition_Container value = optional.orElse(null);
    if (this.container == value) return this;
    return new ImmutableSpecimenDefinition_TypeTested(
        this.modifierExtension,
        value,
        this.retentionTime,
        this.preference,
        this.requirement,
        this.extension,
        this.isDerived,
        this.id,
        this.type,
        this.handling,
        this.rejectionCriterion);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SpecimenDefinition_TypeTested#retentionTime() retentionTime} attribute.
   * @param value The value for retentionTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimenDefinition_TypeTested withRetentionTime(Duration value) {
    @Nullable Duration newValue = Objects.requireNonNull(value, "retentionTime");
    if (this.retentionTime == newValue) return this;
    return new ImmutableSpecimenDefinition_TypeTested(
        this.modifierExtension,
        this.container,
        newValue,
        this.preference,
        this.requirement,
        this.extension,
        this.isDerived,
        this.id,
        this.type,
        this.handling,
        this.rejectionCriterion);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SpecimenDefinition_TypeTested#retentionTime() retentionTime} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for retentionTime
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimenDefinition_TypeTested withRetentionTime(Optional<? extends Duration> optional) {
    @Nullable Duration value = optional.orElse(null);
    if (this.retentionTime == value) return this;
    return new ImmutableSpecimenDefinition_TypeTested(
        this.modifierExtension,
        this.container,
        value,
        this.preference,
        this.requirement,
        this.extension,
        this.isDerived,
        this.id,
        this.type,
        this.handling,
        this.rejectionCriterion);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SpecimenDefinition_TypeTested#preference() preference} attribute.
   * @param value The value for preference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimenDefinition_TypeTested withPreference(Specimendefinition_typetestedPreference value) {
    @Nullable Specimendefinition_typetestedPreference newValue = Objects.requireNonNull(value, "preference");
    if (this.preference == newValue) return this;
    return new ImmutableSpecimenDefinition_TypeTested(
        this.modifierExtension,
        this.container,
        this.retentionTime,
        newValue,
        this.requirement,
        this.extension,
        this.isDerived,
        this.id,
        this.type,
        this.handling,
        this.rejectionCriterion);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SpecimenDefinition_TypeTested#preference() preference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for preference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimenDefinition_TypeTested withPreference(Optional<? extends Specimendefinition_typetestedPreference> optional) {
    @Nullable Specimendefinition_typetestedPreference value = optional.orElse(null);
    if (this.preference == value) return this;
    return new ImmutableSpecimenDefinition_TypeTested(
        this.modifierExtension,
        this.container,
        this.retentionTime,
        value,
        this.requirement,
        this.extension,
        this.isDerived,
        this.id,
        this.type,
        this.handling,
        this.rejectionCriterion);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SpecimenDefinition_TypeTested#requirement() requirement} attribute.
   * @param value The value for requirement
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimenDefinition_TypeTested withRequirement(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "requirement");
    if (Objects.equals(this.requirement, newValue)) return this;
    return new ImmutableSpecimenDefinition_TypeTested(
        this.modifierExtension,
        this.container,
        this.retentionTime,
        this.preference,
        newValue,
        this.extension,
        this.isDerived,
        this.id,
        this.type,
        this.handling,
        this.rejectionCriterion);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SpecimenDefinition_TypeTested#requirement() requirement} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for requirement
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimenDefinition_TypeTested withRequirement(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.requirement, value)) return this;
    return new ImmutableSpecimenDefinition_TypeTested(
        this.modifierExtension,
        this.container,
        this.retentionTime,
        this.preference,
        value,
        this.extension,
        this.isDerived,
        this.id,
        this.type,
        this.handling,
        this.rejectionCriterion);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SpecimenDefinition_TypeTested#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimenDefinition_TypeTested withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableSpecimenDefinition_TypeTested(
        this.modifierExtension,
        this.container,
        this.retentionTime,
        this.preference,
        this.requirement,
        newValue,
        this.isDerived,
        this.id,
        this.type,
        this.handling,
        this.rejectionCriterion);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SpecimenDefinition_TypeTested#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimenDefinition_TypeTested withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableSpecimenDefinition_TypeTested(
        this.modifierExtension,
        this.container,
        this.retentionTime,
        this.preference,
        this.requirement,
        value,
        this.isDerived,
        this.id,
        this.type,
        this.handling,
        this.rejectionCriterion);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SpecimenDefinition_TypeTested#isDerived() isDerived} attribute.
   * @param value The value for isDerived
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimenDefinition_TypeTested withIsDerived(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.isDerived, newValue)) return this;
    return new ImmutableSpecimenDefinition_TypeTested(
        this.modifierExtension,
        this.container,
        this.retentionTime,
        this.preference,
        this.requirement,
        this.extension,
        newValue,
        this.id,
        this.type,
        this.handling,
        this.rejectionCriterion);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SpecimenDefinition_TypeTested#isDerived() isDerived} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for isDerived
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimenDefinition_TypeTested withIsDerived(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.isDerived, value)) return this;
    return new ImmutableSpecimenDefinition_TypeTested(
        this.modifierExtension,
        this.container,
        this.retentionTime,
        this.preference,
        this.requirement,
        this.extension,
        value,
        this.id,
        this.type,
        this.handling,
        this.rejectionCriterion);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SpecimenDefinition_TypeTested#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimenDefinition_TypeTested withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableSpecimenDefinition_TypeTested(
        this.modifierExtension,
        this.container,
        this.retentionTime,
        this.preference,
        this.requirement,
        this.extension,
        this.isDerived,
        newValue,
        this.type,
        this.handling,
        this.rejectionCriterion);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SpecimenDefinition_TypeTested#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimenDefinition_TypeTested withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableSpecimenDefinition_TypeTested(
        this.modifierExtension,
        this.container,
        this.retentionTime,
        this.preference,
        this.requirement,
        this.extension,
        this.isDerived,
        value,
        this.type,
        this.handling,
        this.rejectionCriterion);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SpecimenDefinition_TypeTested#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimenDefinition_TypeTested withType(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableSpecimenDefinition_TypeTested(
        this.modifierExtension,
        this.container,
        this.retentionTime,
        this.preference,
        this.requirement,
        this.extension,
        this.isDerived,
        this.id,
        newValue,
        this.handling,
        this.rejectionCriterion);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SpecimenDefinition_TypeTested#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimenDefinition_TypeTested withType(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableSpecimenDefinition_TypeTested(
        this.modifierExtension,
        this.container,
        this.retentionTime,
        this.preference,
        this.requirement,
        this.extension,
        this.isDerived,
        this.id,
        value,
        this.handling,
        this.rejectionCriterion);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SpecimenDefinition_TypeTested#handling() handling} attribute.
   * @param value The value for handling
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimenDefinition_TypeTested withHandling(List<SpecimenDefinition_Handling> value) {
    @Nullable List<SpecimenDefinition_Handling> newValue = Objects.requireNonNull(value, "handling");
    if (this.handling == newValue) return this;
    return new ImmutableSpecimenDefinition_TypeTested(
        this.modifierExtension,
        this.container,
        this.retentionTime,
        this.preference,
        this.requirement,
        this.extension,
        this.isDerived,
        this.id,
        this.type,
        newValue,
        this.rejectionCriterion);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SpecimenDefinition_TypeTested#handling() handling} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for handling
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimenDefinition_TypeTested withHandling(Optional<? extends List<SpecimenDefinition_Handling>> optional) {
    @Nullable List<SpecimenDefinition_Handling> value = optional.orElse(null);
    if (this.handling == value) return this;
    return new ImmutableSpecimenDefinition_TypeTested(
        this.modifierExtension,
        this.container,
        this.retentionTime,
        this.preference,
        this.requirement,
        this.extension,
        this.isDerived,
        this.id,
        this.type,
        value,
        this.rejectionCriterion);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SpecimenDefinition_TypeTested#rejectionCriterion() rejectionCriterion} attribute.
   * @param value The value for rejectionCriterion
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimenDefinition_TypeTested withRejectionCriterion(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "rejectionCriterion");
    if (this.rejectionCriterion == newValue) return this;
    return new ImmutableSpecimenDefinition_TypeTested(
        this.modifierExtension,
        this.container,
        this.retentionTime,
        this.preference,
        this.requirement,
        this.extension,
        this.isDerived,
        this.id,
        this.type,
        this.handling,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SpecimenDefinition_TypeTested#rejectionCriterion() rejectionCriterion} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for rejectionCriterion
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimenDefinition_TypeTested withRejectionCriterion(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.rejectionCriterion == value) return this;
    return new ImmutableSpecimenDefinition_TypeTested(
        this.modifierExtension,
        this.container,
        this.retentionTime,
        this.preference,
        this.requirement,
        this.extension,
        this.isDerived,
        this.id,
        this.type,
        this.handling,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSpecimenDefinition_TypeTested} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSpecimenDefinition_TypeTested
        && equalTo((ImmutableSpecimenDefinition_TypeTested) another);
  }

  private boolean equalTo(ImmutableSpecimenDefinition_TypeTested another) {
    return Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(container, another.container)
        && Objects.equals(retentionTime, another.retentionTime)
        && Objects.equals(preference, another.preference)
        && Objects.equals(requirement, another.requirement)
        && Objects.equals(extension, another.extension)
        && Objects.equals(isDerived, another.isDerived)
        && Objects.equals(id, another.id)
        && Objects.equals(type, another.type)
        && Objects.equals(handling, another.handling)
        && Objects.equals(rejectionCriterion, another.rejectionCriterion);
  }

  /**
   * Computes a hash code from attributes: {@code modifierExtension}, {@code container}, {@code retentionTime}, {@code preference}, {@code requirement}, {@code extension}, {@code isDerived}, {@code id}, {@code type}, {@code handling}, {@code rejectionCriterion}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(container);
    h += (h << 5) + Objects.hashCode(retentionTime);
    h += (h << 5) + Objects.hashCode(preference);
    h += (h << 5) + Objects.hashCode(requirement);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(isDerived);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(type);
    h += (h << 5) + Objects.hashCode(handling);
    h += (h << 5) + Objects.hashCode(rejectionCriterion);
    return h;
  }

  /**
   * Prints the immutable value {@code SpecimenDefinition_TypeTested} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("SpecimenDefinition_TypeTested{");
    if (modifierExtension != null) {
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (container != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("container=").append(container);
    }
    if (retentionTime != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("retentionTime=").append(retentionTime);
    }
    if (preference != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("preference=").append(preference);
    }
    if (requirement != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("requirement=").append(requirement);
    }
    if (extension != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (isDerived != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("isDerived=").append(isDerived);
    }
    if (id != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (type != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("type=").append(type);
    }
    if (handling != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("handling=").append(handling);
    }
    if (rejectionCriterion != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("rejectionCriterion=").append(rejectionCriterion);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "SpecimenDefinition_TypeTested", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements SpecimenDefinition_TypeTested {
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<SpecimenDefinition_Container> container = Optional.empty();
    boolean containerIsSet;
    @Nullable Optional<Duration> retentionTime = Optional.empty();
    boolean retentionTimeIsSet;
    @Nullable Optional<Specimendefinition_typetestedPreference> preference = Optional.empty();
    boolean preferenceIsSet;
    @Nullable Optional<String> requirement = Optional.empty();
    boolean requirementIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Boolean> isDerived = Optional.empty();
    boolean isDerivedIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<CodeableConcept> type = Optional.empty();
    boolean typeIsSet;
    @Nullable Optional<List<SpecimenDefinition_Handling>> handling = Optional.empty();
    boolean handlingIsSet;
    @Nullable Optional<List<CodeableConcept>> rejectionCriterion = Optional.empty();
    boolean rejectionCriterionIsSet;
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("container")
    public void setContainer(Optional<SpecimenDefinition_Container> container) {
      this.container = container;
      this.containerIsSet = true;
    }
    @JsonProperty("retentionTime")
    public void setRetentionTime(Optional<Duration> retentionTime) {
      this.retentionTime = retentionTime;
      this.retentionTimeIsSet = true;
    }
    @JsonProperty("preference")
    public void setPreference(Optional<Specimendefinition_typetestedPreference> preference) {
      this.preference = preference;
      this.preferenceIsSet = true;
    }
    @JsonProperty("requirement")
    public void setRequirement(Optional<String> requirement) {
      this.requirement = requirement;
      this.requirementIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("isDerived")
    public void setIsDerived(Optional<Boolean> isDerived) {
      this.isDerived = isDerived;
      this.isDerivedIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("type")
    public void setType(Optional<CodeableConcept> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @JsonProperty("handling")
    public void setHandling(Optional<List<SpecimenDefinition_Handling>> handling) {
      this.handling = handling;
      this.handlingIsSet = true;
    }
    @JsonProperty("rejectionCriterion")
    public void setRejectionCriterion(Optional<List<CodeableConcept>> rejectionCriterion) {
      this.rejectionCriterion = rejectionCriterion;
      this.rejectionCriterionIsSet = true;
    }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<SpecimenDefinition_Container> container() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Duration> retentionTime() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Specimendefinition_typetestedPreference> preference() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> requirement() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> isDerived() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<SpecimenDefinition_Handling>> handling() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> rejectionCriterion() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableSpecimenDefinition_TypeTested fromJson(Json json) {
    ImmutableSpecimenDefinition_TypeTested.Builder builder = ImmutableSpecimenDefinition_TypeTested.builder();
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.containerIsSet) {
      builder.container(json.container);
    }
    if (json.retentionTimeIsSet) {
      builder.retentionTime(json.retentionTime);
    }
    if (json.preferenceIsSet) {
      builder.preference(json.preference);
    }
    if (json.requirementIsSet) {
      builder.requirement(json.requirement);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.isDerivedIsSet) {
      builder.isDerived(json.isDerived);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.handlingIsSet) {
      builder.handling(json.handling);
    }
    if (json.rejectionCriterionIsSet) {
      builder.rejectionCriterion(json.rejectionCriterion);
    }
    return (ImmutableSpecimenDefinition_TypeTested) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link SpecimenDefinition_TypeTested} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable SpecimenDefinition_TypeTested instance
   */
  public static SpecimenDefinition_TypeTested copyOf(SpecimenDefinition_TypeTested instance) {
    if (instance instanceof ImmutableSpecimenDefinition_TypeTested) {
      return (ImmutableSpecimenDefinition_TypeTested) instance;
    }
    return ImmutableSpecimenDefinition_TypeTested.builder()
        .modifierExtension(instance.modifierExtension())
        .container(instance.container())
        .retentionTime(instance.retentionTime())
        .preference(instance.preference())
        .requirement(instance.requirement())
        .extension(instance.extension())
        .isDerived(instance.isDerived())
        .id(instance.id())
        .type(instance.type())
        .handling(instance.handling())
        .rejectionCriterion(instance.rejectionCriterion())
        .build();
  }

  /**
   * Creates a builder for {@link SpecimenDefinition_TypeTested SpecimenDefinition_TypeTested}.
   * <pre>
   * ImmutableSpecimenDefinition_TypeTested.builder()
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link SpecimenDefinition_TypeTested#modifierExtension() modifierExtension}
   *    .container(com.medplum.types.fhir.SpecimenDefinition_Container) // optional {@link SpecimenDefinition_TypeTested#container() container}
   *    .retentionTime(com.medplum.types.fhir.Duration) // optional {@link SpecimenDefinition_TypeTested#retentionTime() retentionTime}
   *    .preference(com.medplum.types.fhir.Specimendefinition_typetestedPreference) // optional {@link SpecimenDefinition_TypeTested#preference() preference}
   *    .requirement(String) // optional {@link SpecimenDefinition_TypeTested#requirement() requirement}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link SpecimenDefinition_TypeTested#extension() extension}
   *    .isDerived(Boolean) // optional {@link SpecimenDefinition_TypeTested#isDerived() isDerived}
   *    .id(String) // optional {@link SpecimenDefinition_TypeTested#id() id}
   *    .type(com.medplum.types.fhir.CodeableConcept) // optional {@link SpecimenDefinition_TypeTested#type() type}
   *    .handling(List&amp;lt;com.medplum.types.fhir.SpecimenDefinition_Handling&amp;gt;) // optional {@link SpecimenDefinition_TypeTested#handling() handling}
   *    .rejectionCriterion(List&amp;lt;com.medplum.types.fhir.CodeableConcept&amp;gt;) // optional {@link SpecimenDefinition_TypeTested#rejectionCriterion() rejectionCriterion}
   *    .build();
   * </pre>
   * @return A new SpecimenDefinition_TypeTested builder
   */
  public static ImmutableSpecimenDefinition_TypeTested.Builder builder() {
    return new ImmutableSpecimenDefinition_TypeTested.Builder();
  }

  /**
   * Builds instances of type {@link SpecimenDefinition_TypeTested SpecimenDefinition_TypeTested}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "SpecimenDefinition_TypeTested", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1L;
    private static final long OPT_BIT_CONTAINER = 0x2L;
    private static final long OPT_BIT_RETENTION_TIME = 0x4L;
    private static final long OPT_BIT_PREFERENCE = 0x8L;
    private static final long OPT_BIT_REQUIREMENT = 0x10L;
    private static final long OPT_BIT_EXTENSION = 0x20L;
    private static final long OPT_BIT_IS_DERIVED = 0x40L;
    private static final long OPT_BIT_ID = 0x80L;
    private static final long OPT_BIT_TYPE = 0x100L;
    private static final long OPT_BIT_HANDLING = 0x200L;
    private static final long OPT_BIT_REJECTION_CRITERION = 0x400L;
    private long optBits;

    private @Nullable List<Extension> modifierExtension;
    private @Nullable SpecimenDefinition_Container container;
    private @Nullable Duration retentionTime;
    private @Nullable Specimendefinition_typetestedPreference preference;
    private @Nullable String requirement;
    private @Nullable List<Extension> extension;
    private @Nullable Boolean isDerived;
    private @Nullable String id;
    private @Nullable CodeableConcept type;
    private @Nullable List<SpecimenDefinition_Handling> handling;
    private @Nullable List<CodeableConcept> rejectionCriterion;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link SpecimenDefinition_TypeTested#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link SpecimenDefinition_TypeTested#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link SpecimenDefinition_TypeTested#container() container} to container.
     * @param container The value for container
     * @return {@code this} builder for chained invocation
     */
    public final Builder container(SpecimenDefinition_Container container) {
      checkNotIsSet(containerIsSet(), "container");
      this.container = Objects.requireNonNull(container, "container");
      optBits |= OPT_BIT_CONTAINER;
      return this;
    }

    /**
     * Initializes the optional value {@link SpecimenDefinition_TypeTested#container() container} to container.
     * @param container The value for container
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("container")
    public final Builder container(Optional<? extends SpecimenDefinition_Container> container) {
      checkNotIsSet(containerIsSet(), "container");
      this.container = container.orElse(null);
      optBits |= OPT_BIT_CONTAINER;
      return this;
    }

    /**
     * Initializes the optional value {@link SpecimenDefinition_TypeTested#retentionTime() retentionTime} to retentionTime.
     * @param retentionTime The value for retentionTime
     * @return {@code this} builder for chained invocation
     */
    public final Builder retentionTime(Duration retentionTime) {
      checkNotIsSet(retentionTimeIsSet(), "retentionTime");
      this.retentionTime = Objects.requireNonNull(retentionTime, "retentionTime");
      optBits |= OPT_BIT_RETENTION_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link SpecimenDefinition_TypeTested#retentionTime() retentionTime} to retentionTime.
     * @param retentionTime The value for retentionTime
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("retentionTime")
    public final Builder retentionTime(Optional<? extends Duration> retentionTime) {
      checkNotIsSet(retentionTimeIsSet(), "retentionTime");
      this.retentionTime = retentionTime.orElse(null);
      optBits |= OPT_BIT_RETENTION_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link SpecimenDefinition_TypeTested#preference() preference} to preference.
     * @param preference The value for preference
     * @return {@code this} builder for chained invocation
     */
    public final Builder preference(Specimendefinition_typetestedPreference preference) {
      checkNotIsSet(preferenceIsSet(), "preference");
      this.preference = Objects.requireNonNull(preference, "preference");
      optBits |= OPT_BIT_PREFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link SpecimenDefinition_TypeTested#preference() preference} to preference.
     * @param preference The value for preference
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("preference")
    public final Builder preference(Optional<? extends Specimendefinition_typetestedPreference> preference) {
      checkNotIsSet(preferenceIsSet(), "preference");
      this.preference = preference.orElse(null);
      optBits |= OPT_BIT_PREFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link SpecimenDefinition_TypeTested#requirement() requirement} to requirement.
     * @param requirement The value for requirement
     * @return {@code this} builder for chained invocation
     */
    public final Builder requirement(String requirement) {
      checkNotIsSet(requirementIsSet(), "requirement");
      this.requirement = Objects.requireNonNull(requirement, "requirement");
      optBits |= OPT_BIT_REQUIREMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link SpecimenDefinition_TypeTested#requirement() requirement} to requirement.
     * @param requirement The value for requirement
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("requirement")
    public final Builder requirement(Optional<String> requirement) {
      checkNotIsSet(requirementIsSet(), "requirement");
      this.requirement = requirement.orElse(null);
      optBits |= OPT_BIT_REQUIREMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link SpecimenDefinition_TypeTested#extension() extension} to extension.
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
     * Initializes the optional value {@link SpecimenDefinition_TypeTested#extension() extension} to extension.
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
     * Initializes the optional value {@link SpecimenDefinition_TypeTested#isDerived() isDerived} to isDerived.
     * @param isDerived The value for isDerived
     * @return {@code this} builder for chained invocation
     */
    public final Builder isDerived(boolean isDerived) {
      checkNotIsSet(isDerivedIsSet(), "isDerived");
      this.isDerived = isDerived;
      optBits |= OPT_BIT_IS_DERIVED;
      return this;
    }

    /**
     * Initializes the optional value {@link SpecimenDefinition_TypeTested#isDerived() isDerived} to isDerived.
     * @param isDerived The value for isDerived
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("isDerived")
    public final Builder isDerived(Optional<Boolean> isDerived) {
      checkNotIsSet(isDerivedIsSet(), "isDerived");
      this.isDerived = isDerived.orElse(null);
      optBits |= OPT_BIT_IS_DERIVED;
      return this;
    }

    /**
     * Initializes the optional value {@link SpecimenDefinition_TypeTested#id() id} to id.
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
     * Initializes the optional value {@link SpecimenDefinition_TypeTested#id() id} to id.
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
     * Initializes the optional value {@link SpecimenDefinition_TypeTested#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(CodeableConcept type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link SpecimenDefinition_TypeTested#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("type")
    public final Builder type(Optional<? extends CodeableConcept> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link SpecimenDefinition_TypeTested#handling() handling} to handling.
     * @param handling The value for handling
     * @return {@code this} builder for chained invocation
     */
    public final Builder handling(List<SpecimenDefinition_Handling> handling) {
      checkNotIsSet(handlingIsSet(), "handling");
      this.handling = Objects.requireNonNull(handling, "handling");
      optBits |= OPT_BIT_HANDLING;
      return this;
    }

    /**
     * Initializes the optional value {@link SpecimenDefinition_TypeTested#handling() handling} to handling.
     * @param handling The value for handling
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("handling")
    public final Builder handling(Optional<? extends List<SpecimenDefinition_Handling>> handling) {
      checkNotIsSet(handlingIsSet(), "handling");
      this.handling = handling.orElse(null);
      optBits |= OPT_BIT_HANDLING;
      return this;
    }

    /**
     * Initializes the optional value {@link SpecimenDefinition_TypeTested#rejectionCriterion() rejectionCriterion} to rejectionCriterion.
     * @param rejectionCriterion The value for rejectionCriterion
     * @return {@code this} builder for chained invocation
     */
    public final Builder rejectionCriterion(List<CodeableConcept> rejectionCriterion) {
      checkNotIsSet(rejectionCriterionIsSet(), "rejectionCriterion");
      this.rejectionCriterion = Objects.requireNonNull(rejectionCriterion, "rejectionCriterion");
      optBits |= OPT_BIT_REJECTION_CRITERION;
      return this;
    }

    /**
     * Initializes the optional value {@link SpecimenDefinition_TypeTested#rejectionCriterion() rejectionCriterion} to rejectionCriterion.
     * @param rejectionCriterion The value for rejectionCriterion
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("rejectionCriterion")
    public final Builder rejectionCriterion(Optional<? extends List<CodeableConcept>> rejectionCriterion) {
      checkNotIsSet(rejectionCriterionIsSet(), "rejectionCriterion");
      this.rejectionCriterion = rejectionCriterion.orElse(null);
      optBits |= OPT_BIT_REJECTION_CRITERION;
      return this;
    }

    /**
     * Builds a new {@link SpecimenDefinition_TypeTested SpecimenDefinition_TypeTested}.
     * @return An immutable instance of SpecimenDefinition_TypeTested
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public SpecimenDefinition_TypeTested build() {
      return new ImmutableSpecimenDefinition_TypeTested(
          modifierExtension,
          container,
          retentionTime,
          preference,
          requirement,
          extension,
          isDerived,
          id,
          type,
          handling,
          rejectionCriterion);
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean containerIsSet() {
      return (optBits & OPT_BIT_CONTAINER) != 0;
    }

    private boolean retentionTimeIsSet() {
      return (optBits & OPT_BIT_RETENTION_TIME) != 0;
    }

    private boolean preferenceIsSet() {
      return (optBits & OPT_BIT_PREFERENCE) != 0;
    }

    private boolean requirementIsSet() {
      return (optBits & OPT_BIT_REQUIREMENT) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean isDerivedIsSet() {
      return (optBits & OPT_BIT_IS_DERIVED) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean handlingIsSet() {
      return (optBits & OPT_BIT_HANDLING) != 0;
    }

    private boolean rejectionCriterionIsSet() {
      return (optBits & OPT_BIT_REJECTION_CRITERION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of SpecimenDefinition_TypeTested is strict, attribute is already set: ".concat(name));
    }
  }
}
