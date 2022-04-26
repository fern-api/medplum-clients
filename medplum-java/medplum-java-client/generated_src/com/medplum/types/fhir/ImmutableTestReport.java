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
 * Immutable implementation of {@link TestReport}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableTestReport.builder()}.
 */
@Generated(from = "TestReport", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableTestReport implements TestReport {
  private final @Nullable Code language;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable TestReport_Teardown teardown;
  private final Reference testScript;
  private final @Nullable Decimal score;
  private final @Nullable Identifier identifier;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable TestreportResult result;
  private final @Nullable List<Extension> extension;
  private final @Nullable TestreportStatus status;
  private final @Nullable List<TestReport_Participant> participant;
  private final @Nullable List<TestReport_Test> test;
  private final @Nullable Uri implicitRules;
  private final @Nullable String name;
  private final String resourceType;
  private final @Nullable Id id;
  private final @Nullable Narrative text;
  private final @Nullable TestReport_Setup setup;
  private final @Nullable Meta meta;
  private final @Nullable DateTime issued;
  private final @Nullable String tester;

  private ImmutableTestReport(
      @Nullable Code language,
      @Nullable List<Extension> modifierExtension,
      @Nullable TestReport_Teardown teardown,
      Reference testScript,
      @Nullable Decimal score,
      @Nullable Identifier identifier,
      @Nullable List<ResourceList> contained,
      @Nullable TestreportResult result,
      @Nullable List<Extension> extension,
      @Nullable TestreportStatus status,
      @Nullable List<TestReport_Participant> participant,
      @Nullable List<TestReport_Test> test,
      @Nullable Uri implicitRules,
      @Nullable String name,
      String resourceType,
      @Nullable Id id,
      @Nullable Narrative text,
      @Nullable TestReport_Setup setup,
      @Nullable Meta meta,
      @Nullable DateTime issued,
      @Nullable String tester) {
    this.language = language;
    this.modifierExtension = modifierExtension;
    this.teardown = teardown;
    this.testScript = testScript;
    this.score = score;
    this.identifier = identifier;
    this.contained = contained;
    this.result = result;
    this.extension = extension;
    this.status = status;
    this.participant = participant;
    this.test = test;
    this.implicitRules = implicitRules;
    this.name = name;
    this.resourceType = resourceType;
    this.id = id;
    this.text = text;
    this.setup = setup;
    this.meta = meta;
    this.issued = issued;
    this.tester = tester;
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code teardown} attribute
   */
  @JsonProperty("teardown")
  @Override
  public Optional<TestReport_Teardown> teardown() {
    return Optional.ofNullable(teardown);
  }

  /**
   * @return The value of the {@code testScript} attribute
   */
  @JsonProperty("testScript")
  @Override
  public Reference testScript() {
    return testScript;
  }

  /**
   * @return The value of the {@code score} attribute
   */
  @JsonProperty("score")
  @Override
  public Optional<Decimal> score() {
    return Optional.ofNullable(score);
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
   * @return The value of the {@code contained} attribute
   */
  @JsonProperty("contained")
  @Override
  public Optional<List<ResourceList>> contained() {
    return Optional.ofNullable(contained);
  }

  /**
   * @return The value of the {@code result} attribute
   */
  @JsonProperty("result")
  @Override
  public Optional<TestreportResult> result() {
    return Optional.ofNullable(result);
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
   * @return The value of the {@code status} attribute
   */
  @JsonProperty("status")
  @Override
  public Optional<TestreportStatus> status() {
    return Optional.ofNullable(status);
  }

  /**
   * @return The value of the {@code participant} attribute
   */
  @JsonProperty("participant")
  @Override
  public Optional<List<TestReport_Participant>> participant() {
    return Optional.ofNullable(participant);
  }

  /**
   * @return The value of the {@code test} attribute
   */
  @JsonProperty("test")
  @Override
  public Optional<List<TestReport_Test>> test() {
    return Optional.ofNullable(test);
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
   * @return The value of the {@code name} attribute
   */
  @JsonProperty("name")
  @Override
  public Optional<String> name() {
    return Optional.ofNullable(name);
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
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<Id> id() {
    return Optional.ofNullable(id);
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
   * @return The value of the {@code setup} attribute
   */
  @JsonProperty("setup")
  @Override
  public Optional<TestReport_Setup> setup() {
    return Optional.ofNullable(setup);
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
   * @return The value of the {@code issued} attribute
   */
  @JsonProperty("issued")
  @Override
  public Optional<DateTime> issued() {
    return Optional.ofNullable(issued);
  }

  /**
   * @return The value of the {@code tester} attribute
   */
  @JsonProperty("tester")
  @Override
  public Optional<String> tester() {
    return Optional.ofNullable(tester);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestReport#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestReport withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableTestReport(
        newValue,
        this.modifierExtension,
        this.teardown,
        this.testScript,
        this.score,
        this.identifier,
        this.contained,
        this.result,
        this.extension,
        this.status,
        this.participant,
        this.test,
        this.implicitRules,
        this.name,
        this.resourceType,
        this.id,
        this.text,
        this.setup,
        this.meta,
        this.issued,
        this.tester);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestReport#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestReport withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableTestReport(
        value,
        this.modifierExtension,
        this.teardown,
        this.testScript,
        this.score,
        this.identifier,
        this.contained,
        this.result,
        this.extension,
        this.status,
        this.participant,
        this.test,
        this.implicitRules,
        this.name,
        this.resourceType,
        this.id,
        this.text,
        this.setup,
        this.meta,
        this.issued,
        this.tester);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestReport#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestReport withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableTestReport(
        this.language,
        newValue,
        this.teardown,
        this.testScript,
        this.score,
        this.identifier,
        this.contained,
        this.result,
        this.extension,
        this.status,
        this.participant,
        this.test,
        this.implicitRules,
        this.name,
        this.resourceType,
        this.id,
        this.text,
        this.setup,
        this.meta,
        this.issued,
        this.tester);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestReport#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestReport withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableTestReport(
        this.language,
        value,
        this.teardown,
        this.testScript,
        this.score,
        this.identifier,
        this.contained,
        this.result,
        this.extension,
        this.status,
        this.participant,
        this.test,
        this.implicitRules,
        this.name,
        this.resourceType,
        this.id,
        this.text,
        this.setup,
        this.meta,
        this.issued,
        this.tester);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestReport#teardown() teardown} attribute.
   * @param value The value for teardown
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestReport withTeardown(TestReport_Teardown value) {
    @Nullable TestReport_Teardown newValue = Objects.requireNonNull(value, "teardown");
    if (this.teardown == newValue) return this;
    return new ImmutableTestReport(
        this.language,
        this.modifierExtension,
        newValue,
        this.testScript,
        this.score,
        this.identifier,
        this.contained,
        this.result,
        this.extension,
        this.status,
        this.participant,
        this.test,
        this.implicitRules,
        this.name,
        this.resourceType,
        this.id,
        this.text,
        this.setup,
        this.meta,
        this.issued,
        this.tester);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestReport#teardown() teardown} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for teardown
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestReport withTeardown(Optional<? extends TestReport_Teardown> optional) {
    @Nullable TestReport_Teardown value = optional.orElse(null);
    if (this.teardown == value) return this;
    return new ImmutableTestReport(
        this.language,
        this.modifierExtension,
        value,
        this.testScript,
        this.score,
        this.identifier,
        this.contained,
        this.result,
        this.extension,
        this.status,
        this.participant,
        this.test,
        this.implicitRules,
        this.name,
        this.resourceType,
        this.id,
        this.text,
        this.setup,
        this.meta,
        this.issued,
        this.tester);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TestReport#testScript() testScript} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for testScript
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTestReport withTestScript(Reference value) {
    if (this.testScript == value) return this;
    Reference newValue = Objects.requireNonNull(value, "testScript");
    return new ImmutableTestReport(
        this.language,
        this.modifierExtension,
        this.teardown,
        newValue,
        this.score,
        this.identifier,
        this.contained,
        this.result,
        this.extension,
        this.status,
        this.participant,
        this.test,
        this.implicitRules,
        this.name,
        this.resourceType,
        this.id,
        this.text,
        this.setup,
        this.meta,
        this.issued,
        this.tester);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestReport#score() score} attribute.
   * @param value The value for score
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestReport withScore(Decimal value) {
    @Nullable Decimal newValue = Objects.requireNonNull(value, "score");
    if (this.score == newValue) return this;
    return new ImmutableTestReport(
        this.language,
        this.modifierExtension,
        this.teardown,
        this.testScript,
        newValue,
        this.identifier,
        this.contained,
        this.result,
        this.extension,
        this.status,
        this.participant,
        this.test,
        this.implicitRules,
        this.name,
        this.resourceType,
        this.id,
        this.text,
        this.setup,
        this.meta,
        this.issued,
        this.tester);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestReport#score() score} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for score
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestReport withScore(Optional<? extends Decimal> optional) {
    @Nullable Decimal value = optional.orElse(null);
    if (this.score == value) return this;
    return new ImmutableTestReport(
        this.language,
        this.modifierExtension,
        this.teardown,
        this.testScript,
        value,
        this.identifier,
        this.contained,
        this.result,
        this.extension,
        this.status,
        this.participant,
        this.test,
        this.implicitRules,
        this.name,
        this.resourceType,
        this.id,
        this.text,
        this.setup,
        this.meta,
        this.issued,
        this.tester);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestReport#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestReport withIdentifier(Identifier value) {
    @Nullable Identifier newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableTestReport(
        this.language,
        this.modifierExtension,
        this.teardown,
        this.testScript,
        this.score,
        newValue,
        this.contained,
        this.result,
        this.extension,
        this.status,
        this.participant,
        this.test,
        this.implicitRules,
        this.name,
        this.resourceType,
        this.id,
        this.text,
        this.setup,
        this.meta,
        this.issued,
        this.tester);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestReport#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestReport withIdentifier(Optional<? extends Identifier> optional) {
    @Nullable Identifier value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableTestReport(
        this.language,
        this.modifierExtension,
        this.teardown,
        this.testScript,
        this.score,
        value,
        this.contained,
        this.result,
        this.extension,
        this.status,
        this.participant,
        this.test,
        this.implicitRules,
        this.name,
        this.resourceType,
        this.id,
        this.text,
        this.setup,
        this.meta,
        this.issued,
        this.tester);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestReport#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestReport withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableTestReport(
        this.language,
        this.modifierExtension,
        this.teardown,
        this.testScript,
        this.score,
        this.identifier,
        newValue,
        this.result,
        this.extension,
        this.status,
        this.participant,
        this.test,
        this.implicitRules,
        this.name,
        this.resourceType,
        this.id,
        this.text,
        this.setup,
        this.meta,
        this.issued,
        this.tester);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestReport#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestReport withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableTestReport(
        this.language,
        this.modifierExtension,
        this.teardown,
        this.testScript,
        this.score,
        this.identifier,
        value,
        this.result,
        this.extension,
        this.status,
        this.participant,
        this.test,
        this.implicitRules,
        this.name,
        this.resourceType,
        this.id,
        this.text,
        this.setup,
        this.meta,
        this.issued,
        this.tester);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestReport#result() result} attribute.
   * @param value The value for result
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestReport withResult(TestreportResult value) {
    @Nullable TestreportResult newValue = Objects.requireNonNull(value, "result");
    if (this.result == newValue) return this;
    return new ImmutableTestReport(
        this.language,
        this.modifierExtension,
        this.teardown,
        this.testScript,
        this.score,
        this.identifier,
        this.contained,
        newValue,
        this.extension,
        this.status,
        this.participant,
        this.test,
        this.implicitRules,
        this.name,
        this.resourceType,
        this.id,
        this.text,
        this.setup,
        this.meta,
        this.issued,
        this.tester);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestReport#result() result} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for result
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestReport withResult(Optional<? extends TestreportResult> optional) {
    @Nullable TestreportResult value = optional.orElse(null);
    if (this.result == value) return this;
    return new ImmutableTestReport(
        this.language,
        this.modifierExtension,
        this.teardown,
        this.testScript,
        this.score,
        this.identifier,
        this.contained,
        value,
        this.extension,
        this.status,
        this.participant,
        this.test,
        this.implicitRules,
        this.name,
        this.resourceType,
        this.id,
        this.text,
        this.setup,
        this.meta,
        this.issued,
        this.tester);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestReport#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestReport withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableTestReport(
        this.language,
        this.modifierExtension,
        this.teardown,
        this.testScript,
        this.score,
        this.identifier,
        this.contained,
        this.result,
        newValue,
        this.status,
        this.participant,
        this.test,
        this.implicitRules,
        this.name,
        this.resourceType,
        this.id,
        this.text,
        this.setup,
        this.meta,
        this.issued,
        this.tester);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestReport#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestReport withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableTestReport(
        this.language,
        this.modifierExtension,
        this.teardown,
        this.testScript,
        this.score,
        this.identifier,
        this.contained,
        this.result,
        value,
        this.status,
        this.participant,
        this.test,
        this.implicitRules,
        this.name,
        this.resourceType,
        this.id,
        this.text,
        this.setup,
        this.meta,
        this.issued,
        this.tester);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestReport#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestReport withStatus(TestreportStatus value) {
    @Nullable TestreportStatus newValue = Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableTestReport(
        this.language,
        this.modifierExtension,
        this.teardown,
        this.testScript,
        this.score,
        this.identifier,
        this.contained,
        this.result,
        this.extension,
        newValue,
        this.participant,
        this.test,
        this.implicitRules,
        this.name,
        this.resourceType,
        this.id,
        this.text,
        this.setup,
        this.meta,
        this.issued,
        this.tester);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestReport#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestReport withStatus(Optional<? extends TestreportStatus> optional) {
    @Nullable TestreportStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableTestReport(
        this.language,
        this.modifierExtension,
        this.teardown,
        this.testScript,
        this.score,
        this.identifier,
        this.contained,
        this.result,
        this.extension,
        value,
        this.participant,
        this.test,
        this.implicitRules,
        this.name,
        this.resourceType,
        this.id,
        this.text,
        this.setup,
        this.meta,
        this.issued,
        this.tester);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestReport#participant() participant} attribute.
   * @param value The value for participant
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestReport withParticipant(List<TestReport_Participant> value) {
    @Nullable List<TestReport_Participant> newValue = Objects.requireNonNull(value, "participant");
    if (this.participant == newValue) return this;
    return new ImmutableTestReport(
        this.language,
        this.modifierExtension,
        this.teardown,
        this.testScript,
        this.score,
        this.identifier,
        this.contained,
        this.result,
        this.extension,
        this.status,
        newValue,
        this.test,
        this.implicitRules,
        this.name,
        this.resourceType,
        this.id,
        this.text,
        this.setup,
        this.meta,
        this.issued,
        this.tester);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestReport#participant() participant} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for participant
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestReport withParticipant(Optional<? extends List<TestReport_Participant>> optional) {
    @Nullable List<TestReport_Participant> value = optional.orElse(null);
    if (this.participant == value) return this;
    return new ImmutableTestReport(
        this.language,
        this.modifierExtension,
        this.teardown,
        this.testScript,
        this.score,
        this.identifier,
        this.contained,
        this.result,
        this.extension,
        this.status,
        value,
        this.test,
        this.implicitRules,
        this.name,
        this.resourceType,
        this.id,
        this.text,
        this.setup,
        this.meta,
        this.issued,
        this.tester);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestReport#test() test} attribute.
   * @param value The value for test
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestReport withTest(List<TestReport_Test> value) {
    @Nullable List<TestReport_Test> newValue = Objects.requireNonNull(value, "test");
    if (this.test == newValue) return this;
    return new ImmutableTestReport(
        this.language,
        this.modifierExtension,
        this.teardown,
        this.testScript,
        this.score,
        this.identifier,
        this.contained,
        this.result,
        this.extension,
        this.status,
        this.participant,
        newValue,
        this.implicitRules,
        this.name,
        this.resourceType,
        this.id,
        this.text,
        this.setup,
        this.meta,
        this.issued,
        this.tester);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestReport#test() test} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for test
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestReport withTest(Optional<? extends List<TestReport_Test>> optional) {
    @Nullable List<TestReport_Test> value = optional.orElse(null);
    if (this.test == value) return this;
    return new ImmutableTestReport(
        this.language,
        this.modifierExtension,
        this.teardown,
        this.testScript,
        this.score,
        this.identifier,
        this.contained,
        this.result,
        this.extension,
        this.status,
        this.participant,
        value,
        this.implicitRules,
        this.name,
        this.resourceType,
        this.id,
        this.text,
        this.setup,
        this.meta,
        this.issued,
        this.tester);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestReport#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestReport withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableTestReport(
        this.language,
        this.modifierExtension,
        this.teardown,
        this.testScript,
        this.score,
        this.identifier,
        this.contained,
        this.result,
        this.extension,
        this.status,
        this.participant,
        this.test,
        newValue,
        this.name,
        this.resourceType,
        this.id,
        this.text,
        this.setup,
        this.meta,
        this.issued,
        this.tester);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestReport#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestReport withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableTestReport(
        this.language,
        this.modifierExtension,
        this.teardown,
        this.testScript,
        this.score,
        this.identifier,
        this.contained,
        this.result,
        this.extension,
        this.status,
        this.participant,
        this.test,
        value,
        this.name,
        this.resourceType,
        this.id,
        this.text,
        this.setup,
        this.meta,
        this.issued,
        this.tester);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestReport#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestReport withName(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "name");
    if (Objects.equals(this.name, newValue)) return this;
    return new ImmutableTestReport(
        this.language,
        this.modifierExtension,
        this.teardown,
        this.testScript,
        this.score,
        this.identifier,
        this.contained,
        this.result,
        this.extension,
        this.status,
        this.participant,
        this.test,
        this.implicitRules,
        newValue,
        this.resourceType,
        this.id,
        this.text,
        this.setup,
        this.meta,
        this.issued,
        this.tester);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestReport#name() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestReport withName(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.name, value)) return this;
    return new ImmutableTestReport(
        this.language,
        this.modifierExtension,
        this.teardown,
        this.testScript,
        this.score,
        this.identifier,
        this.contained,
        this.result,
        this.extension,
        this.status,
        this.participant,
        this.test,
        this.implicitRules,
        value,
        this.resourceType,
        this.id,
        this.text,
        this.setup,
        this.meta,
        this.issued,
        this.tester);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TestReport#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTestReport withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableTestReport(
        this.language,
        this.modifierExtension,
        this.teardown,
        this.testScript,
        this.score,
        this.identifier,
        this.contained,
        this.result,
        this.extension,
        this.status,
        this.participant,
        this.test,
        this.implicitRules,
        this.name,
        newValue,
        this.id,
        this.text,
        this.setup,
        this.meta,
        this.issued,
        this.tester);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestReport#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestReport withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableTestReport(
        this.language,
        this.modifierExtension,
        this.teardown,
        this.testScript,
        this.score,
        this.identifier,
        this.contained,
        this.result,
        this.extension,
        this.status,
        this.participant,
        this.test,
        this.implicitRules,
        this.name,
        this.resourceType,
        newValue,
        this.text,
        this.setup,
        this.meta,
        this.issued,
        this.tester);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestReport#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestReport withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableTestReport(
        this.language,
        this.modifierExtension,
        this.teardown,
        this.testScript,
        this.score,
        this.identifier,
        this.contained,
        this.result,
        this.extension,
        this.status,
        this.participant,
        this.test,
        this.implicitRules,
        this.name,
        this.resourceType,
        value,
        this.text,
        this.setup,
        this.meta,
        this.issued,
        this.tester);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestReport#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestReport withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableTestReport(
        this.language,
        this.modifierExtension,
        this.teardown,
        this.testScript,
        this.score,
        this.identifier,
        this.contained,
        this.result,
        this.extension,
        this.status,
        this.participant,
        this.test,
        this.implicitRules,
        this.name,
        this.resourceType,
        this.id,
        newValue,
        this.setup,
        this.meta,
        this.issued,
        this.tester);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestReport#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestReport withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableTestReport(
        this.language,
        this.modifierExtension,
        this.teardown,
        this.testScript,
        this.score,
        this.identifier,
        this.contained,
        this.result,
        this.extension,
        this.status,
        this.participant,
        this.test,
        this.implicitRules,
        this.name,
        this.resourceType,
        this.id,
        value,
        this.setup,
        this.meta,
        this.issued,
        this.tester);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestReport#setup() setup} attribute.
   * @param value The value for setup
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestReport withSetup(TestReport_Setup value) {
    @Nullable TestReport_Setup newValue = Objects.requireNonNull(value, "setup");
    if (this.setup == newValue) return this;
    return new ImmutableTestReport(
        this.language,
        this.modifierExtension,
        this.teardown,
        this.testScript,
        this.score,
        this.identifier,
        this.contained,
        this.result,
        this.extension,
        this.status,
        this.participant,
        this.test,
        this.implicitRules,
        this.name,
        this.resourceType,
        this.id,
        this.text,
        newValue,
        this.meta,
        this.issued,
        this.tester);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestReport#setup() setup} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for setup
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestReport withSetup(Optional<? extends TestReport_Setup> optional) {
    @Nullable TestReport_Setup value = optional.orElse(null);
    if (this.setup == value) return this;
    return new ImmutableTestReport(
        this.language,
        this.modifierExtension,
        this.teardown,
        this.testScript,
        this.score,
        this.identifier,
        this.contained,
        this.result,
        this.extension,
        this.status,
        this.participant,
        this.test,
        this.implicitRules,
        this.name,
        this.resourceType,
        this.id,
        this.text,
        value,
        this.meta,
        this.issued,
        this.tester);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestReport#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestReport withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableTestReport(
        this.language,
        this.modifierExtension,
        this.teardown,
        this.testScript,
        this.score,
        this.identifier,
        this.contained,
        this.result,
        this.extension,
        this.status,
        this.participant,
        this.test,
        this.implicitRules,
        this.name,
        this.resourceType,
        this.id,
        this.text,
        this.setup,
        newValue,
        this.issued,
        this.tester);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestReport#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestReport withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableTestReport(
        this.language,
        this.modifierExtension,
        this.teardown,
        this.testScript,
        this.score,
        this.identifier,
        this.contained,
        this.result,
        this.extension,
        this.status,
        this.participant,
        this.test,
        this.implicitRules,
        this.name,
        this.resourceType,
        this.id,
        this.text,
        this.setup,
        value,
        this.issued,
        this.tester);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestReport#issued() issued} attribute.
   * @param value The value for issued
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestReport withIssued(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "issued");
    if (this.issued == newValue) return this;
    return new ImmutableTestReport(
        this.language,
        this.modifierExtension,
        this.teardown,
        this.testScript,
        this.score,
        this.identifier,
        this.contained,
        this.result,
        this.extension,
        this.status,
        this.participant,
        this.test,
        this.implicitRules,
        this.name,
        this.resourceType,
        this.id,
        this.text,
        this.setup,
        this.meta,
        newValue,
        this.tester);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestReport#issued() issued} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for issued
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestReport withIssued(Optional<? extends DateTime> optional) {
    @Nullable DateTime value = optional.orElse(null);
    if (this.issued == value) return this;
    return new ImmutableTestReport(
        this.language,
        this.modifierExtension,
        this.teardown,
        this.testScript,
        this.score,
        this.identifier,
        this.contained,
        this.result,
        this.extension,
        this.status,
        this.participant,
        this.test,
        this.implicitRules,
        this.name,
        this.resourceType,
        this.id,
        this.text,
        this.setup,
        this.meta,
        value,
        this.tester);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestReport#tester() tester} attribute.
   * @param value The value for tester
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestReport withTester(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "tester");
    if (Objects.equals(this.tester, newValue)) return this;
    return new ImmutableTestReport(
        this.language,
        this.modifierExtension,
        this.teardown,
        this.testScript,
        this.score,
        this.identifier,
        this.contained,
        this.result,
        this.extension,
        this.status,
        this.participant,
        this.test,
        this.implicitRules,
        this.name,
        this.resourceType,
        this.id,
        this.text,
        this.setup,
        this.meta,
        this.issued,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestReport#tester() tester} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for tester
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestReport withTester(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.tester, value)) return this;
    return new ImmutableTestReport(
        this.language,
        this.modifierExtension,
        this.teardown,
        this.testScript,
        this.score,
        this.identifier,
        this.contained,
        this.result,
        this.extension,
        this.status,
        this.participant,
        this.test,
        this.implicitRules,
        this.name,
        this.resourceType,
        this.id,
        this.text,
        this.setup,
        this.meta,
        this.issued,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableTestReport} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableTestReport
        && equalTo((ImmutableTestReport) another);
  }

  private boolean equalTo(ImmutableTestReport another) {
    return Objects.equals(language, another.language)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(teardown, another.teardown)
        && testScript.equals(another.testScript)
        && Objects.equals(score, another.score)
        && Objects.equals(identifier, another.identifier)
        && Objects.equals(contained, another.contained)
        && Objects.equals(result, another.result)
        && Objects.equals(extension, another.extension)
        && Objects.equals(status, another.status)
        && Objects.equals(participant, another.participant)
        && Objects.equals(test, another.test)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(name, another.name)
        && resourceType.equals(another.resourceType)
        && Objects.equals(id, another.id)
        && Objects.equals(text, another.text)
        && Objects.equals(setup, another.setup)
        && Objects.equals(meta, another.meta)
        && Objects.equals(issued, another.issued)
        && Objects.equals(tester, another.tester);
  }

  /**
   * Computes a hash code from attributes: {@code language}, {@code modifierExtension}, {@code teardown}, {@code testScript}, {@code score}, {@code identifier}, {@code contained}, {@code result}, {@code extension}, {@code status}, {@code participant}, {@code test}, {@code implicitRules}, {@code name}, {@code resourceType}, {@code id}, {@code text}, {@code setup}, {@code meta}, {@code issued}, {@code tester}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(teardown);
    h += (h << 5) + testScript.hashCode();
    h += (h << 5) + Objects.hashCode(score);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(result);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(status);
    h += (h << 5) + Objects.hashCode(participant);
    h += (h << 5) + Objects.hashCode(test);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(name);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(setup);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(issued);
    h += (h << 5) + Objects.hashCode(tester);
    return h;
  }

  /**
   * Prints the immutable value {@code TestReport} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("TestReport{");
    if (language != null) {
      builder.append("language=").append(language);
    }
    if (modifierExtension != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (teardown != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("teardown=").append(teardown);
    }
    if (builder.length() > 11) builder.append(", ");
    builder.append("testScript=").append(testScript);
    if (score != null) {
      builder.append(", ");
      builder.append("score=").append(score);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (result != null) {
      builder.append(", ");
      builder.append("result=").append(result);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
    }
    if (participant != null) {
      builder.append(", ");
      builder.append("participant=").append(participant);
    }
    if (test != null) {
      builder.append(", ");
      builder.append("test=").append(test);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (name != null) {
      builder.append(", ");
      builder.append("name=").append(name);
    }
    builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (setup != null) {
      builder.append(", ");
      builder.append("setup=").append(setup);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (issued != null) {
      builder.append(", ");
      builder.append("issued=").append(issued);
    }
    if (tester != null) {
      builder.append(", ");
      builder.append("tester=").append(tester);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "TestReport", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements TestReport {
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<TestReport_Teardown> teardown = Optional.empty();
    boolean teardownIsSet;
    @Nullable Reference testScript;
    @Nullable Optional<Decimal> score = Optional.empty();
    boolean scoreIsSet;
    @Nullable Optional<Identifier> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<TestreportResult> result = Optional.empty();
    boolean resultIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<TestreportStatus> status = Optional.empty();
    boolean statusIsSet;
    @Nullable Optional<List<TestReport_Participant>> participant = Optional.empty();
    boolean participantIsSet;
    @Nullable Optional<List<TestReport_Test>> test = Optional.empty();
    boolean testIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<String> name = Optional.empty();
    boolean nameIsSet;
    @Nullable String resourceType;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<TestReport_Setup> setup = Optional.empty();
    boolean setupIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<DateTime> issued = Optional.empty();
    boolean issuedIsSet;
    @Nullable Optional<String> tester = Optional.empty();
    boolean testerIsSet;
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("teardown")
    public void setTeardown(Optional<TestReport_Teardown> teardown) {
      this.teardown = teardown;
      this.teardownIsSet = true;
    }
    @JsonProperty("testScript")
    public void setTestScript(Reference testScript) {
      this.testScript = testScript;
    }
    @JsonProperty("score")
    public void setScore(Optional<Decimal> score) {
      this.score = score;
      this.scoreIsSet = true;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<Identifier> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @JsonProperty("result")
    public void setResult(Optional<TestreportResult> result) {
      this.result = result;
      this.resultIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("status")
    public void setStatus(Optional<TestreportStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @JsonProperty("participant")
    public void setParticipant(Optional<List<TestReport_Participant>> participant) {
      this.participant = participant;
      this.participantIsSet = true;
    }
    @JsonProperty("test")
    public void setTest(Optional<List<TestReport_Test>> test) {
      this.test = test;
      this.testIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("name")
    public void setName(Optional<String> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("setup")
    public void setSetup(Optional<TestReport_Setup> setup) {
      this.setup = setup;
      this.setupIsSet = true;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("issued")
    public void setIssued(Optional<DateTime> issued) {
      this.issued = issued;
      this.issuedIsSet = true;
    }
    @JsonProperty("tester")
    public void setTester(Optional<String> tester) {
      this.tester = tester;
      this.testerIsSet = true;
    }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<TestReport_Teardown> teardown() { throw new UnsupportedOperationException(); }
    @Override
    public Reference testScript() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Decimal> score() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Identifier> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<TestreportResult> result() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<TestreportStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<TestReport_Participant>> participant() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<TestReport_Test>> test() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> name() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<TestReport_Setup> setup() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DateTime> issued() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> tester() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableTestReport fromJson(Json json) {
    ImmutableTestReport.Builder builder = ((ImmutableTestReport.Builder) ImmutableTestReport.builder());
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.teardownIsSet) {
      builder.teardown(json.teardown);
    }
    if (json.testScript != null) {
      builder.testScript(json.testScript);
    }
    if (json.scoreIsSet) {
      builder.score(json.score);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.resultIsSet) {
      builder.result(json.result);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.participantIsSet) {
      builder.participant(json.participant);
    }
    if (json.testIsSet) {
      builder.test(json.test);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.setupIsSet) {
      builder.setup(json.setup);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.issuedIsSet) {
      builder.issued(json.issued);
    }
    if (json.testerIsSet) {
      builder.tester(json.tester);
    }
    return (ImmutableTestReport) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link TestReport} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable TestReport instance
   */
  public static TestReport copyOf(TestReport instance) {
    if (instance instanceof ImmutableTestReport) {
      return (ImmutableTestReport) instance;
    }
    return ((ImmutableTestReport.Builder) ImmutableTestReport.builder())
        .language(instance.language())
        .modifierExtension(instance.modifierExtension())
        .teardown(instance.teardown())
        .testScript(instance.testScript())
        .score(instance.score())
        .identifier(instance.identifier())
        .contained(instance.contained())
        .result(instance.result())
        .extension(instance.extension())
        .status(instance.status())
        .participant(instance.participant())
        .test(instance.test())
        .implicitRules(instance.implicitRules())
        .name(instance.name())
        .resourceType(instance.resourceType())
        .id(instance.id())
        .text(instance.text())
        .setup(instance.setup())
        .meta(instance.meta())
        .issued(instance.issued())
        .tester(instance.tester())
        .build();
  }

  /**
   * Creates a builder for {@link TestReport TestReport}.
   * <pre>
   * ImmutableTestReport.builder()
   *    .language(com.medplum.types.fhir.Code) // optional {@link TestReport#language() language}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link TestReport#modifierExtension() modifierExtension}
   *    .teardown(com.medplum.types.fhir.TestReport_Teardown) // optional {@link TestReport#teardown() teardown}
   *    .testScript(com.medplum.types.fhir.Reference) // required {@link TestReport#testScript() testScript}
   *    .score(com.medplum.types.fhir.Decimal) // optional {@link TestReport#score() score}
   *    .identifier(com.medplum.types.fhir.Identifier) // optional {@link TestReport#identifier() identifier}
   *    .contained(List&amp;lt;com.medplum.types.fhir.ResourceList&amp;gt;) // optional {@link TestReport#contained() contained}
   *    .result(com.medplum.types.fhir.TestreportResult) // optional {@link TestReport#result() result}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link TestReport#extension() extension}
   *    .status(com.medplum.types.fhir.TestreportStatus) // optional {@link TestReport#status() status}
   *    .participant(List&amp;lt;com.medplum.types.fhir.TestReport_Participant&amp;gt;) // optional {@link TestReport#participant() participant}
   *    .test(List&amp;lt;com.medplum.types.fhir.TestReport_Test&amp;gt;) // optional {@link TestReport#test() test}
   *    .implicitRules(com.medplum.types.fhir.Uri) // optional {@link TestReport#implicitRules() implicitRules}
   *    .name(String) // optional {@link TestReport#name() name}
   *    .resourceType(String) // required {@link TestReport#resourceType() resourceType}
   *    .id(com.medplum.types.fhir.Id) // optional {@link TestReport#id() id}
   *    .text(com.medplum.types.fhir.Narrative) // optional {@link TestReport#text() text}
   *    .setup(com.medplum.types.fhir.TestReport_Setup) // optional {@link TestReport#setup() setup}
   *    .meta(com.medplum.types.fhir.Meta) // optional {@link TestReport#meta() meta}
   *    .issued(com.medplum.types.fhir.DateTime) // optional {@link TestReport#issued() issued}
   *    .tester(String) // optional {@link TestReport#tester() tester}
   *    .build();
   * </pre>
   * @return A new TestReport builder
   */
  public static TestScriptBuildStage builder() {
    return new ImmutableTestReport.Builder();
  }

  /**
   * Builds instances of type {@link TestReport TestReport}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "TestReport", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements TestScriptBuildStage, ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_TEST_SCRIPT = 0x1L;
    private static final long INIT_BIT_RESOURCE_TYPE = 0x2L;
    private static final long OPT_BIT_LANGUAGE = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x2L;
    private static final long OPT_BIT_TEARDOWN = 0x4L;
    private static final long OPT_BIT_SCORE = 0x8L;
    private static final long OPT_BIT_IDENTIFIER = 0x10L;
    private static final long OPT_BIT_CONTAINED = 0x20L;
    private static final long OPT_BIT_RESULT = 0x40L;
    private static final long OPT_BIT_EXTENSION = 0x80L;
    private static final long OPT_BIT_STATUS = 0x100L;
    private static final long OPT_BIT_PARTICIPANT = 0x200L;
    private static final long OPT_BIT_TEST = 0x400L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x800L;
    private static final long OPT_BIT_NAME = 0x1000L;
    private static final long OPT_BIT_ID = 0x2000L;
    private static final long OPT_BIT_TEXT = 0x4000L;
    private static final long OPT_BIT_SETUP = 0x8000L;
    private static final long OPT_BIT_META = 0x10000L;
    private static final long OPT_BIT_ISSUED = 0x20000L;
    private static final long OPT_BIT_TESTER = 0x40000L;
    private long initBits = 0x3L;
    private long optBits;

    private @Nullable Code language;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable TestReport_Teardown teardown;
    private @Nullable Reference testScript;
    private @Nullable Decimal score;
    private @Nullable Identifier identifier;
    private @Nullable List<ResourceList> contained;
    private @Nullable TestreportResult result;
    private @Nullable List<Extension> extension;
    private @Nullable TestreportStatus status;
    private @Nullable List<TestReport_Participant> participant;
    private @Nullable List<TestReport_Test> test;
    private @Nullable Uri implicitRules;
    private @Nullable String name;
    private @Nullable String resourceType;
    private @Nullable Id id;
    private @Nullable Narrative text;
    private @Nullable TestReport_Setup setup;
    private @Nullable Meta meta;
    private @Nullable DateTime issued;
    private @Nullable String tester;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link TestReport#language() language} to language.
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
     * Initializes the optional value {@link TestReport#language() language} to language.
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
     * Initializes the optional value {@link TestReport#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link TestReport#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link TestReport#teardown() teardown} to teardown.
     * @param teardown The value for teardown
     * @return {@code this} builder for chained invocation
     */
    public final Builder teardown(TestReport_Teardown teardown) {
      checkNotIsSet(teardownIsSet(), "teardown");
      this.teardown = Objects.requireNonNull(teardown, "teardown");
      optBits |= OPT_BIT_TEARDOWN;
      return this;
    }

    /**
     * Initializes the optional value {@link TestReport#teardown() teardown} to teardown.
     * @param teardown The value for teardown
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("teardown")
    public final Builder teardown(Optional<? extends TestReport_Teardown> teardown) {
      checkNotIsSet(teardownIsSet(), "teardown");
      this.teardown = teardown.orElse(null);
      optBits |= OPT_BIT_TEARDOWN;
      return this;
    }

    /**
     * Initializes the value for the {@link TestReport#testScript() testScript} attribute.
     * @param testScript The value for testScript 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("testScript")
    public final Builder testScript(Reference testScript) {
      checkNotIsSet(testScriptIsSet(), "testScript");
      this.testScript = Objects.requireNonNull(testScript, "testScript");
      initBits &= ~INIT_BIT_TEST_SCRIPT;
      return this;
    }

    /**
     * Initializes the optional value {@link TestReport#score() score} to score.
     * @param score The value for score
     * @return {@code this} builder for chained invocation
     */
    public final Builder score(Decimal score) {
      checkNotIsSet(scoreIsSet(), "score");
      this.score = Objects.requireNonNull(score, "score");
      optBits |= OPT_BIT_SCORE;
      return this;
    }

    /**
     * Initializes the optional value {@link TestReport#score() score} to score.
     * @param score The value for score
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("score")
    public final Builder score(Optional<? extends Decimal> score) {
      checkNotIsSet(scoreIsSet(), "score");
      this.score = score.orElse(null);
      optBits |= OPT_BIT_SCORE;
      return this;
    }

    /**
     * Initializes the optional value {@link TestReport#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link TestReport#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link TestReport#contained() contained} to contained.
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
     * Initializes the optional value {@link TestReport#contained() contained} to contained.
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
     * Initializes the optional value {@link TestReport#result() result} to result.
     * @param result The value for result
     * @return {@code this} builder for chained invocation
     */
    public final Builder result(TestreportResult result) {
      checkNotIsSet(resultIsSet(), "result");
      this.result = Objects.requireNonNull(result, "result");
      optBits |= OPT_BIT_RESULT;
      return this;
    }

    /**
     * Initializes the optional value {@link TestReport#result() result} to result.
     * @param result The value for result
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("result")
    public final Builder result(Optional<? extends TestreportResult> result) {
      checkNotIsSet(resultIsSet(), "result");
      this.result = result.orElse(null);
      optBits |= OPT_BIT_RESULT;
      return this;
    }

    /**
     * Initializes the optional value {@link TestReport#extension() extension} to extension.
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
     * Initializes the optional value {@link TestReport#extension() extension} to extension.
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
     * Initializes the optional value {@link TestReport#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(TestreportStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link TestReport#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("status")
    public final Builder status(Optional<? extends TestreportStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link TestReport#participant() participant} to participant.
     * @param participant The value for participant
     * @return {@code this} builder for chained invocation
     */
    public final Builder participant(List<TestReport_Participant> participant) {
      checkNotIsSet(participantIsSet(), "participant");
      this.participant = Objects.requireNonNull(participant, "participant");
      optBits |= OPT_BIT_PARTICIPANT;
      return this;
    }

    /**
     * Initializes the optional value {@link TestReport#participant() participant} to participant.
     * @param participant The value for participant
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("participant")
    public final Builder participant(Optional<? extends List<TestReport_Participant>> participant) {
      checkNotIsSet(participantIsSet(), "participant");
      this.participant = participant.orElse(null);
      optBits |= OPT_BIT_PARTICIPANT;
      return this;
    }

    /**
     * Initializes the optional value {@link TestReport#test() test} to test.
     * @param test The value for test
     * @return {@code this} builder for chained invocation
     */
    public final Builder test(List<TestReport_Test> test) {
      checkNotIsSet(testIsSet(), "test");
      this.test = Objects.requireNonNull(test, "test");
      optBits |= OPT_BIT_TEST;
      return this;
    }

    /**
     * Initializes the optional value {@link TestReport#test() test} to test.
     * @param test The value for test
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("test")
    public final Builder test(Optional<? extends List<TestReport_Test>> test) {
      checkNotIsSet(testIsSet(), "test");
      this.test = test.orElse(null);
      optBits |= OPT_BIT_TEST;
      return this;
    }

    /**
     * Initializes the optional value {@link TestReport#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link TestReport#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link TestReport#name() name} to name.
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
     * Initializes the optional value {@link TestReport#name() name} to name.
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
     * Initializes the value for the {@link TestReport#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link TestReport#id() id} to id.
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
     * Initializes the optional value {@link TestReport#id() id} to id.
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
     * Initializes the optional value {@link TestReport#text() text} to text.
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
     * Initializes the optional value {@link TestReport#text() text} to text.
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
     * Initializes the optional value {@link TestReport#setup() setup} to setup.
     * @param setup The value for setup
     * @return {@code this} builder for chained invocation
     */
    public final Builder setup(TestReport_Setup setup) {
      checkNotIsSet(setupIsSet(), "setup");
      this.setup = Objects.requireNonNull(setup, "setup");
      optBits |= OPT_BIT_SETUP;
      return this;
    }

    /**
     * Initializes the optional value {@link TestReport#setup() setup} to setup.
     * @param setup The value for setup
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("setup")
    public final Builder setup(Optional<? extends TestReport_Setup> setup) {
      checkNotIsSet(setupIsSet(), "setup");
      this.setup = setup.orElse(null);
      optBits |= OPT_BIT_SETUP;
      return this;
    }

    /**
     * Initializes the optional value {@link TestReport#meta() meta} to meta.
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
     * Initializes the optional value {@link TestReport#meta() meta} to meta.
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
     * Initializes the optional value {@link TestReport#issued() issued} to issued.
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
     * Initializes the optional value {@link TestReport#issued() issued} to issued.
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
     * Initializes the optional value {@link TestReport#tester() tester} to tester.
     * @param tester The value for tester
     * @return {@code this} builder for chained invocation
     */
    public final Builder tester(String tester) {
      checkNotIsSet(testerIsSet(), "tester");
      this.tester = Objects.requireNonNull(tester, "tester");
      optBits |= OPT_BIT_TESTER;
      return this;
    }

    /**
     * Initializes the optional value {@link TestReport#tester() tester} to tester.
     * @param tester The value for tester
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("tester")
    public final Builder tester(Optional<String> tester) {
      checkNotIsSet(testerIsSet(), "tester");
      this.tester = tester.orElse(null);
      optBits |= OPT_BIT_TESTER;
      return this;
    }

    /**
     * Builds a new {@link TestReport TestReport}.
     * @return An immutable instance of TestReport
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public TestReport build() {
      checkRequiredAttributes();
      return new ImmutableTestReport(
          language,
          modifierExtension,
          teardown,
          testScript,
          score,
          identifier,
          contained,
          result,
          extension,
          status,
          participant,
          test,
          implicitRules,
          name,
          resourceType,
          id,
          text,
          setup,
          meta,
          issued,
          tester);
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean teardownIsSet() {
      return (optBits & OPT_BIT_TEARDOWN) != 0;
    }

    private boolean scoreIsSet() {
      return (optBits & OPT_BIT_SCORE) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean resultIsSet() {
      return (optBits & OPT_BIT_RESULT) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean participantIsSet() {
      return (optBits & OPT_BIT_PARTICIPANT) != 0;
    }

    private boolean testIsSet() {
      return (optBits & OPT_BIT_TEST) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean setupIsSet() {
      return (optBits & OPT_BIT_SETUP) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean issuedIsSet() {
      return (optBits & OPT_BIT_ISSUED) != 0;
    }

    private boolean testerIsSet() {
      return (optBits & OPT_BIT_TESTER) != 0;
    }

    private boolean testScriptIsSet() {
      return (initBits & INIT_BIT_TEST_SCRIPT) == 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of TestReport is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!testScriptIsSet()) attributes.add("testScript");
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build TestReport, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "TestReport", generator = "Immutables")
  public interface TestScriptBuildStage {
    /**
     * Initializes the value for the {@link TestReport#testScript() testScript} attribute.
     * @param testScript The value for testScript 
     * @return {@code this} builder for use in a chained invocation
     */
    ResourceTypeBuildStage testScript(Reference testScript);
  }

  @Generated(from = "TestReport", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link TestReport#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(String resourceType);
  }

  @Generated(from = "TestReport", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link TestReport#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link TestReport#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link TestReport#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link TestReport#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link TestReport#teardown() teardown} to teardown.
     * @param teardown The value for teardown
     * @return {@code this} builder for chained invocation
     */
    BuildFinal teardown(TestReport_Teardown teardown);

    /**
     * Initializes the optional value {@link TestReport#teardown() teardown} to teardown.
     * @param teardown The value for teardown
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal teardown(Optional<? extends TestReport_Teardown> teardown);

    /**
     * Initializes the optional value {@link TestReport#score() score} to score.
     * @param score The value for score
     * @return {@code this} builder for chained invocation
     */
    BuildFinal score(Decimal score);

    /**
     * Initializes the optional value {@link TestReport#score() score} to score.
     * @param score The value for score
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal score(Optional<? extends Decimal> score);

    /**
     * Initializes the optional value {@link TestReport#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(Identifier identifier);

    /**
     * Initializes the optional value {@link TestReport#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends Identifier> identifier);

    /**
     * Initializes the optional value {@link TestReport#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link TestReport#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link TestReport#result() result} to result.
     * @param result The value for result
     * @return {@code this} builder for chained invocation
     */
    BuildFinal result(TestreportResult result);

    /**
     * Initializes the optional value {@link TestReport#result() result} to result.
     * @param result The value for result
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal result(Optional<? extends TestreportResult> result);

    /**
     * Initializes the optional value {@link TestReport#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link TestReport#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link TestReport#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(TestreportStatus status);

    /**
     * Initializes the optional value {@link TestReport#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(Optional<? extends TestreportStatus> status);

    /**
     * Initializes the optional value {@link TestReport#participant() participant} to participant.
     * @param participant The value for participant
     * @return {@code this} builder for chained invocation
     */
    BuildFinal participant(List<TestReport_Participant> participant);

    /**
     * Initializes the optional value {@link TestReport#participant() participant} to participant.
     * @param participant The value for participant
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal participant(Optional<? extends List<TestReport_Participant>> participant);

    /**
     * Initializes the optional value {@link TestReport#test() test} to test.
     * @param test The value for test
     * @return {@code this} builder for chained invocation
     */
    BuildFinal test(List<TestReport_Test> test);

    /**
     * Initializes the optional value {@link TestReport#test() test} to test.
     * @param test The value for test
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal test(Optional<? extends List<TestReport_Test>> test);

    /**
     * Initializes the optional value {@link TestReport#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link TestReport#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link TestReport#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    BuildFinal name(String name);

    /**
     * Initializes the optional value {@link TestReport#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal name(Optional<String> name);

    /**
     * Initializes the optional value {@link TestReport#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link TestReport#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link TestReport#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link TestReport#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link TestReport#setup() setup} to setup.
     * @param setup The value for setup
     * @return {@code this} builder for chained invocation
     */
    BuildFinal setup(TestReport_Setup setup);

    /**
     * Initializes the optional value {@link TestReport#setup() setup} to setup.
     * @param setup The value for setup
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal setup(Optional<? extends TestReport_Setup> setup);

    /**
     * Initializes the optional value {@link TestReport#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link TestReport#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link TestReport#issued() issued} to issued.
     * @param issued The value for issued
     * @return {@code this} builder for chained invocation
     */
    BuildFinal issued(DateTime issued);

    /**
     * Initializes the optional value {@link TestReport#issued() issued} to issued.
     * @param issued The value for issued
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal issued(Optional<? extends DateTime> issued);

    /**
     * Initializes the optional value {@link TestReport#tester() tester} to tester.
     * @param tester The value for tester
     * @return {@code this} builder for chained invocation
     */
    BuildFinal tester(String tester);

    /**
     * Initializes the optional value {@link TestReport#tester() tester} to tester.
     * @param tester The value for tester
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal tester(Optional<String> tester);

    /**
     * Builds a new {@link TestReport TestReport}.
     * @return An immutable instance of TestReport
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    TestReport build();
  }
}
