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
 * Immutable implementation of {@link Group}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableGroup.builder()}.
 */
@Generated(from = "Group", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableGroup implements Group {
  private final @Nullable String name;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable Meta meta;
  private final @Nullable List<Identifier> identifier;
  private final @Nullable Boolean active;
  private final @Nullable Code language;
  private final @Nullable Narrative text;
  private final @Nullable UnsignedInt quantity;
  private final @Nullable Reference managingEntity;
  private final @Nullable Uri implicitRules;
  private final @Nullable CodeableConcept code;
  private final @Nullable Id id;
  private final @Nullable GroupType type;
  private final @Nullable List<Group_Characteristic> characteristic;
  private final @Nullable List<Extension> extension;
  private final @Nullable Boolean actual;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable List<Group_Member> member;
  private final String resourceType;

  private ImmutableGroup(
      @Nullable String name,
      @Nullable List<ResourceList> contained,
      @Nullable Meta meta,
      @Nullable List<Identifier> identifier,
      @Nullable Boolean active,
      @Nullable Code language,
      @Nullable Narrative text,
      @Nullable UnsignedInt quantity,
      @Nullable Reference managingEntity,
      @Nullable Uri implicitRules,
      @Nullable CodeableConcept code,
      @Nullable Id id,
      @Nullable GroupType type,
      @Nullable List<Group_Characteristic> characteristic,
      @Nullable List<Extension> extension,
      @Nullable Boolean actual,
      @Nullable List<Extension> modifierExtension,
      @Nullable List<Group_Member> member,
      String resourceType) {
    this.name = name;
    this.contained = contained;
    this.meta = meta;
    this.identifier = identifier;
    this.active = active;
    this.language = language;
    this.text = text;
    this.quantity = quantity;
    this.managingEntity = managingEntity;
    this.implicitRules = implicitRules;
    this.code = code;
    this.id = id;
    this.type = type;
    this.characteristic = characteristic;
    this.extension = extension;
    this.actual = actual;
    this.modifierExtension = modifierExtension;
    this.member = member;
    this.resourceType = resourceType;
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
   * @return The value of the {@code contained} attribute
   */
  @JsonProperty("contained")
  @Override
  public Optional<List<ResourceList>> contained() {
    return Optional.ofNullable(contained);
  }

  /**
   * @return The value of the {@code meta} attribute
   */
  @JsonProperty("meta")
  @Override
  public Optional<Meta> meta() {
    return Optional.ofNullable(meta);
  }

  /**
   * @return The value of the {@code identifier} attribute
   */
  @JsonProperty("identifier")
  @Override
  public Optional<List<Identifier>> identifier() {
    return Optional.ofNullable(identifier);
  }

  /**
   * @return The value of the {@code active} attribute
   */
  @JsonProperty("active")
  @Override
  public Optional<Boolean> active() {
    return Optional.ofNullable(active);
  }

  /**
   * @return The value of the {@code language} attribute
   */
  @JsonProperty("language")
  @Override
  public Optional<Code> language() {
    return Optional.ofNullable(language);
  }

  /**
   * @return The value of the {@code text} attribute
   */
  @JsonProperty("text")
  @Override
  public Optional<Narrative> text() {
    return Optional.ofNullable(text);
  }

  /**
   * @return The value of the {@code quantity} attribute
   */
  @JsonProperty("quantity")
  @Override
  public Optional<UnsignedInt> quantity() {
    return Optional.ofNullable(quantity);
  }

  /**
   * @return The value of the {@code managingEntity} attribute
   */
  @JsonProperty("managingEntity")
  @Override
  public Optional<Reference> managingEntity() {
    return Optional.ofNullable(managingEntity);
  }

  /**
   * @return The value of the {@code implicitRules} attribute
   */
  @JsonProperty("implicitRules")
  @Override
  public Optional<Uri> implicitRules() {
    return Optional.ofNullable(implicitRules);
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
  public Optional<Id> id() {
    return Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public Optional<GroupType> type() {
    return Optional.ofNullable(type);
  }

  /**
   * @return The value of the {@code characteristic} attribute
   */
  @JsonProperty("characteristic")
  @Override
  public Optional<List<Group_Characteristic>> characteristic() {
    return Optional.ofNullable(characteristic);
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
   * @return The value of the {@code actual} attribute
   */
  @JsonProperty("actual")
  @Override
  public Optional<Boolean> actual() {
    return Optional.ofNullable(actual);
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
   * @return The value of the {@code member} attribute
   */
  @JsonProperty("member")
  @Override
  public Optional<List<Group_Member>> member() {
    return Optional.ofNullable(member);
  }

  /**
   * @return The value of the {@code resourceType} attribute
   */
  @JsonProperty("resourceType")
  @Override
  public String resourceType() {
    return resourceType;
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Group#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGroup withName(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "name");
    if (Objects.equals(this.name, newValue)) return this;
    return new ImmutableGroup(
        newValue,
        this.contained,
        this.meta,
        this.identifier,
        this.active,
        this.language,
        this.text,
        this.quantity,
        this.managingEntity,
        this.implicitRules,
        this.code,
        this.id,
        this.type,
        this.characteristic,
        this.extension,
        this.actual,
        this.modifierExtension,
        this.member,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Group#name() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGroup withName(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.name, value)) return this;
    return new ImmutableGroup(
        value,
        this.contained,
        this.meta,
        this.identifier,
        this.active,
        this.language,
        this.text,
        this.quantity,
        this.managingEntity,
        this.implicitRules,
        this.code,
        this.id,
        this.type,
        this.characteristic,
        this.extension,
        this.actual,
        this.modifierExtension,
        this.member,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Group#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGroup withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableGroup(
        this.name,
        newValue,
        this.meta,
        this.identifier,
        this.active,
        this.language,
        this.text,
        this.quantity,
        this.managingEntity,
        this.implicitRules,
        this.code,
        this.id,
        this.type,
        this.characteristic,
        this.extension,
        this.actual,
        this.modifierExtension,
        this.member,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Group#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGroup withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableGroup(
        this.name,
        value,
        this.meta,
        this.identifier,
        this.active,
        this.language,
        this.text,
        this.quantity,
        this.managingEntity,
        this.implicitRules,
        this.code,
        this.id,
        this.type,
        this.characteristic,
        this.extension,
        this.actual,
        this.modifierExtension,
        this.member,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Group#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGroup withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableGroup(
        this.name,
        this.contained,
        newValue,
        this.identifier,
        this.active,
        this.language,
        this.text,
        this.quantity,
        this.managingEntity,
        this.implicitRules,
        this.code,
        this.id,
        this.type,
        this.characteristic,
        this.extension,
        this.actual,
        this.modifierExtension,
        this.member,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Group#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGroup withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableGroup(
        this.name,
        this.contained,
        value,
        this.identifier,
        this.active,
        this.language,
        this.text,
        this.quantity,
        this.managingEntity,
        this.implicitRules,
        this.code,
        this.id,
        this.type,
        this.characteristic,
        this.extension,
        this.actual,
        this.modifierExtension,
        this.member,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Group#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGroup withIdentifier(List<Identifier> value) {
    @Nullable List<Identifier> newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableGroup(
        this.name,
        this.contained,
        this.meta,
        newValue,
        this.active,
        this.language,
        this.text,
        this.quantity,
        this.managingEntity,
        this.implicitRules,
        this.code,
        this.id,
        this.type,
        this.characteristic,
        this.extension,
        this.actual,
        this.modifierExtension,
        this.member,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Group#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGroup withIdentifier(Optional<? extends List<Identifier>> optional) {
    @Nullable List<Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableGroup(
        this.name,
        this.contained,
        this.meta,
        value,
        this.active,
        this.language,
        this.text,
        this.quantity,
        this.managingEntity,
        this.implicitRules,
        this.code,
        this.id,
        this.type,
        this.characteristic,
        this.extension,
        this.actual,
        this.modifierExtension,
        this.member,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Group#active() active} attribute.
   * @param value The value for active
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGroup withActive(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.active, newValue)) return this;
    return new ImmutableGroup(
        this.name,
        this.contained,
        this.meta,
        this.identifier,
        newValue,
        this.language,
        this.text,
        this.quantity,
        this.managingEntity,
        this.implicitRules,
        this.code,
        this.id,
        this.type,
        this.characteristic,
        this.extension,
        this.actual,
        this.modifierExtension,
        this.member,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Group#active() active} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for active
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGroup withActive(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.active, value)) return this;
    return new ImmutableGroup(
        this.name,
        this.contained,
        this.meta,
        this.identifier,
        value,
        this.language,
        this.text,
        this.quantity,
        this.managingEntity,
        this.implicitRules,
        this.code,
        this.id,
        this.type,
        this.characteristic,
        this.extension,
        this.actual,
        this.modifierExtension,
        this.member,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Group#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGroup withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableGroup(
        this.name,
        this.contained,
        this.meta,
        this.identifier,
        this.active,
        newValue,
        this.text,
        this.quantity,
        this.managingEntity,
        this.implicitRules,
        this.code,
        this.id,
        this.type,
        this.characteristic,
        this.extension,
        this.actual,
        this.modifierExtension,
        this.member,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Group#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGroup withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableGroup(
        this.name,
        this.contained,
        this.meta,
        this.identifier,
        this.active,
        value,
        this.text,
        this.quantity,
        this.managingEntity,
        this.implicitRules,
        this.code,
        this.id,
        this.type,
        this.characteristic,
        this.extension,
        this.actual,
        this.modifierExtension,
        this.member,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Group#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGroup withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableGroup(
        this.name,
        this.contained,
        this.meta,
        this.identifier,
        this.active,
        this.language,
        newValue,
        this.quantity,
        this.managingEntity,
        this.implicitRules,
        this.code,
        this.id,
        this.type,
        this.characteristic,
        this.extension,
        this.actual,
        this.modifierExtension,
        this.member,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Group#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGroup withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableGroup(
        this.name,
        this.contained,
        this.meta,
        this.identifier,
        this.active,
        this.language,
        value,
        this.quantity,
        this.managingEntity,
        this.implicitRules,
        this.code,
        this.id,
        this.type,
        this.characteristic,
        this.extension,
        this.actual,
        this.modifierExtension,
        this.member,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Group#quantity() quantity} attribute.
   * @param value The value for quantity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGroup withQuantity(UnsignedInt value) {
    @Nullable UnsignedInt newValue = Objects.requireNonNull(value, "quantity");
    if (this.quantity == newValue) return this;
    return new ImmutableGroup(
        this.name,
        this.contained,
        this.meta,
        this.identifier,
        this.active,
        this.language,
        this.text,
        newValue,
        this.managingEntity,
        this.implicitRules,
        this.code,
        this.id,
        this.type,
        this.characteristic,
        this.extension,
        this.actual,
        this.modifierExtension,
        this.member,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Group#quantity() quantity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for quantity
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGroup withQuantity(Optional<? extends UnsignedInt> optional) {
    @Nullable UnsignedInt value = optional.orElse(null);
    if (this.quantity == value) return this;
    return new ImmutableGroup(
        this.name,
        this.contained,
        this.meta,
        this.identifier,
        this.active,
        this.language,
        this.text,
        value,
        this.managingEntity,
        this.implicitRules,
        this.code,
        this.id,
        this.type,
        this.characteristic,
        this.extension,
        this.actual,
        this.modifierExtension,
        this.member,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Group#managingEntity() managingEntity} attribute.
   * @param value The value for managingEntity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGroup withManagingEntity(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "managingEntity");
    if (this.managingEntity == newValue) return this;
    return new ImmutableGroup(
        this.name,
        this.contained,
        this.meta,
        this.identifier,
        this.active,
        this.language,
        this.text,
        this.quantity,
        newValue,
        this.implicitRules,
        this.code,
        this.id,
        this.type,
        this.characteristic,
        this.extension,
        this.actual,
        this.modifierExtension,
        this.member,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Group#managingEntity() managingEntity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for managingEntity
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGroup withManagingEntity(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.managingEntity == value) return this;
    return new ImmutableGroup(
        this.name,
        this.contained,
        this.meta,
        this.identifier,
        this.active,
        this.language,
        this.text,
        this.quantity,
        value,
        this.implicitRules,
        this.code,
        this.id,
        this.type,
        this.characteristic,
        this.extension,
        this.actual,
        this.modifierExtension,
        this.member,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Group#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGroup withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableGroup(
        this.name,
        this.contained,
        this.meta,
        this.identifier,
        this.active,
        this.language,
        this.text,
        this.quantity,
        this.managingEntity,
        newValue,
        this.code,
        this.id,
        this.type,
        this.characteristic,
        this.extension,
        this.actual,
        this.modifierExtension,
        this.member,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Group#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGroup withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableGroup(
        this.name,
        this.contained,
        this.meta,
        this.identifier,
        this.active,
        this.language,
        this.text,
        this.quantity,
        this.managingEntity,
        value,
        this.code,
        this.id,
        this.type,
        this.characteristic,
        this.extension,
        this.actual,
        this.modifierExtension,
        this.member,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Group#code() code} attribute.
   * @param value The value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGroup withCode(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "code");
    if (this.code == newValue) return this;
    return new ImmutableGroup(
        this.name,
        this.contained,
        this.meta,
        this.identifier,
        this.active,
        this.language,
        this.text,
        this.quantity,
        this.managingEntity,
        this.implicitRules,
        newValue,
        this.id,
        this.type,
        this.characteristic,
        this.extension,
        this.actual,
        this.modifierExtension,
        this.member,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Group#code() code} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for code
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGroup withCode(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.code == value) return this;
    return new ImmutableGroup(
        this.name,
        this.contained,
        this.meta,
        this.identifier,
        this.active,
        this.language,
        this.text,
        this.quantity,
        this.managingEntity,
        this.implicitRules,
        value,
        this.id,
        this.type,
        this.characteristic,
        this.extension,
        this.actual,
        this.modifierExtension,
        this.member,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Group#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGroup withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableGroup(
        this.name,
        this.contained,
        this.meta,
        this.identifier,
        this.active,
        this.language,
        this.text,
        this.quantity,
        this.managingEntity,
        this.implicitRules,
        this.code,
        newValue,
        this.type,
        this.characteristic,
        this.extension,
        this.actual,
        this.modifierExtension,
        this.member,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Group#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGroup withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableGroup(
        this.name,
        this.contained,
        this.meta,
        this.identifier,
        this.active,
        this.language,
        this.text,
        this.quantity,
        this.managingEntity,
        this.implicitRules,
        this.code,
        value,
        this.type,
        this.characteristic,
        this.extension,
        this.actual,
        this.modifierExtension,
        this.member,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Group#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGroup withType(GroupType value) {
    @Nullable GroupType newValue = Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableGroup(
        this.name,
        this.contained,
        this.meta,
        this.identifier,
        this.active,
        this.language,
        this.text,
        this.quantity,
        this.managingEntity,
        this.implicitRules,
        this.code,
        this.id,
        newValue,
        this.characteristic,
        this.extension,
        this.actual,
        this.modifierExtension,
        this.member,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Group#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGroup withType(Optional<? extends GroupType> optional) {
    @Nullable GroupType value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableGroup(
        this.name,
        this.contained,
        this.meta,
        this.identifier,
        this.active,
        this.language,
        this.text,
        this.quantity,
        this.managingEntity,
        this.implicitRules,
        this.code,
        this.id,
        value,
        this.characteristic,
        this.extension,
        this.actual,
        this.modifierExtension,
        this.member,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Group#characteristic() characteristic} attribute.
   * @param value The value for characteristic
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGroup withCharacteristic(List<Group_Characteristic> value) {
    @Nullable List<Group_Characteristic> newValue = Objects.requireNonNull(value, "characteristic");
    if (this.characteristic == newValue) return this;
    return new ImmutableGroup(
        this.name,
        this.contained,
        this.meta,
        this.identifier,
        this.active,
        this.language,
        this.text,
        this.quantity,
        this.managingEntity,
        this.implicitRules,
        this.code,
        this.id,
        this.type,
        newValue,
        this.extension,
        this.actual,
        this.modifierExtension,
        this.member,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Group#characteristic() characteristic} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for characteristic
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGroup withCharacteristic(Optional<? extends List<Group_Characteristic>> optional) {
    @Nullable List<Group_Characteristic> value = optional.orElse(null);
    if (this.characteristic == value) return this;
    return new ImmutableGroup(
        this.name,
        this.contained,
        this.meta,
        this.identifier,
        this.active,
        this.language,
        this.text,
        this.quantity,
        this.managingEntity,
        this.implicitRules,
        this.code,
        this.id,
        this.type,
        value,
        this.extension,
        this.actual,
        this.modifierExtension,
        this.member,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Group#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGroup withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableGroup(
        this.name,
        this.contained,
        this.meta,
        this.identifier,
        this.active,
        this.language,
        this.text,
        this.quantity,
        this.managingEntity,
        this.implicitRules,
        this.code,
        this.id,
        this.type,
        this.characteristic,
        newValue,
        this.actual,
        this.modifierExtension,
        this.member,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Group#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGroup withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableGroup(
        this.name,
        this.contained,
        this.meta,
        this.identifier,
        this.active,
        this.language,
        this.text,
        this.quantity,
        this.managingEntity,
        this.implicitRules,
        this.code,
        this.id,
        this.type,
        this.characteristic,
        value,
        this.actual,
        this.modifierExtension,
        this.member,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Group#actual() actual} attribute.
   * @param value The value for actual
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGroup withActual(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.actual, newValue)) return this;
    return new ImmutableGroup(
        this.name,
        this.contained,
        this.meta,
        this.identifier,
        this.active,
        this.language,
        this.text,
        this.quantity,
        this.managingEntity,
        this.implicitRules,
        this.code,
        this.id,
        this.type,
        this.characteristic,
        this.extension,
        newValue,
        this.modifierExtension,
        this.member,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Group#actual() actual} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for actual
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGroup withActual(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.actual, value)) return this;
    return new ImmutableGroup(
        this.name,
        this.contained,
        this.meta,
        this.identifier,
        this.active,
        this.language,
        this.text,
        this.quantity,
        this.managingEntity,
        this.implicitRules,
        this.code,
        this.id,
        this.type,
        this.characteristic,
        this.extension,
        value,
        this.modifierExtension,
        this.member,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Group#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGroup withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableGroup(
        this.name,
        this.contained,
        this.meta,
        this.identifier,
        this.active,
        this.language,
        this.text,
        this.quantity,
        this.managingEntity,
        this.implicitRules,
        this.code,
        this.id,
        this.type,
        this.characteristic,
        this.extension,
        this.actual,
        newValue,
        this.member,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Group#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGroup withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableGroup(
        this.name,
        this.contained,
        this.meta,
        this.identifier,
        this.active,
        this.language,
        this.text,
        this.quantity,
        this.managingEntity,
        this.implicitRules,
        this.code,
        this.id,
        this.type,
        this.characteristic,
        this.extension,
        this.actual,
        value,
        this.member,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Group#member() member} attribute.
   * @param value The value for member
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGroup withMember(List<Group_Member> value) {
    @Nullable List<Group_Member> newValue = Objects.requireNonNull(value, "member");
    if (this.member == newValue) return this;
    return new ImmutableGroup(
        this.name,
        this.contained,
        this.meta,
        this.identifier,
        this.active,
        this.language,
        this.text,
        this.quantity,
        this.managingEntity,
        this.implicitRules,
        this.code,
        this.id,
        this.type,
        this.characteristic,
        this.extension,
        this.actual,
        this.modifierExtension,
        newValue,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Group#member() member} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for member
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGroup withMember(Optional<? extends List<Group_Member>> optional) {
    @Nullable List<Group_Member> value = optional.orElse(null);
    if (this.member == value) return this;
    return new ImmutableGroup(
        this.name,
        this.contained,
        this.meta,
        this.identifier,
        this.active,
        this.language,
        this.text,
        this.quantity,
        this.managingEntity,
        this.implicitRules,
        this.code,
        this.id,
        this.type,
        this.characteristic,
        this.extension,
        this.actual,
        this.modifierExtension,
        value,
        this.resourceType);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Group#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableGroup withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableGroup(
        this.name,
        this.contained,
        this.meta,
        this.identifier,
        this.active,
        this.language,
        this.text,
        this.quantity,
        this.managingEntity,
        this.implicitRules,
        this.code,
        this.id,
        this.type,
        this.characteristic,
        this.extension,
        this.actual,
        this.modifierExtension,
        this.member,
        newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableGroup} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableGroup
        && equalTo((ImmutableGroup) another);
  }

  private boolean equalTo(ImmutableGroup another) {
    return Objects.equals(name, another.name)
        && Objects.equals(contained, another.contained)
        && Objects.equals(meta, another.meta)
        && Objects.equals(identifier, another.identifier)
        && Objects.equals(active, another.active)
        && Objects.equals(language, another.language)
        && Objects.equals(text, another.text)
        && Objects.equals(quantity, another.quantity)
        && Objects.equals(managingEntity, another.managingEntity)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(code, another.code)
        && Objects.equals(id, another.id)
        && Objects.equals(type, another.type)
        && Objects.equals(characteristic, another.characteristic)
        && Objects.equals(extension, another.extension)
        && Objects.equals(actual, another.actual)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(member, another.member)
        && resourceType.equals(another.resourceType);
  }

  /**
   * Computes a hash code from attributes: {@code name}, {@code contained}, {@code meta}, {@code identifier}, {@code active}, {@code language}, {@code text}, {@code quantity}, {@code managingEntity}, {@code implicitRules}, {@code code}, {@code id}, {@code type}, {@code characteristic}, {@code extension}, {@code actual}, {@code modifierExtension}, {@code member}, {@code resourceType}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(name);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(active);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(quantity);
    h += (h << 5) + Objects.hashCode(managingEntity);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(code);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(type);
    h += (h << 5) + Objects.hashCode(characteristic);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(actual);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(member);
    h += (h << 5) + resourceType.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code Group} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Group{");
    if (name != null) {
      builder.append("name=").append(name);
    }
    if (contained != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (meta != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (identifier != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (active != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("active=").append(active);
    }
    if (language != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("language=").append(language);
    }
    if (text != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (quantity != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("quantity=").append(quantity);
    }
    if (managingEntity != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("managingEntity=").append(managingEntity);
    }
    if (implicitRules != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (code != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("code=").append(code);
    }
    if (id != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (type != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("type=").append(type);
    }
    if (characteristic != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("characteristic=").append(characteristic);
    }
    if (extension != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (actual != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("actual=").append(actual);
    }
    if (modifierExtension != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (member != null) {
      if (builder.length() > 6) builder.append(", ");
      builder.append("member=").append(member);
    }
    if (builder.length() > 6) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Group", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Group {
    @Nullable Optional<String> name = Optional.empty();
    boolean nameIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<List<Identifier>> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<Boolean> active = Optional.empty();
    boolean activeIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<UnsignedInt> quantity = Optional.empty();
    boolean quantityIsSet;
    @Nullable Optional<Reference> managingEntity = Optional.empty();
    boolean managingEntityIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<CodeableConcept> code = Optional.empty();
    boolean codeIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<GroupType> type = Optional.empty();
    boolean typeIsSet;
    @Nullable Optional<List<Group_Characteristic>> characteristic = Optional.empty();
    boolean characteristicIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Boolean> actual = Optional.empty();
    boolean actualIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<List<Group_Member>> member = Optional.empty();
    boolean memberIsSet;
    @Nullable String resourceType;
    @JsonProperty("name")
    public void setName(Optional<String> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<List<Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("active")
    public void setActive(Optional<Boolean> active) {
      this.active = active;
      this.activeIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("quantity")
    public void setQuantity(Optional<UnsignedInt> quantity) {
      this.quantity = quantity;
      this.quantityIsSet = true;
    }
    @JsonProperty("managingEntity")
    public void setManagingEntity(Optional<Reference> managingEntity) {
      this.managingEntity = managingEntity;
      this.managingEntityIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("code")
    public void setCode(Optional<CodeableConcept> code) {
      this.code = code;
      this.codeIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("type")
    public void setType(Optional<GroupType> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @JsonProperty("characteristic")
    public void setCharacteristic(Optional<List<Group_Characteristic>> characteristic) {
      this.characteristic = characteristic;
      this.characteristicIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("actual")
    public void setActual(Optional<Boolean> actual) {
      this.actual = actual;
      this.actualIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("member")
    public void setMember(Optional<List<Group_Member>> member) {
      this.member = member;
      this.memberIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @Override
    public Optional<String> name() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> active() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<UnsignedInt> quantity() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> managingEntity() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> code() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<GroupType> type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Group_Characteristic>> characteristic() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> actual() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Group_Member>> member() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableGroup fromJson(Json json) {
    ImmutableGroup.Builder builder = ((ImmutableGroup.Builder) ImmutableGroup.builder());
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.activeIsSet) {
      builder.active(json.active);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.quantityIsSet) {
      builder.quantity(json.quantity);
    }
    if (json.managingEntityIsSet) {
      builder.managingEntity(json.managingEntity);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.codeIsSet) {
      builder.code(json.code);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.characteristicIsSet) {
      builder.characteristic(json.characteristic);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.actualIsSet) {
      builder.actual(json.actual);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.memberIsSet) {
      builder.member(json.member);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    return (ImmutableGroup) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Group} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Group instance
   */
  public static Group copyOf(Group instance) {
    if (instance instanceof ImmutableGroup) {
      return (ImmutableGroup) instance;
    }
    return ((ImmutableGroup.Builder) ImmutableGroup.builder())
        .name(instance.name())
        .contained(instance.contained())
        .meta(instance.meta())
        .identifier(instance.identifier())
        .active(instance.active())
        .language(instance.language())
        .text(instance.text())
        .quantity(instance.quantity())
        .managingEntity(instance.managingEntity())
        .implicitRules(instance.implicitRules())
        .code(instance.code())
        .id(instance.id())
        .type(instance.type())
        .characteristic(instance.characteristic())
        .extension(instance.extension())
        .actual(instance.actual())
        .modifierExtension(instance.modifierExtension())
        .member(instance.member())
        .resourceType(instance.resourceType())
        .build();
  }

  /**
   * Creates a builder for {@link Group Group}.
   * <pre>
   * ImmutableGroup.builder()
   *    .name(String) // optional {@link Group#name() name}
   *    .contained(List&amp;lt;com.medplum.types.fhir.ResourceList&amp;gt;) // optional {@link Group#contained() contained}
   *    .meta(com.medplum.types.fhir.Meta) // optional {@link Group#meta() meta}
   *    .identifier(List&amp;lt;com.medplum.types.fhir.Identifier&amp;gt;) // optional {@link Group#identifier() identifier}
   *    .active(Boolean) // optional {@link Group#active() active}
   *    .language(com.medplum.types.fhir.Code) // optional {@link Group#language() language}
   *    .text(com.medplum.types.fhir.Narrative) // optional {@link Group#text() text}
   *    .quantity(com.medplum.types.fhir.UnsignedInt) // optional {@link Group#quantity() quantity}
   *    .managingEntity(com.medplum.types.fhir.Reference) // optional {@link Group#managingEntity() managingEntity}
   *    .implicitRules(com.medplum.types.fhir.Uri) // optional {@link Group#implicitRules() implicitRules}
   *    .code(com.medplum.types.fhir.CodeableConcept) // optional {@link Group#code() code}
   *    .id(com.medplum.types.fhir.Id) // optional {@link Group#id() id}
   *    .type(com.medplum.types.fhir.GroupType) // optional {@link Group#type() type}
   *    .characteristic(List&amp;lt;com.medplum.types.fhir.Group_Characteristic&amp;gt;) // optional {@link Group#characteristic() characteristic}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link Group#extension() extension}
   *    .actual(Boolean) // optional {@link Group#actual() actual}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link Group#modifierExtension() modifierExtension}
   *    .member(List&amp;lt;com.medplum.types.fhir.Group_Member&amp;gt;) // optional {@link Group#member() member}
   *    .resourceType(String) // required {@link Group#resourceType() resourceType}
   *    .build();
   * </pre>
   * @return A new Group builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableGroup.Builder();
  }

  /**
   * Builds instances of type {@link Group Group}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Group", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_NAME = 0x1L;
    private static final long OPT_BIT_CONTAINED = 0x2L;
    private static final long OPT_BIT_META = 0x4L;
    private static final long OPT_BIT_IDENTIFIER = 0x8L;
    private static final long OPT_BIT_ACTIVE = 0x10L;
    private static final long OPT_BIT_LANGUAGE = 0x20L;
    private static final long OPT_BIT_TEXT = 0x40L;
    private static final long OPT_BIT_QUANTITY = 0x80L;
    private static final long OPT_BIT_MANAGING_ENTITY = 0x100L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x200L;
    private static final long OPT_BIT_CODE = 0x400L;
    private static final long OPT_BIT_ID = 0x800L;
    private static final long OPT_BIT_TYPE = 0x1000L;
    private static final long OPT_BIT_CHARACTERISTIC = 0x2000L;
    private static final long OPT_BIT_EXTENSION = 0x4000L;
    private static final long OPT_BIT_ACTUAL = 0x8000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x10000L;
    private static final long OPT_BIT_MEMBER = 0x20000L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable String name;
    private @Nullable List<ResourceList> contained;
    private @Nullable Meta meta;
    private @Nullable List<Identifier> identifier;
    private @Nullable Boolean active;
    private @Nullable Code language;
    private @Nullable Narrative text;
    private @Nullable UnsignedInt quantity;
    private @Nullable Reference managingEntity;
    private @Nullable Uri implicitRules;
    private @Nullable CodeableConcept code;
    private @Nullable Id id;
    private @Nullable GroupType type;
    private @Nullable List<Group_Characteristic> characteristic;
    private @Nullable List<Extension> extension;
    private @Nullable Boolean actual;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable List<Group_Member> member;
    private @Nullable String resourceType;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Group#name() name} to name.
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
     * Initializes the optional value {@link Group#name() name} to name.
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
     * Initializes the optional value {@link Group#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    public final Builder contained(List<ResourceList> contained) {
      checkNotIsSet(containedIsSet(), "contained");
      this.contained = Objects.requireNonNull(contained, "contained");
      optBits |= OPT_BIT_CONTAINED;
      return this;
    }

    /**
     * Initializes the optional value {@link Group#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("contained")
    public final Builder contained(Optional<? extends List<ResourceList>> contained) {
      checkNotIsSet(containedIsSet(), "contained");
      this.contained = contained.orElse(null);
      optBits |= OPT_BIT_CONTAINED;
      return this;
    }

    /**
     * Initializes the optional value {@link Group#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    public final Builder meta(Meta meta) {
      checkNotIsSet(metaIsSet(), "meta");
      this.meta = Objects.requireNonNull(meta, "meta");
      optBits |= OPT_BIT_META;
      return this;
    }

    /**
     * Initializes the optional value {@link Group#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("meta")
    public final Builder meta(Optional<? extends Meta> meta) {
      checkNotIsSet(metaIsSet(), "meta");
      this.meta = meta.orElse(null);
      optBits |= OPT_BIT_META;
      return this;
    }

    /**
     * Initializes the optional value {@link Group#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    public final Builder identifier(List<Identifier> identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = Objects.requireNonNull(identifier, "identifier");
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link Group#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("identifier")
    public final Builder identifier(Optional<? extends List<Identifier>> identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = identifier.orElse(null);
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link Group#active() active} to active.
     * @param active The value for active
     * @return {@code this} builder for chained invocation
     */
    public final Builder active(boolean active) {
      checkNotIsSet(activeIsSet(), "active");
      this.active = active;
      optBits |= OPT_BIT_ACTIVE;
      return this;
    }

    /**
     * Initializes the optional value {@link Group#active() active} to active.
     * @param active The value for active
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("active")
    public final Builder active(Optional<Boolean> active) {
      checkNotIsSet(activeIsSet(), "active");
      this.active = active.orElse(null);
      optBits |= OPT_BIT_ACTIVE;
      return this;
    }

    /**
     * Initializes the optional value {@link Group#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    public final Builder language(Code language) {
      checkNotIsSet(languageIsSet(), "language");
      this.language = Objects.requireNonNull(language, "language");
      optBits |= OPT_BIT_LANGUAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link Group#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("language")
    public final Builder language(Optional<? extends Code> language) {
      checkNotIsSet(languageIsSet(), "language");
      this.language = language.orElse(null);
      optBits |= OPT_BIT_LANGUAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link Group#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    public final Builder text(Narrative text) {
      checkNotIsSet(textIsSet(), "text");
      this.text = Objects.requireNonNull(text, "text");
      optBits |= OPT_BIT_TEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link Group#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("text")
    public final Builder text(Optional<? extends Narrative> text) {
      checkNotIsSet(textIsSet(), "text");
      this.text = text.orElse(null);
      optBits |= OPT_BIT_TEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link Group#quantity() quantity} to quantity.
     * @param quantity The value for quantity
     * @return {@code this} builder for chained invocation
     */
    public final Builder quantity(UnsignedInt quantity) {
      checkNotIsSet(quantityIsSet(), "quantity");
      this.quantity = Objects.requireNonNull(quantity, "quantity");
      optBits |= OPT_BIT_QUANTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link Group#quantity() quantity} to quantity.
     * @param quantity The value for quantity
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("quantity")
    public final Builder quantity(Optional<? extends UnsignedInt> quantity) {
      checkNotIsSet(quantityIsSet(), "quantity");
      this.quantity = quantity.orElse(null);
      optBits |= OPT_BIT_QUANTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link Group#managingEntity() managingEntity} to managingEntity.
     * @param managingEntity The value for managingEntity
     * @return {@code this} builder for chained invocation
     */
    public final Builder managingEntity(Reference managingEntity) {
      checkNotIsSet(managingEntityIsSet(), "managingEntity");
      this.managingEntity = Objects.requireNonNull(managingEntity, "managingEntity");
      optBits |= OPT_BIT_MANAGING_ENTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link Group#managingEntity() managingEntity} to managingEntity.
     * @param managingEntity The value for managingEntity
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("managingEntity")
    public final Builder managingEntity(Optional<? extends Reference> managingEntity) {
      checkNotIsSet(managingEntityIsSet(), "managingEntity");
      this.managingEntity = managingEntity.orElse(null);
      optBits |= OPT_BIT_MANAGING_ENTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link Group#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    public final Builder implicitRules(Uri implicitRules) {
      checkNotIsSet(implicitRulesIsSet(), "implicitRules");
      this.implicitRules = Objects.requireNonNull(implicitRules, "implicitRules");
      optBits |= OPT_BIT_IMPLICIT_RULES;
      return this;
    }

    /**
     * Initializes the optional value {@link Group#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("implicitRules")
    public final Builder implicitRules(Optional<? extends Uri> implicitRules) {
      checkNotIsSet(implicitRulesIsSet(), "implicitRules");
      this.implicitRules = implicitRules.orElse(null);
      optBits |= OPT_BIT_IMPLICIT_RULES;
      return this;
    }

    /**
     * Initializes the optional value {@link Group#code() code} to code.
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
     * Initializes the optional value {@link Group#code() code} to code.
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
     * Initializes the optional value {@link Group#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(Id id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = Objects.requireNonNull(id, "id");
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link Group#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(Optional<? extends Id> id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = id.orElse(null);
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link Group#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(GroupType type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Group#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("type")
    public final Builder type(Optional<? extends GroupType> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Group#characteristic() characteristic} to characteristic.
     * @param characteristic The value for characteristic
     * @return {@code this} builder for chained invocation
     */
    public final Builder characteristic(List<Group_Characteristic> characteristic) {
      checkNotIsSet(characteristicIsSet(), "characteristic");
      this.characteristic = Objects.requireNonNull(characteristic, "characteristic");
      optBits |= OPT_BIT_CHARACTERISTIC;
      return this;
    }

    /**
     * Initializes the optional value {@link Group#characteristic() characteristic} to characteristic.
     * @param characteristic The value for characteristic
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("characteristic")
    public final Builder characteristic(Optional<? extends List<Group_Characteristic>> characteristic) {
      checkNotIsSet(characteristicIsSet(), "characteristic");
      this.characteristic = characteristic.orElse(null);
      optBits |= OPT_BIT_CHARACTERISTIC;
      return this;
    }

    /**
     * Initializes the optional value {@link Group#extension() extension} to extension.
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
     * Initializes the optional value {@link Group#extension() extension} to extension.
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
     * Initializes the optional value {@link Group#actual() actual} to actual.
     * @param actual The value for actual
     * @return {@code this} builder for chained invocation
     */
    public final Builder actual(boolean actual) {
      checkNotIsSet(actualIsSet(), "actual");
      this.actual = actual;
      optBits |= OPT_BIT_ACTUAL;
      return this;
    }

    /**
     * Initializes the optional value {@link Group#actual() actual} to actual.
     * @param actual The value for actual
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("actual")
    public final Builder actual(Optional<Boolean> actual) {
      checkNotIsSet(actualIsSet(), "actual");
      this.actual = actual.orElse(null);
      optBits |= OPT_BIT_ACTUAL;
      return this;
    }

    /**
     * Initializes the optional value {@link Group#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Group#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Group#member() member} to member.
     * @param member The value for member
     * @return {@code this} builder for chained invocation
     */
    public final Builder member(List<Group_Member> member) {
      checkNotIsSet(memberIsSet(), "member");
      this.member = Objects.requireNonNull(member, "member");
      optBits |= OPT_BIT_MEMBER;
      return this;
    }

    /**
     * Initializes the optional value {@link Group#member() member} to member.
     * @param member The value for member
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("member")
    public final Builder member(Optional<? extends List<Group_Member>> member) {
      checkNotIsSet(memberIsSet(), "member");
      this.member = member.orElse(null);
      optBits |= OPT_BIT_MEMBER;
      return this;
    }

    /**
     * Initializes the value for the {@link Group#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("resourceType")
    public final Builder resourceType(String resourceType) {
      checkNotIsSet(resourceTypeIsSet(), "resourceType");
      this.resourceType = Objects.requireNonNull(resourceType, "resourceType");
      initBits &= ~INIT_BIT_RESOURCE_TYPE;
      return this;
    }

    /**
     * Builds a new {@link Group Group}.
     * @return An immutable instance of Group
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Group build() {
      checkRequiredAttributes();
      return new ImmutableGroup(
          name,
          contained,
          meta,
          identifier,
          active,
          language,
          text,
          quantity,
          managingEntity,
          implicitRules,
          code,
          id,
          type,
          characteristic,
          extension,
          actual,
          modifierExtension,
          member,
          resourceType);
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean activeIsSet() {
      return (optBits & OPT_BIT_ACTIVE) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean quantityIsSet() {
      return (optBits & OPT_BIT_QUANTITY) != 0;
    }

    private boolean managingEntityIsSet() {
      return (optBits & OPT_BIT_MANAGING_ENTITY) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean codeIsSet() {
      return (optBits & OPT_BIT_CODE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean characteristicIsSet() {
      return (optBits & OPT_BIT_CHARACTERISTIC) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean actualIsSet() {
      return (optBits & OPT_BIT_ACTUAL) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean memberIsSet() {
      return (optBits & OPT_BIT_MEMBER) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Group is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build Group, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "Group", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link Group#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(String resourceType);
  }

  @Generated(from = "Group", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Group#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    BuildFinal name(String name);

    /**
     * Initializes the optional value {@link Group#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal name(Optional<String> name);

    /**
     * Initializes the optional value {@link Group#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link Group#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link Group#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link Group#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link Group#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(List<Identifier> identifier);

    /**
     * Initializes the optional value {@link Group#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends List<Identifier>> identifier);

    /**
     * Initializes the optional value {@link Group#active() active} to active.
     * @param active The value for active
     * @return {@code this} builder for chained invocation
     */
    BuildFinal active(boolean active);

    /**
     * Initializes the optional value {@link Group#active() active} to active.
     * @param active The value for active
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal active(Optional<Boolean> active);

    /**
     * Initializes the optional value {@link Group#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link Group#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link Group#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link Group#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link Group#quantity() quantity} to quantity.
     * @param quantity The value for quantity
     * @return {@code this} builder for chained invocation
     */
    BuildFinal quantity(UnsignedInt quantity);

    /**
     * Initializes the optional value {@link Group#quantity() quantity} to quantity.
     * @param quantity The value for quantity
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal quantity(Optional<? extends UnsignedInt> quantity);

    /**
     * Initializes the optional value {@link Group#managingEntity() managingEntity} to managingEntity.
     * @param managingEntity The value for managingEntity
     * @return {@code this} builder for chained invocation
     */
    BuildFinal managingEntity(Reference managingEntity);

    /**
     * Initializes the optional value {@link Group#managingEntity() managingEntity} to managingEntity.
     * @param managingEntity The value for managingEntity
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal managingEntity(Optional<? extends Reference> managingEntity);

    /**
     * Initializes the optional value {@link Group#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link Group#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link Group#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    BuildFinal code(CodeableConcept code);

    /**
     * Initializes the optional value {@link Group#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal code(Optional<? extends CodeableConcept> code);

    /**
     * Initializes the optional value {@link Group#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link Group#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link Group#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    BuildFinal type(GroupType type);

    /**
     * Initializes the optional value {@link Group#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal type(Optional<? extends GroupType> type);

    /**
     * Initializes the optional value {@link Group#characteristic() characteristic} to characteristic.
     * @param characteristic The value for characteristic
     * @return {@code this} builder for chained invocation
     */
    BuildFinal characteristic(List<Group_Characteristic> characteristic);

    /**
     * Initializes the optional value {@link Group#characteristic() characteristic} to characteristic.
     * @param characteristic The value for characteristic
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal characteristic(Optional<? extends List<Group_Characteristic>> characteristic);

    /**
     * Initializes the optional value {@link Group#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link Group#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link Group#actual() actual} to actual.
     * @param actual The value for actual
     * @return {@code this} builder for chained invocation
     */
    BuildFinal actual(boolean actual);

    /**
     * Initializes the optional value {@link Group#actual() actual} to actual.
     * @param actual The value for actual
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal actual(Optional<Boolean> actual);

    /**
     * Initializes the optional value {@link Group#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link Group#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link Group#member() member} to member.
     * @param member The value for member
     * @return {@code this} builder for chained invocation
     */
    BuildFinal member(List<Group_Member> member);

    /**
     * Initializes the optional value {@link Group#member() member} to member.
     * @param member The value for member
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal member(Optional<? extends List<Group_Member>> member);

    /**
     * Builds a new {@link Group Group}.
     * @return An immutable instance of Group
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Group build();
  }
}
