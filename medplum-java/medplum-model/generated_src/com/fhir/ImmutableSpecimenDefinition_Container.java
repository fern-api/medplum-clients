package com.fhir;

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
 * Immutable implementation of {@link SpecimenDefinition_Container}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSpecimenDefinition_Container.builder()}.
 */
@Generated(from = "SpecimenDefinition_Container", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableSpecimenDefinition_Container implements SpecimenDefinition_Container {
  private final @Nullable String id;
  private final @Nullable String preparation;
  private final @Nullable List<SpecimenDefinition_Additive> additive;
  private final @Nullable CodeableConcept cap;
  private final @Nullable String description;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Quantity capacity;
  private final @Nullable CodeableConcept type;
  private final @Nullable String minimumVolumeString;
  private final @Nullable CodeableConcept material;
  private final @Nullable Quantity minimumVolumeQuantity;
  private final @Nullable List<Extension> extension;

  private ImmutableSpecimenDefinition_Container(
      @Nullable String id,
      @Nullable String preparation,
      @Nullable List<SpecimenDefinition_Additive> additive,
      @Nullable CodeableConcept cap,
      @Nullable String description,
      @Nullable List<Extension> modifierExtension,
      @Nullable Quantity capacity,
      @Nullable CodeableConcept type,
      @Nullable String minimumVolumeString,
      @Nullable CodeableConcept material,
      @Nullable Quantity minimumVolumeQuantity,
      @Nullable List<Extension> extension) {
    this.id = id;
    this.preparation = preparation;
    this.additive = additive;
    this.cap = cap;
    this.description = description;
    this.modifierExtension = modifierExtension;
    this.capacity = capacity;
    this.type = type;
    this.minimumVolumeString = minimumVolumeString;
    this.material = material;
    this.minimumVolumeQuantity = minimumVolumeQuantity;
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
   * @return The value of the {@code preparation} attribute
   */
  @JsonProperty("preparation")
  @Override
  public Optional<String> preparation() {
    return Optional.ofNullable(preparation);
  }

  /**
   * @return The value of the {@code additive} attribute
   */
  @JsonProperty("additive")
  @Override
  public Optional<List<SpecimenDefinition_Additive>> additive() {
    return Optional.ofNullable(additive);
  }

  /**
   * @return The value of the {@code cap} attribute
   */
  @JsonProperty("cap")
  @Override
  public Optional<CodeableConcept> cap() {
    return Optional.ofNullable(cap);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code capacity} attribute
   */
  @JsonProperty("capacity")
  @Override
  public Optional<Quantity> capacity() {
    return Optional.ofNullable(capacity);
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
   * @return The value of the {@code minimumVolumeString} attribute
   */
  @JsonProperty("minimumVolumeString")
  @Override
  public Optional<String> minimumVolumeString() {
    return Optional.ofNullable(minimumVolumeString);
  }

  /**
   * @return The value of the {@code material} attribute
   */
  @JsonProperty("material")
  @Override
  public Optional<CodeableConcept> material() {
    return Optional.ofNullable(material);
  }

  /**
   * @return The value of the {@code minimumVolumeQuantity} attribute
   */
  @JsonProperty("minimumVolumeQuantity")
  @Override
  public Optional<Quantity> minimumVolumeQuantity() {
    return Optional.ofNullable(minimumVolumeQuantity);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SpecimenDefinition_Container#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimenDefinition_Container withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableSpecimenDefinition_Container(
        newValue,
        this.preparation,
        this.additive,
        this.cap,
        this.description,
        this.modifierExtension,
        this.capacity,
        this.type,
        this.minimumVolumeString,
        this.material,
        this.minimumVolumeQuantity,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SpecimenDefinition_Container#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimenDefinition_Container withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableSpecimenDefinition_Container(
        value,
        this.preparation,
        this.additive,
        this.cap,
        this.description,
        this.modifierExtension,
        this.capacity,
        this.type,
        this.minimumVolumeString,
        this.material,
        this.minimumVolumeQuantity,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SpecimenDefinition_Container#preparation() preparation} attribute.
   * @param value The value for preparation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimenDefinition_Container withPreparation(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "preparation");
    if (Objects.equals(this.preparation, newValue)) return this;
    return new ImmutableSpecimenDefinition_Container(
        this.id,
        newValue,
        this.additive,
        this.cap,
        this.description,
        this.modifierExtension,
        this.capacity,
        this.type,
        this.minimumVolumeString,
        this.material,
        this.minimumVolumeQuantity,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SpecimenDefinition_Container#preparation() preparation} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for preparation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimenDefinition_Container withPreparation(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.preparation, value)) return this;
    return new ImmutableSpecimenDefinition_Container(
        this.id,
        value,
        this.additive,
        this.cap,
        this.description,
        this.modifierExtension,
        this.capacity,
        this.type,
        this.minimumVolumeString,
        this.material,
        this.minimumVolumeQuantity,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SpecimenDefinition_Container#additive() additive} attribute.
   * @param value The value for additive
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimenDefinition_Container withAdditive(List<SpecimenDefinition_Additive> value) {
    @Nullable List<SpecimenDefinition_Additive> newValue = Objects.requireNonNull(value, "additive");
    if (this.additive == newValue) return this;
    return new ImmutableSpecimenDefinition_Container(
        this.id,
        this.preparation,
        newValue,
        this.cap,
        this.description,
        this.modifierExtension,
        this.capacity,
        this.type,
        this.minimumVolumeString,
        this.material,
        this.minimumVolumeQuantity,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SpecimenDefinition_Container#additive() additive} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for additive
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimenDefinition_Container withAdditive(Optional<? extends List<SpecimenDefinition_Additive>> optional) {
    @Nullable List<SpecimenDefinition_Additive> value = optional.orElse(null);
    if (this.additive == value) return this;
    return new ImmutableSpecimenDefinition_Container(
        this.id,
        this.preparation,
        value,
        this.cap,
        this.description,
        this.modifierExtension,
        this.capacity,
        this.type,
        this.minimumVolumeString,
        this.material,
        this.minimumVolumeQuantity,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SpecimenDefinition_Container#cap() cap} attribute.
   * @param value The value for cap
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimenDefinition_Container withCap(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "cap");
    if (this.cap == newValue) return this;
    return new ImmutableSpecimenDefinition_Container(
        this.id,
        this.preparation,
        this.additive,
        newValue,
        this.description,
        this.modifierExtension,
        this.capacity,
        this.type,
        this.minimumVolumeString,
        this.material,
        this.minimumVolumeQuantity,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SpecimenDefinition_Container#cap() cap} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for cap
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimenDefinition_Container withCap(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.cap == value) return this;
    return new ImmutableSpecimenDefinition_Container(
        this.id,
        this.preparation,
        this.additive,
        value,
        this.description,
        this.modifierExtension,
        this.capacity,
        this.type,
        this.minimumVolumeString,
        this.material,
        this.minimumVolumeQuantity,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SpecimenDefinition_Container#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimenDefinition_Container withDescription(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "description");
    if (Objects.equals(this.description, newValue)) return this;
    return new ImmutableSpecimenDefinition_Container(
        this.id,
        this.preparation,
        this.additive,
        this.cap,
        newValue,
        this.modifierExtension,
        this.capacity,
        this.type,
        this.minimumVolumeString,
        this.material,
        this.minimumVolumeQuantity,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SpecimenDefinition_Container#description() description} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimenDefinition_Container withDescription(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.description, value)) return this;
    return new ImmutableSpecimenDefinition_Container(
        this.id,
        this.preparation,
        this.additive,
        this.cap,
        value,
        this.modifierExtension,
        this.capacity,
        this.type,
        this.minimumVolumeString,
        this.material,
        this.minimumVolumeQuantity,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SpecimenDefinition_Container#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimenDefinition_Container withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableSpecimenDefinition_Container(
        this.id,
        this.preparation,
        this.additive,
        this.cap,
        this.description,
        newValue,
        this.capacity,
        this.type,
        this.minimumVolumeString,
        this.material,
        this.minimumVolumeQuantity,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SpecimenDefinition_Container#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimenDefinition_Container withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableSpecimenDefinition_Container(
        this.id,
        this.preparation,
        this.additive,
        this.cap,
        this.description,
        value,
        this.capacity,
        this.type,
        this.minimumVolumeString,
        this.material,
        this.minimumVolumeQuantity,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SpecimenDefinition_Container#capacity() capacity} attribute.
   * @param value The value for capacity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimenDefinition_Container withCapacity(Quantity value) {
    @Nullable Quantity newValue = Objects.requireNonNull(value, "capacity");
    if (this.capacity == newValue) return this;
    return new ImmutableSpecimenDefinition_Container(
        this.id,
        this.preparation,
        this.additive,
        this.cap,
        this.description,
        this.modifierExtension,
        newValue,
        this.type,
        this.minimumVolumeString,
        this.material,
        this.minimumVolumeQuantity,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SpecimenDefinition_Container#capacity() capacity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for capacity
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimenDefinition_Container withCapacity(Optional<? extends Quantity> optional) {
    @Nullable Quantity value = optional.orElse(null);
    if (this.capacity == value) return this;
    return new ImmutableSpecimenDefinition_Container(
        this.id,
        this.preparation,
        this.additive,
        this.cap,
        this.description,
        this.modifierExtension,
        value,
        this.type,
        this.minimumVolumeString,
        this.material,
        this.minimumVolumeQuantity,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SpecimenDefinition_Container#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimenDefinition_Container withType(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableSpecimenDefinition_Container(
        this.id,
        this.preparation,
        this.additive,
        this.cap,
        this.description,
        this.modifierExtension,
        this.capacity,
        newValue,
        this.minimumVolumeString,
        this.material,
        this.minimumVolumeQuantity,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SpecimenDefinition_Container#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimenDefinition_Container withType(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableSpecimenDefinition_Container(
        this.id,
        this.preparation,
        this.additive,
        this.cap,
        this.description,
        this.modifierExtension,
        this.capacity,
        value,
        this.minimumVolumeString,
        this.material,
        this.minimumVolumeQuantity,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SpecimenDefinition_Container#minimumVolumeString() minimumVolumeString} attribute.
   * @param value The value for minimumVolumeString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimenDefinition_Container withMinimumVolumeString(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "minimumVolumeString");
    if (Objects.equals(this.minimumVolumeString, newValue)) return this;
    return new ImmutableSpecimenDefinition_Container(
        this.id,
        this.preparation,
        this.additive,
        this.cap,
        this.description,
        this.modifierExtension,
        this.capacity,
        this.type,
        newValue,
        this.material,
        this.minimumVolumeQuantity,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SpecimenDefinition_Container#minimumVolumeString() minimumVolumeString} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for minimumVolumeString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimenDefinition_Container withMinimumVolumeString(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.minimumVolumeString, value)) return this;
    return new ImmutableSpecimenDefinition_Container(
        this.id,
        this.preparation,
        this.additive,
        this.cap,
        this.description,
        this.modifierExtension,
        this.capacity,
        this.type,
        value,
        this.material,
        this.minimumVolumeQuantity,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SpecimenDefinition_Container#material() material} attribute.
   * @param value The value for material
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimenDefinition_Container withMaterial(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "material");
    if (this.material == newValue) return this;
    return new ImmutableSpecimenDefinition_Container(
        this.id,
        this.preparation,
        this.additive,
        this.cap,
        this.description,
        this.modifierExtension,
        this.capacity,
        this.type,
        this.minimumVolumeString,
        newValue,
        this.minimumVolumeQuantity,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SpecimenDefinition_Container#material() material} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for material
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimenDefinition_Container withMaterial(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.material == value) return this;
    return new ImmutableSpecimenDefinition_Container(
        this.id,
        this.preparation,
        this.additive,
        this.cap,
        this.description,
        this.modifierExtension,
        this.capacity,
        this.type,
        this.minimumVolumeString,
        value,
        this.minimumVolumeQuantity,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SpecimenDefinition_Container#minimumVolumeQuantity() minimumVolumeQuantity} attribute.
   * @param value The value for minimumVolumeQuantity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimenDefinition_Container withMinimumVolumeQuantity(Quantity value) {
    @Nullable Quantity newValue = Objects.requireNonNull(value, "minimumVolumeQuantity");
    if (this.minimumVolumeQuantity == newValue) return this;
    return new ImmutableSpecimenDefinition_Container(
        this.id,
        this.preparation,
        this.additive,
        this.cap,
        this.description,
        this.modifierExtension,
        this.capacity,
        this.type,
        this.minimumVolumeString,
        this.material,
        newValue,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SpecimenDefinition_Container#minimumVolumeQuantity() minimumVolumeQuantity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for minimumVolumeQuantity
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimenDefinition_Container withMinimumVolumeQuantity(Optional<? extends Quantity> optional) {
    @Nullable Quantity value = optional.orElse(null);
    if (this.minimumVolumeQuantity == value) return this;
    return new ImmutableSpecimenDefinition_Container(
        this.id,
        this.preparation,
        this.additive,
        this.cap,
        this.description,
        this.modifierExtension,
        this.capacity,
        this.type,
        this.minimumVolumeString,
        this.material,
        value,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SpecimenDefinition_Container#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimenDefinition_Container withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableSpecimenDefinition_Container(
        this.id,
        this.preparation,
        this.additive,
        this.cap,
        this.description,
        this.modifierExtension,
        this.capacity,
        this.type,
        this.minimumVolumeString,
        this.material,
        this.minimumVolumeQuantity,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SpecimenDefinition_Container#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimenDefinition_Container withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableSpecimenDefinition_Container(
        this.id,
        this.preparation,
        this.additive,
        this.cap,
        this.description,
        this.modifierExtension,
        this.capacity,
        this.type,
        this.minimumVolumeString,
        this.material,
        this.minimumVolumeQuantity,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSpecimenDefinition_Container} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSpecimenDefinition_Container
        && equalTo((ImmutableSpecimenDefinition_Container) another);
  }

  private boolean equalTo(ImmutableSpecimenDefinition_Container another) {
    return Objects.equals(id, another.id)
        && Objects.equals(preparation, another.preparation)
        && Objects.equals(additive, another.additive)
        && Objects.equals(cap, another.cap)
        && Objects.equals(description, another.description)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(capacity, another.capacity)
        && Objects.equals(type, another.type)
        && Objects.equals(minimumVolumeString, another.minimumVolumeString)
        && Objects.equals(material, another.material)
        && Objects.equals(minimumVolumeQuantity, another.minimumVolumeQuantity)
        && Objects.equals(extension, another.extension);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code preparation}, {@code additive}, {@code cap}, {@code description}, {@code modifierExtension}, {@code capacity}, {@code type}, {@code minimumVolumeString}, {@code material}, {@code minimumVolumeQuantity}, {@code extension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(preparation);
    h += (h << 5) + Objects.hashCode(additive);
    h += (h << 5) + Objects.hashCode(cap);
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(capacity);
    h += (h << 5) + Objects.hashCode(type);
    h += (h << 5) + Objects.hashCode(minimumVolumeString);
    h += (h << 5) + Objects.hashCode(material);
    h += (h << 5) + Objects.hashCode(minimumVolumeQuantity);
    h += (h << 5) + Objects.hashCode(extension);
    return h;
  }

  /**
   * Prints the immutable value {@code SpecimenDefinition_Container} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("SpecimenDefinition_Container{");
    if (id != null) {
      builder.append("id=").append(id);
    }
    if (preparation != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("preparation=").append(preparation);
    }
    if (additive != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("additive=").append(additive);
    }
    if (cap != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("cap=").append(cap);
    }
    if (description != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("description=").append(description);
    }
    if (modifierExtension != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (capacity != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("capacity=").append(capacity);
    }
    if (type != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("type=").append(type);
    }
    if (minimumVolumeString != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("minimumVolumeString=").append(minimumVolumeString);
    }
    if (material != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("material=").append(material);
    }
    if (minimumVolumeQuantity != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("minimumVolumeQuantity=").append(minimumVolumeQuantity);
    }
    if (extension != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "SpecimenDefinition_Container", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements SpecimenDefinition_Container {
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<String> preparation = Optional.empty();
    boolean preparationIsSet;
    @Nullable Optional<List<SpecimenDefinition_Additive>> additive = Optional.empty();
    boolean additiveIsSet;
    @Nullable Optional<CodeableConcept> cap = Optional.empty();
    boolean capIsSet;
    @Nullable Optional<String> description = Optional.empty();
    boolean descriptionIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Quantity> capacity = Optional.empty();
    boolean capacityIsSet;
    @Nullable Optional<CodeableConcept> type = Optional.empty();
    boolean typeIsSet;
    @Nullable Optional<String> minimumVolumeString = Optional.empty();
    boolean minimumVolumeStringIsSet;
    @Nullable Optional<CodeableConcept> material = Optional.empty();
    boolean materialIsSet;
    @Nullable Optional<Quantity> minimumVolumeQuantity = Optional.empty();
    boolean minimumVolumeQuantityIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("preparation")
    public void setPreparation(Optional<String> preparation) {
      this.preparation = preparation;
      this.preparationIsSet = true;
    }
    @JsonProperty("additive")
    public void setAdditive(Optional<List<SpecimenDefinition_Additive>> additive) {
      this.additive = additive;
      this.additiveIsSet = true;
    }
    @JsonProperty("cap")
    public void setCap(Optional<CodeableConcept> cap) {
      this.cap = cap;
      this.capIsSet = true;
    }
    @JsonProperty("description")
    public void setDescription(Optional<String> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("capacity")
    public void setCapacity(Optional<Quantity> capacity) {
      this.capacity = capacity;
      this.capacityIsSet = true;
    }
    @JsonProperty("type")
    public void setType(Optional<CodeableConcept> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @JsonProperty("minimumVolumeString")
    public void setMinimumVolumeString(Optional<String> minimumVolumeString) {
      this.minimumVolumeString = minimumVolumeString;
      this.minimumVolumeStringIsSet = true;
    }
    @JsonProperty("material")
    public void setMaterial(Optional<CodeableConcept> material) {
      this.material = material;
      this.materialIsSet = true;
    }
    @JsonProperty("minimumVolumeQuantity")
    public void setMinimumVolumeQuantity(Optional<Quantity> minimumVolumeQuantity) {
      this.minimumVolumeQuantity = minimumVolumeQuantity;
      this.minimumVolumeQuantityIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> preparation() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<SpecimenDefinition_Additive>> additive() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> cap() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> description() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Quantity> capacity() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> minimumVolumeString() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> material() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Quantity> minimumVolumeQuantity() { throw new UnsupportedOperationException(); }
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
  static ImmutableSpecimenDefinition_Container fromJson(Json json) {
    ImmutableSpecimenDefinition_Container.Builder builder = ImmutableSpecimenDefinition_Container.builder();
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.preparationIsSet) {
      builder.preparation(json.preparation);
    }
    if (json.additiveIsSet) {
      builder.additive(json.additive);
    }
    if (json.capIsSet) {
      builder.cap(json.cap);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.capacityIsSet) {
      builder.capacity(json.capacity);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.minimumVolumeStringIsSet) {
      builder.minimumVolumeString(json.minimumVolumeString);
    }
    if (json.materialIsSet) {
      builder.material(json.material);
    }
    if (json.minimumVolumeQuantityIsSet) {
      builder.minimumVolumeQuantity(json.minimumVolumeQuantity);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    return (ImmutableSpecimenDefinition_Container) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link SpecimenDefinition_Container} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable SpecimenDefinition_Container instance
   */
  public static SpecimenDefinition_Container copyOf(SpecimenDefinition_Container instance) {
    if (instance instanceof ImmutableSpecimenDefinition_Container) {
      return (ImmutableSpecimenDefinition_Container) instance;
    }
    return ImmutableSpecimenDefinition_Container.builder()
        .id(instance.id())
        .preparation(instance.preparation())
        .additive(instance.additive())
        .cap(instance.cap())
        .description(instance.description())
        .modifierExtension(instance.modifierExtension())
        .capacity(instance.capacity())
        .type(instance.type())
        .minimumVolumeString(instance.minimumVolumeString())
        .material(instance.material())
        .minimumVolumeQuantity(instance.minimumVolumeQuantity())
        .extension(instance.extension())
        .build();
  }

  /**
   * Creates a builder for {@link SpecimenDefinition_Container SpecimenDefinition_Container}.
   * <pre>
   * ImmutableSpecimenDefinition_Container.builder()
   *    .id(String) // optional {@link SpecimenDefinition_Container#id() id}
   *    .preparation(String) // optional {@link SpecimenDefinition_Container#preparation() preparation}
   *    .additive(List&amp;lt;com.fhir.SpecimenDefinition_Additive&amp;gt;) // optional {@link SpecimenDefinition_Container#additive() additive}
   *    .cap(com.fhir.CodeableConcept) // optional {@link SpecimenDefinition_Container#cap() cap}
   *    .description(String) // optional {@link SpecimenDefinition_Container#description() description}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link SpecimenDefinition_Container#modifierExtension() modifierExtension}
   *    .capacity(com.fhir.Quantity) // optional {@link SpecimenDefinition_Container#capacity() capacity}
   *    .type(com.fhir.CodeableConcept) // optional {@link SpecimenDefinition_Container#type() type}
   *    .minimumVolumeString(String) // optional {@link SpecimenDefinition_Container#minimumVolumeString() minimumVolumeString}
   *    .material(com.fhir.CodeableConcept) // optional {@link SpecimenDefinition_Container#material() material}
   *    .minimumVolumeQuantity(com.fhir.Quantity) // optional {@link SpecimenDefinition_Container#minimumVolumeQuantity() minimumVolumeQuantity}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link SpecimenDefinition_Container#extension() extension}
   *    .build();
   * </pre>
   * @return A new SpecimenDefinition_Container builder
   */
  public static ImmutableSpecimenDefinition_Container.Builder builder() {
    return new ImmutableSpecimenDefinition_Container.Builder();
  }

  /**
   * Builds instances of type {@link SpecimenDefinition_Container SpecimenDefinition_Container}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "SpecimenDefinition_Container", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_ID = 0x1L;
    private static final long OPT_BIT_PREPARATION = 0x2L;
    private static final long OPT_BIT_ADDITIVE = 0x4L;
    private static final long OPT_BIT_CAP = 0x8L;
    private static final long OPT_BIT_DESCRIPTION = 0x10L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x20L;
    private static final long OPT_BIT_CAPACITY = 0x40L;
    private static final long OPT_BIT_TYPE = 0x80L;
    private static final long OPT_BIT_MINIMUM_VOLUME_STRING = 0x100L;
    private static final long OPT_BIT_MATERIAL = 0x200L;
    private static final long OPT_BIT_MINIMUM_VOLUME_QUANTITY = 0x400L;
    private static final long OPT_BIT_EXTENSION = 0x800L;
    private long optBits;

    private @Nullable String id;
    private @Nullable String preparation;
    private @Nullable List<SpecimenDefinition_Additive> additive;
    private @Nullable CodeableConcept cap;
    private @Nullable String description;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Quantity capacity;
    private @Nullable CodeableConcept type;
    private @Nullable String minimumVolumeString;
    private @Nullable CodeableConcept material;
    private @Nullable Quantity minimumVolumeQuantity;
    private @Nullable List<Extension> extension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link SpecimenDefinition_Container#id() id} to id.
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
     * Initializes the optional value {@link SpecimenDefinition_Container#id() id} to id.
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
     * Initializes the optional value {@link SpecimenDefinition_Container#preparation() preparation} to preparation.
     * @param preparation The value for preparation
     * @return {@code this} builder for chained invocation
     */
    public final Builder preparation(String preparation) {
      checkNotIsSet(preparationIsSet(), "preparation");
      this.preparation = Objects.requireNonNull(preparation, "preparation");
      optBits |= OPT_BIT_PREPARATION;
      return this;
    }

    /**
     * Initializes the optional value {@link SpecimenDefinition_Container#preparation() preparation} to preparation.
     * @param preparation The value for preparation
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("preparation")
    public final Builder preparation(Optional<String> preparation) {
      checkNotIsSet(preparationIsSet(), "preparation");
      this.preparation = preparation.orElse(null);
      optBits |= OPT_BIT_PREPARATION;
      return this;
    }

    /**
     * Initializes the optional value {@link SpecimenDefinition_Container#additive() additive} to additive.
     * @param additive The value for additive
     * @return {@code this} builder for chained invocation
     */
    public final Builder additive(List<SpecimenDefinition_Additive> additive) {
      checkNotIsSet(additiveIsSet(), "additive");
      this.additive = Objects.requireNonNull(additive, "additive");
      optBits |= OPT_BIT_ADDITIVE;
      return this;
    }

    /**
     * Initializes the optional value {@link SpecimenDefinition_Container#additive() additive} to additive.
     * @param additive The value for additive
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("additive")
    public final Builder additive(Optional<? extends List<SpecimenDefinition_Additive>> additive) {
      checkNotIsSet(additiveIsSet(), "additive");
      this.additive = additive.orElse(null);
      optBits |= OPT_BIT_ADDITIVE;
      return this;
    }

    /**
     * Initializes the optional value {@link SpecimenDefinition_Container#cap() cap} to cap.
     * @param cap The value for cap
     * @return {@code this} builder for chained invocation
     */
    public final Builder cap(CodeableConcept cap) {
      checkNotIsSet(capIsSet(), "cap");
      this.cap = Objects.requireNonNull(cap, "cap");
      optBits |= OPT_BIT_CAP;
      return this;
    }

    /**
     * Initializes the optional value {@link SpecimenDefinition_Container#cap() cap} to cap.
     * @param cap The value for cap
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("cap")
    public final Builder cap(Optional<? extends CodeableConcept> cap) {
      checkNotIsSet(capIsSet(), "cap");
      this.cap = cap.orElse(null);
      optBits |= OPT_BIT_CAP;
      return this;
    }

    /**
     * Initializes the optional value {@link SpecimenDefinition_Container#description() description} to description.
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
     * Initializes the optional value {@link SpecimenDefinition_Container#description() description} to description.
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
     * Initializes the optional value {@link SpecimenDefinition_Container#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link SpecimenDefinition_Container#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link SpecimenDefinition_Container#capacity() capacity} to capacity.
     * @param capacity The value for capacity
     * @return {@code this} builder for chained invocation
     */
    public final Builder capacity(Quantity capacity) {
      checkNotIsSet(capacityIsSet(), "capacity");
      this.capacity = Objects.requireNonNull(capacity, "capacity");
      optBits |= OPT_BIT_CAPACITY;
      return this;
    }

    /**
     * Initializes the optional value {@link SpecimenDefinition_Container#capacity() capacity} to capacity.
     * @param capacity The value for capacity
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("capacity")
    public final Builder capacity(Optional<? extends Quantity> capacity) {
      checkNotIsSet(capacityIsSet(), "capacity");
      this.capacity = capacity.orElse(null);
      optBits |= OPT_BIT_CAPACITY;
      return this;
    }

    /**
     * Initializes the optional value {@link SpecimenDefinition_Container#type() type} to type.
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
     * Initializes the optional value {@link SpecimenDefinition_Container#type() type} to type.
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
     * Initializes the optional value {@link SpecimenDefinition_Container#minimumVolumeString() minimumVolumeString} to minimumVolumeString.
     * @param minimumVolumeString The value for minimumVolumeString
     * @return {@code this} builder for chained invocation
     */
    public final Builder minimumVolumeString(String minimumVolumeString) {
      checkNotIsSet(minimumVolumeStringIsSet(), "minimumVolumeString");
      this.minimumVolumeString = Objects.requireNonNull(minimumVolumeString, "minimumVolumeString");
      optBits |= OPT_BIT_MINIMUM_VOLUME_STRING;
      return this;
    }

    /**
     * Initializes the optional value {@link SpecimenDefinition_Container#minimumVolumeString() minimumVolumeString} to minimumVolumeString.
     * @param minimumVolumeString The value for minimumVolumeString
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("minimumVolumeString")
    public final Builder minimumVolumeString(Optional<String> minimumVolumeString) {
      checkNotIsSet(minimumVolumeStringIsSet(), "minimumVolumeString");
      this.minimumVolumeString = minimumVolumeString.orElse(null);
      optBits |= OPT_BIT_MINIMUM_VOLUME_STRING;
      return this;
    }

    /**
     * Initializes the optional value {@link SpecimenDefinition_Container#material() material} to material.
     * @param material The value for material
     * @return {@code this} builder for chained invocation
     */
    public final Builder material(CodeableConcept material) {
      checkNotIsSet(materialIsSet(), "material");
      this.material = Objects.requireNonNull(material, "material");
      optBits |= OPT_BIT_MATERIAL;
      return this;
    }

    /**
     * Initializes the optional value {@link SpecimenDefinition_Container#material() material} to material.
     * @param material The value for material
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("material")
    public final Builder material(Optional<? extends CodeableConcept> material) {
      checkNotIsSet(materialIsSet(), "material");
      this.material = material.orElse(null);
      optBits |= OPT_BIT_MATERIAL;
      return this;
    }

    /**
     * Initializes the optional value {@link SpecimenDefinition_Container#minimumVolumeQuantity() minimumVolumeQuantity} to minimumVolumeQuantity.
     * @param minimumVolumeQuantity The value for minimumVolumeQuantity
     * @return {@code this} builder for chained invocation
     */
    public final Builder minimumVolumeQuantity(Quantity minimumVolumeQuantity) {
      checkNotIsSet(minimumVolumeQuantityIsSet(), "minimumVolumeQuantity");
      this.minimumVolumeQuantity = Objects.requireNonNull(minimumVolumeQuantity, "minimumVolumeQuantity");
      optBits |= OPT_BIT_MINIMUM_VOLUME_QUANTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link SpecimenDefinition_Container#minimumVolumeQuantity() minimumVolumeQuantity} to minimumVolumeQuantity.
     * @param minimumVolumeQuantity The value for minimumVolumeQuantity
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("minimumVolumeQuantity")
    public final Builder minimumVolumeQuantity(Optional<? extends Quantity> minimumVolumeQuantity) {
      checkNotIsSet(minimumVolumeQuantityIsSet(), "minimumVolumeQuantity");
      this.minimumVolumeQuantity = minimumVolumeQuantity.orElse(null);
      optBits |= OPT_BIT_MINIMUM_VOLUME_QUANTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link SpecimenDefinition_Container#extension() extension} to extension.
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
     * Initializes the optional value {@link SpecimenDefinition_Container#extension() extension} to extension.
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
     * Builds a new {@link SpecimenDefinition_Container SpecimenDefinition_Container}.
     * @return An immutable instance of SpecimenDefinition_Container
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public SpecimenDefinition_Container build() {
      return new ImmutableSpecimenDefinition_Container(
          id,
          preparation,
          additive,
          cap,
          description,
          modifierExtension,
          capacity,
          type,
          minimumVolumeString,
          material,
          minimumVolumeQuantity,
          extension);
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean preparationIsSet() {
      return (optBits & OPT_BIT_PREPARATION) != 0;
    }

    private boolean additiveIsSet() {
      return (optBits & OPT_BIT_ADDITIVE) != 0;
    }

    private boolean capIsSet() {
      return (optBits & OPT_BIT_CAP) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean capacityIsSet() {
      return (optBits & OPT_BIT_CAPACITY) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean minimumVolumeStringIsSet() {
      return (optBits & OPT_BIT_MINIMUM_VOLUME_STRING) != 0;
    }

    private boolean materialIsSet() {
      return (optBits & OPT_BIT_MATERIAL) != 0;
    }

    private boolean minimumVolumeQuantityIsSet() {
      return (optBits & OPT_BIT_MINIMUM_VOLUME_QUANTITY) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of SpecimenDefinition_Container is strict, attribute is already set: ".concat(name));
    }
  }
}
