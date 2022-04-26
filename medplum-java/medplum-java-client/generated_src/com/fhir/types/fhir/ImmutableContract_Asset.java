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
 * Immutable implementation of {@link Contract_Asset}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableContract_Asset.builder()}.
 */
@Generated(from = "Contract_Asset", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableContract_Asset implements Contract_Asset {
  private final @Nullable List<CodeableConcept> type;
  private final @Nullable List<Period> usePeriod;
  private final @Nullable List<Contract_Answer> answer;
  private final @Nullable CodeableConcept scope;
  private final @Nullable List<String> linkId;
  private final @Nullable List<Contract_Context> context;
  private final @Nullable String id;
  private final @Nullable List<Reference> typeReference;
  private final @Nullable String condition;
  private final @Nullable Coding relationship;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<UnsignedInt> securityLabelNumber;
  private final @Nullable List<Period> period;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable List<CodeableConcept> periodType;
  private final @Nullable List<Contract_ValuedItem> valuedItem;
  private final @Nullable String text;
  private final @Nullable List<CodeableConcept> subtype;

  private ImmutableContract_Asset(
      @Nullable List<CodeableConcept> type,
      @Nullable List<Period> usePeriod,
      @Nullable List<Contract_Answer> answer,
      @Nullable CodeableConcept scope,
      @Nullable List<String> linkId,
      @Nullable List<Contract_Context> context,
      @Nullable String id,
      @Nullable List<Reference> typeReference,
      @Nullable String condition,
      @Nullable Coding relationship,
      @Nullable List<Extension> extension,
      @Nullable List<UnsignedInt> securityLabelNumber,
      @Nullable List<Period> period,
      @Nullable List<Extension> modifierExtension,
      @Nullable List<CodeableConcept> periodType,
      @Nullable List<Contract_ValuedItem> valuedItem,
      @Nullable String text,
      @Nullable List<CodeableConcept> subtype) {
    this.type = type;
    this.usePeriod = usePeriod;
    this.answer = answer;
    this.scope = scope;
    this.linkId = linkId;
    this.context = context;
    this.id = id;
    this.typeReference = typeReference;
    this.condition = condition;
    this.relationship = relationship;
    this.extension = extension;
    this.securityLabelNumber = securityLabelNumber;
    this.period = period;
    this.modifierExtension = modifierExtension;
    this.periodType = periodType;
    this.valuedItem = valuedItem;
    this.text = text;
    this.subtype = subtype;
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
   * @return The value of the {@code usePeriod} attribute
   */
  @JsonProperty("usePeriod")
  @Override
  public Optional<List<Period>> usePeriod() {
    return Optional.ofNullable(usePeriod);
  }

  /**
   * @return The value of the {@code answer} attribute
   */
  @JsonProperty("answer")
  @Override
  public Optional<List<Contract_Answer>> answer() {
    return Optional.ofNullable(answer);
  }

  /**
   * @return The value of the {@code scope} attribute
   */
  @JsonProperty("scope")
  @Override
  public Optional<CodeableConcept> scope() {
    return Optional.ofNullable(scope);
  }

  /**
   * @return The value of the {@code linkId} attribute
   */
  @JsonProperty("linkId")
  @Override
  public Optional<List<String>> linkId() {
    return Optional.ofNullable(linkId);
  }

  /**
   * @return The value of the {@code context} attribute
   */
  @JsonProperty("context")
  @Override
  public Optional<List<Contract_Context>> context() {
    return Optional.ofNullable(context);
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
   * @return The value of the {@code typeReference} attribute
   */
  @JsonProperty("typeReference")
  @Override
  public Optional<List<Reference>> typeReference() {
    return Optional.ofNullable(typeReference);
  }

  /**
   * @return The value of the {@code condition} attribute
   */
  @JsonProperty("condition")
  @Override
  public Optional<String> condition() {
    return Optional.ofNullable(condition);
  }

  /**
   * @return The value of the {@code relationship} attribute
   */
  @JsonProperty("relationship")
  @Override
  public Optional<Coding> relationship() {
    return Optional.ofNullable(relationship);
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
   * @return The value of the {@code securityLabelNumber} attribute
   */
  @JsonProperty("securityLabelNumber")
  @Override
  public Optional<List<UnsignedInt>> securityLabelNumber() {
    return Optional.ofNullable(securityLabelNumber);
  }

  /**
   * @return The value of the {@code period} attribute
   */
  @JsonProperty("period")
  @Override
  public Optional<List<Period>> period() {
    return Optional.ofNullable(period);
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
   * @return The value of the {@code periodType} attribute
   */
  @JsonProperty("periodType")
  @Override
  public Optional<List<CodeableConcept>> periodType() {
    return Optional.ofNullable(periodType);
  }

  /**
   * @return The value of the {@code valuedItem} attribute
   */
  @JsonProperty("valuedItem")
  @Override
  public Optional<List<Contract_ValuedItem>> valuedItem() {
    return Optional.ofNullable(valuedItem);
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
   * @return The value of the {@code subtype} attribute
   */
  @JsonProperty("subtype")
  @Override
  public Optional<List<CodeableConcept>> subtype() {
    return Optional.ofNullable(subtype);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_Asset#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Asset withType(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableContract_Asset(
        newValue,
        this.usePeriod,
        this.answer,
        this.scope,
        this.linkId,
        this.context,
        this.id,
        this.typeReference,
        this.condition,
        this.relationship,
        this.extension,
        this.securityLabelNumber,
        this.period,
        this.modifierExtension,
        this.periodType,
        this.valuedItem,
        this.text,
        this.subtype);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_Asset#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_Asset withType(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableContract_Asset(
        value,
        this.usePeriod,
        this.answer,
        this.scope,
        this.linkId,
        this.context,
        this.id,
        this.typeReference,
        this.condition,
        this.relationship,
        this.extension,
        this.securityLabelNumber,
        this.period,
        this.modifierExtension,
        this.periodType,
        this.valuedItem,
        this.text,
        this.subtype);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_Asset#usePeriod() usePeriod} attribute.
   * @param value The value for usePeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Asset withUsePeriod(List<Period> value) {
    @Nullable List<Period> newValue = Objects.requireNonNull(value, "usePeriod");
    if (this.usePeriod == newValue) return this;
    return new ImmutableContract_Asset(
        this.type,
        newValue,
        this.answer,
        this.scope,
        this.linkId,
        this.context,
        this.id,
        this.typeReference,
        this.condition,
        this.relationship,
        this.extension,
        this.securityLabelNumber,
        this.period,
        this.modifierExtension,
        this.periodType,
        this.valuedItem,
        this.text,
        this.subtype);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_Asset#usePeriod() usePeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for usePeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_Asset withUsePeriod(Optional<? extends List<Period>> optional) {
    @Nullable List<Period> value = optional.orElse(null);
    if (this.usePeriod == value) return this;
    return new ImmutableContract_Asset(
        this.type,
        value,
        this.answer,
        this.scope,
        this.linkId,
        this.context,
        this.id,
        this.typeReference,
        this.condition,
        this.relationship,
        this.extension,
        this.securityLabelNumber,
        this.period,
        this.modifierExtension,
        this.periodType,
        this.valuedItem,
        this.text,
        this.subtype);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_Asset#answer() answer} attribute.
   * @param value The value for answer
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Asset withAnswer(List<Contract_Answer> value) {
    @Nullable List<Contract_Answer> newValue = Objects.requireNonNull(value, "answer");
    if (this.answer == newValue) return this;
    return new ImmutableContract_Asset(
        this.type,
        this.usePeriod,
        newValue,
        this.scope,
        this.linkId,
        this.context,
        this.id,
        this.typeReference,
        this.condition,
        this.relationship,
        this.extension,
        this.securityLabelNumber,
        this.period,
        this.modifierExtension,
        this.periodType,
        this.valuedItem,
        this.text,
        this.subtype);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_Asset#answer() answer} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for answer
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_Asset withAnswer(Optional<? extends List<Contract_Answer>> optional) {
    @Nullable List<Contract_Answer> value = optional.orElse(null);
    if (this.answer == value) return this;
    return new ImmutableContract_Asset(
        this.type,
        this.usePeriod,
        value,
        this.scope,
        this.linkId,
        this.context,
        this.id,
        this.typeReference,
        this.condition,
        this.relationship,
        this.extension,
        this.securityLabelNumber,
        this.period,
        this.modifierExtension,
        this.periodType,
        this.valuedItem,
        this.text,
        this.subtype);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_Asset#scope() scope} attribute.
   * @param value The value for scope
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Asset withScope(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "scope");
    if (this.scope == newValue) return this;
    return new ImmutableContract_Asset(
        this.type,
        this.usePeriod,
        this.answer,
        newValue,
        this.linkId,
        this.context,
        this.id,
        this.typeReference,
        this.condition,
        this.relationship,
        this.extension,
        this.securityLabelNumber,
        this.period,
        this.modifierExtension,
        this.periodType,
        this.valuedItem,
        this.text,
        this.subtype);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_Asset#scope() scope} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for scope
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_Asset withScope(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.scope == value) return this;
    return new ImmutableContract_Asset(
        this.type,
        this.usePeriod,
        this.answer,
        value,
        this.linkId,
        this.context,
        this.id,
        this.typeReference,
        this.condition,
        this.relationship,
        this.extension,
        this.securityLabelNumber,
        this.period,
        this.modifierExtension,
        this.periodType,
        this.valuedItem,
        this.text,
        this.subtype);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_Asset#linkId() linkId} attribute.
   * @param value The value for linkId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Asset withLinkId(List<String> value) {
    @Nullable List<String> newValue = Objects.requireNonNull(value, "linkId");
    if (this.linkId == newValue) return this;
    return new ImmutableContract_Asset(
        this.type,
        this.usePeriod,
        this.answer,
        this.scope,
        newValue,
        this.context,
        this.id,
        this.typeReference,
        this.condition,
        this.relationship,
        this.extension,
        this.securityLabelNumber,
        this.period,
        this.modifierExtension,
        this.periodType,
        this.valuedItem,
        this.text,
        this.subtype);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_Asset#linkId() linkId} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for linkId
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_Asset withLinkId(Optional<? extends List<String>> optional) {
    @Nullable List<String> value = optional.orElse(null);
    if (this.linkId == value) return this;
    return new ImmutableContract_Asset(
        this.type,
        this.usePeriod,
        this.answer,
        this.scope,
        value,
        this.context,
        this.id,
        this.typeReference,
        this.condition,
        this.relationship,
        this.extension,
        this.securityLabelNumber,
        this.period,
        this.modifierExtension,
        this.periodType,
        this.valuedItem,
        this.text,
        this.subtype);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_Asset#context() context} attribute.
   * @param value The value for context
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Asset withContext(List<Contract_Context> value) {
    @Nullable List<Contract_Context> newValue = Objects.requireNonNull(value, "context");
    if (this.context == newValue) return this;
    return new ImmutableContract_Asset(
        this.type,
        this.usePeriod,
        this.answer,
        this.scope,
        this.linkId,
        newValue,
        this.id,
        this.typeReference,
        this.condition,
        this.relationship,
        this.extension,
        this.securityLabelNumber,
        this.period,
        this.modifierExtension,
        this.periodType,
        this.valuedItem,
        this.text,
        this.subtype);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_Asset#context() context} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for context
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_Asset withContext(Optional<? extends List<Contract_Context>> optional) {
    @Nullable List<Contract_Context> value = optional.orElse(null);
    if (this.context == value) return this;
    return new ImmutableContract_Asset(
        this.type,
        this.usePeriod,
        this.answer,
        this.scope,
        this.linkId,
        value,
        this.id,
        this.typeReference,
        this.condition,
        this.relationship,
        this.extension,
        this.securityLabelNumber,
        this.period,
        this.modifierExtension,
        this.periodType,
        this.valuedItem,
        this.text,
        this.subtype);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_Asset#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Asset withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableContract_Asset(
        this.type,
        this.usePeriod,
        this.answer,
        this.scope,
        this.linkId,
        this.context,
        newValue,
        this.typeReference,
        this.condition,
        this.relationship,
        this.extension,
        this.securityLabelNumber,
        this.period,
        this.modifierExtension,
        this.periodType,
        this.valuedItem,
        this.text,
        this.subtype);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_Asset#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Asset withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableContract_Asset(
        this.type,
        this.usePeriod,
        this.answer,
        this.scope,
        this.linkId,
        this.context,
        value,
        this.typeReference,
        this.condition,
        this.relationship,
        this.extension,
        this.securityLabelNumber,
        this.period,
        this.modifierExtension,
        this.periodType,
        this.valuedItem,
        this.text,
        this.subtype);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_Asset#typeReference() typeReference} attribute.
   * @param value The value for typeReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Asset withTypeReference(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "typeReference");
    if (this.typeReference == newValue) return this;
    return new ImmutableContract_Asset(
        this.type,
        this.usePeriod,
        this.answer,
        this.scope,
        this.linkId,
        this.context,
        this.id,
        newValue,
        this.condition,
        this.relationship,
        this.extension,
        this.securityLabelNumber,
        this.period,
        this.modifierExtension,
        this.periodType,
        this.valuedItem,
        this.text,
        this.subtype);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_Asset#typeReference() typeReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for typeReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_Asset withTypeReference(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.typeReference == value) return this;
    return new ImmutableContract_Asset(
        this.type,
        this.usePeriod,
        this.answer,
        this.scope,
        this.linkId,
        this.context,
        this.id,
        value,
        this.condition,
        this.relationship,
        this.extension,
        this.securityLabelNumber,
        this.period,
        this.modifierExtension,
        this.periodType,
        this.valuedItem,
        this.text,
        this.subtype);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_Asset#condition() condition} attribute.
   * @param value The value for condition
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Asset withCondition(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "condition");
    if (Objects.equals(this.condition, newValue)) return this;
    return new ImmutableContract_Asset(
        this.type,
        this.usePeriod,
        this.answer,
        this.scope,
        this.linkId,
        this.context,
        this.id,
        this.typeReference,
        newValue,
        this.relationship,
        this.extension,
        this.securityLabelNumber,
        this.period,
        this.modifierExtension,
        this.periodType,
        this.valuedItem,
        this.text,
        this.subtype);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_Asset#condition() condition} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for condition
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Asset withCondition(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.condition, value)) return this;
    return new ImmutableContract_Asset(
        this.type,
        this.usePeriod,
        this.answer,
        this.scope,
        this.linkId,
        this.context,
        this.id,
        this.typeReference,
        value,
        this.relationship,
        this.extension,
        this.securityLabelNumber,
        this.period,
        this.modifierExtension,
        this.periodType,
        this.valuedItem,
        this.text,
        this.subtype);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_Asset#relationship() relationship} attribute.
   * @param value The value for relationship
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Asset withRelationship(Coding value) {
    @Nullable Coding newValue = Objects.requireNonNull(value, "relationship");
    if (this.relationship == newValue) return this;
    return new ImmutableContract_Asset(
        this.type,
        this.usePeriod,
        this.answer,
        this.scope,
        this.linkId,
        this.context,
        this.id,
        this.typeReference,
        this.condition,
        newValue,
        this.extension,
        this.securityLabelNumber,
        this.period,
        this.modifierExtension,
        this.periodType,
        this.valuedItem,
        this.text,
        this.subtype);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_Asset#relationship() relationship} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for relationship
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_Asset withRelationship(Optional<? extends Coding> optional) {
    @Nullable Coding value = optional.orElse(null);
    if (this.relationship == value) return this;
    return new ImmutableContract_Asset(
        this.type,
        this.usePeriod,
        this.answer,
        this.scope,
        this.linkId,
        this.context,
        this.id,
        this.typeReference,
        this.condition,
        value,
        this.extension,
        this.securityLabelNumber,
        this.period,
        this.modifierExtension,
        this.periodType,
        this.valuedItem,
        this.text,
        this.subtype);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_Asset#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Asset withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableContract_Asset(
        this.type,
        this.usePeriod,
        this.answer,
        this.scope,
        this.linkId,
        this.context,
        this.id,
        this.typeReference,
        this.condition,
        this.relationship,
        newValue,
        this.securityLabelNumber,
        this.period,
        this.modifierExtension,
        this.periodType,
        this.valuedItem,
        this.text,
        this.subtype);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_Asset#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_Asset withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableContract_Asset(
        this.type,
        this.usePeriod,
        this.answer,
        this.scope,
        this.linkId,
        this.context,
        this.id,
        this.typeReference,
        this.condition,
        this.relationship,
        value,
        this.securityLabelNumber,
        this.period,
        this.modifierExtension,
        this.periodType,
        this.valuedItem,
        this.text,
        this.subtype);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_Asset#securityLabelNumber() securityLabelNumber} attribute.
   * @param value The value for securityLabelNumber
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Asset withSecurityLabelNumber(List<UnsignedInt> value) {
    @Nullable List<UnsignedInt> newValue = Objects.requireNonNull(value, "securityLabelNumber");
    if (this.securityLabelNumber == newValue) return this;
    return new ImmutableContract_Asset(
        this.type,
        this.usePeriod,
        this.answer,
        this.scope,
        this.linkId,
        this.context,
        this.id,
        this.typeReference,
        this.condition,
        this.relationship,
        this.extension,
        newValue,
        this.period,
        this.modifierExtension,
        this.periodType,
        this.valuedItem,
        this.text,
        this.subtype);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_Asset#securityLabelNumber() securityLabelNumber} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for securityLabelNumber
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_Asset withSecurityLabelNumber(Optional<? extends List<UnsignedInt>> optional) {
    @Nullable List<UnsignedInt> value = optional.orElse(null);
    if (this.securityLabelNumber == value) return this;
    return new ImmutableContract_Asset(
        this.type,
        this.usePeriod,
        this.answer,
        this.scope,
        this.linkId,
        this.context,
        this.id,
        this.typeReference,
        this.condition,
        this.relationship,
        this.extension,
        value,
        this.period,
        this.modifierExtension,
        this.periodType,
        this.valuedItem,
        this.text,
        this.subtype);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_Asset#period() period} attribute.
   * @param value The value for period
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Asset withPeriod(List<Period> value) {
    @Nullable List<Period> newValue = Objects.requireNonNull(value, "period");
    if (this.period == newValue) return this;
    return new ImmutableContract_Asset(
        this.type,
        this.usePeriod,
        this.answer,
        this.scope,
        this.linkId,
        this.context,
        this.id,
        this.typeReference,
        this.condition,
        this.relationship,
        this.extension,
        this.securityLabelNumber,
        newValue,
        this.modifierExtension,
        this.periodType,
        this.valuedItem,
        this.text,
        this.subtype);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_Asset#period() period} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for period
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_Asset withPeriod(Optional<? extends List<Period>> optional) {
    @Nullable List<Period> value = optional.orElse(null);
    if (this.period == value) return this;
    return new ImmutableContract_Asset(
        this.type,
        this.usePeriod,
        this.answer,
        this.scope,
        this.linkId,
        this.context,
        this.id,
        this.typeReference,
        this.condition,
        this.relationship,
        this.extension,
        this.securityLabelNumber,
        value,
        this.modifierExtension,
        this.periodType,
        this.valuedItem,
        this.text,
        this.subtype);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_Asset#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Asset withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableContract_Asset(
        this.type,
        this.usePeriod,
        this.answer,
        this.scope,
        this.linkId,
        this.context,
        this.id,
        this.typeReference,
        this.condition,
        this.relationship,
        this.extension,
        this.securityLabelNumber,
        this.period,
        newValue,
        this.periodType,
        this.valuedItem,
        this.text,
        this.subtype);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_Asset#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_Asset withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableContract_Asset(
        this.type,
        this.usePeriod,
        this.answer,
        this.scope,
        this.linkId,
        this.context,
        this.id,
        this.typeReference,
        this.condition,
        this.relationship,
        this.extension,
        this.securityLabelNumber,
        this.period,
        value,
        this.periodType,
        this.valuedItem,
        this.text,
        this.subtype);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_Asset#periodType() periodType} attribute.
   * @param value The value for periodType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Asset withPeriodType(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "periodType");
    if (this.periodType == newValue) return this;
    return new ImmutableContract_Asset(
        this.type,
        this.usePeriod,
        this.answer,
        this.scope,
        this.linkId,
        this.context,
        this.id,
        this.typeReference,
        this.condition,
        this.relationship,
        this.extension,
        this.securityLabelNumber,
        this.period,
        this.modifierExtension,
        newValue,
        this.valuedItem,
        this.text,
        this.subtype);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_Asset#periodType() periodType} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for periodType
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_Asset withPeriodType(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.periodType == value) return this;
    return new ImmutableContract_Asset(
        this.type,
        this.usePeriod,
        this.answer,
        this.scope,
        this.linkId,
        this.context,
        this.id,
        this.typeReference,
        this.condition,
        this.relationship,
        this.extension,
        this.securityLabelNumber,
        this.period,
        this.modifierExtension,
        value,
        this.valuedItem,
        this.text,
        this.subtype);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_Asset#valuedItem() valuedItem} attribute.
   * @param value The value for valuedItem
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Asset withValuedItem(List<Contract_ValuedItem> value) {
    @Nullable List<Contract_ValuedItem> newValue = Objects.requireNonNull(value, "valuedItem");
    if (this.valuedItem == newValue) return this;
    return new ImmutableContract_Asset(
        this.type,
        this.usePeriod,
        this.answer,
        this.scope,
        this.linkId,
        this.context,
        this.id,
        this.typeReference,
        this.condition,
        this.relationship,
        this.extension,
        this.securityLabelNumber,
        this.period,
        this.modifierExtension,
        this.periodType,
        newValue,
        this.text,
        this.subtype);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_Asset#valuedItem() valuedItem} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valuedItem
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_Asset withValuedItem(Optional<? extends List<Contract_ValuedItem>> optional) {
    @Nullable List<Contract_ValuedItem> value = optional.orElse(null);
    if (this.valuedItem == value) return this;
    return new ImmutableContract_Asset(
        this.type,
        this.usePeriod,
        this.answer,
        this.scope,
        this.linkId,
        this.context,
        this.id,
        this.typeReference,
        this.condition,
        this.relationship,
        this.extension,
        this.securityLabelNumber,
        this.period,
        this.modifierExtension,
        this.periodType,
        value,
        this.text,
        this.subtype);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_Asset#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Asset withText(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "text");
    if (Objects.equals(this.text, newValue)) return this;
    return new ImmutableContract_Asset(
        this.type,
        this.usePeriod,
        this.answer,
        this.scope,
        this.linkId,
        this.context,
        this.id,
        this.typeReference,
        this.condition,
        this.relationship,
        this.extension,
        this.securityLabelNumber,
        this.period,
        this.modifierExtension,
        this.periodType,
        this.valuedItem,
        newValue,
        this.subtype);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_Asset#text() text} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Asset withText(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.text, value)) return this;
    return new ImmutableContract_Asset(
        this.type,
        this.usePeriod,
        this.answer,
        this.scope,
        this.linkId,
        this.context,
        this.id,
        this.typeReference,
        this.condition,
        this.relationship,
        this.extension,
        this.securityLabelNumber,
        this.period,
        this.modifierExtension,
        this.periodType,
        this.valuedItem,
        value,
        this.subtype);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_Asset#subtype() subtype} attribute.
   * @param value The value for subtype
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Asset withSubtype(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "subtype");
    if (this.subtype == newValue) return this;
    return new ImmutableContract_Asset(
        this.type,
        this.usePeriod,
        this.answer,
        this.scope,
        this.linkId,
        this.context,
        this.id,
        this.typeReference,
        this.condition,
        this.relationship,
        this.extension,
        this.securityLabelNumber,
        this.period,
        this.modifierExtension,
        this.periodType,
        this.valuedItem,
        this.text,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_Asset#subtype() subtype} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subtype
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_Asset withSubtype(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.subtype == value) return this;
    return new ImmutableContract_Asset(
        this.type,
        this.usePeriod,
        this.answer,
        this.scope,
        this.linkId,
        this.context,
        this.id,
        this.typeReference,
        this.condition,
        this.relationship,
        this.extension,
        this.securityLabelNumber,
        this.period,
        this.modifierExtension,
        this.periodType,
        this.valuedItem,
        this.text,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableContract_Asset} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableContract_Asset
        && equalTo((ImmutableContract_Asset) another);
  }

  private boolean equalTo(ImmutableContract_Asset another) {
    return Objects.equals(type, another.type)
        && Objects.equals(usePeriod, another.usePeriod)
        && Objects.equals(answer, another.answer)
        && Objects.equals(scope, another.scope)
        && Objects.equals(linkId, another.linkId)
        && Objects.equals(context, another.context)
        && Objects.equals(id, another.id)
        && Objects.equals(typeReference, another.typeReference)
        && Objects.equals(condition, another.condition)
        && Objects.equals(relationship, another.relationship)
        && Objects.equals(extension, another.extension)
        && Objects.equals(securityLabelNumber, another.securityLabelNumber)
        && Objects.equals(period, another.period)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(periodType, another.periodType)
        && Objects.equals(valuedItem, another.valuedItem)
        && Objects.equals(text, another.text)
        && Objects.equals(subtype, another.subtype);
  }

  /**
   * Computes a hash code from attributes: {@code type}, {@code usePeriod}, {@code answer}, {@code scope}, {@code linkId}, {@code context}, {@code id}, {@code typeReference}, {@code condition}, {@code relationship}, {@code extension}, {@code securityLabelNumber}, {@code period}, {@code modifierExtension}, {@code periodType}, {@code valuedItem}, {@code text}, {@code subtype}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(type);
    h += (h << 5) + Objects.hashCode(usePeriod);
    h += (h << 5) + Objects.hashCode(answer);
    h += (h << 5) + Objects.hashCode(scope);
    h += (h << 5) + Objects.hashCode(linkId);
    h += (h << 5) + Objects.hashCode(context);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(typeReference);
    h += (h << 5) + Objects.hashCode(condition);
    h += (h << 5) + Objects.hashCode(relationship);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(securityLabelNumber);
    h += (h << 5) + Objects.hashCode(period);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(periodType);
    h += (h << 5) + Objects.hashCode(valuedItem);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(subtype);
    return h;
  }

  /**
   * Prints the immutable value {@code Contract_Asset} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Contract_Asset{");
    if (type != null) {
      builder.append("type=").append(type);
    }
    if (usePeriod != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("usePeriod=").append(usePeriod);
    }
    if (answer != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("answer=").append(answer);
    }
    if (scope != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("scope=").append(scope);
    }
    if (linkId != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("linkId=").append(linkId);
    }
    if (context != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("context=").append(context);
    }
    if (id != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (typeReference != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("typeReference=").append(typeReference);
    }
    if (condition != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("condition=").append(condition);
    }
    if (relationship != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("relationship=").append(relationship);
    }
    if (extension != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (securityLabelNumber != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("securityLabelNumber=").append(securityLabelNumber);
    }
    if (period != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("period=").append(period);
    }
    if (modifierExtension != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (periodType != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("periodType=").append(periodType);
    }
    if (valuedItem != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("valuedItem=").append(valuedItem);
    }
    if (text != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (subtype != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("subtype=").append(subtype);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Contract_Asset", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Contract_Asset {
    @Nullable Optional<List<CodeableConcept>> type = Optional.empty();
    boolean typeIsSet;
    @Nullable Optional<List<Period>> usePeriod = Optional.empty();
    boolean usePeriodIsSet;
    @Nullable Optional<List<Contract_Answer>> answer = Optional.empty();
    boolean answerIsSet;
    @Nullable Optional<CodeableConcept> scope = Optional.empty();
    boolean scopeIsSet;
    @Nullable Optional<List<String>> linkId = Optional.empty();
    boolean linkIdIsSet;
    @Nullable Optional<List<Contract_Context>> context = Optional.empty();
    boolean contextIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Reference>> typeReference = Optional.empty();
    boolean typeReferenceIsSet;
    @Nullable Optional<String> condition = Optional.empty();
    boolean conditionIsSet;
    @Nullable Optional<Coding> relationship = Optional.empty();
    boolean relationshipIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<UnsignedInt>> securityLabelNumber = Optional.empty();
    boolean securityLabelNumberIsSet;
    @Nullable Optional<List<Period>> period = Optional.empty();
    boolean periodIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<List<CodeableConcept>> periodType = Optional.empty();
    boolean periodTypeIsSet;
    @Nullable Optional<List<Contract_ValuedItem>> valuedItem = Optional.empty();
    boolean valuedItemIsSet;
    @Nullable Optional<String> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<List<CodeableConcept>> subtype = Optional.empty();
    boolean subtypeIsSet;
    @JsonProperty("type")
    public void setType(Optional<List<CodeableConcept>> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @JsonProperty("usePeriod")
    public void setUsePeriod(Optional<List<Period>> usePeriod) {
      this.usePeriod = usePeriod;
      this.usePeriodIsSet = true;
    }
    @JsonProperty("answer")
    public void setAnswer(Optional<List<Contract_Answer>> answer) {
      this.answer = answer;
      this.answerIsSet = true;
    }
    @JsonProperty("scope")
    public void setScope(Optional<CodeableConcept> scope) {
      this.scope = scope;
      this.scopeIsSet = true;
    }
    @JsonProperty("linkId")
    public void setLinkId(Optional<List<String>> linkId) {
      this.linkId = linkId;
      this.linkIdIsSet = true;
    }
    @JsonProperty("context")
    public void setContext(Optional<List<Contract_Context>> context) {
      this.context = context;
      this.contextIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("typeReference")
    public void setTypeReference(Optional<List<Reference>> typeReference) {
      this.typeReference = typeReference;
      this.typeReferenceIsSet = true;
    }
    @JsonProperty("condition")
    public void setCondition(Optional<String> condition) {
      this.condition = condition;
      this.conditionIsSet = true;
    }
    @JsonProperty("relationship")
    public void setRelationship(Optional<Coding> relationship) {
      this.relationship = relationship;
      this.relationshipIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("securityLabelNumber")
    public void setSecurityLabelNumber(Optional<List<UnsignedInt>> securityLabelNumber) {
      this.securityLabelNumber = securityLabelNumber;
      this.securityLabelNumberIsSet = true;
    }
    @JsonProperty("period")
    public void setPeriod(Optional<List<Period>> period) {
      this.period = period;
      this.periodIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("periodType")
    public void setPeriodType(Optional<List<CodeableConcept>> periodType) {
      this.periodType = periodType;
      this.periodTypeIsSet = true;
    }
    @JsonProperty("valuedItem")
    public void setValuedItem(Optional<List<Contract_ValuedItem>> valuedItem) {
      this.valuedItem = valuedItem;
      this.valuedItemIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<String> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("subtype")
    public void setSubtype(Optional<List<CodeableConcept>> subtype) {
      this.subtype = subtype;
      this.subtypeIsSet = true;
    }
    @Override
    public Optional<List<CodeableConcept>> type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Period>> usePeriod() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Contract_Answer>> answer() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> scope() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<String>> linkId() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Contract_Context>> context() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> typeReference() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> condition() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Coding> relationship() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<UnsignedInt>> securityLabelNumber() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Period>> period() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> periodType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Contract_ValuedItem>> valuedItem() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> subtype() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableContract_Asset fromJson(Json json) {
    ImmutableContract_Asset.Builder builder = ImmutableContract_Asset.builder();
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.usePeriodIsSet) {
      builder.usePeriod(json.usePeriod);
    }
    if (json.answerIsSet) {
      builder.answer(json.answer);
    }
    if (json.scopeIsSet) {
      builder.scope(json.scope);
    }
    if (json.linkIdIsSet) {
      builder.linkId(json.linkId);
    }
    if (json.contextIsSet) {
      builder.context(json.context);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.typeReferenceIsSet) {
      builder.typeReference(json.typeReference);
    }
    if (json.conditionIsSet) {
      builder.condition(json.condition);
    }
    if (json.relationshipIsSet) {
      builder.relationship(json.relationship);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.securityLabelNumberIsSet) {
      builder.securityLabelNumber(json.securityLabelNumber);
    }
    if (json.periodIsSet) {
      builder.period(json.period);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.periodTypeIsSet) {
      builder.periodType(json.periodType);
    }
    if (json.valuedItemIsSet) {
      builder.valuedItem(json.valuedItem);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.subtypeIsSet) {
      builder.subtype(json.subtype);
    }
    return (ImmutableContract_Asset) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Contract_Asset} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Contract_Asset instance
   */
  public static Contract_Asset copyOf(Contract_Asset instance) {
    if (instance instanceof ImmutableContract_Asset) {
      return (ImmutableContract_Asset) instance;
    }
    return ImmutableContract_Asset.builder()
        .type(instance.type())
        .usePeriod(instance.usePeriod())
        .answer(instance.answer())
        .scope(instance.scope())
        .linkId(instance.linkId())
        .context(instance.context())
        .id(instance.id())
        .typeReference(instance.typeReference())
        .condition(instance.condition())
        .relationship(instance.relationship())
        .extension(instance.extension())
        .securityLabelNumber(instance.securityLabelNumber())
        .period(instance.period())
        .modifierExtension(instance.modifierExtension())
        .periodType(instance.periodType())
        .valuedItem(instance.valuedItem())
        .text(instance.text())
        .subtype(instance.subtype())
        .build();
  }

  /**
   * Creates a builder for {@link Contract_Asset Contract_Asset}.
   * <pre>
   * ImmutableContract_Asset.builder()
   *    .type(List&amp;lt;com.fhir.types.fhir.CodeableConcept&amp;gt;) // optional {@link Contract_Asset#type() type}
   *    .usePeriod(List&amp;lt;com.fhir.types.fhir.Period&amp;gt;) // optional {@link Contract_Asset#usePeriod() usePeriod}
   *    .answer(List&amp;lt;com.fhir.types.fhir.Contract_Answer&amp;gt;) // optional {@link Contract_Asset#answer() answer}
   *    .scope(com.fhir.types.fhir.CodeableConcept) // optional {@link Contract_Asset#scope() scope}
   *    .linkId(List&amp;lt;String&amp;gt;) // optional {@link Contract_Asset#linkId() linkId}
   *    .context(List&amp;lt;com.fhir.types.fhir.Contract_Context&amp;gt;) // optional {@link Contract_Asset#context() context}
   *    .id(String) // optional {@link Contract_Asset#id() id}
   *    .typeReference(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link Contract_Asset#typeReference() typeReference}
   *    .condition(String) // optional {@link Contract_Asset#condition() condition}
   *    .relationship(com.fhir.types.fhir.Coding) // optional {@link Contract_Asset#relationship() relationship}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Contract_Asset#extension() extension}
   *    .securityLabelNumber(List&amp;lt;com.fhir.types.fhir.UnsignedInt&amp;gt;) // optional {@link Contract_Asset#securityLabelNumber() securityLabelNumber}
   *    .period(List&amp;lt;com.fhir.types.fhir.Period&amp;gt;) // optional {@link Contract_Asset#period() period}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Contract_Asset#modifierExtension() modifierExtension}
   *    .periodType(List&amp;lt;com.fhir.types.fhir.CodeableConcept&amp;gt;) // optional {@link Contract_Asset#periodType() periodType}
   *    .valuedItem(List&amp;lt;com.fhir.types.fhir.Contract_ValuedItem&amp;gt;) // optional {@link Contract_Asset#valuedItem() valuedItem}
   *    .text(String) // optional {@link Contract_Asset#text() text}
   *    .subtype(List&amp;lt;com.fhir.types.fhir.CodeableConcept&amp;gt;) // optional {@link Contract_Asset#subtype() subtype}
   *    .build();
   * </pre>
   * @return A new Contract_Asset builder
   */
  public static ImmutableContract_Asset.Builder builder() {
    return new ImmutableContract_Asset.Builder();
  }

  /**
   * Builds instances of type {@link Contract_Asset Contract_Asset}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Contract_Asset", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_TYPE = 0x1L;
    private static final long OPT_BIT_USE_PERIOD = 0x2L;
    private static final long OPT_BIT_ANSWER = 0x4L;
    private static final long OPT_BIT_SCOPE = 0x8L;
    private static final long OPT_BIT_LINK_ID = 0x10L;
    private static final long OPT_BIT_CONTEXT = 0x20L;
    private static final long OPT_BIT_ID = 0x40L;
    private static final long OPT_BIT_TYPE_REFERENCE = 0x80L;
    private static final long OPT_BIT_CONDITION = 0x100L;
    private static final long OPT_BIT_RELATIONSHIP = 0x200L;
    private static final long OPT_BIT_EXTENSION = 0x400L;
    private static final long OPT_BIT_SECURITY_LABEL_NUMBER = 0x800L;
    private static final long OPT_BIT_PERIOD = 0x1000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x2000L;
    private static final long OPT_BIT_PERIOD_TYPE = 0x4000L;
    private static final long OPT_BIT_VALUED_ITEM = 0x8000L;
    private static final long OPT_BIT_TEXT = 0x10000L;
    private static final long OPT_BIT_SUBTYPE = 0x20000L;
    private long optBits;

    private @Nullable List<CodeableConcept> type;
    private @Nullable List<Period> usePeriod;
    private @Nullable List<Contract_Answer> answer;
    private @Nullable CodeableConcept scope;
    private @Nullable List<String> linkId;
    private @Nullable List<Contract_Context> context;
    private @Nullable String id;
    private @Nullable List<Reference> typeReference;
    private @Nullable String condition;
    private @Nullable Coding relationship;
    private @Nullable List<Extension> extension;
    private @Nullable List<UnsignedInt> securityLabelNumber;
    private @Nullable List<Period> period;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable List<CodeableConcept> periodType;
    private @Nullable List<Contract_ValuedItem> valuedItem;
    private @Nullable String text;
    private @Nullable List<CodeableConcept> subtype;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Contract_Asset#type() type} to type.
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
     * Initializes the optional value {@link Contract_Asset#type() type} to type.
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
     * Initializes the optional value {@link Contract_Asset#usePeriod() usePeriod} to usePeriod.
     * @param usePeriod The value for usePeriod
     * @return {@code this} builder for chained invocation
     */
    public final Builder usePeriod(List<Period> usePeriod) {
      checkNotIsSet(usePeriodIsSet(), "usePeriod");
      this.usePeriod = Objects.requireNonNull(usePeriod, "usePeriod");
      optBits |= OPT_BIT_USE_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_Asset#usePeriod() usePeriod} to usePeriod.
     * @param usePeriod The value for usePeriod
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("usePeriod")
    public final Builder usePeriod(Optional<? extends List<Period>> usePeriod) {
      checkNotIsSet(usePeriodIsSet(), "usePeriod");
      this.usePeriod = usePeriod.orElse(null);
      optBits |= OPT_BIT_USE_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_Asset#answer() answer} to answer.
     * @param answer The value for answer
     * @return {@code this} builder for chained invocation
     */
    public final Builder answer(List<Contract_Answer> answer) {
      checkNotIsSet(answerIsSet(), "answer");
      this.answer = Objects.requireNonNull(answer, "answer");
      optBits |= OPT_BIT_ANSWER;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_Asset#answer() answer} to answer.
     * @param answer The value for answer
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("answer")
    public final Builder answer(Optional<? extends List<Contract_Answer>> answer) {
      checkNotIsSet(answerIsSet(), "answer");
      this.answer = answer.orElse(null);
      optBits |= OPT_BIT_ANSWER;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_Asset#scope() scope} to scope.
     * @param scope The value for scope
     * @return {@code this} builder for chained invocation
     */
    public final Builder scope(CodeableConcept scope) {
      checkNotIsSet(scopeIsSet(), "scope");
      this.scope = Objects.requireNonNull(scope, "scope");
      optBits |= OPT_BIT_SCOPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_Asset#scope() scope} to scope.
     * @param scope The value for scope
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("scope")
    public final Builder scope(Optional<? extends CodeableConcept> scope) {
      checkNotIsSet(scopeIsSet(), "scope");
      this.scope = scope.orElse(null);
      optBits |= OPT_BIT_SCOPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_Asset#linkId() linkId} to linkId.
     * @param linkId The value for linkId
     * @return {@code this} builder for chained invocation
     */
    public final Builder linkId(List<String> linkId) {
      checkNotIsSet(linkIdIsSet(), "linkId");
      this.linkId = Objects.requireNonNull(linkId, "linkId");
      optBits |= OPT_BIT_LINK_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_Asset#linkId() linkId} to linkId.
     * @param linkId The value for linkId
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("linkId")
    public final Builder linkId(Optional<? extends List<String>> linkId) {
      checkNotIsSet(linkIdIsSet(), "linkId");
      this.linkId = linkId.orElse(null);
      optBits |= OPT_BIT_LINK_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_Asset#context() context} to context.
     * @param context The value for context
     * @return {@code this} builder for chained invocation
     */
    public final Builder context(List<Contract_Context> context) {
      checkNotIsSet(contextIsSet(), "context");
      this.context = Objects.requireNonNull(context, "context");
      optBits |= OPT_BIT_CONTEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_Asset#context() context} to context.
     * @param context The value for context
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("context")
    public final Builder context(Optional<? extends List<Contract_Context>> context) {
      checkNotIsSet(contextIsSet(), "context");
      this.context = context.orElse(null);
      optBits |= OPT_BIT_CONTEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_Asset#id() id} to id.
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
     * Initializes the optional value {@link Contract_Asset#id() id} to id.
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
     * Initializes the optional value {@link Contract_Asset#typeReference() typeReference} to typeReference.
     * @param typeReference The value for typeReference
     * @return {@code this} builder for chained invocation
     */
    public final Builder typeReference(List<Reference> typeReference) {
      checkNotIsSet(typeReferenceIsSet(), "typeReference");
      this.typeReference = Objects.requireNonNull(typeReference, "typeReference");
      optBits |= OPT_BIT_TYPE_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_Asset#typeReference() typeReference} to typeReference.
     * @param typeReference The value for typeReference
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("typeReference")
    public final Builder typeReference(Optional<? extends List<Reference>> typeReference) {
      checkNotIsSet(typeReferenceIsSet(), "typeReference");
      this.typeReference = typeReference.orElse(null);
      optBits |= OPT_BIT_TYPE_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_Asset#condition() condition} to condition.
     * @param condition The value for condition
     * @return {@code this} builder for chained invocation
     */
    public final Builder condition(String condition) {
      checkNotIsSet(conditionIsSet(), "condition");
      this.condition = Objects.requireNonNull(condition, "condition");
      optBits |= OPT_BIT_CONDITION;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_Asset#condition() condition} to condition.
     * @param condition The value for condition
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("condition")
    public final Builder condition(Optional<String> condition) {
      checkNotIsSet(conditionIsSet(), "condition");
      this.condition = condition.orElse(null);
      optBits |= OPT_BIT_CONDITION;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_Asset#relationship() relationship} to relationship.
     * @param relationship The value for relationship
     * @return {@code this} builder for chained invocation
     */
    public final Builder relationship(Coding relationship) {
      checkNotIsSet(relationshipIsSet(), "relationship");
      this.relationship = Objects.requireNonNull(relationship, "relationship");
      optBits |= OPT_BIT_RELATIONSHIP;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_Asset#relationship() relationship} to relationship.
     * @param relationship The value for relationship
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("relationship")
    public final Builder relationship(Optional<? extends Coding> relationship) {
      checkNotIsSet(relationshipIsSet(), "relationship");
      this.relationship = relationship.orElse(null);
      optBits |= OPT_BIT_RELATIONSHIP;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_Asset#extension() extension} to extension.
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
     * Initializes the optional value {@link Contract_Asset#extension() extension} to extension.
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
     * Initializes the optional value {@link Contract_Asset#securityLabelNumber() securityLabelNumber} to securityLabelNumber.
     * @param securityLabelNumber The value for securityLabelNumber
     * @return {@code this} builder for chained invocation
     */
    public final Builder securityLabelNumber(List<UnsignedInt> securityLabelNumber) {
      checkNotIsSet(securityLabelNumberIsSet(), "securityLabelNumber");
      this.securityLabelNumber = Objects.requireNonNull(securityLabelNumber, "securityLabelNumber");
      optBits |= OPT_BIT_SECURITY_LABEL_NUMBER;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_Asset#securityLabelNumber() securityLabelNumber} to securityLabelNumber.
     * @param securityLabelNumber The value for securityLabelNumber
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("securityLabelNumber")
    public final Builder securityLabelNumber(Optional<? extends List<UnsignedInt>> securityLabelNumber) {
      checkNotIsSet(securityLabelNumberIsSet(), "securityLabelNumber");
      this.securityLabelNumber = securityLabelNumber.orElse(null);
      optBits |= OPT_BIT_SECURITY_LABEL_NUMBER;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_Asset#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for chained invocation
     */
    public final Builder period(List<Period> period) {
      checkNotIsSet(periodIsSet(), "period");
      this.period = Objects.requireNonNull(period, "period");
      optBits |= OPT_BIT_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_Asset#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("period")
    public final Builder period(Optional<? extends List<Period>> period) {
      checkNotIsSet(periodIsSet(), "period");
      this.period = period.orElse(null);
      optBits |= OPT_BIT_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_Asset#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Contract_Asset#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Contract_Asset#periodType() periodType} to periodType.
     * @param periodType The value for periodType
     * @return {@code this} builder for chained invocation
     */
    public final Builder periodType(List<CodeableConcept> periodType) {
      checkNotIsSet(periodTypeIsSet(), "periodType");
      this.periodType = Objects.requireNonNull(periodType, "periodType");
      optBits |= OPT_BIT_PERIOD_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_Asset#periodType() periodType} to periodType.
     * @param periodType The value for periodType
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("periodType")
    public final Builder periodType(Optional<? extends List<CodeableConcept>> periodType) {
      checkNotIsSet(periodTypeIsSet(), "periodType");
      this.periodType = periodType.orElse(null);
      optBits |= OPT_BIT_PERIOD_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_Asset#valuedItem() valuedItem} to valuedItem.
     * @param valuedItem The value for valuedItem
     * @return {@code this} builder for chained invocation
     */
    public final Builder valuedItem(List<Contract_ValuedItem> valuedItem) {
      checkNotIsSet(valuedItemIsSet(), "valuedItem");
      this.valuedItem = Objects.requireNonNull(valuedItem, "valuedItem");
      optBits |= OPT_BIT_VALUED_ITEM;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_Asset#valuedItem() valuedItem} to valuedItem.
     * @param valuedItem The value for valuedItem
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valuedItem")
    public final Builder valuedItem(Optional<? extends List<Contract_ValuedItem>> valuedItem) {
      checkNotIsSet(valuedItemIsSet(), "valuedItem");
      this.valuedItem = valuedItem.orElse(null);
      optBits |= OPT_BIT_VALUED_ITEM;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_Asset#text() text} to text.
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
     * Initializes the optional value {@link Contract_Asset#text() text} to text.
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
     * Initializes the optional value {@link Contract_Asset#subtype() subtype} to subtype.
     * @param subtype The value for subtype
     * @return {@code this} builder for chained invocation
     */
    public final Builder subtype(List<CodeableConcept> subtype) {
      checkNotIsSet(subtypeIsSet(), "subtype");
      this.subtype = Objects.requireNonNull(subtype, "subtype");
      optBits |= OPT_BIT_SUBTYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_Asset#subtype() subtype} to subtype.
     * @param subtype The value for subtype
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("subtype")
    public final Builder subtype(Optional<? extends List<CodeableConcept>> subtype) {
      checkNotIsSet(subtypeIsSet(), "subtype");
      this.subtype = subtype.orElse(null);
      optBits |= OPT_BIT_SUBTYPE;
      return this;
    }

    /**
     * Builds a new {@link Contract_Asset Contract_Asset}.
     * @return An immutable instance of Contract_Asset
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Contract_Asset build() {
      return new ImmutableContract_Asset(
          type,
          usePeriod,
          answer,
          scope,
          linkId,
          context,
          id,
          typeReference,
          condition,
          relationship,
          extension,
          securityLabelNumber,
          period,
          modifierExtension,
          periodType,
          valuedItem,
          text,
          subtype);
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean usePeriodIsSet() {
      return (optBits & OPT_BIT_USE_PERIOD) != 0;
    }

    private boolean answerIsSet() {
      return (optBits & OPT_BIT_ANSWER) != 0;
    }

    private boolean scopeIsSet() {
      return (optBits & OPT_BIT_SCOPE) != 0;
    }

    private boolean linkIdIsSet() {
      return (optBits & OPT_BIT_LINK_ID) != 0;
    }

    private boolean contextIsSet() {
      return (optBits & OPT_BIT_CONTEXT) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean typeReferenceIsSet() {
      return (optBits & OPT_BIT_TYPE_REFERENCE) != 0;
    }

    private boolean conditionIsSet() {
      return (optBits & OPT_BIT_CONDITION) != 0;
    }

    private boolean relationshipIsSet() {
      return (optBits & OPT_BIT_RELATIONSHIP) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean securityLabelNumberIsSet() {
      return (optBits & OPT_BIT_SECURITY_LABEL_NUMBER) != 0;
    }

    private boolean periodIsSet() {
      return (optBits & OPT_BIT_PERIOD) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean periodTypeIsSet() {
      return (optBits & OPT_BIT_PERIOD_TYPE) != 0;
    }

    private boolean valuedItemIsSet() {
      return (optBits & OPT_BIT_VALUED_ITEM) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean subtypeIsSet() {
      return (optBits & OPT_BIT_SUBTYPE) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Contract_Asset is strict, attribute is already set: ".concat(name));
    }
  }
}
