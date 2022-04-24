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
 * Immutable implementation of {@link Contract_Offer}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableContract_Offer.builder()}.
 */
@Generated(from = "Contract_Offer", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableContract_Offer implements Contract_Offer {
  private final @Nullable List<CodeableConcept> decisionMode;
  private final @Nullable List<Identifier> identifier;
  private final @Nullable List<String> linkId;
  private final @Nullable Reference topic;
  private final @Nullable String text;
  private final @Nullable List<Contract_Party> party;
  private final @Nullable CodeableConcept type;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable CodeableConcept decision;
  private final @Nullable String id;
  private final @Nullable List<Contract_Answer> answer;
  private final @Nullable List<com.fhir.unsignedInt> securityLabelNumber;
  private final @Nullable List<Extension> extension;

  private ImmutableContract_Offer(
      @Nullable List<CodeableConcept> decisionMode,
      @Nullable List<Identifier> identifier,
      @Nullable List<String> linkId,
      @Nullable Reference topic,
      @Nullable String text,
      @Nullable List<Contract_Party> party,
      @Nullable CodeableConcept type,
      @Nullable List<Extension> modifierExtension,
      @Nullable CodeableConcept decision,
      @Nullable String id,
      @Nullable List<Contract_Answer> answer,
      @Nullable List<com.fhir.unsignedInt> securityLabelNumber,
      @Nullable List<Extension> extension) {
    this.decisionMode = decisionMode;
    this.identifier = identifier;
    this.linkId = linkId;
    this.topic = topic;
    this.text = text;
    this.party = party;
    this.type = type;
    this.modifierExtension = modifierExtension;
    this.decision = decision;
    this.id = id;
    this.answer = answer;
    this.securityLabelNumber = securityLabelNumber;
    this.extension = extension;
  }

  /**
   * @return The value of the {@code decisionMode} attribute
   */
  @JsonProperty("decisionMode")
  @Override
  public Optional<List<CodeableConcept>> decisionMode() {
    return Optional.ofNullable(decisionMode);
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
   * @return The value of the {@code linkId} attribute
   */
  @JsonProperty("linkId")
  @Override
  public Optional<List<String>> linkId() {
    return Optional.ofNullable(linkId);
  }

  /**
   * @return The value of the {@code topic} attribute
   */
  @JsonProperty("topic")
  @Override
  public Optional<Reference> topic() {
    return Optional.ofNullable(topic);
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
   * @return The value of the {@code party} attribute
   */
  @JsonProperty("party")
  @Override
  public Optional<List<Contract_Party>> party() {
    return Optional.ofNullable(party);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code decision} attribute
   */
  @JsonProperty("decision")
  @Override
  public Optional<CodeableConcept> decision() {
    return Optional.ofNullable(decision);
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
   * @return The value of the {@code answer} attribute
   */
  @JsonProperty("answer")
  @Override
  public Optional<List<Contract_Answer>> answer() {
    return Optional.ofNullable(answer);
  }

  /**
   * @return The value of the {@code securityLabelNumber} attribute
   */
  @JsonProperty("securityLabelNumber")
  @Override
  public Optional<List<com.fhir.unsignedInt>> securityLabelNumber() {
    return Optional.ofNullable(securityLabelNumber);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_Offer#decisionMode() decisionMode} attribute.
   * @param value The value for decisionMode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Offer withDecisionMode(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "decisionMode");
    if (this.decisionMode == newValue) return this;
    return new ImmutableContract_Offer(
        newValue,
        this.identifier,
        this.linkId,
        this.topic,
        this.text,
        this.party,
        this.type,
        this.modifierExtension,
        this.decision,
        this.id,
        this.answer,
        this.securityLabelNumber,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_Offer#decisionMode() decisionMode} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for decisionMode
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_Offer withDecisionMode(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.decisionMode == value) return this;
    return new ImmutableContract_Offer(
        value,
        this.identifier,
        this.linkId,
        this.topic,
        this.text,
        this.party,
        this.type,
        this.modifierExtension,
        this.decision,
        this.id,
        this.answer,
        this.securityLabelNumber,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_Offer#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Offer withIdentifier(List<Identifier> value) {
    @Nullable List<Identifier> newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableContract_Offer(
        this.decisionMode,
        newValue,
        this.linkId,
        this.topic,
        this.text,
        this.party,
        this.type,
        this.modifierExtension,
        this.decision,
        this.id,
        this.answer,
        this.securityLabelNumber,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_Offer#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_Offer withIdentifier(Optional<? extends List<Identifier>> optional) {
    @Nullable List<Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableContract_Offer(
        this.decisionMode,
        value,
        this.linkId,
        this.topic,
        this.text,
        this.party,
        this.type,
        this.modifierExtension,
        this.decision,
        this.id,
        this.answer,
        this.securityLabelNumber,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_Offer#linkId() linkId} attribute.
   * @param value The value for linkId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Offer withLinkId(List<String> value) {
    @Nullable List<String> newValue = Objects.requireNonNull(value, "linkId");
    if (this.linkId == newValue) return this;
    return new ImmutableContract_Offer(
        this.decisionMode,
        this.identifier,
        newValue,
        this.topic,
        this.text,
        this.party,
        this.type,
        this.modifierExtension,
        this.decision,
        this.id,
        this.answer,
        this.securityLabelNumber,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_Offer#linkId() linkId} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for linkId
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_Offer withLinkId(Optional<? extends List<String>> optional) {
    @Nullable List<String> value = optional.orElse(null);
    if (this.linkId == value) return this;
    return new ImmutableContract_Offer(
        this.decisionMode,
        this.identifier,
        value,
        this.topic,
        this.text,
        this.party,
        this.type,
        this.modifierExtension,
        this.decision,
        this.id,
        this.answer,
        this.securityLabelNumber,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_Offer#topic() topic} attribute.
   * @param value The value for topic
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Offer withTopic(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "topic");
    if (this.topic == newValue) return this;
    return new ImmutableContract_Offer(
        this.decisionMode,
        this.identifier,
        this.linkId,
        newValue,
        this.text,
        this.party,
        this.type,
        this.modifierExtension,
        this.decision,
        this.id,
        this.answer,
        this.securityLabelNumber,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_Offer#topic() topic} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for topic
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_Offer withTopic(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.topic == value) return this;
    return new ImmutableContract_Offer(
        this.decisionMode,
        this.identifier,
        this.linkId,
        value,
        this.text,
        this.party,
        this.type,
        this.modifierExtension,
        this.decision,
        this.id,
        this.answer,
        this.securityLabelNumber,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_Offer#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Offer withText(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "text");
    if (Objects.equals(this.text, newValue)) return this;
    return new ImmutableContract_Offer(
        this.decisionMode,
        this.identifier,
        this.linkId,
        this.topic,
        newValue,
        this.party,
        this.type,
        this.modifierExtension,
        this.decision,
        this.id,
        this.answer,
        this.securityLabelNumber,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_Offer#text() text} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Offer withText(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.text, value)) return this;
    return new ImmutableContract_Offer(
        this.decisionMode,
        this.identifier,
        this.linkId,
        this.topic,
        value,
        this.party,
        this.type,
        this.modifierExtension,
        this.decision,
        this.id,
        this.answer,
        this.securityLabelNumber,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_Offer#party() party} attribute.
   * @param value The value for party
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Offer withParty(List<Contract_Party> value) {
    @Nullable List<Contract_Party> newValue = Objects.requireNonNull(value, "party");
    if (this.party == newValue) return this;
    return new ImmutableContract_Offer(
        this.decisionMode,
        this.identifier,
        this.linkId,
        this.topic,
        this.text,
        newValue,
        this.type,
        this.modifierExtension,
        this.decision,
        this.id,
        this.answer,
        this.securityLabelNumber,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_Offer#party() party} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for party
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_Offer withParty(Optional<? extends List<Contract_Party>> optional) {
    @Nullable List<Contract_Party> value = optional.orElse(null);
    if (this.party == value) return this;
    return new ImmutableContract_Offer(
        this.decisionMode,
        this.identifier,
        this.linkId,
        this.topic,
        this.text,
        value,
        this.type,
        this.modifierExtension,
        this.decision,
        this.id,
        this.answer,
        this.securityLabelNumber,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_Offer#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Offer withType(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableContract_Offer(
        this.decisionMode,
        this.identifier,
        this.linkId,
        this.topic,
        this.text,
        this.party,
        newValue,
        this.modifierExtension,
        this.decision,
        this.id,
        this.answer,
        this.securityLabelNumber,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_Offer#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_Offer withType(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableContract_Offer(
        this.decisionMode,
        this.identifier,
        this.linkId,
        this.topic,
        this.text,
        this.party,
        value,
        this.modifierExtension,
        this.decision,
        this.id,
        this.answer,
        this.securityLabelNumber,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_Offer#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Offer withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableContract_Offer(
        this.decisionMode,
        this.identifier,
        this.linkId,
        this.topic,
        this.text,
        this.party,
        this.type,
        newValue,
        this.decision,
        this.id,
        this.answer,
        this.securityLabelNumber,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_Offer#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_Offer withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableContract_Offer(
        this.decisionMode,
        this.identifier,
        this.linkId,
        this.topic,
        this.text,
        this.party,
        this.type,
        value,
        this.decision,
        this.id,
        this.answer,
        this.securityLabelNumber,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_Offer#decision() decision} attribute.
   * @param value The value for decision
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Offer withDecision(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "decision");
    if (this.decision == newValue) return this;
    return new ImmutableContract_Offer(
        this.decisionMode,
        this.identifier,
        this.linkId,
        this.topic,
        this.text,
        this.party,
        this.type,
        this.modifierExtension,
        newValue,
        this.id,
        this.answer,
        this.securityLabelNumber,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_Offer#decision() decision} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for decision
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_Offer withDecision(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.decision == value) return this;
    return new ImmutableContract_Offer(
        this.decisionMode,
        this.identifier,
        this.linkId,
        this.topic,
        this.text,
        this.party,
        this.type,
        this.modifierExtension,
        value,
        this.id,
        this.answer,
        this.securityLabelNumber,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_Offer#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Offer withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableContract_Offer(
        this.decisionMode,
        this.identifier,
        this.linkId,
        this.topic,
        this.text,
        this.party,
        this.type,
        this.modifierExtension,
        this.decision,
        newValue,
        this.answer,
        this.securityLabelNumber,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_Offer#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Offer withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableContract_Offer(
        this.decisionMode,
        this.identifier,
        this.linkId,
        this.topic,
        this.text,
        this.party,
        this.type,
        this.modifierExtension,
        this.decision,
        value,
        this.answer,
        this.securityLabelNumber,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_Offer#answer() answer} attribute.
   * @param value The value for answer
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Offer withAnswer(List<Contract_Answer> value) {
    @Nullable List<Contract_Answer> newValue = Objects.requireNonNull(value, "answer");
    if (this.answer == newValue) return this;
    return new ImmutableContract_Offer(
        this.decisionMode,
        this.identifier,
        this.linkId,
        this.topic,
        this.text,
        this.party,
        this.type,
        this.modifierExtension,
        this.decision,
        this.id,
        newValue,
        this.securityLabelNumber,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_Offer#answer() answer} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for answer
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_Offer withAnswer(Optional<? extends List<Contract_Answer>> optional) {
    @Nullable List<Contract_Answer> value = optional.orElse(null);
    if (this.answer == value) return this;
    return new ImmutableContract_Offer(
        this.decisionMode,
        this.identifier,
        this.linkId,
        this.topic,
        this.text,
        this.party,
        this.type,
        this.modifierExtension,
        this.decision,
        this.id,
        value,
        this.securityLabelNumber,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_Offer#securityLabelNumber() securityLabelNumber} attribute.
   * @param value The value for securityLabelNumber
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Offer withSecurityLabelNumber(List<com.fhir.unsignedInt> value) {
    @Nullable List<com.fhir.unsignedInt> newValue = Objects.requireNonNull(value, "securityLabelNumber");
    if (this.securityLabelNumber == newValue) return this;
    return new ImmutableContract_Offer(
        this.decisionMode,
        this.identifier,
        this.linkId,
        this.topic,
        this.text,
        this.party,
        this.type,
        this.modifierExtension,
        this.decision,
        this.id,
        this.answer,
        newValue,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_Offer#securityLabelNumber() securityLabelNumber} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for securityLabelNumber
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_Offer withSecurityLabelNumber(Optional<? extends List<com.fhir.unsignedInt>> optional) {
    @Nullable List<com.fhir.unsignedInt> value = optional.orElse(null);
    if (this.securityLabelNumber == value) return this;
    return new ImmutableContract_Offer(
        this.decisionMode,
        this.identifier,
        this.linkId,
        this.topic,
        this.text,
        this.party,
        this.type,
        this.modifierExtension,
        this.decision,
        this.id,
        this.answer,
        value,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_Offer#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Offer withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableContract_Offer(
        this.decisionMode,
        this.identifier,
        this.linkId,
        this.topic,
        this.text,
        this.party,
        this.type,
        this.modifierExtension,
        this.decision,
        this.id,
        this.answer,
        this.securityLabelNumber,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_Offer#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_Offer withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableContract_Offer(
        this.decisionMode,
        this.identifier,
        this.linkId,
        this.topic,
        this.text,
        this.party,
        this.type,
        this.modifierExtension,
        this.decision,
        this.id,
        this.answer,
        this.securityLabelNumber,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableContract_Offer} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableContract_Offer
        && equalTo((ImmutableContract_Offer) another);
  }

  private boolean equalTo(ImmutableContract_Offer another) {
    return Objects.equals(decisionMode, another.decisionMode)
        && Objects.equals(identifier, another.identifier)
        && Objects.equals(linkId, another.linkId)
        && Objects.equals(topic, another.topic)
        && Objects.equals(text, another.text)
        && Objects.equals(party, another.party)
        && Objects.equals(type, another.type)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(decision, another.decision)
        && Objects.equals(id, another.id)
        && Objects.equals(answer, another.answer)
        && Objects.equals(securityLabelNumber, another.securityLabelNumber)
        && Objects.equals(extension, another.extension);
  }

  /**
   * Computes a hash code from attributes: {@code decisionMode}, {@code identifier}, {@code linkId}, {@code topic}, {@code text}, {@code party}, {@code type}, {@code modifierExtension}, {@code decision}, {@code id}, {@code answer}, {@code securityLabelNumber}, {@code extension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(decisionMode);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(linkId);
    h += (h << 5) + Objects.hashCode(topic);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(party);
    h += (h << 5) + Objects.hashCode(type);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(decision);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(answer);
    h += (h << 5) + Objects.hashCode(securityLabelNumber);
    h += (h << 5) + Objects.hashCode(extension);
    return h;
  }

  /**
   * Prints the immutable value {@code Contract_Offer} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Contract_Offer{");
    if (decisionMode != null) {
      builder.append("decisionMode=").append(decisionMode);
    }
    if (identifier != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (linkId != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("linkId=").append(linkId);
    }
    if (topic != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("topic=").append(topic);
    }
    if (text != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (party != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("party=").append(party);
    }
    if (type != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("type=").append(type);
    }
    if (modifierExtension != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (decision != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("decision=").append(decision);
    }
    if (id != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (answer != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("answer=").append(answer);
    }
    if (securityLabelNumber != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("securityLabelNumber=").append(securityLabelNumber);
    }
    if (extension != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Contract_Offer", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Contract_Offer {
    @Nullable Optional<List<CodeableConcept>> decisionMode = Optional.empty();
    boolean decisionModeIsSet;
    @Nullable Optional<List<Identifier>> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<List<String>> linkId = Optional.empty();
    boolean linkIdIsSet;
    @Nullable Optional<Reference> topic = Optional.empty();
    boolean topicIsSet;
    @Nullable Optional<String> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<List<Contract_Party>> party = Optional.empty();
    boolean partyIsSet;
    @Nullable Optional<CodeableConcept> type = Optional.empty();
    boolean typeIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<CodeableConcept> decision = Optional.empty();
    boolean decisionIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Contract_Answer>> answer = Optional.empty();
    boolean answerIsSet;
    @Nullable Optional<List<com.fhir.unsignedInt>> securityLabelNumber = Optional.empty();
    boolean securityLabelNumberIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @JsonProperty("decisionMode")
    public void setDecisionMode(Optional<List<CodeableConcept>> decisionMode) {
      this.decisionMode = decisionMode;
      this.decisionModeIsSet = true;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<List<Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("linkId")
    public void setLinkId(Optional<List<String>> linkId) {
      this.linkId = linkId;
      this.linkIdIsSet = true;
    }
    @JsonProperty("topic")
    public void setTopic(Optional<Reference> topic) {
      this.topic = topic;
      this.topicIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<String> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("party")
    public void setParty(Optional<List<Contract_Party>> party) {
      this.party = party;
      this.partyIsSet = true;
    }
    @JsonProperty("type")
    public void setType(Optional<CodeableConcept> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("decision")
    public void setDecision(Optional<CodeableConcept> decision) {
      this.decision = decision;
      this.decisionIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("answer")
    public void setAnswer(Optional<List<Contract_Answer>> answer) {
      this.answer = answer;
      this.answerIsSet = true;
    }
    @JsonProperty("securityLabelNumber")
    public void setSecurityLabelNumber(Optional<List<com.fhir.unsignedInt>> securityLabelNumber) {
      this.securityLabelNumber = securityLabelNumber;
      this.securityLabelNumberIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @Override
    public Optional<List<CodeableConcept>> decisionMode() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<String>> linkId() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> topic() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Contract_Party>> party() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> decision() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Contract_Answer>> answer() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<com.fhir.unsignedInt>> securityLabelNumber() { throw new UnsupportedOperationException(); }
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
  static ImmutableContract_Offer fromJson(Json json) {
    ImmutableContract_Offer.Builder builder = ImmutableContract_Offer.builder();
    if (json.decisionModeIsSet) {
      builder.decisionMode(json.decisionMode);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.linkIdIsSet) {
      builder.linkId(json.linkId);
    }
    if (json.topicIsSet) {
      builder.topic(json.topic);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.partyIsSet) {
      builder.party(json.party);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.decisionIsSet) {
      builder.decision(json.decision);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.answerIsSet) {
      builder.answer(json.answer);
    }
    if (json.securityLabelNumberIsSet) {
      builder.securityLabelNumber(json.securityLabelNumber);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    return (ImmutableContract_Offer) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Contract_Offer} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Contract_Offer instance
   */
  public static Contract_Offer copyOf(Contract_Offer instance) {
    if (instance instanceof ImmutableContract_Offer) {
      return (ImmutableContract_Offer) instance;
    }
    return ImmutableContract_Offer.builder()
        .decisionMode(instance.decisionMode())
        .identifier(instance.identifier())
        .linkId(instance.linkId())
        .topic(instance.topic())
        .text(instance.text())
        .party(instance.party())
        .type(instance.type())
        .modifierExtension(instance.modifierExtension())
        .decision(instance.decision())
        .id(instance.id())
        .answer(instance.answer())
        .securityLabelNumber(instance.securityLabelNumber())
        .extension(instance.extension())
        .build();
  }

  /**
   * Creates a builder for {@link Contract_Offer Contract_Offer}.
   * <pre>
   * ImmutableContract_Offer.builder()
   *    .decisionMode(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link Contract_Offer#decisionMode() decisionMode}
   *    .identifier(List&amp;lt;com.fhir.Identifier&amp;gt;) // optional {@link Contract_Offer#identifier() identifier}
   *    .linkId(List&amp;lt;String&amp;gt;) // optional {@link Contract_Offer#linkId() linkId}
   *    .topic(com.fhir.Reference) // optional {@link Contract_Offer#topic() topic}
   *    .text(String) // optional {@link Contract_Offer#text() text}
   *    .party(List&amp;lt;com.fhir.Contract_Party&amp;gt;) // optional {@link Contract_Offer#party() party}
   *    .type(com.fhir.CodeableConcept) // optional {@link Contract_Offer#type() type}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Contract_Offer#modifierExtension() modifierExtension}
   *    .decision(com.fhir.CodeableConcept) // optional {@link Contract_Offer#decision() decision}
   *    .id(String) // optional {@link Contract_Offer#id() id}
   *    .answer(List&amp;lt;com.fhir.Contract_Answer&amp;gt;) // optional {@link Contract_Offer#answer() answer}
   *    .securityLabelNumber(List&amp;lt;com.fhir.unsignedInt&amp;gt;) // optional {@link Contract_Offer#securityLabelNumber() securityLabelNumber}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Contract_Offer#extension() extension}
   *    .build();
   * </pre>
   * @return A new Contract_Offer builder
   */
  public static ImmutableContract_Offer.Builder builder() {
    return new ImmutableContract_Offer.Builder();
  }

  /**
   * Builds instances of type {@link Contract_Offer Contract_Offer}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Contract_Offer", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_DECISION_MODE = 0x1L;
    private static final long OPT_BIT_IDENTIFIER = 0x2L;
    private static final long OPT_BIT_LINK_ID = 0x4L;
    private static final long OPT_BIT_TOPIC = 0x8L;
    private static final long OPT_BIT_TEXT = 0x10L;
    private static final long OPT_BIT_PARTY = 0x20L;
    private static final long OPT_BIT_TYPE = 0x40L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x80L;
    private static final long OPT_BIT_DECISION = 0x100L;
    private static final long OPT_BIT_ID = 0x200L;
    private static final long OPT_BIT_ANSWER = 0x400L;
    private static final long OPT_BIT_SECURITY_LABEL_NUMBER = 0x800L;
    private static final long OPT_BIT_EXTENSION = 0x1000L;
    private long optBits;

    private @Nullable List<CodeableConcept> decisionMode;
    private @Nullable List<Identifier> identifier;
    private @Nullable List<String> linkId;
    private @Nullable Reference topic;
    private @Nullable String text;
    private @Nullable List<Contract_Party> party;
    private @Nullable CodeableConcept type;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable CodeableConcept decision;
    private @Nullable String id;
    private @Nullable List<Contract_Answer> answer;
    private @Nullable List<com.fhir.unsignedInt> securityLabelNumber;
    private @Nullable List<Extension> extension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Contract_Offer#decisionMode() decisionMode} to decisionMode.
     * @param decisionMode The value for decisionMode
     * @return {@code this} builder for chained invocation
     */
    public final Builder decisionMode(List<CodeableConcept> decisionMode) {
      checkNotIsSet(decisionModeIsSet(), "decisionMode");
      this.decisionMode = Objects.requireNonNull(decisionMode, "decisionMode");
      optBits |= OPT_BIT_DECISION_MODE;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_Offer#decisionMode() decisionMode} to decisionMode.
     * @param decisionMode The value for decisionMode
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("decisionMode")
    public final Builder decisionMode(Optional<? extends List<CodeableConcept>> decisionMode) {
      checkNotIsSet(decisionModeIsSet(), "decisionMode");
      this.decisionMode = decisionMode.orElse(null);
      optBits |= OPT_BIT_DECISION_MODE;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_Offer#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Contract_Offer#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Contract_Offer#linkId() linkId} to linkId.
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
     * Initializes the optional value {@link Contract_Offer#linkId() linkId} to linkId.
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
     * Initializes the optional value {@link Contract_Offer#topic() topic} to topic.
     * @param topic The value for topic
     * @return {@code this} builder for chained invocation
     */
    public final Builder topic(Reference topic) {
      checkNotIsSet(topicIsSet(), "topic");
      this.topic = Objects.requireNonNull(topic, "topic");
      optBits |= OPT_BIT_TOPIC;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_Offer#topic() topic} to topic.
     * @param topic The value for topic
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("topic")
    public final Builder topic(Optional<? extends Reference> topic) {
      checkNotIsSet(topicIsSet(), "topic");
      this.topic = topic.orElse(null);
      optBits |= OPT_BIT_TOPIC;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_Offer#text() text} to text.
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
     * Initializes the optional value {@link Contract_Offer#text() text} to text.
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
     * Initializes the optional value {@link Contract_Offer#party() party} to party.
     * @param party The value for party
     * @return {@code this} builder for chained invocation
     */
    public final Builder party(List<Contract_Party> party) {
      checkNotIsSet(partyIsSet(), "party");
      this.party = Objects.requireNonNull(party, "party");
      optBits |= OPT_BIT_PARTY;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_Offer#party() party} to party.
     * @param party The value for party
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("party")
    public final Builder party(Optional<? extends List<Contract_Party>> party) {
      checkNotIsSet(partyIsSet(), "party");
      this.party = party.orElse(null);
      optBits |= OPT_BIT_PARTY;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_Offer#type() type} to type.
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
     * Initializes the optional value {@link Contract_Offer#type() type} to type.
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
     * Initializes the optional value {@link Contract_Offer#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Contract_Offer#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Contract_Offer#decision() decision} to decision.
     * @param decision The value for decision
     * @return {@code this} builder for chained invocation
     */
    public final Builder decision(CodeableConcept decision) {
      checkNotIsSet(decisionIsSet(), "decision");
      this.decision = Objects.requireNonNull(decision, "decision");
      optBits |= OPT_BIT_DECISION;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_Offer#decision() decision} to decision.
     * @param decision The value for decision
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("decision")
    public final Builder decision(Optional<? extends CodeableConcept> decision) {
      checkNotIsSet(decisionIsSet(), "decision");
      this.decision = decision.orElse(null);
      optBits |= OPT_BIT_DECISION;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_Offer#id() id} to id.
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
     * Initializes the optional value {@link Contract_Offer#id() id} to id.
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
     * Initializes the optional value {@link Contract_Offer#answer() answer} to answer.
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
     * Initializes the optional value {@link Contract_Offer#answer() answer} to answer.
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
     * Initializes the optional value {@link Contract_Offer#securityLabelNumber() securityLabelNumber} to securityLabelNumber.
     * @param securityLabelNumber The value for securityLabelNumber
     * @return {@code this} builder for chained invocation
     */
    public final Builder securityLabelNumber(List<com.fhir.unsignedInt> securityLabelNumber) {
      checkNotIsSet(securityLabelNumberIsSet(), "securityLabelNumber");
      this.securityLabelNumber = Objects.requireNonNull(securityLabelNumber, "securityLabelNumber");
      optBits |= OPT_BIT_SECURITY_LABEL_NUMBER;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_Offer#securityLabelNumber() securityLabelNumber} to securityLabelNumber.
     * @param securityLabelNumber The value for securityLabelNumber
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("securityLabelNumber")
    public final Builder securityLabelNumber(Optional<? extends List<com.fhir.unsignedInt>> securityLabelNumber) {
      checkNotIsSet(securityLabelNumberIsSet(), "securityLabelNumber");
      this.securityLabelNumber = securityLabelNumber.orElse(null);
      optBits |= OPT_BIT_SECURITY_LABEL_NUMBER;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_Offer#extension() extension} to extension.
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
     * Initializes the optional value {@link Contract_Offer#extension() extension} to extension.
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
     * Builds a new {@link Contract_Offer Contract_Offer}.
     * @return An immutable instance of Contract_Offer
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Contract_Offer build() {
      return new ImmutableContract_Offer(
          decisionMode,
          identifier,
          linkId,
          topic,
          text,
          party,
          type,
          modifierExtension,
          decision,
          id,
          answer,
          securityLabelNumber,
          extension);
    }

    private boolean decisionModeIsSet() {
      return (optBits & OPT_BIT_DECISION_MODE) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean linkIdIsSet() {
      return (optBits & OPT_BIT_LINK_ID) != 0;
    }

    private boolean topicIsSet() {
      return (optBits & OPT_BIT_TOPIC) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean partyIsSet() {
      return (optBits & OPT_BIT_PARTY) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean decisionIsSet() {
      return (optBits & OPT_BIT_DECISION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean answerIsSet() {
      return (optBits & OPT_BIT_ANSWER) != 0;
    }

    private boolean securityLabelNumberIsSet() {
      return (optBits & OPT_BIT_SECURITY_LABEL_NUMBER) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Contract_Offer is strict, attribute is already set: ".concat(name));
    }
  }
}
