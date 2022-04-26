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
 * Immutable implementation of {@link Contract_Term}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableContract_Term.builder()}.
 */
@Generated(from = "Contract_Term", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableContract_Term implements Contract_Term {
  private final @Nullable String id;
  private final @Nullable List<Contract_Term> group;
  private final @Nullable List<Extension> extension;
  private final Contract_Offer offer;
  private final @Nullable CodeableConcept type;
  private final @Nullable String text;
  private final @Nullable List<Contract_Action> action;
  private final @Nullable CodeableConcept subType;
  private final @Nullable Period applies;
  private final @Nullable Identifier identifier;
  private final @Nullable CodeableConcept topicCodeableConcept;
  private final @Nullable List<Contract_Asset> asset;
  private final @Nullable List<Contract_SecurityLabel> securityLabel;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Reference topicReference;
  private final @Nullable DateTime issued;

  private ImmutableContract_Term(
      @Nullable String id,
      @Nullable List<Contract_Term> group,
      @Nullable List<Extension> extension,
      Contract_Offer offer,
      @Nullable CodeableConcept type,
      @Nullable String text,
      @Nullable List<Contract_Action> action,
      @Nullable CodeableConcept subType,
      @Nullable Period applies,
      @Nullable Identifier identifier,
      @Nullable CodeableConcept topicCodeableConcept,
      @Nullable List<Contract_Asset> asset,
      @Nullable List<Contract_SecurityLabel> securityLabel,
      @Nullable List<Extension> modifierExtension,
      @Nullable Reference topicReference,
      @Nullable DateTime issued) {
    this.id = id;
    this.group = group;
    this.extension = extension;
    this.offer = offer;
    this.type = type;
    this.text = text;
    this.action = action;
    this.subType = subType;
    this.applies = applies;
    this.identifier = identifier;
    this.topicCodeableConcept = topicCodeableConcept;
    this.asset = asset;
    this.securityLabel = securityLabel;
    this.modifierExtension = modifierExtension;
    this.topicReference = topicReference;
    this.issued = issued;
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
   * @return The value of the {@code group} attribute
   */
  @JsonProperty("group")
  @Override
  public Optional<List<Contract_Term>> group() {
    return Optional.ofNullable(group);
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
   * @return The value of the {@code offer} attribute
   */
  @JsonProperty("offer")
  @Override
  public Contract_Offer offer() {
    return offer;
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
   * @return The value of the {@code text} attribute
   */
  @JsonProperty("text")
  @Override
  public Optional<String> text() {
    return Optional.ofNullable(text);
  }

  /**
   * @return The value of the {@code action} attribute
   */
  @JsonProperty("action")
  @Override
  public Optional<List<Contract_Action>> action() {
    return Optional.ofNullable(action);
  }

  /**
   * @return The value of the {@code subType} attribute
   */
  @JsonProperty("subType")
  @Override
  public Optional<CodeableConcept> subType() {
    return Optional.ofNullable(subType);
  }

  /**
   * @return The value of the {@code applies} attribute
   */
  @JsonProperty("applies")
  @Override
  public Optional<Period> applies() {
    return Optional.ofNullable(applies);
  }

  /**
   * @return The value of the {@code identifier} attribute
   */
  @JsonProperty("identifier")
  @Override
  public Optional<Identifier> identifier() {
    return Optional.ofNullable(identifier);
  }

  /**
   * @return The value of the {@code topicCodeableConcept} attribute
   */
  @JsonProperty("topicCodeableConcept")
  @Override
  public Optional<CodeableConcept> topicCodeableConcept() {
    return Optional.ofNullable(topicCodeableConcept);
  }

  /**
   * @return The value of the {@code asset} attribute
   */
  @JsonProperty("asset")
  @Override
  public Optional<List<Contract_Asset>> asset() {
    return Optional.ofNullable(asset);
  }

  /**
   * @return The value of the {@code securityLabel} attribute
   */
  @JsonProperty("securityLabel")
  @Override
  public Optional<List<Contract_SecurityLabel>> securityLabel() {
    return Optional.ofNullable(securityLabel);
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
   * @return The value of the {@code topicReference} attribute
   */
  @JsonProperty("topicReference")
  @Override
  public Optional<Reference> topicReference() {
    return Optional.ofNullable(topicReference);
  }

  /**
   * @return The value of the {@code issued} attribute
   */
  @JsonProperty("issued")
  @Override
  public Optional<DateTime> issued() {
    return Optional.ofNullable(issued);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_Term#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Term withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableContract_Term(
        newValue,
        this.group,
        this.extension,
        this.offer,
        this.type,
        this.text,
        this.action,
        this.subType,
        this.applies,
        this.identifier,
        this.topicCodeableConcept,
        this.asset,
        this.securityLabel,
        this.modifierExtension,
        this.topicReference,
        this.issued);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_Term#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Term withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableContract_Term(
        value,
        this.group,
        this.extension,
        this.offer,
        this.type,
        this.text,
        this.action,
        this.subType,
        this.applies,
        this.identifier,
        this.topicCodeableConcept,
        this.asset,
        this.securityLabel,
        this.modifierExtension,
        this.topicReference,
        this.issued);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_Term#group() group} attribute.
   * @param value The value for group
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Term withGroup(List<Contract_Term> value) {
    @Nullable List<Contract_Term> newValue = Objects.requireNonNull(value, "group");
    if (this.group == newValue) return this;
    return new ImmutableContract_Term(
        this.id,
        newValue,
        this.extension,
        this.offer,
        this.type,
        this.text,
        this.action,
        this.subType,
        this.applies,
        this.identifier,
        this.topicCodeableConcept,
        this.asset,
        this.securityLabel,
        this.modifierExtension,
        this.topicReference,
        this.issued);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_Term#group() group} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for group
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_Term withGroup(Optional<? extends List<Contract_Term>> optional) {
    @Nullable List<Contract_Term> value = optional.orElse(null);
    if (this.group == value) return this;
    return new ImmutableContract_Term(
        this.id,
        value,
        this.extension,
        this.offer,
        this.type,
        this.text,
        this.action,
        this.subType,
        this.applies,
        this.identifier,
        this.topicCodeableConcept,
        this.asset,
        this.securityLabel,
        this.modifierExtension,
        this.topicReference,
        this.issued);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_Term#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Term withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableContract_Term(
        this.id,
        this.group,
        newValue,
        this.offer,
        this.type,
        this.text,
        this.action,
        this.subType,
        this.applies,
        this.identifier,
        this.topicCodeableConcept,
        this.asset,
        this.securityLabel,
        this.modifierExtension,
        this.topicReference,
        this.issued);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_Term#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_Term withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableContract_Term(
        this.id,
        this.group,
        value,
        this.offer,
        this.type,
        this.text,
        this.action,
        this.subType,
        this.applies,
        this.identifier,
        this.topicCodeableConcept,
        this.asset,
        this.securityLabel,
        this.modifierExtension,
        this.topicReference,
        this.issued);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Contract_Term#offer() offer} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for offer
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableContract_Term withOffer(Contract_Offer value) {
    if (this.offer == value) return this;
    Contract_Offer newValue = Objects.requireNonNull(value, "offer");
    return new ImmutableContract_Term(
        this.id,
        this.group,
        this.extension,
        newValue,
        this.type,
        this.text,
        this.action,
        this.subType,
        this.applies,
        this.identifier,
        this.topicCodeableConcept,
        this.asset,
        this.securityLabel,
        this.modifierExtension,
        this.topicReference,
        this.issued);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_Term#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Term withType(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableContract_Term(
        this.id,
        this.group,
        this.extension,
        this.offer,
        newValue,
        this.text,
        this.action,
        this.subType,
        this.applies,
        this.identifier,
        this.topicCodeableConcept,
        this.asset,
        this.securityLabel,
        this.modifierExtension,
        this.topicReference,
        this.issued);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_Term#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_Term withType(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableContract_Term(
        this.id,
        this.group,
        this.extension,
        this.offer,
        value,
        this.text,
        this.action,
        this.subType,
        this.applies,
        this.identifier,
        this.topicCodeableConcept,
        this.asset,
        this.securityLabel,
        this.modifierExtension,
        this.topicReference,
        this.issued);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_Term#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Term withText(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "text");
    if (Objects.equals(this.text, newValue)) return this;
    return new ImmutableContract_Term(
        this.id,
        this.group,
        this.extension,
        this.offer,
        this.type,
        newValue,
        this.action,
        this.subType,
        this.applies,
        this.identifier,
        this.topicCodeableConcept,
        this.asset,
        this.securityLabel,
        this.modifierExtension,
        this.topicReference,
        this.issued);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_Term#text() text} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Term withText(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.text, value)) return this;
    return new ImmutableContract_Term(
        this.id,
        this.group,
        this.extension,
        this.offer,
        this.type,
        value,
        this.action,
        this.subType,
        this.applies,
        this.identifier,
        this.topicCodeableConcept,
        this.asset,
        this.securityLabel,
        this.modifierExtension,
        this.topicReference,
        this.issued);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_Term#action() action} attribute.
   * @param value The value for action
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Term withAction(List<Contract_Action> value) {
    @Nullable List<Contract_Action> newValue = Objects.requireNonNull(value, "action");
    if (this.action == newValue) return this;
    return new ImmutableContract_Term(
        this.id,
        this.group,
        this.extension,
        this.offer,
        this.type,
        this.text,
        newValue,
        this.subType,
        this.applies,
        this.identifier,
        this.topicCodeableConcept,
        this.asset,
        this.securityLabel,
        this.modifierExtension,
        this.topicReference,
        this.issued);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_Term#action() action} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for action
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_Term withAction(Optional<? extends List<Contract_Action>> optional) {
    @Nullable List<Contract_Action> value = optional.orElse(null);
    if (this.action == value) return this;
    return new ImmutableContract_Term(
        this.id,
        this.group,
        this.extension,
        this.offer,
        this.type,
        this.text,
        value,
        this.subType,
        this.applies,
        this.identifier,
        this.topicCodeableConcept,
        this.asset,
        this.securityLabel,
        this.modifierExtension,
        this.topicReference,
        this.issued);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_Term#subType() subType} attribute.
   * @param value The value for subType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Term withSubType(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "subType");
    if (this.subType == newValue) return this;
    return new ImmutableContract_Term(
        this.id,
        this.group,
        this.extension,
        this.offer,
        this.type,
        this.text,
        this.action,
        newValue,
        this.applies,
        this.identifier,
        this.topicCodeableConcept,
        this.asset,
        this.securityLabel,
        this.modifierExtension,
        this.topicReference,
        this.issued);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_Term#subType() subType} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subType
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_Term withSubType(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.subType == value) return this;
    return new ImmutableContract_Term(
        this.id,
        this.group,
        this.extension,
        this.offer,
        this.type,
        this.text,
        this.action,
        value,
        this.applies,
        this.identifier,
        this.topicCodeableConcept,
        this.asset,
        this.securityLabel,
        this.modifierExtension,
        this.topicReference,
        this.issued);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_Term#applies() applies} attribute.
   * @param value The value for applies
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Term withApplies(Period value) {
    @Nullable Period newValue = Objects.requireNonNull(value, "applies");
    if (this.applies == newValue) return this;
    return new ImmutableContract_Term(
        this.id,
        this.group,
        this.extension,
        this.offer,
        this.type,
        this.text,
        this.action,
        this.subType,
        newValue,
        this.identifier,
        this.topicCodeableConcept,
        this.asset,
        this.securityLabel,
        this.modifierExtension,
        this.topicReference,
        this.issued);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_Term#applies() applies} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for applies
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_Term withApplies(Optional<? extends Period> optional) {
    @Nullable Period value = optional.orElse(null);
    if (this.applies == value) return this;
    return new ImmutableContract_Term(
        this.id,
        this.group,
        this.extension,
        this.offer,
        this.type,
        this.text,
        this.action,
        this.subType,
        value,
        this.identifier,
        this.topicCodeableConcept,
        this.asset,
        this.securityLabel,
        this.modifierExtension,
        this.topicReference,
        this.issued);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_Term#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Term withIdentifier(Identifier value) {
    @Nullable Identifier newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableContract_Term(
        this.id,
        this.group,
        this.extension,
        this.offer,
        this.type,
        this.text,
        this.action,
        this.subType,
        this.applies,
        newValue,
        this.topicCodeableConcept,
        this.asset,
        this.securityLabel,
        this.modifierExtension,
        this.topicReference,
        this.issued);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_Term#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_Term withIdentifier(Optional<? extends Identifier> optional) {
    @Nullable Identifier value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableContract_Term(
        this.id,
        this.group,
        this.extension,
        this.offer,
        this.type,
        this.text,
        this.action,
        this.subType,
        this.applies,
        value,
        this.topicCodeableConcept,
        this.asset,
        this.securityLabel,
        this.modifierExtension,
        this.topicReference,
        this.issued);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_Term#topicCodeableConcept() topicCodeableConcept} attribute.
   * @param value The value for topicCodeableConcept
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Term withTopicCodeableConcept(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "topicCodeableConcept");
    if (this.topicCodeableConcept == newValue) return this;
    return new ImmutableContract_Term(
        this.id,
        this.group,
        this.extension,
        this.offer,
        this.type,
        this.text,
        this.action,
        this.subType,
        this.applies,
        this.identifier,
        newValue,
        this.asset,
        this.securityLabel,
        this.modifierExtension,
        this.topicReference,
        this.issued);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_Term#topicCodeableConcept() topicCodeableConcept} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for topicCodeableConcept
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_Term withTopicCodeableConcept(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.topicCodeableConcept == value) return this;
    return new ImmutableContract_Term(
        this.id,
        this.group,
        this.extension,
        this.offer,
        this.type,
        this.text,
        this.action,
        this.subType,
        this.applies,
        this.identifier,
        value,
        this.asset,
        this.securityLabel,
        this.modifierExtension,
        this.topicReference,
        this.issued);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_Term#asset() asset} attribute.
   * @param value The value for asset
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Term withAsset(List<Contract_Asset> value) {
    @Nullable List<Contract_Asset> newValue = Objects.requireNonNull(value, "asset");
    if (this.asset == newValue) return this;
    return new ImmutableContract_Term(
        this.id,
        this.group,
        this.extension,
        this.offer,
        this.type,
        this.text,
        this.action,
        this.subType,
        this.applies,
        this.identifier,
        this.topicCodeableConcept,
        newValue,
        this.securityLabel,
        this.modifierExtension,
        this.topicReference,
        this.issued);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_Term#asset() asset} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for asset
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_Term withAsset(Optional<? extends List<Contract_Asset>> optional) {
    @Nullable List<Contract_Asset> value = optional.orElse(null);
    if (this.asset == value) return this;
    return new ImmutableContract_Term(
        this.id,
        this.group,
        this.extension,
        this.offer,
        this.type,
        this.text,
        this.action,
        this.subType,
        this.applies,
        this.identifier,
        this.topicCodeableConcept,
        value,
        this.securityLabel,
        this.modifierExtension,
        this.topicReference,
        this.issued);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_Term#securityLabel() securityLabel} attribute.
   * @param value The value for securityLabel
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Term withSecurityLabel(List<Contract_SecurityLabel> value) {
    @Nullable List<Contract_SecurityLabel> newValue = Objects.requireNonNull(value, "securityLabel");
    if (this.securityLabel == newValue) return this;
    return new ImmutableContract_Term(
        this.id,
        this.group,
        this.extension,
        this.offer,
        this.type,
        this.text,
        this.action,
        this.subType,
        this.applies,
        this.identifier,
        this.topicCodeableConcept,
        this.asset,
        newValue,
        this.modifierExtension,
        this.topicReference,
        this.issued);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_Term#securityLabel() securityLabel} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for securityLabel
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_Term withSecurityLabel(Optional<? extends List<Contract_SecurityLabel>> optional) {
    @Nullable List<Contract_SecurityLabel> value = optional.orElse(null);
    if (this.securityLabel == value) return this;
    return new ImmutableContract_Term(
        this.id,
        this.group,
        this.extension,
        this.offer,
        this.type,
        this.text,
        this.action,
        this.subType,
        this.applies,
        this.identifier,
        this.topicCodeableConcept,
        this.asset,
        value,
        this.modifierExtension,
        this.topicReference,
        this.issued);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_Term#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Term withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableContract_Term(
        this.id,
        this.group,
        this.extension,
        this.offer,
        this.type,
        this.text,
        this.action,
        this.subType,
        this.applies,
        this.identifier,
        this.topicCodeableConcept,
        this.asset,
        this.securityLabel,
        newValue,
        this.topicReference,
        this.issued);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_Term#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_Term withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableContract_Term(
        this.id,
        this.group,
        this.extension,
        this.offer,
        this.type,
        this.text,
        this.action,
        this.subType,
        this.applies,
        this.identifier,
        this.topicCodeableConcept,
        this.asset,
        this.securityLabel,
        value,
        this.topicReference,
        this.issued);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_Term#topicReference() topicReference} attribute.
   * @param value The value for topicReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Term withTopicReference(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "topicReference");
    if (this.topicReference == newValue) return this;
    return new ImmutableContract_Term(
        this.id,
        this.group,
        this.extension,
        this.offer,
        this.type,
        this.text,
        this.action,
        this.subType,
        this.applies,
        this.identifier,
        this.topicCodeableConcept,
        this.asset,
        this.securityLabel,
        this.modifierExtension,
        newValue,
        this.issued);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_Term#topicReference() topicReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for topicReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_Term withTopicReference(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.topicReference == value) return this;
    return new ImmutableContract_Term(
        this.id,
        this.group,
        this.extension,
        this.offer,
        this.type,
        this.text,
        this.action,
        this.subType,
        this.applies,
        this.identifier,
        this.topicCodeableConcept,
        this.asset,
        this.securityLabel,
        this.modifierExtension,
        value,
        this.issued);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_Term#issued() issued} attribute.
   * @param value The value for issued
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Term withIssued(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "issued");
    if (this.issued == newValue) return this;
    return new ImmutableContract_Term(
        this.id,
        this.group,
        this.extension,
        this.offer,
        this.type,
        this.text,
        this.action,
        this.subType,
        this.applies,
        this.identifier,
        this.topicCodeableConcept,
        this.asset,
        this.securityLabel,
        this.modifierExtension,
        this.topicReference,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_Term#issued() issued} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for issued
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_Term withIssued(Optional<? extends DateTime> optional) {
    @Nullable DateTime value = optional.orElse(null);
    if (this.issued == value) return this;
    return new ImmutableContract_Term(
        this.id,
        this.group,
        this.extension,
        this.offer,
        this.type,
        this.text,
        this.action,
        this.subType,
        this.applies,
        this.identifier,
        this.topicCodeableConcept,
        this.asset,
        this.securityLabel,
        this.modifierExtension,
        this.topicReference,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableContract_Term} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableContract_Term
        && equalTo((ImmutableContract_Term) another);
  }

  private boolean equalTo(ImmutableContract_Term another) {
    return Objects.equals(id, another.id)
        && Objects.equals(group, another.group)
        && Objects.equals(extension, another.extension)
        && offer.equals(another.offer)
        && Objects.equals(type, another.type)
        && Objects.equals(text, another.text)
        && Objects.equals(action, another.action)
        && Objects.equals(subType, another.subType)
        && Objects.equals(applies, another.applies)
        && Objects.equals(identifier, another.identifier)
        && Objects.equals(topicCodeableConcept, another.topicCodeableConcept)
        && Objects.equals(asset, another.asset)
        && Objects.equals(securityLabel, another.securityLabel)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(topicReference, another.topicReference)
        && Objects.equals(issued, another.issued);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code group}, {@code extension}, {@code offer}, {@code type}, {@code text}, {@code action}, {@code subType}, {@code applies}, {@code identifier}, {@code topicCodeableConcept}, {@code asset}, {@code securityLabel}, {@code modifierExtension}, {@code topicReference}, {@code issued}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(group);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + offer.hashCode();
    h += (h << 5) + Objects.hashCode(type);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(action);
    h += (h << 5) + Objects.hashCode(subType);
    h += (h << 5) + Objects.hashCode(applies);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(topicCodeableConcept);
    h += (h << 5) + Objects.hashCode(asset);
    h += (h << 5) + Objects.hashCode(securityLabel);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(topicReference);
    h += (h << 5) + Objects.hashCode(issued);
    return h;
  }

  /**
   * Prints the immutable value {@code Contract_Term} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Contract_Term{");
    if (id != null) {
      builder.append("id=").append(id);
    }
    if (group != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("group=").append(group);
    }
    if (extension != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (builder.length() > 14) builder.append(", ");
    builder.append("offer=").append(offer);
    if (type != null) {
      builder.append(", ");
      builder.append("type=").append(type);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (action != null) {
      builder.append(", ");
      builder.append("action=").append(action);
    }
    if (subType != null) {
      builder.append(", ");
      builder.append("subType=").append(subType);
    }
    if (applies != null) {
      builder.append(", ");
      builder.append("applies=").append(applies);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (topicCodeableConcept != null) {
      builder.append(", ");
      builder.append("topicCodeableConcept=").append(topicCodeableConcept);
    }
    if (asset != null) {
      builder.append(", ");
      builder.append("asset=").append(asset);
    }
    if (securityLabel != null) {
      builder.append(", ");
      builder.append("securityLabel=").append(securityLabel);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (topicReference != null) {
      builder.append(", ");
      builder.append("topicReference=").append(topicReference);
    }
    if (issued != null) {
      builder.append(", ");
      builder.append("issued=").append(issued);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Contract_Term", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Contract_Term {
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Contract_Term>> group = Optional.empty();
    boolean groupIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Contract_Offer offer;
    @Nullable Optional<CodeableConcept> type = Optional.empty();
    boolean typeIsSet;
    @Nullable Optional<String> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<List<Contract_Action>> action = Optional.empty();
    boolean actionIsSet;
    @Nullable Optional<CodeableConcept> subType = Optional.empty();
    boolean subTypeIsSet;
    @Nullable Optional<Period> applies = Optional.empty();
    boolean appliesIsSet;
    @Nullable Optional<Identifier> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<CodeableConcept> topicCodeableConcept = Optional.empty();
    boolean topicCodeableConceptIsSet;
    @Nullable Optional<List<Contract_Asset>> asset = Optional.empty();
    boolean assetIsSet;
    @Nullable Optional<List<Contract_SecurityLabel>> securityLabel = Optional.empty();
    boolean securityLabelIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Reference> topicReference = Optional.empty();
    boolean topicReferenceIsSet;
    @Nullable Optional<DateTime> issued = Optional.empty();
    boolean issuedIsSet;
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("group")
    public void setGroup(Optional<List<Contract_Term>> group) {
      this.group = group;
      this.groupIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("offer")
    public void setOffer(Contract_Offer offer) {
      this.offer = offer;
    }
    @JsonProperty("type")
    public void setType(Optional<CodeableConcept> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<String> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("action")
    public void setAction(Optional<List<Contract_Action>> action) {
      this.action = action;
      this.actionIsSet = true;
    }
    @JsonProperty("subType")
    public void setSubType(Optional<CodeableConcept> subType) {
      this.subType = subType;
      this.subTypeIsSet = true;
    }
    @JsonProperty("applies")
    public void setApplies(Optional<Period> applies) {
      this.applies = applies;
      this.appliesIsSet = true;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<Identifier> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("topicCodeableConcept")
    public void setTopicCodeableConcept(Optional<CodeableConcept> topicCodeableConcept) {
      this.topicCodeableConcept = topicCodeableConcept;
      this.topicCodeableConceptIsSet = true;
    }
    @JsonProperty("asset")
    public void setAsset(Optional<List<Contract_Asset>> asset) {
      this.asset = asset;
      this.assetIsSet = true;
    }
    @JsonProperty("securityLabel")
    public void setSecurityLabel(Optional<List<Contract_SecurityLabel>> securityLabel) {
      this.securityLabel = securityLabel;
      this.securityLabelIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("topicReference")
    public void setTopicReference(Optional<Reference> topicReference) {
      this.topicReference = topicReference;
      this.topicReferenceIsSet = true;
    }
    @JsonProperty("issued")
    public void setIssued(Optional<DateTime> issued) {
      this.issued = issued;
      this.issuedIsSet = true;
    }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Contract_Term>> group() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Contract_Offer offer() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Contract_Action>> action() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> subType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Period> applies() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Identifier> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> topicCodeableConcept() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Contract_Asset>> asset() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Contract_SecurityLabel>> securityLabel() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> topicReference() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DateTime> issued() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableContract_Term fromJson(Json json) {
    ImmutableContract_Term.Builder builder = ((ImmutableContract_Term.Builder) ImmutableContract_Term.builder());
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.groupIsSet) {
      builder.group(json.group);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.offer != null) {
      builder.offer(json.offer);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.actionIsSet) {
      builder.action(json.action);
    }
    if (json.subTypeIsSet) {
      builder.subType(json.subType);
    }
    if (json.appliesIsSet) {
      builder.applies(json.applies);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.topicCodeableConceptIsSet) {
      builder.topicCodeableConcept(json.topicCodeableConcept);
    }
    if (json.assetIsSet) {
      builder.asset(json.asset);
    }
    if (json.securityLabelIsSet) {
      builder.securityLabel(json.securityLabel);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.topicReferenceIsSet) {
      builder.topicReference(json.topicReference);
    }
    if (json.issuedIsSet) {
      builder.issued(json.issued);
    }
    return (ImmutableContract_Term) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Contract_Term} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Contract_Term instance
   */
  public static Contract_Term copyOf(Contract_Term instance) {
    if (instance instanceof ImmutableContract_Term) {
      return (ImmutableContract_Term) instance;
    }
    return ((ImmutableContract_Term.Builder) ImmutableContract_Term.builder())
        .id(instance.id())
        .group(instance.group())
        .extension(instance.extension())
        .offer(instance.offer())
        .type(instance.type())
        .text(instance.text())
        .action(instance.action())
        .subType(instance.subType())
        .applies(instance.applies())
        .identifier(instance.identifier())
        .topicCodeableConcept(instance.topicCodeableConcept())
        .asset(instance.asset())
        .securityLabel(instance.securityLabel())
        .modifierExtension(instance.modifierExtension())
        .topicReference(instance.topicReference())
        .issued(instance.issued())
        .build();
  }

  /**
   * Creates a builder for {@link Contract_Term Contract_Term}.
   * <pre>
   * ImmutableContract_Term.builder()
   *    .id(String) // optional {@link Contract_Term#id() id}
   *    .group(List&amp;lt;com.medplum.types.fhir.Contract_Term&amp;gt;) // optional {@link Contract_Term#group() group}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link Contract_Term#extension() extension}
   *    .offer(com.medplum.types.fhir.Contract_Offer) // required {@link Contract_Term#offer() offer}
   *    .type(com.medplum.types.fhir.CodeableConcept) // optional {@link Contract_Term#type() type}
   *    .text(String) // optional {@link Contract_Term#text() text}
   *    .action(List&amp;lt;com.medplum.types.fhir.Contract_Action&amp;gt;) // optional {@link Contract_Term#action() action}
   *    .subType(com.medplum.types.fhir.CodeableConcept) // optional {@link Contract_Term#subType() subType}
   *    .applies(com.medplum.types.fhir.Period) // optional {@link Contract_Term#applies() applies}
   *    .identifier(com.medplum.types.fhir.Identifier) // optional {@link Contract_Term#identifier() identifier}
   *    .topicCodeableConcept(com.medplum.types.fhir.CodeableConcept) // optional {@link Contract_Term#topicCodeableConcept() topicCodeableConcept}
   *    .asset(List&amp;lt;com.medplum.types.fhir.Contract_Asset&amp;gt;) // optional {@link Contract_Term#asset() asset}
   *    .securityLabel(List&amp;lt;com.medplum.types.fhir.Contract_SecurityLabel&amp;gt;) // optional {@link Contract_Term#securityLabel() securityLabel}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link Contract_Term#modifierExtension() modifierExtension}
   *    .topicReference(com.medplum.types.fhir.Reference) // optional {@link Contract_Term#topicReference() topicReference}
   *    .issued(com.medplum.types.fhir.DateTime) // optional {@link Contract_Term#issued() issued}
   *    .build();
   * </pre>
   * @return A new Contract_Term builder
   */
  public static OfferBuildStage builder() {
    return new ImmutableContract_Term.Builder();
  }

  /**
   * Builds instances of type {@link Contract_Term Contract_Term}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Contract_Term", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements OfferBuildStage, BuildFinal {
    private static final long INIT_BIT_OFFER = 0x1L;
    private static final long OPT_BIT_ID = 0x1L;
    private static final long OPT_BIT_GROUP = 0x2L;
    private static final long OPT_BIT_EXTENSION = 0x4L;
    private static final long OPT_BIT_TYPE = 0x8L;
    private static final long OPT_BIT_TEXT = 0x10L;
    private static final long OPT_BIT_ACTION = 0x20L;
    private static final long OPT_BIT_SUB_TYPE = 0x40L;
    private static final long OPT_BIT_APPLIES = 0x80L;
    private static final long OPT_BIT_IDENTIFIER = 0x100L;
    private static final long OPT_BIT_TOPIC_CODEABLE_CONCEPT = 0x200L;
    private static final long OPT_BIT_ASSET = 0x400L;
    private static final long OPT_BIT_SECURITY_LABEL = 0x800L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1000L;
    private static final long OPT_BIT_TOPIC_REFERENCE = 0x2000L;
    private static final long OPT_BIT_ISSUED = 0x4000L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable String id;
    private @Nullable List<Contract_Term> group;
    private @Nullable List<Extension> extension;
    private @Nullable Contract_Offer offer;
    private @Nullable CodeableConcept type;
    private @Nullable String text;
    private @Nullable List<Contract_Action> action;
    private @Nullable CodeableConcept subType;
    private @Nullable Period applies;
    private @Nullable Identifier identifier;
    private @Nullable CodeableConcept topicCodeableConcept;
    private @Nullable List<Contract_Asset> asset;
    private @Nullable List<Contract_SecurityLabel> securityLabel;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Reference topicReference;
    private @Nullable DateTime issued;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Contract_Term#id() id} to id.
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
     * Initializes the optional value {@link Contract_Term#id() id} to id.
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
     * Initializes the optional value {@link Contract_Term#group() group} to group.
     * @param group The value for group
     * @return {@code this} builder for chained invocation
     */
    public final Builder group(List<Contract_Term> group) {
      checkNotIsSet(groupIsSet(), "group");
      this.group = Objects.requireNonNull(group, "group");
      optBits |= OPT_BIT_GROUP;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_Term#group() group} to group.
     * @param group The value for group
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("group")
    public final Builder group(Optional<? extends List<Contract_Term>> group) {
      checkNotIsSet(groupIsSet(), "group");
      this.group = group.orElse(null);
      optBits |= OPT_BIT_GROUP;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_Term#extension() extension} to extension.
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
     * Initializes the optional value {@link Contract_Term#extension() extension} to extension.
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
     * Initializes the value for the {@link Contract_Term#offer() offer} attribute.
     * @param offer The value for offer 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("offer")
    public final Builder offer(Contract_Offer offer) {
      checkNotIsSet(offerIsSet(), "offer");
      this.offer = Objects.requireNonNull(offer, "offer");
      initBits &= ~INIT_BIT_OFFER;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_Term#type() type} to type.
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
     * Initializes the optional value {@link Contract_Term#type() type} to type.
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
     * Initializes the optional value {@link Contract_Term#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    public final Builder text(String text) {
      checkNotIsSet(textIsSet(), "text");
      this.text = Objects.requireNonNull(text, "text");
      optBits |= OPT_BIT_TEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_Term#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("text")
    public final Builder text(Optional<String> text) {
      checkNotIsSet(textIsSet(), "text");
      this.text = text.orElse(null);
      optBits |= OPT_BIT_TEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_Term#action() action} to action.
     * @param action The value for action
     * @return {@code this} builder for chained invocation
     */
    public final Builder action(List<Contract_Action> action) {
      checkNotIsSet(actionIsSet(), "action");
      this.action = Objects.requireNonNull(action, "action");
      optBits |= OPT_BIT_ACTION;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_Term#action() action} to action.
     * @param action The value for action
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("action")
    public final Builder action(Optional<? extends List<Contract_Action>> action) {
      checkNotIsSet(actionIsSet(), "action");
      this.action = action.orElse(null);
      optBits |= OPT_BIT_ACTION;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_Term#subType() subType} to subType.
     * @param subType The value for subType
     * @return {@code this} builder for chained invocation
     */
    public final Builder subType(CodeableConcept subType) {
      checkNotIsSet(subTypeIsSet(), "subType");
      this.subType = Objects.requireNonNull(subType, "subType");
      optBits |= OPT_BIT_SUB_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_Term#subType() subType} to subType.
     * @param subType The value for subType
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("subType")
    public final Builder subType(Optional<? extends CodeableConcept> subType) {
      checkNotIsSet(subTypeIsSet(), "subType");
      this.subType = subType.orElse(null);
      optBits |= OPT_BIT_SUB_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_Term#applies() applies} to applies.
     * @param applies The value for applies
     * @return {@code this} builder for chained invocation
     */
    public final Builder applies(Period applies) {
      checkNotIsSet(appliesIsSet(), "applies");
      this.applies = Objects.requireNonNull(applies, "applies");
      optBits |= OPT_BIT_APPLIES;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_Term#applies() applies} to applies.
     * @param applies The value for applies
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("applies")
    public final Builder applies(Optional<? extends Period> applies) {
      checkNotIsSet(appliesIsSet(), "applies");
      this.applies = applies.orElse(null);
      optBits |= OPT_BIT_APPLIES;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_Term#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    public final Builder identifier(Identifier identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = Objects.requireNonNull(identifier, "identifier");
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_Term#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("identifier")
    public final Builder identifier(Optional<? extends Identifier> identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = identifier.orElse(null);
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_Term#topicCodeableConcept() topicCodeableConcept} to topicCodeableConcept.
     * @param topicCodeableConcept The value for topicCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    public final Builder topicCodeableConcept(CodeableConcept topicCodeableConcept) {
      checkNotIsSet(topicCodeableConceptIsSet(), "topicCodeableConcept");
      this.topicCodeableConcept = Objects.requireNonNull(topicCodeableConcept, "topicCodeableConcept");
      optBits |= OPT_BIT_TOPIC_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_Term#topicCodeableConcept() topicCodeableConcept} to topicCodeableConcept.
     * @param topicCodeableConcept The value for topicCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("topicCodeableConcept")
    public final Builder topicCodeableConcept(Optional<? extends CodeableConcept> topicCodeableConcept) {
      checkNotIsSet(topicCodeableConceptIsSet(), "topicCodeableConcept");
      this.topicCodeableConcept = topicCodeableConcept.orElse(null);
      optBits |= OPT_BIT_TOPIC_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_Term#asset() asset} to asset.
     * @param asset The value for asset
     * @return {@code this} builder for chained invocation
     */
    public final Builder asset(List<Contract_Asset> asset) {
      checkNotIsSet(assetIsSet(), "asset");
      this.asset = Objects.requireNonNull(asset, "asset");
      optBits |= OPT_BIT_ASSET;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_Term#asset() asset} to asset.
     * @param asset The value for asset
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("asset")
    public final Builder asset(Optional<? extends List<Contract_Asset>> asset) {
      checkNotIsSet(assetIsSet(), "asset");
      this.asset = asset.orElse(null);
      optBits |= OPT_BIT_ASSET;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_Term#securityLabel() securityLabel} to securityLabel.
     * @param securityLabel The value for securityLabel
     * @return {@code this} builder for chained invocation
     */
    public final Builder securityLabel(List<Contract_SecurityLabel> securityLabel) {
      checkNotIsSet(securityLabelIsSet(), "securityLabel");
      this.securityLabel = Objects.requireNonNull(securityLabel, "securityLabel");
      optBits |= OPT_BIT_SECURITY_LABEL;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_Term#securityLabel() securityLabel} to securityLabel.
     * @param securityLabel The value for securityLabel
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("securityLabel")
    public final Builder securityLabel(Optional<? extends List<Contract_SecurityLabel>> securityLabel) {
      checkNotIsSet(securityLabelIsSet(), "securityLabel");
      this.securityLabel = securityLabel.orElse(null);
      optBits |= OPT_BIT_SECURITY_LABEL;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_Term#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Contract_Term#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Contract_Term#topicReference() topicReference} to topicReference.
     * @param topicReference The value for topicReference
     * @return {@code this} builder for chained invocation
     */
    public final Builder topicReference(Reference topicReference) {
      checkNotIsSet(topicReferenceIsSet(), "topicReference");
      this.topicReference = Objects.requireNonNull(topicReference, "topicReference");
      optBits |= OPT_BIT_TOPIC_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_Term#topicReference() topicReference} to topicReference.
     * @param topicReference The value for topicReference
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("topicReference")
    public final Builder topicReference(Optional<? extends Reference> topicReference) {
      checkNotIsSet(topicReferenceIsSet(), "topicReference");
      this.topicReference = topicReference.orElse(null);
      optBits |= OPT_BIT_TOPIC_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_Term#issued() issued} to issued.
     * @param issued The value for issued
     * @return {@code this} builder for chained invocation
     */
    public final Builder issued(DateTime issued) {
      checkNotIsSet(issuedIsSet(), "issued");
      this.issued = Objects.requireNonNull(issued, "issued");
      optBits |= OPT_BIT_ISSUED;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_Term#issued() issued} to issued.
     * @param issued The value for issued
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("issued")
    public final Builder issued(Optional<? extends DateTime> issued) {
      checkNotIsSet(issuedIsSet(), "issued");
      this.issued = issued.orElse(null);
      optBits |= OPT_BIT_ISSUED;
      return this;
    }

    /**
     * Builds a new {@link Contract_Term Contract_Term}.
     * @return An immutable instance of Contract_Term
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Contract_Term build() {
      checkRequiredAttributes();
      return new ImmutableContract_Term(
          id,
          group,
          extension,
          offer,
          type,
          text,
          action,
          subType,
          applies,
          identifier,
          topicCodeableConcept,
          asset,
          securityLabel,
          modifierExtension,
          topicReference,
          issued);
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean groupIsSet() {
      return (optBits & OPT_BIT_GROUP) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean actionIsSet() {
      return (optBits & OPT_BIT_ACTION) != 0;
    }

    private boolean subTypeIsSet() {
      return (optBits & OPT_BIT_SUB_TYPE) != 0;
    }

    private boolean appliesIsSet() {
      return (optBits & OPT_BIT_APPLIES) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean topicCodeableConceptIsSet() {
      return (optBits & OPT_BIT_TOPIC_CODEABLE_CONCEPT) != 0;
    }

    private boolean assetIsSet() {
      return (optBits & OPT_BIT_ASSET) != 0;
    }

    private boolean securityLabelIsSet() {
      return (optBits & OPT_BIT_SECURITY_LABEL) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean topicReferenceIsSet() {
      return (optBits & OPT_BIT_TOPIC_REFERENCE) != 0;
    }

    private boolean issuedIsSet() {
      return (optBits & OPT_BIT_ISSUED) != 0;
    }

    private boolean offerIsSet() {
      return (initBits & INIT_BIT_OFFER) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Contract_Term is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!offerIsSet()) attributes.add("offer");
      return "Cannot build Contract_Term, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "Contract_Term", generator = "Immutables")
  public interface OfferBuildStage {
    /**
     * Initializes the value for the {@link Contract_Term#offer() offer} attribute.
     * @param offer The value for offer 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal offer(Contract_Offer offer);
  }

  @Generated(from = "Contract_Term", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Contract_Term#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(String id);

    /**
     * Initializes the optional value {@link Contract_Term#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<String> id);

    /**
     * Initializes the optional value {@link Contract_Term#group() group} to group.
     * @param group The value for group
     * @return {@code this} builder for chained invocation
     */
    BuildFinal group(List<Contract_Term> group);

    /**
     * Initializes the optional value {@link Contract_Term#group() group} to group.
     * @param group The value for group
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal group(Optional<? extends List<Contract_Term>> group);

    /**
     * Initializes the optional value {@link Contract_Term#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link Contract_Term#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link Contract_Term#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    BuildFinal type(CodeableConcept type);

    /**
     * Initializes the optional value {@link Contract_Term#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal type(Optional<? extends CodeableConcept> type);

    /**
     * Initializes the optional value {@link Contract_Term#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(String text);

    /**
     * Initializes the optional value {@link Contract_Term#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<String> text);

    /**
     * Initializes the optional value {@link Contract_Term#action() action} to action.
     * @param action The value for action
     * @return {@code this} builder for chained invocation
     */
    BuildFinal action(List<Contract_Action> action);

    /**
     * Initializes the optional value {@link Contract_Term#action() action} to action.
     * @param action The value for action
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal action(Optional<? extends List<Contract_Action>> action);

    /**
     * Initializes the optional value {@link Contract_Term#subType() subType} to subType.
     * @param subType The value for subType
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subType(CodeableConcept subType);

    /**
     * Initializes the optional value {@link Contract_Term#subType() subType} to subType.
     * @param subType The value for subType
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subType(Optional<? extends CodeableConcept> subType);

    /**
     * Initializes the optional value {@link Contract_Term#applies() applies} to applies.
     * @param applies The value for applies
     * @return {@code this} builder for chained invocation
     */
    BuildFinal applies(Period applies);

    /**
     * Initializes the optional value {@link Contract_Term#applies() applies} to applies.
     * @param applies The value for applies
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal applies(Optional<? extends Period> applies);

    /**
     * Initializes the optional value {@link Contract_Term#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(Identifier identifier);

    /**
     * Initializes the optional value {@link Contract_Term#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends Identifier> identifier);

    /**
     * Initializes the optional value {@link Contract_Term#topicCodeableConcept() topicCodeableConcept} to topicCodeableConcept.
     * @param topicCodeableConcept The value for topicCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    BuildFinal topicCodeableConcept(CodeableConcept topicCodeableConcept);

    /**
     * Initializes the optional value {@link Contract_Term#topicCodeableConcept() topicCodeableConcept} to topicCodeableConcept.
     * @param topicCodeableConcept The value for topicCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal topicCodeableConcept(Optional<? extends CodeableConcept> topicCodeableConcept);

    /**
     * Initializes the optional value {@link Contract_Term#asset() asset} to asset.
     * @param asset The value for asset
     * @return {@code this} builder for chained invocation
     */
    BuildFinal asset(List<Contract_Asset> asset);

    /**
     * Initializes the optional value {@link Contract_Term#asset() asset} to asset.
     * @param asset The value for asset
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal asset(Optional<? extends List<Contract_Asset>> asset);

    /**
     * Initializes the optional value {@link Contract_Term#securityLabel() securityLabel} to securityLabel.
     * @param securityLabel The value for securityLabel
     * @return {@code this} builder for chained invocation
     */
    BuildFinal securityLabel(List<Contract_SecurityLabel> securityLabel);

    /**
     * Initializes the optional value {@link Contract_Term#securityLabel() securityLabel} to securityLabel.
     * @param securityLabel The value for securityLabel
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal securityLabel(Optional<? extends List<Contract_SecurityLabel>> securityLabel);

    /**
     * Initializes the optional value {@link Contract_Term#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link Contract_Term#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link Contract_Term#topicReference() topicReference} to topicReference.
     * @param topicReference The value for topicReference
     * @return {@code this} builder for chained invocation
     */
    BuildFinal topicReference(Reference topicReference);

    /**
     * Initializes the optional value {@link Contract_Term#topicReference() topicReference} to topicReference.
     * @param topicReference The value for topicReference
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal topicReference(Optional<? extends Reference> topicReference);

    /**
     * Initializes the optional value {@link Contract_Term#issued() issued} to issued.
     * @param issued The value for issued
     * @return {@code this} builder for chained invocation
     */
    BuildFinal issued(DateTime issued);

    /**
     * Initializes the optional value {@link Contract_Term#issued() issued} to issued.
     * @param issued The value for issued
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal issued(Optional<? extends DateTime> issued);

    /**
     * Builds a new {@link Contract_Term Contract_Term}.
     * @return An immutable instance of Contract_Term
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Contract_Term build();
  }
}
