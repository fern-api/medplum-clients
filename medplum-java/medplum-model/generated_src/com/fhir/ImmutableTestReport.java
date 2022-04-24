//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link TestReport}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableTestReport.builder()}.
 */
@org.immutables.value.Generated(from = "TestReport", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableTestReport implements com.fhir.TestReport {
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable com.fhir.Identifier identifier;
  private final com.fhir.Reference testScript;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable java.lang.String tester;
  private final @javax.annotation.Nullable com.fhir.TestreportStatus status;
  private final @javax.annotation.Nullable com.fhir.TestReport_Teardown teardown;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable com.fhir.TestReport_Setup setup;
  private final @javax.annotation.Nullable com.fhir.decimal score;
  private final @javax.annotation.Nullable com.fhir.dateTime issued;
  private final @javax.annotation.Nullable java.util.List<com.fhir.TestReport_Test> test;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.TestreportResult result;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable java.lang.String name;
  private final @javax.annotation.Nullable java.util.List<com.fhir.TestReport_Participant> participant;

  private ImmutableTestReport(
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable com.fhir.Identifier identifier,
      com.fhir.Reference testScript,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable java.lang.String tester,
      @javax.annotation.Nullable com.fhir.TestreportStatus status,
      @javax.annotation.Nullable com.fhir.TestReport_Teardown teardown,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      java.lang.String resourceType,
      @javax.annotation.Nullable com.fhir.TestReport_Setup setup,
      @javax.annotation.Nullable com.fhir.decimal score,
      @javax.annotation.Nullable com.fhir.dateTime issued,
      @javax.annotation.Nullable java.util.List<com.fhir.TestReport_Test> test,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.TestreportResult result,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable java.lang.String name,
      @javax.annotation.Nullable java.util.List<com.fhir.TestReport_Participant> participant) {
    this.text = text;
    this.id = id;
    this.implicitRules = implicitRules;
    this.identifier = identifier;
    this.testScript = testScript;
    this.meta = meta;
    this.tester = tester;
    this.status = status;
    this.teardown = teardown;
    this.contained = contained;
    this.resourceType = resourceType;
    this.setup = setup;
    this.score = score;
    this.issued = issued;
    this.test = test;
    this.modifierExtension = modifierExtension;
    this.extension = extension;
    this.result = result;
    this.language = language;
    this.name = name;
    this.participant = participant;
  }

  /**
   * @return The value of the {@code text} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("text")
  @Override
  public java.util.Optional<com.fhir.Narrative> text() {
    return java.util.Optional.ofNullable(text);
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("id")
  @Override
  public java.util.Optional<com.fhir.id> id() {
    return java.util.Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code implicitRules} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
  @Override
  public java.util.Optional<com.fhir.uri> implicitRules() {
    return java.util.Optional.ofNullable(implicitRules);
  }

  /**
   * @return The value of the {@code identifier} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("identifier")
  @Override
  public java.util.Optional<com.fhir.Identifier> identifier() {
    return java.util.Optional.ofNullable(identifier);
  }

  /**
   * @return The value of the {@code testScript} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("testScript")
  @Override
  public com.fhir.Reference testScript() {
    return testScript;
  }

  /**
   * @return The value of the {@code meta} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("meta")
  @Override
  public java.util.Optional<com.fhir.Meta> meta() {
    return java.util.Optional.ofNullable(meta);
  }

  /**
   * @return The value of the {@code tester} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("tester")
  @Override
  public java.util.Optional<java.lang.String> tester() {
    return java.util.Optional.ofNullable(tester);
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("status")
  @Override
  public java.util.Optional<com.fhir.TestreportStatus> status() {
    return java.util.Optional.ofNullable(status);
  }

  /**
   * @return The value of the {@code teardown} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("teardown")
  @Override
  public java.util.Optional<com.fhir.TestReport_Teardown> teardown() {
    return java.util.Optional.ofNullable(teardown);
  }

  /**
   * @return The value of the {@code contained} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("contained")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() {
    return java.util.Optional.ofNullable(contained);
  }

  /**
   * @return The value of the {@code resourceType} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
  @Override
  public java.lang.String resourceType() {
    return resourceType;
  }

  /**
   * @return The value of the {@code setup} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("setup")
  @Override
  public java.util.Optional<com.fhir.TestReport_Setup> setup() {
    return java.util.Optional.ofNullable(setup);
  }

  /**
   * @return The value of the {@code score} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("score")
  @Override
  public java.util.Optional<com.fhir.decimal> score() {
    return java.util.Optional.ofNullable(score);
  }

  /**
   * @return The value of the {@code issued} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("issued")
  @Override
  public java.util.Optional<com.fhir.dateTime> issued() {
    return java.util.Optional.ofNullable(issued);
  }

  /**
   * @return The value of the {@code test} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("test")
  @Override
  public java.util.Optional<java.util.List<com.fhir.TestReport_Test>> test() {
    return java.util.Optional.ofNullable(test);
  }

  /**
   * @return The value of the {@code modifierExtension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() {
    return java.util.Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code extension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("extension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> extension() {
    return java.util.Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code result} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("result")
  @Override
  public java.util.Optional<com.fhir.TestreportResult> result() {
    return java.util.Optional.ofNullable(result);
  }

  /**
   * @return The value of the {@code language} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("language")
  @Override
  public java.util.Optional<com.fhir.code> language() {
    return java.util.Optional.ofNullable(language);
  }

  /**
   * @return The value of the {@code name} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("name")
  @Override
  public java.util.Optional<java.lang.String> name() {
    return java.util.Optional.ofNullable(name);
  }

  /**
   * @return The value of the {@code participant} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("participant")
  @Override
  public java.util.Optional<java.util.List<com.fhir.TestReport_Participant>> participant() {
    return java.util.Optional.ofNullable(participant);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestReport#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestReport withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableTestReport(
        newValue,
        this.id,
        this.implicitRules,
        this.identifier,
        this.testScript,
        this.meta,
        this.tester,
        this.status,
        this.teardown,
        this.contained,
        this.resourceType,
        this.setup,
        this.score,
        this.issued,
        this.test,
        this.modifierExtension,
        this.extension,
        this.result,
        this.language,
        this.name,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestReport#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestReport withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableTestReport(
        value,
        this.id,
        this.implicitRules,
        this.identifier,
        this.testScript,
        this.meta,
        this.tester,
        this.status,
        this.teardown,
        this.contained,
        this.resourceType,
        this.setup,
        this.score,
        this.issued,
        this.test,
        this.modifierExtension,
        this.extension,
        this.result,
        this.language,
        this.name,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestReport#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestReport withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableTestReport(
        this.text,
        newValue,
        this.implicitRules,
        this.identifier,
        this.testScript,
        this.meta,
        this.tester,
        this.status,
        this.teardown,
        this.contained,
        this.resourceType,
        this.setup,
        this.score,
        this.issued,
        this.test,
        this.modifierExtension,
        this.extension,
        this.result,
        this.language,
        this.name,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestReport#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestReport withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableTestReport(
        this.text,
        value,
        this.implicitRules,
        this.identifier,
        this.testScript,
        this.meta,
        this.tester,
        this.status,
        this.teardown,
        this.contained,
        this.resourceType,
        this.setup,
        this.score,
        this.issued,
        this.test,
        this.modifierExtension,
        this.extension,
        this.result,
        this.language,
        this.name,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestReport#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestReport withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableTestReport(
        this.text,
        this.id,
        newValue,
        this.identifier,
        this.testScript,
        this.meta,
        this.tester,
        this.status,
        this.teardown,
        this.contained,
        this.resourceType,
        this.setup,
        this.score,
        this.issued,
        this.test,
        this.modifierExtension,
        this.extension,
        this.result,
        this.language,
        this.name,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestReport#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestReport withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableTestReport(
        this.text,
        this.id,
        value,
        this.identifier,
        this.testScript,
        this.meta,
        this.tester,
        this.status,
        this.teardown,
        this.contained,
        this.resourceType,
        this.setup,
        this.score,
        this.issued,
        this.test,
        this.modifierExtension,
        this.extension,
        this.result,
        this.language,
        this.name,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestReport#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestReport withIdentifier(com.fhir.Identifier value) {
    @javax.annotation.Nullable com.fhir.Identifier newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableTestReport(
        this.text,
        this.id,
        this.implicitRules,
        newValue,
        this.testScript,
        this.meta,
        this.tester,
        this.status,
        this.teardown,
        this.contained,
        this.resourceType,
        this.setup,
        this.score,
        this.issued,
        this.test,
        this.modifierExtension,
        this.extension,
        this.result,
        this.language,
        this.name,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestReport#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestReport withIdentifier(java.util.Optional<? extends com.fhir.Identifier> optional) {
    @javax.annotation.Nullable com.fhir.Identifier value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableTestReport(
        this.text,
        this.id,
        this.implicitRules,
        value,
        this.testScript,
        this.meta,
        this.tester,
        this.status,
        this.teardown,
        this.contained,
        this.resourceType,
        this.setup,
        this.score,
        this.issued,
        this.test,
        this.modifierExtension,
        this.extension,
        this.result,
        this.language,
        this.name,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TestReport#testScript() testScript} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for testScript
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTestReport withTestScript(com.fhir.Reference value) {
    if (this.testScript == value) return this;
    com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "testScript");
    return new ImmutableTestReport(
        this.text,
        this.id,
        this.implicitRules,
        this.identifier,
        newValue,
        this.meta,
        this.tester,
        this.status,
        this.teardown,
        this.contained,
        this.resourceType,
        this.setup,
        this.score,
        this.issued,
        this.test,
        this.modifierExtension,
        this.extension,
        this.result,
        this.language,
        this.name,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestReport#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestReport withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableTestReport(
        this.text,
        this.id,
        this.implicitRules,
        this.identifier,
        this.testScript,
        newValue,
        this.tester,
        this.status,
        this.teardown,
        this.contained,
        this.resourceType,
        this.setup,
        this.score,
        this.issued,
        this.test,
        this.modifierExtension,
        this.extension,
        this.result,
        this.language,
        this.name,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestReport#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestReport withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableTestReport(
        this.text,
        this.id,
        this.implicitRules,
        this.identifier,
        this.testScript,
        value,
        this.tester,
        this.status,
        this.teardown,
        this.contained,
        this.resourceType,
        this.setup,
        this.score,
        this.issued,
        this.test,
        this.modifierExtension,
        this.extension,
        this.result,
        this.language,
        this.name,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestReport#tester() tester} attribute.
   * @param value The value for tester
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestReport withTester(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "tester");
    if (java.util.Objects.equals(this.tester, newValue)) return this;
    return new ImmutableTestReport(
        this.text,
        this.id,
        this.implicitRules,
        this.identifier,
        this.testScript,
        this.meta,
        newValue,
        this.status,
        this.teardown,
        this.contained,
        this.resourceType,
        this.setup,
        this.score,
        this.issued,
        this.test,
        this.modifierExtension,
        this.extension,
        this.result,
        this.language,
        this.name,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestReport#tester() tester} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for tester
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestReport withTester(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.tester, value)) return this;
    return new ImmutableTestReport(
        this.text,
        this.id,
        this.implicitRules,
        this.identifier,
        this.testScript,
        this.meta,
        value,
        this.status,
        this.teardown,
        this.contained,
        this.resourceType,
        this.setup,
        this.score,
        this.issued,
        this.test,
        this.modifierExtension,
        this.extension,
        this.result,
        this.language,
        this.name,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestReport#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestReport withStatus(com.fhir.TestreportStatus value) {
    @javax.annotation.Nullable com.fhir.TestreportStatus newValue = java.util.Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableTestReport(
        this.text,
        this.id,
        this.implicitRules,
        this.identifier,
        this.testScript,
        this.meta,
        this.tester,
        newValue,
        this.teardown,
        this.contained,
        this.resourceType,
        this.setup,
        this.score,
        this.issued,
        this.test,
        this.modifierExtension,
        this.extension,
        this.result,
        this.language,
        this.name,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestReport#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestReport withStatus(java.util.Optional<? extends com.fhir.TestreportStatus> optional) {
    @javax.annotation.Nullable com.fhir.TestreportStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableTestReport(
        this.text,
        this.id,
        this.implicitRules,
        this.identifier,
        this.testScript,
        this.meta,
        this.tester,
        value,
        this.teardown,
        this.contained,
        this.resourceType,
        this.setup,
        this.score,
        this.issued,
        this.test,
        this.modifierExtension,
        this.extension,
        this.result,
        this.language,
        this.name,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestReport#teardown() teardown} attribute.
   * @param value The value for teardown
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestReport withTeardown(com.fhir.TestReport_Teardown value) {
    @javax.annotation.Nullable com.fhir.TestReport_Teardown newValue = java.util.Objects.requireNonNull(value, "teardown");
    if (this.teardown == newValue) return this;
    return new ImmutableTestReport(
        this.text,
        this.id,
        this.implicitRules,
        this.identifier,
        this.testScript,
        this.meta,
        this.tester,
        this.status,
        newValue,
        this.contained,
        this.resourceType,
        this.setup,
        this.score,
        this.issued,
        this.test,
        this.modifierExtension,
        this.extension,
        this.result,
        this.language,
        this.name,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestReport#teardown() teardown} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for teardown
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestReport withTeardown(java.util.Optional<? extends com.fhir.TestReport_Teardown> optional) {
    @javax.annotation.Nullable com.fhir.TestReport_Teardown value = optional.orElse(null);
    if (this.teardown == value) return this;
    return new ImmutableTestReport(
        this.text,
        this.id,
        this.implicitRules,
        this.identifier,
        this.testScript,
        this.meta,
        this.tester,
        this.status,
        value,
        this.contained,
        this.resourceType,
        this.setup,
        this.score,
        this.issued,
        this.test,
        this.modifierExtension,
        this.extension,
        this.result,
        this.language,
        this.name,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestReport#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestReport withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableTestReport(
        this.text,
        this.id,
        this.implicitRules,
        this.identifier,
        this.testScript,
        this.meta,
        this.tester,
        this.status,
        this.teardown,
        newValue,
        this.resourceType,
        this.setup,
        this.score,
        this.issued,
        this.test,
        this.modifierExtension,
        this.extension,
        this.result,
        this.language,
        this.name,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestReport#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestReport withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableTestReport(
        this.text,
        this.id,
        this.implicitRules,
        this.identifier,
        this.testScript,
        this.meta,
        this.tester,
        this.status,
        this.teardown,
        value,
        this.resourceType,
        this.setup,
        this.score,
        this.issued,
        this.test,
        this.modifierExtension,
        this.extension,
        this.result,
        this.language,
        this.name,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TestReport#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTestReport withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableTestReport(
        this.text,
        this.id,
        this.implicitRules,
        this.identifier,
        this.testScript,
        this.meta,
        this.tester,
        this.status,
        this.teardown,
        this.contained,
        newValue,
        this.setup,
        this.score,
        this.issued,
        this.test,
        this.modifierExtension,
        this.extension,
        this.result,
        this.language,
        this.name,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestReport#setup() setup} attribute.
   * @param value The value for setup
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestReport withSetup(com.fhir.TestReport_Setup value) {
    @javax.annotation.Nullable com.fhir.TestReport_Setup newValue = java.util.Objects.requireNonNull(value, "setup");
    if (this.setup == newValue) return this;
    return new ImmutableTestReport(
        this.text,
        this.id,
        this.implicitRules,
        this.identifier,
        this.testScript,
        this.meta,
        this.tester,
        this.status,
        this.teardown,
        this.contained,
        this.resourceType,
        newValue,
        this.score,
        this.issued,
        this.test,
        this.modifierExtension,
        this.extension,
        this.result,
        this.language,
        this.name,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestReport#setup() setup} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for setup
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestReport withSetup(java.util.Optional<? extends com.fhir.TestReport_Setup> optional) {
    @javax.annotation.Nullable com.fhir.TestReport_Setup value = optional.orElse(null);
    if (this.setup == value) return this;
    return new ImmutableTestReport(
        this.text,
        this.id,
        this.implicitRules,
        this.identifier,
        this.testScript,
        this.meta,
        this.tester,
        this.status,
        this.teardown,
        this.contained,
        this.resourceType,
        value,
        this.score,
        this.issued,
        this.test,
        this.modifierExtension,
        this.extension,
        this.result,
        this.language,
        this.name,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestReport#score() score} attribute.
   * @param value The value for score
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestReport withScore(com.fhir.decimal value) {
    @javax.annotation.Nullable com.fhir.decimal newValue = java.util.Objects.requireNonNull(value, "score");
    if (this.score == newValue) return this;
    return new ImmutableTestReport(
        this.text,
        this.id,
        this.implicitRules,
        this.identifier,
        this.testScript,
        this.meta,
        this.tester,
        this.status,
        this.teardown,
        this.contained,
        this.resourceType,
        this.setup,
        newValue,
        this.issued,
        this.test,
        this.modifierExtension,
        this.extension,
        this.result,
        this.language,
        this.name,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestReport#score() score} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for score
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestReport withScore(java.util.Optional<? extends com.fhir.decimal> optional) {
    @javax.annotation.Nullable com.fhir.decimal value = optional.orElse(null);
    if (this.score == value) return this;
    return new ImmutableTestReport(
        this.text,
        this.id,
        this.implicitRules,
        this.identifier,
        this.testScript,
        this.meta,
        this.tester,
        this.status,
        this.teardown,
        this.contained,
        this.resourceType,
        this.setup,
        value,
        this.issued,
        this.test,
        this.modifierExtension,
        this.extension,
        this.result,
        this.language,
        this.name,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestReport#issued() issued} attribute.
   * @param value The value for issued
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestReport withIssued(com.fhir.dateTime value) {
    @javax.annotation.Nullable com.fhir.dateTime newValue = java.util.Objects.requireNonNull(value, "issued");
    if (this.issued == newValue) return this;
    return new ImmutableTestReport(
        this.text,
        this.id,
        this.implicitRules,
        this.identifier,
        this.testScript,
        this.meta,
        this.tester,
        this.status,
        this.teardown,
        this.contained,
        this.resourceType,
        this.setup,
        this.score,
        newValue,
        this.test,
        this.modifierExtension,
        this.extension,
        this.result,
        this.language,
        this.name,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestReport#issued() issued} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for issued
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestReport withIssued(java.util.Optional<? extends com.fhir.dateTime> optional) {
    @javax.annotation.Nullable com.fhir.dateTime value = optional.orElse(null);
    if (this.issued == value) return this;
    return new ImmutableTestReport(
        this.text,
        this.id,
        this.implicitRules,
        this.identifier,
        this.testScript,
        this.meta,
        this.tester,
        this.status,
        this.teardown,
        this.contained,
        this.resourceType,
        this.setup,
        this.score,
        value,
        this.test,
        this.modifierExtension,
        this.extension,
        this.result,
        this.language,
        this.name,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestReport#test() test} attribute.
   * @param value The value for test
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestReport withTest(java.util.List<com.fhir.TestReport_Test> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.TestReport_Test> newValue = java.util.Objects.requireNonNull(value, "test");
    if (this.test == newValue) return this;
    return new ImmutableTestReport(
        this.text,
        this.id,
        this.implicitRules,
        this.identifier,
        this.testScript,
        this.meta,
        this.tester,
        this.status,
        this.teardown,
        this.contained,
        this.resourceType,
        this.setup,
        this.score,
        this.issued,
        newValue,
        this.modifierExtension,
        this.extension,
        this.result,
        this.language,
        this.name,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestReport#test() test} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for test
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestReport withTest(java.util.Optional<? extends java.util.List<com.fhir.TestReport_Test>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.TestReport_Test> value = optional.orElse(null);
    if (this.test == value) return this;
    return new ImmutableTestReport(
        this.text,
        this.id,
        this.implicitRules,
        this.identifier,
        this.testScript,
        this.meta,
        this.tester,
        this.status,
        this.teardown,
        this.contained,
        this.resourceType,
        this.setup,
        this.score,
        this.issued,
        value,
        this.modifierExtension,
        this.extension,
        this.result,
        this.language,
        this.name,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestReport#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestReport withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableTestReport(
        this.text,
        this.id,
        this.implicitRules,
        this.identifier,
        this.testScript,
        this.meta,
        this.tester,
        this.status,
        this.teardown,
        this.contained,
        this.resourceType,
        this.setup,
        this.score,
        this.issued,
        this.test,
        newValue,
        this.extension,
        this.result,
        this.language,
        this.name,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestReport#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestReport withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableTestReport(
        this.text,
        this.id,
        this.implicitRules,
        this.identifier,
        this.testScript,
        this.meta,
        this.tester,
        this.status,
        this.teardown,
        this.contained,
        this.resourceType,
        this.setup,
        this.score,
        this.issued,
        this.test,
        value,
        this.extension,
        this.result,
        this.language,
        this.name,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestReport#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestReport withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableTestReport(
        this.text,
        this.id,
        this.implicitRules,
        this.identifier,
        this.testScript,
        this.meta,
        this.tester,
        this.status,
        this.teardown,
        this.contained,
        this.resourceType,
        this.setup,
        this.score,
        this.issued,
        this.test,
        this.modifierExtension,
        newValue,
        this.result,
        this.language,
        this.name,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestReport#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestReport withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableTestReport(
        this.text,
        this.id,
        this.implicitRules,
        this.identifier,
        this.testScript,
        this.meta,
        this.tester,
        this.status,
        this.teardown,
        this.contained,
        this.resourceType,
        this.setup,
        this.score,
        this.issued,
        this.test,
        this.modifierExtension,
        value,
        this.result,
        this.language,
        this.name,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestReport#result() result} attribute.
   * @param value The value for result
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestReport withResult(com.fhir.TestreportResult value) {
    @javax.annotation.Nullable com.fhir.TestreportResult newValue = java.util.Objects.requireNonNull(value, "result");
    if (this.result == newValue) return this;
    return new ImmutableTestReport(
        this.text,
        this.id,
        this.implicitRules,
        this.identifier,
        this.testScript,
        this.meta,
        this.tester,
        this.status,
        this.teardown,
        this.contained,
        this.resourceType,
        this.setup,
        this.score,
        this.issued,
        this.test,
        this.modifierExtension,
        this.extension,
        newValue,
        this.language,
        this.name,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestReport#result() result} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for result
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestReport withResult(java.util.Optional<? extends com.fhir.TestreportResult> optional) {
    @javax.annotation.Nullable com.fhir.TestreportResult value = optional.orElse(null);
    if (this.result == value) return this;
    return new ImmutableTestReport(
        this.text,
        this.id,
        this.implicitRules,
        this.identifier,
        this.testScript,
        this.meta,
        this.tester,
        this.status,
        this.teardown,
        this.contained,
        this.resourceType,
        this.setup,
        this.score,
        this.issued,
        this.test,
        this.modifierExtension,
        this.extension,
        value,
        this.language,
        this.name,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestReport#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestReport withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableTestReport(
        this.text,
        this.id,
        this.implicitRules,
        this.identifier,
        this.testScript,
        this.meta,
        this.tester,
        this.status,
        this.teardown,
        this.contained,
        this.resourceType,
        this.setup,
        this.score,
        this.issued,
        this.test,
        this.modifierExtension,
        this.extension,
        this.result,
        newValue,
        this.name,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestReport#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestReport withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableTestReport(
        this.text,
        this.id,
        this.implicitRules,
        this.identifier,
        this.testScript,
        this.meta,
        this.tester,
        this.status,
        this.teardown,
        this.contained,
        this.resourceType,
        this.setup,
        this.score,
        this.issued,
        this.test,
        this.modifierExtension,
        this.extension,
        this.result,
        value,
        this.name,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestReport#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestReport withName(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "name");
    if (java.util.Objects.equals(this.name, newValue)) return this;
    return new ImmutableTestReport(
        this.text,
        this.id,
        this.implicitRules,
        this.identifier,
        this.testScript,
        this.meta,
        this.tester,
        this.status,
        this.teardown,
        this.contained,
        this.resourceType,
        this.setup,
        this.score,
        this.issued,
        this.test,
        this.modifierExtension,
        this.extension,
        this.result,
        this.language,
        newValue,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestReport#name() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestReport withName(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.name, value)) return this;
    return new ImmutableTestReport(
        this.text,
        this.id,
        this.implicitRules,
        this.identifier,
        this.testScript,
        this.meta,
        this.tester,
        this.status,
        this.teardown,
        this.contained,
        this.resourceType,
        this.setup,
        this.score,
        this.issued,
        this.test,
        this.modifierExtension,
        this.extension,
        this.result,
        this.language,
        value,
        this.participant);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestReport#participant() participant} attribute.
   * @param value The value for participant
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestReport withParticipant(java.util.List<com.fhir.TestReport_Participant> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.TestReport_Participant> newValue = java.util.Objects.requireNonNull(value, "participant");
    if (this.participant == newValue) return this;
    return new ImmutableTestReport(
        this.text,
        this.id,
        this.implicitRules,
        this.identifier,
        this.testScript,
        this.meta,
        this.tester,
        this.status,
        this.teardown,
        this.contained,
        this.resourceType,
        this.setup,
        this.score,
        this.issued,
        this.test,
        this.modifierExtension,
        this.extension,
        this.result,
        this.language,
        this.name,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestReport#participant() participant} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for participant
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestReport withParticipant(java.util.Optional<? extends java.util.List<com.fhir.TestReport_Participant>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.TestReport_Participant> value = optional.orElse(null);
    if (this.participant == value) return this;
    return new ImmutableTestReport(
        this.text,
        this.id,
        this.implicitRules,
        this.identifier,
        this.testScript,
        this.meta,
        this.tester,
        this.status,
        this.teardown,
        this.contained,
        this.resourceType,
        this.setup,
        this.score,
        this.issued,
        this.test,
        this.modifierExtension,
        this.extension,
        this.result,
        this.language,
        this.name,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableTestReport} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableTestReport
        && equalTo((ImmutableTestReport) another);
  }

  private boolean equalTo(ImmutableTestReport another) {
    return java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(identifier, another.identifier)
        && testScript.equals(another.testScript)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(tester, another.tester)
        && java.util.Objects.equals(status, another.status)
        && java.util.Objects.equals(teardown, another.teardown)
        && java.util.Objects.equals(contained, another.contained)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(setup, another.setup)
        && java.util.Objects.equals(score, another.score)
        && java.util.Objects.equals(issued, another.issued)
        && java.util.Objects.equals(test, another.test)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(result, another.result)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(name, another.name)
        && java.util.Objects.equals(participant, another.participant);
  }

  /**
   * Computes a hash code from attributes: {@code text}, {@code id}, {@code implicitRules}, {@code identifier}, {@code testScript}, {@code meta}, {@code tester}, {@code status}, {@code teardown}, {@code contained}, {@code resourceType}, {@code setup}, {@code score}, {@code issued}, {@code test}, {@code modifierExtension}, {@code extension}, {@code result}, {@code language}, {@code name}, {@code participant}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    h += (h << 5) + testScript.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(tester);
    h += (h << 5) + java.util.Objects.hashCode(status);
    h += (h << 5) + java.util.Objects.hashCode(teardown);
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(setup);
    h += (h << 5) + java.util.Objects.hashCode(score);
    h += (h << 5) + java.util.Objects.hashCode(issued);
    h += (h << 5) + java.util.Objects.hashCode(test);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(result);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(name);
    h += (h << 5) + java.util.Objects.hashCode(participant);
    return h;
  }

  /**
   * Prints the immutable value {@code TestReport} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("TestReport{");
    if (text != null) {
      builder.append("text=").append(text);
    }
    if (id != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (implicitRules != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (identifier != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (builder.length() > 11) builder.append(", ");
    builder.append("testScript=").append(testScript);
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (tester != null) {
      builder.append(", ");
      builder.append("tester=").append(tester);
    }
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
    }
    if (teardown != null) {
      builder.append(", ");
      builder.append("teardown=").append(teardown);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (setup != null) {
      builder.append(", ");
      builder.append("setup=").append(setup);
    }
    if (score != null) {
      builder.append(", ");
      builder.append("score=").append(score);
    }
    if (issued != null) {
      builder.append(", ");
      builder.append("issued=").append(issued);
    }
    if (test != null) {
      builder.append(", ");
      builder.append("test=").append(test);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (result != null) {
      builder.append(", ");
      builder.append("result=").append(result);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (name != null) {
      builder.append(", ");
      builder.append("name=").append(name);
    }
    if (participant != null) {
      builder.append(", ");
      builder.append("participant=").append(participant);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "TestReport", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.TestReport {
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Identifier> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @javax.annotation.Nullable com.fhir.Reference testScript;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> tester = java.util.Optional.empty();
    boolean testerIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.TestreportStatus> status = java.util.Optional.empty();
    boolean statusIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.TestReport_Teardown> teardown = java.util.Optional.empty();
    boolean teardownIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<com.fhir.TestReport_Setup> setup = java.util.Optional.empty();
    boolean setupIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.decimal> score = java.util.Optional.empty();
    boolean scoreIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.dateTime> issued = java.util.Optional.empty();
    boolean issuedIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.TestReport_Test>> test = java.util.Optional.empty();
    boolean testIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.TestreportResult> result = java.util.Optional.empty();
    boolean resultIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> name = java.util.Optional.empty();
    boolean nameIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.TestReport_Participant>> participant = java.util.Optional.empty();
    boolean participantIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public void setIdentifier(java.util.Optional<com.fhir.Identifier> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("testScript")
    public void setTestScript(com.fhir.Reference testScript) {
      this.testScript = testScript;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("tester")
    public void setTester(java.util.Optional<java.lang.String> tester) {
      this.tester = tester;
      this.testerIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public void setStatus(java.util.Optional<com.fhir.TestreportStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("teardown")
    public void setTeardown(java.util.Optional<com.fhir.TestReport_Teardown> teardown) {
      this.teardown = teardown;
      this.teardownIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public void setContained(java.util.Optional<java.util.List<com.fhir.ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("setup")
    public void setSetup(java.util.Optional<com.fhir.TestReport_Setup> setup) {
      this.setup = setup;
      this.setupIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("score")
    public void setScore(java.util.Optional<com.fhir.decimal> score) {
      this.score = score;
      this.scoreIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("issued")
    public void setIssued(java.util.Optional<com.fhir.dateTime> issued) {
      this.issued = issued;
      this.issuedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("test")
    public void setTest(java.util.Optional<java.util.List<com.fhir.TestReport_Test>> test) {
      this.test = test;
      this.testIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("result")
    public void setResult(java.util.Optional<com.fhir.TestreportResult> result) {
      this.result = result;
      this.resultIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    public void setName(java.util.Optional<java.lang.String> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("participant")
    public void setParticipant(java.util.Optional<java.util.List<com.fhir.TestReport_Participant>> participant) {
      this.participant = participant;
      this.participantIsSet = true;
    }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Identifier> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.Reference testScript() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> tester() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.TestreportStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.TestReport_Teardown> teardown() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.TestReport_Setup> setup() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.decimal> score() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.dateTime> issued() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.TestReport_Test>> test() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.TestreportResult> result() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> name() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.TestReport_Participant>> participant() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableTestReport fromJson(Json json) {
    ImmutableTestReport.Builder builder = ((ImmutableTestReport.Builder) ImmutableTestReport.builder());
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.testScript != null) {
      builder.testScript(json.testScript);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.testerIsSet) {
      builder.tester(json.tester);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.teardownIsSet) {
      builder.teardown(json.teardown);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.setupIsSet) {
      builder.setup(json.setup);
    }
    if (json.scoreIsSet) {
      builder.score(json.score);
    }
    if (json.issuedIsSet) {
      builder.issued(json.issued);
    }
    if (json.testIsSet) {
      builder.test(json.test);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.resultIsSet) {
      builder.result(json.result);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.participantIsSet) {
      builder.participant(json.participant);
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
        .text(instance.text())
        .id(instance.id())
        .implicitRules(instance.implicitRules())
        .identifier(instance.identifier())
        .testScript(instance.testScript())
        .meta(instance.meta())
        .tester(instance.tester())
        .status(instance.status())
        .teardown(instance.teardown())
        .contained(instance.contained())
        .resourceType(instance.resourceType())
        .setup(instance.setup())
        .score(instance.score())
        .issued(instance.issued())
        .test(instance.test())
        .modifierExtension(instance.modifierExtension())
        .extension(instance.extension())
        .result(instance.result())
        .language(instance.language())
        .name(instance.name())
        .participant(instance.participant())
        .build();
  }

  /**
   * Creates a builder for {@link TestReport TestReport}.
   * <pre>
   * ImmutableTestReport.builder()
   *    .text(com.fhir.Narrative) // optional {@link TestReport#text() text}
   *    .id(com.fhir.id) // optional {@link TestReport#id() id}
   *    .implicitRules(com.fhir.uri) // optional {@link TestReport#implicitRules() implicitRules}
   *    .identifier(com.fhir.Identifier) // optional {@link TestReport#identifier() identifier}
   *    .testScript(com.fhir.Reference) // required {@link TestReport#testScript() testScript}
   *    .meta(com.fhir.Meta) // optional {@link TestReport#meta() meta}
   *    .tester(String) // optional {@link TestReport#tester() tester}
   *    .status(com.fhir.TestreportStatus) // optional {@link TestReport#status() status}
   *    .teardown(com.fhir.TestReport_Teardown) // optional {@link TestReport#teardown() teardown}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link TestReport#contained() contained}
   *    .resourceType(String) // required {@link TestReport#resourceType() resourceType}
   *    .setup(com.fhir.TestReport_Setup) // optional {@link TestReport#setup() setup}
   *    .score(com.fhir.decimal) // optional {@link TestReport#score() score}
   *    .issued(com.fhir.dateTime) // optional {@link TestReport#issued() issued}
   *    .test(List&amp;lt;com.fhir.TestReport_Test&amp;gt;) // optional {@link TestReport#test() test}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link TestReport#modifierExtension() modifierExtension}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link TestReport#extension() extension}
   *    .result(com.fhir.TestreportResult) // optional {@link TestReport#result() result}
   *    .language(com.fhir.code) // optional {@link TestReport#language() language}
   *    .name(String) // optional {@link TestReport#name() name}
   *    .participant(List&amp;lt;com.fhir.TestReport_Participant&amp;gt;) // optional {@link TestReport#participant() participant}
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
  @org.immutables.value.Generated(from = "TestReport", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements TestScriptBuildStage, ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_TEST_SCRIPT = 0x1L;
    private static final long INIT_BIT_RESOURCE_TYPE = 0x2L;
    private static final long OPT_BIT_TEXT = 0x1L;
    private static final long OPT_BIT_ID = 0x2L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x4L;
    private static final long OPT_BIT_IDENTIFIER = 0x8L;
    private static final long OPT_BIT_META = 0x10L;
    private static final long OPT_BIT_TESTER = 0x20L;
    private static final long OPT_BIT_STATUS = 0x40L;
    private static final long OPT_BIT_TEARDOWN = 0x80L;
    private static final long OPT_BIT_CONTAINED = 0x100L;
    private static final long OPT_BIT_SETUP = 0x200L;
    private static final long OPT_BIT_SCORE = 0x400L;
    private static final long OPT_BIT_ISSUED = 0x800L;
    private static final long OPT_BIT_TEST = 0x1000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x2000L;
    private static final long OPT_BIT_EXTENSION = 0x4000L;
    private static final long OPT_BIT_RESULT = 0x8000L;
    private static final long OPT_BIT_LANGUAGE = 0x10000L;
    private static final long OPT_BIT_NAME = 0x20000L;
    private static final long OPT_BIT_PARTICIPANT = 0x40000L;
    private long initBits = 0x3L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable com.fhir.Identifier identifier;
    private @javax.annotation.Nullable com.fhir.Reference testScript;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable java.lang.String tester;
    private @javax.annotation.Nullable com.fhir.TestreportStatus status;
    private @javax.annotation.Nullable com.fhir.TestReport_Teardown teardown;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable com.fhir.TestReport_Setup setup;
    private @javax.annotation.Nullable com.fhir.decimal score;
    private @javax.annotation.Nullable com.fhir.dateTime issued;
    private @javax.annotation.Nullable java.util.List<com.fhir.TestReport_Test> test;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.TestreportResult result;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable java.lang.String name;
    private @javax.annotation.Nullable java.util.List<com.fhir.TestReport_Participant> participant;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link TestReport#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    public final Builder text(com.fhir.Narrative text) {
      checkNotIsSet(textIsSet(), "text");
      this.text = java.util.Objects.requireNonNull(text, "text");
      optBits |= OPT_BIT_TEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link TestReport#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public final Builder text(java.util.Optional<? extends com.fhir.Narrative> text) {
      checkNotIsSet(textIsSet(), "text");
      this.text = text.orElse(null);
      optBits |= OPT_BIT_TEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link TestReport#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(com.fhir.id id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = java.util.Objects.requireNonNull(id, "id");
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link TestReport#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public final Builder id(java.util.Optional<? extends com.fhir.id> id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = id.orElse(null);
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link TestReport#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    public final Builder implicitRules(com.fhir.uri implicitRules) {
      checkNotIsSet(implicitRulesIsSet(), "implicitRules");
      this.implicitRules = java.util.Objects.requireNonNull(implicitRules, "implicitRules");
      optBits |= OPT_BIT_IMPLICIT_RULES;
      return this;
    }

    /**
     * Initializes the optional value {@link TestReport#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public final Builder implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules) {
      checkNotIsSet(implicitRulesIsSet(), "implicitRules");
      this.implicitRules = implicitRules.orElse(null);
      optBits |= OPT_BIT_IMPLICIT_RULES;
      return this;
    }

    /**
     * Initializes the optional value {@link TestReport#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    public final Builder identifier(com.fhir.Identifier identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = java.util.Objects.requireNonNull(identifier, "identifier");
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link TestReport#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public final Builder identifier(java.util.Optional<? extends com.fhir.Identifier> identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = identifier.orElse(null);
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the value for the {@link TestReport#testScript() testScript} attribute.
     * @param testScript The value for testScript 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("testScript")
    public final Builder testScript(com.fhir.Reference testScript) {
      checkNotIsSet(testScriptIsSet(), "testScript");
      this.testScript = java.util.Objects.requireNonNull(testScript, "testScript");
      initBits &= ~INIT_BIT_TEST_SCRIPT;
      return this;
    }

    /**
     * Initializes the optional value {@link TestReport#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    public final Builder meta(com.fhir.Meta meta) {
      checkNotIsSet(metaIsSet(), "meta");
      this.meta = java.util.Objects.requireNonNull(meta, "meta");
      optBits |= OPT_BIT_META;
      return this;
    }

    /**
     * Initializes the optional value {@link TestReport#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public final Builder meta(java.util.Optional<? extends com.fhir.Meta> meta) {
      checkNotIsSet(metaIsSet(), "meta");
      this.meta = meta.orElse(null);
      optBits |= OPT_BIT_META;
      return this;
    }

    /**
     * Initializes the optional value {@link TestReport#tester() tester} to tester.
     * @param tester The value for tester
     * @return {@code this} builder for chained invocation
     */
    public final Builder tester(java.lang.String tester) {
      checkNotIsSet(testerIsSet(), "tester");
      this.tester = java.util.Objects.requireNonNull(tester, "tester");
      optBits |= OPT_BIT_TESTER;
      return this;
    }

    /**
     * Initializes the optional value {@link TestReport#tester() tester} to tester.
     * @param tester The value for tester
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tester")
    public final Builder tester(java.util.Optional<java.lang.String> tester) {
      checkNotIsSet(testerIsSet(), "tester");
      this.tester = tester.orElse(null);
      optBits |= OPT_BIT_TESTER;
      return this;
    }

    /**
     * Initializes the optional value {@link TestReport#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(com.fhir.TestreportStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = java.util.Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link TestReport#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public final Builder status(java.util.Optional<? extends com.fhir.TestreportStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link TestReport#teardown() teardown} to teardown.
     * @param teardown The value for teardown
     * @return {@code this} builder for chained invocation
     */
    public final Builder teardown(com.fhir.TestReport_Teardown teardown) {
      checkNotIsSet(teardownIsSet(), "teardown");
      this.teardown = java.util.Objects.requireNonNull(teardown, "teardown");
      optBits |= OPT_BIT_TEARDOWN;
      return this;
    }

    /**
     * Initializes the optional value {@link TestReport#teardown() teardown} to teardown.
     * @param teardown The value for teardown
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("teardown")
    public final Builder teardown(java.util.Optional<? extends com.fhir.TestReport_Teardown> teardown) {
      checkNotIsSet(teardownIsSet(), "teardown");
      this.teardown = teardown.orElse(null);
      optBits |= OPT_BIT_TEARDOWN;
      return this;
    }

    /**
     * Initializes the optional value {@link TestReport#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    public final Builder contained(java.util.List<com.fhir.ResourceList> contained) {
      checkNotIsSet(containedIsSet(), "contained");
      this.contained = java.util.Objects.requireNonNull(contained, "contained");
      optBits |= OPT_BIT_CONTAINED;
      return this;
    }

    /**
     * Initializes the optional value {@link TestReport#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public final Builder contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained) {
      checkNotIsSet(containedIsSet(), "contained");
      this.contained = contained.orElse(null);
      optBits |= OPT_BIT_CONTAINED;
      return this;
    }

    /**
     * Initializes the value for the {@link TestReport#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public final Builder resourceType(java.lang.String resourceType) {
      checkNotIsSet(resourceTypeIsSet(), "resourceType");
      this.resourceType = java.util.Objects.requireNonNull(resourceType, "resourceType");
      initBits &= ~INIT_BIT_RESOURCE_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link TestReport#setup() setup} to setup.
     * @param setup The value for setup
     * @return {@code this} builder for chained invocation
     */
    public final Builder setup(com.fhir.TestReport_Setup setup) {
      checkNotIsSet(setupIsSet(), "setup");
      this.setup = java.util.Objects.requireNonNull(setup, "setup");
      optBits |= OPT_BIT_SETUP;
      return this;
    }

    /**
     * Initializes the optional value {@link TestReport#setup() setup} to setup.
     * @param setup The value for setup
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("setup")
    public final Builder setup(java.util.Optional<? extends com.fhir.TestReport_Setup> setup) {
      checkNotIsSet(setupIsSet(), "setup");
      this.setup = setup.orElse(null);
      optBits |= OPT_BIT_SETUP;
      return this;
    }

    /**
     * Initializes the optional value {@link TestReport#score() score} to score.
     * @param score The value for score
     * @return {@code this} builder for chained invocation
     */
    public final Builder score(com.fhir.decimal score) {
      checkNotIsSet(scoreIsSet(), "score");
      this.score = java.util.Objects.requireNonNull(score, "score");
      optBits |= OPT_BIT_SCORE;
      return this;
    }

    /**
     * Initializes the optional value {@link TestReport#score() score} to score.
     * @param score The value for score
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("score")
    public final Builder score(java.util.Optional<? extends com.fhir.decimal> score) {
      checkNotIsSet(scoreIsSet(), "score");
      this.score = score.orElse(null);
      optBits |= OPT_BIT_SCORE;
      return this;
    }

    /**
     * Initializes the optional value {@link TestReport#issued() issued} to issued.
     * @param issued The value for issued
     * @return {@code this} builder for chained invocation
     */
    public final Builder issued(com.fhir.dateTime issued) {
      checkNotIsSet(issuedIsSet(), "issued");
      this.issued = java.util.Objects.requireNonNull(issued, "issued");
      optBits |= OPT_BIT_ISSUED;
      return this;
    }

    /**
     * Initializes the optional value {@link TestReport#issued() issued} to issued.
     * @param issued The value for issued
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("issued")
    public final Builder issued(java.util.Optional<? extends com.fhir.dateTime> issued) {
      checkNotIsSet(issuedIsSet(), "issued");
      this.issued = issued.orElse(null);
      optBits |= OPT_BIT_ISSUED;
      return this;
    }

    /**
     * Initializes the optional value {@link TestReport#test() test} to test.
     * @param test The value for test
     * @return {@code this} builder for chained invocation
     */
    public final Builder test(java.util.List<com.fhir.TestReport_Test> test) {
      checkNotIsSet(testIsSet(), "test");
      this.test = java.util.Objects.requireNonNull(test, "test");
      optBits |= OPT_BIT_TEST;
      return this;
    }

    /**
     * Initializes the optional value {@link TestReport#test() test} to test.
     * @param test The value for test
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("test")
    public final Builder test(java.util.Optional<? extends java.util.List<com.fhir.TestReport_Test>> test) {
      checkNotIsSet(testIsSet(), "test");
      this.test = test.orElse(null);
      optBits |= OPT_BIT_TEST;
      return this;
    }

    /**
     * Initializes the optional value {@link TestReport#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    public final Builder modifierExtension(java.util.List<com.fhir.Extension> modifierExtension) {
      checkNotIsSet(modifierExtensionIsSet(), "modifierExtension");
      this.modifierExtension = java.util.Objects.requireNonNull(modifierExtension, "modifierExtension");
      optBits |= OPT_BIT_MODIFIER_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link TestReport#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public final Builder modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension) {
      checkNotIsSet(modifierExtensionIsSet(), "modifierExtension");
      this.modifierExtension = modifierExtension.orElse(null);
      optBits |= OPT_BIT_MODIFIER_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link TestReport#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    public final Builder extension(java.util.List<com.fhir.Extension> extension) {
      checkNotIsSet(extensionIsSet(), "extension");
      this.extension = java.util.Objects.requireNonNull(extension, "extension");
      optBits |= OPT_BIT_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link TestReport#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public final Builder extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension) {
      checkNotIsSet(extensionIsSet(), "extension");
      this.extension = extension.orElse(null);
      optBits |= OPT_BIT_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link TestReport#result() result} to result.
     * @param result The value for result
     * @return {@code this} builder for chained invocation
     */
    public final Builder result(com.fhir.TestreportResult result) {
      checkNotIsSet(resultIsSet(), "result");
      this.result = java.util.Objects.requireNonNull(result, "result");
      optBits |= OPT_BIT_RESULT;
      return this;
    }

    /**
     * Initializes the optional value {@link TestReport#result() result} to result.
     * @param result The value for result
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("result")
    public final Builder result(java.util.Optional<? extends com.fhir.TestreportResult> result) {
      checkNotIsSet(resultIsSet(), "result");
      this.result = result.orElse(null);
      optBits |= OPT_BIT_RESULT;
      return this;
    }

    /**
     * Initializes the optional value {@link TestReport#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    public final Builder language(com.fhir.code language) {
      checkNotIsSet(languageIsSet(), "language");
      this.language = java.util.Objects.requireNonNull(language, "language");
      optBits |= OPT_BIT_LANGUAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link TestReport#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public final Builder language(java.util.Optional<? extends com.fhir.code> language) {
      checkNotIsSet(languageIsSet(), "language");
      this.language = language.orElse(null);
      optBits |= OPT_BIT_LANGUAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link TestReport#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    public final Builder name(java.lang.String name) {
      checkNotIsSet(nameIsSet(), "name");
      this.name = java.util.Objects.requireNonNull(name, "name");
      optBits |= OPT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link TestReport#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    public final Builder name(java.util.Optional<java.lang.String> name) {
      checkNotIsSet(nameIsSet(), "name");
      this.name = name.orElse(null);
      optBits |= OPT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link TestReport#participant() participant} to participant.
     * @param participant The value for participant
     * @return {@code this} builder for chained invocation
     */
    public final Builder participant(java.util.List<com.fhir.TestReport_Participant> participant) {
      checkNotIsSet(participantIsSet(), "participant");
      this.participant = java.util.Objects.requireNonNull(participant, "participant");
      optBits |= OPT_BIT_PARTICIPANT;
      return this;
    }

    /**
     * Initializes the optional value {@link TestReport#participant() participant} to participant.
     * @param participant The value for participant
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("participant")
    public final Builder participant(java.util.Optional<? extends java.util.List<com.fhir.TestReport_Participant>> participant) {
      checkNotIsSet(participantIsSet(), "participant");
      this.participant = participant.orElse(null);
      optBits |= OPT_BIT_PARTICIPANT;
      return this;
    }

    /**
     * Builds a new {@link TestReport TestReport}.
     * @return An immutable instance of TestReport
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.TestReport build() {
      checkRequiredAttributes();
      return new ImmutableTestReport(
          text,
          id,
          implicitRules,
          identifier,
          testScript,
          meta,
          tester,
          status,
          teardown,
          contained,
          resourceType,
          setup,
          score,
          issued,
          test,
          modifierExtension,
          extension,
          result,
          language,
          name,
          participant);
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean testerIsSet() {
      return (optBits & OPT_BIT_TESTER) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean teardownIsSet() {
      return (optBits & OPT_BIT_TEARDOWN) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean setupIsSet() {
      return (optBits & OPT_BIT_SETUP) != 0;
    }

    private boolean scoreIsSet() {
      return (optBits & OPT_BIT_SCORE) != 0;
    }

    private boolean issuedIsSet() {
      return (optBits & OPT_BIT_ISSUED) != 0;
    }

    private boolean testIsSet() {
      return (optBits & OPT_BIT_TEST) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean resultIsSet() {
      return (optBits & OPT_BIT_RESULT) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean participantIsSet() {
      return (optBits & OPT_BIT_PARTICIPANT) != 0;
    }

    private boolean testScriptIsSet() {
      return (initBits & INIT_BIT_TEST_SCRIPT) == 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of TestReport is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!testScriptIsSet()) attributes.add("testScript");
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build TestReport, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "TestReport", generator = "Immutables")
  public interface TestScriptBuildStage {
    /**
     * Initializes the value for the {@link TestReport#testScript() testScript} attribute.
     * @param testScript The value for testScript 
     * @return {@code this} builder for use in a chained invocation
     */
    ResourceTypeBuildStage testScript(com.fhir.Reference testScript);
  }

  @org.immutables.value.Generated(from = "TestReport", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link TestReport#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "TestReport", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link TestReport#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link TestReport#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link TestReport#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link TestReport#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link TestReport#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link TestReport#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link TestReport#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(com.fhir.Identifier identifier);

    /**
     * Initializes the optional value {@link TestReport#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(java.util.Optional<? extends com.fhir.Identifier> identifier);

    /**
     * Initializes the optional value {@link TestReport#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link TestReport#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link TestReport#tester() tester} to tester.
     * @param tester The value for tester
     * @return {@code this} builder for chained invocation
     */
    BuildFinal tester(java.lang.String tester);

    /**
     * Initializes the optional value {@link TestReport#tester() tester} to tester.
     * @param tester The value for tester
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal tester(java.util.Optional<java.lang.String> tester);

    /**
     * Initializes the optional value {@link TestReport#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(com.fhir.TestreportStatus status);

    /**
     * Initializes the optional value {@link TestReport#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(java.util.Optional<? extends com.fhir.TestreportStatus> status);

    /**
     * Initializes the optional value {@link TestReport#teardown() teardown} to teardown.
     * @param teardown The value for teardown
     * @return {@code this} builder for chained invocation
     */
    BuildFinal teardown(com.fhir.TestReport_Teardown teardown);

    /**
     * Initializes the optional value {@link TestReport#teardown() teardown} to teardown.
     * @param teardown The value for teardown
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal teardown(java.util.Optional<? extends com.fhir.TestReport_Teardown> teardown);

    /**
     * Initializes the optional value {@link TestReport#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link TestReport#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link TestReport#setup() setup} to setup.
     * @param setup The value for setup
     * @return {@code this} builder for chained invocation
     */
    BuildFinal setup(com.fhir.TestReport_Setup setup);

    /**
     * Initializes the optional value {@link TestReport#setup() setup} to setup.
     * @param setup The value for setup
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal setup(java.util.Optional<? extends com.fhir.TestReport_Setup> setup);

    /**
     * Initializes the optional value {@link TestReport#score() score} to score.
     * @param score The value for score
     * @return {@code this} builder for chained invocation
     */
    BuildFinal score(com.fhir.decimal score);

    /**
     * Initializes the optional value {@link TestReport#score() score} to score.
     * @param score The value for score
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal score(java.util.Optional<? extends com.fhir.decimal> score);

    /**
     * Initializes the optional value {@link TestReport#issued() issued} to issued.
     * @param issued The value for issued
     * @return {@code this} builder for chained invocation
     */
    BuildFinal issued(com.fhir.dateTime issued);

    /**
     * Initializes the optional value {@link TestReport#issued() issued} to issued.
     * @param issued The value for issued
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal issued(java.util.Optional<? extends com.fhir.dateTime> issued);

    /**
     * Initializes the optional value {@link TestReport#test() test} to test.
     * @param test The value for test
     * @return {@code this} builder for chained invocation
     */
    BuildFinal test(java.util.List<com.fhir.TestReport_Test> test);

    /**
     * Initializes the optional value {@link TestReport#test() test} to test.
     * @param test The value for test
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal test(java.util.Optional<? extends java.util.List<com.fhir.TestReport_Test>> test);

    /**
     * Initializes the optional value {@link TestReport#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link TestReport#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link TestReport#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link TestReport#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link TestReport#result() result} to result.
     * @param result The value for result
     * @return {@code this} builder for chained invocation
     */
    BuildFinal result(com.fhir.TestreportResult result);

    /**
     * Initializes the optional value {@link TestReport#result() result} to result.
     * @param result The value for result
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal result(java.util.Optional<? extends com.fhir.TestreportResult> result);

    /**
     * Initializes the optional value {@link TestReport#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link TestReport#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link TestReport#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    BuildFinal name(java.lang.String name);

    /**
     * Initializes the optional value {@link TestReport#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal name(java.util.Optional<java.lang.String> name);

    /**
     * Initializes the optional value {@link TestReport#participant() participant} to participant.
     * @param participant The value for participant
     * @return {@code this} builder for chained invocation
     */
    BuildFinal participant(java.util.List<com.fhir.TestReport_Participant> participant);

    /**
     * Initializes the optional value {@link TestReport#participant() participant} to participant.
     * @param participant The value for participant
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal participant(java.util.Optional<? extends java.util.List<com.fhir.TestReport_Participant>> participant);

    /**
     * Builds a new {@link TestReport TestReport}.
     * @return An immutable instance of TestReport
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    TestReport build();
  }
}
