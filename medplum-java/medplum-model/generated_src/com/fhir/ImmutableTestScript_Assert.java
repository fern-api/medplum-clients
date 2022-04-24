//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link TestScript_Assert}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableTestScript_Assert.builder()}.
 */
@org.immutables.value.Generated(from = "TestScript_Assert", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableTestScript_Assert implements com.fhir.TestScript_Assert {
  private final @javax.annotation.Nullable java.lang.String compareToSourcePath;
  private final @javax.annotation.Nullable com.fhir.code contentType;
  private final @javax.annotation.Nullable java.lang.String headerField;
  private final @javax.annotation.Nullable com.fhir.Testscript_assertDirection direction;
  private final @javax.annotation.Nullable java.lang.Boolean warningOnly;
  private final @javax.annotation.Nullable java.lang.String label;
  private final @javax.annotation.Nullable java.lang.String minimumId;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable java.lang.String compareToSourceId;
  private final @javax.annotation.Nullable com.fhir.id sourceId;
  private final @javax.annotation.Nullable java.lang.String description;
  private final @javax.annotation.Nullable java.lang.String path;
  private final @javax.annotation.Nullable com.fhir.code resource;
  private final @javax.annotation.Nullable com.fhir.id validateProfileId;
  private final @javax.annotation.Nullable java.lang.String compareToSourceExpression;
  private final @javax.annotation.Nullable java.lang.String responseCode;
  private final @javax.annotation.Nullable com.fhir.Testscript_assertResponse response;
  private final @javax.annotation.Nullable java.lang.String value;
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable com.fhir.Testscript_assertOperator operator;
  private final @javax.annotation.Nullable java.lang.String expression;
  private final @javax.annotation.Nullable com.fhir.Testscript_assertRequestmethod requestMethod;
  private final @javax.annotation.Nullable java.lang.Boolean navigationLinks;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable java.lang.String requestURL;

  private ImmutableTestScript_Assert(
      @javax.annotation.Nullable java.lang.String compareToSourcePath,
      @javax.annotation.Nullable com.fhir.code contentType,
      @javax.annotation.Nullable java.lang.String headerField,
      @javax.annotation.Nullable com.fhir.Testscript_assertDirection direction,
      @javax.annotation.Nullable java.lang.Boolean warningOnly,
      @javax.annotation.Nullable java.lang.String label,
      @javax.annotation.Nullable java.lang.String minimumId,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable java.lang.String compareToSourceId,
      @javax.annotation.Nullable com.fhir.id sourceId,
      @javax.annotation.Nullable java.lang.String description,
      @javax.annotation.Nullable java.lang.String path,
      @javax.annotation.Nullable com.fhir.code resource,
      @javax.annotation.Nullable com.fhir.id validateProfileId,
      @javax.annotation.Nullable java.lang.String compareToSourceExpression,
      @javax.annotation.Nullable java.lang.String responseCode,
      @javax.annotation.Nullable com.fhir.Testscript_assertResponse response,
      @javax.annotation.Nullable java.lang.String value,
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable com.fhir.Testscript_assertOperator operator,
      @javax.annotation.Nullable java.lang.String expression,
      @javax.annotation.Nullable com.fhir.Testscript_assertRequestmethod requestMethod,
      @javax.annotation.Nullable java.lang.Boolean navigationLinks,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable java.lang.String requestURL) {
    this.compareToSourcePath = compareToSourcePath;
    this.contentType = contentType;
    this.headerField = headerField;
    this.direction = direction;
    this.warningOnly = warningOnly;
    this.label = label;
    this.minimumId = minimumId;
    this.modifierExtension = modifierExtension;
    this.compareToSourceId = compareToSourceId;
    this.sourceId = sourceId;
    this.description = description;
    this.path = path;
    this.resource = resource;
    this.validateProfileId = validateProfileId;
    this.compareToSourceExpression = compareToSourceExpression;
    this.responseCode = responseCode;
    this.response = response;
    this.value = value;
    this.id = id;
    this.operator = operator;
    this.expression = expression;
    this.requestMethod = requestMethod;
    this.navigationLinks = navigationLinks;
    this.extension = extension;
    this.requestURL = requestURL;
  }

  /**
   * @return The value of the {@code compareToSourcePath} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("compareToSourcePath")
  @Override
  public java.util.Optional<java.lang.String> compareToSourcePath() {
    return java.util.Optional.ofNullable(compareToSourcePath);
  }

  /**
   * @return The value of the {@code contentType} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("contentType")
  @Override
  public java.util.Optional<com.fhir.code> contentType() {
    return java.util.Optional.ofNullable(contentType);
  }

  /**
   * @return The value of the {@code headerField} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("headerField")
  @Override
  public java.util.Optional<java.lang.String> headerField() {
    return java.util.Optional.ofNullable(headerField);
  }

  /**
   * @return The value of the {@code direction} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("direction")
  @Override
  public java.util.Optional<com.fhir.Testscript_assertDirection> direction() {
    return java.util.Optional.ofNullable(direction);
  }

  /**
   * @return The value of the {@code warningOnly} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("warningOnly")
  @Override
  public java.util.Optional<java.lang.Boolean> warningOnly() {
    return java.util.Optional.ofNullable(warningOnly);
  }

  /**
   * @return The value of the {@code label} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("label")
  @Override
  public java.util.Optional<java.lang.String> label() {
    return java.util.Optional.ofNullable(label);
  }

  /**
   * @return The value of the {@code minimumId} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("minimumId")
  @Override
  public java.util.Optional<java.lang.String> minimumId() {
    return java.util.Optional.ofNullable(minimumId);
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
   * @return The value of the {@code compareToSourceId} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("compareToSourceId")
  @Override
  public java.util.Optional<java.lang.String> compareToSourceId() {
    return java.util.Optional.ofNullable(compareToSourceId);
  }

  /**
   * @return The value of the {@code sourceId} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("sourceId")
  @Override
  public java.util.Optional<com.fhir.id> sourceId() {
    return java.util.Optional.ofNullable(sourceId);
  }

  /**
   * @return The value of the {@code description} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("description")
  @Override
  public java.util.Optional<java.lang.String> description() {
    return java.util.Optional.ofNullable(description);
  }

  /**
   * @return The value of the {@code path} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("path")
  @Override
  public java.util.Optional<java.lang.String> path() {
    return java.util.Optional.ofNullable(path);
  }

  /**
   * @return The value of the {@code resource} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("resource")
  @Override
  public java.util.Optional<com.fhir.code> resource() {
    return java.util.Optional.ofNullable(resource);
  }

  /**
   * @return The value of the {@code validateProfileId} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("validateProfileId")
  @Override
  public java.util.Optional<com.fhir.id> validateProfileId() {
    return java.util.Optional.ofNullable(validateProfileId);
  }

  /**
   * @return The value of the {@code compareToSourceExpression} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("compareToSourceExpression")
  @Override
  public java.util.Optional<java.lang.String> compareToSourceExpression() {
    return java.util.Optional.ofNullable(compareToSourceExpression);
  }

  /**
   * @return The value of the {@code responseCode} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("responseCode")
  @Override
  public java.util.Optional<java.lang.String> responseCode() {
    return java.util.Optional.ofNullable(responseCode);
  }

  /**
   * @return The value of the {@code response} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("response")
  @Override
  public java.util.Optional<com.fhir.Testscript_assertResponse> response() {
    return java.util.Optional.ofNullable(response);
  }

  /**
   * @return The value of the {@code value} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("value")
  @Override
  public java.util.Optional<java.lang.String> value() {
    return java.util.Optional.ofNullable(value);
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("id")
  @Override
  public java.util.Optional<java.lang.String> id() {
    return java.util.Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code operator} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("operator")
  @Override
  public java.util.Optional<com.fhir.Testscript_assertOperator> operator() {
    return java.util.Optional.ofNullable(operator);
  }

  /**
   * @return The value of the {@code expression} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("expression")
  @Override
  public java.util.Optional<java.lang.String> expression() {
    return java.util.Optional.ofNullable(expression);
  }

  /**
   * @return The value of the {@code requestMethod} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("requestMethod")
  @Override
  public java.util.Optional<com.fhir.Testscript_assertRequestmethod> requestMethod() {
    return java.util.Optional.ofNullable(requestMethod);
  }

  /**
   * @return The value of the {@code navigationLinks} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("navigationLinks")
  @Override
  public java.util.Optional<java.lang.Boolean> navigationLinks() {
    return java.util.Optional.ofNullable(navigationLinks);
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
   * @return The value of the {@code requestURL} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("requestURL")
  @Override
  public java.util.Optional<java.lang.String> requestURL() {
    return java.util.Optional.ofNullable(requestURL);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Assert#compareToSourcePath() compareToSourcePath} attribute.
   * @param value The value for compareToSourcePath
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Assert withCompareToSourcePath(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "compareToSourcePath");
    if (java.util.Objects.equals(this.compareToSourcePath, newValue)) return this;
    return new ImmutableTestScript_Assert(
        newValue,
        this.contentType,
        this.headerField,
        this.direction,
        this.warningOnly,
        this.label,
        this.minimumId,
        this.modifierExtension,
        this.compareToSourceId,
        this.sourceId,
        this.description,
        this.path,
        this.resource,
        this.validateProfileId,
        this.compareToSourceExpression,
        this.responseCode,
        this.response,
        this.value,
        this.id,
        this.operator,
        this.expression,
        this.requestMethod,
        this.navigationLinks,
        this.extension,
        this.requestURL);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Assert#compareToSourcePath() compareToSourcePath} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for compareToSourcePath
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Assert withCompareToSourcePath(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.compareToSourcePath, value)) return this;
    return new ImmutableTestScript_Assert(
        value,
        this.contentType,
        this.headerField,
        this.direction,
        this.warningOnly,
        this.label,
        this.minimumId,
        this.modifierExtension,
        this.compareToSourceId,
        this.sourceId,
        this.description,
        this.path,
        this.resource,
        this.validateProfileId,
        this.compareToSourceExpression,
        this.responseCode,
        this.response,
        this.value,
        this.id,
        this.operator,
        this.expression,
        this.requestMethod,
        this.navigationLinks,
        this.extension,
        this.requestURL);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Assert#contentType() contentType} attribute.
   * @param value The value for contentType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Assert withContentType(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "contentType");
    if (this.contentType == newValue) return this;
    return new ImmutableTestScript_Assert(
        this.compareToSourcePath,
        newValue,
        this.headerField,
        this.direction,
        this.warningOnly,
        this.label,
        this.minimumId,
        this.modifierExtension,
        this.compareToSourceId,
        this.sourceId,
        this.description,
        this.path,
        this.resource,
        this.validateProfileId,
        this.compareToSourceExpression,
        this.responseCode,
        this.response,
        this.value,
        this.id,
        this.operator,
        this.expression,
        this.requestMethod,
        this.navigationLinks,
        this.extension,
        this.requestURL);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Assert#contentType() contentType} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contentType
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript_Assert withContentType(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.contentType == value) return this;
    return new ImmutableTestScript_Assert(
        this.compareToSourcePath,
        value,
        this.headerField,
        this.direction,
        this.warningOnly,
        this.label,
        this.minimumId,
        this.modifierExtension,
        this.compareToSourceId,
        this.sourceId,
        this.description,
        this.path,
        this.resource,
        this.validateProfileId,
        this.compareToSourceExpression,
        this.responseCode,
        this.response,
        this.value,
        this.id,
        this.operator,
        this.expression,
        this.requestMethod,
        this.navigationLinks,
        this.extension,
        this.requestURL);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Assert#headerField() headerField} attribute.
   * @param value The value for headerField
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Assert withHeaderField(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "headerField");
    if (java.util.Objects.equals(this.headerField, newValue)) return this;
    return new ImmutableTestScript_Assert(
        this.compareToSourcePath,
        this.contentType,
        newValue,
        this.direction,
        this.warningOnly,
        this.label,
        this.minimumId,
        this.modifierExtension,
        this.compareToSourceId,
        this.sourceId,
        this.description,
        this.path,
        this.resource,
        this.validateProfileId,
        this.compareToSourceExpression,
        this.responseCode,
        this.response,
        this.value,
        this.id,
        this.operator,
        this.expression,
        this.requestMethod,
        this.navigationLinks,
        this.extension,
        this.requestURL);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Assert#headerField() headerField} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for headerField
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Assert withHeaderField(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.headerField, value)) return this;
    return new ImmutableTestScript_Assert(
        this.compareToSourcePath,
        this.contentType,
        value,
        this.direction,
        this.warningOnly,
        this.label,
        this.minimumId,
        this.modifierExtension,
        this.compareToSourceId,
        this.sourceId,
        this.description,
        this.path,
        this.resource,
        this.validateProfileId,
        this.compareToSourceExpression,
        this.responseCode,
        this.response,
        this.value,
        this.id,
        this.operator,
        this.expression,
        this.requestMethod,
        this.navigationLinks,
        this.extension,
        this.requestURL);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Assert#direction() direction} attribute.
   * @param value The value for direction
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Assert withDirection(com.fhir.Testscript_assertDirection value) {
    @javax.annotation.Nullable com.fhir.Testscript_assertDirection newValue = java.util.Objects.requireNonNull(value, "direction");
    if (this.direction == newValue) return this;
    return new ImmutableTestScript_Assert(
        this.compareToSourcePath,
        this.contentType,
        this.headerField,
        newValue,
        this.warningOnly,
        this.label,
        this.minimumId,
        this.modifierExtension,
        this.compareToSourceId,
        this.sourceId,
        this.description,
        this.path,
        this.resource,
        this.validateProfileId,
        this.compareToSourceExpression,
        this.responseCode,
        this.response,
        this.value,
        this.id,
        this.operator,
        this.expression,
        this.requestMethod,
        this.navigationLinks,
        this.extension,
        this.requestURL);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Assert#direction() direction} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for direction
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript_Assert withDirection(java.util.Optional<? extends com.fhir.Testscript_assertDirection> optional) {
    @javax.annotation.Nullable com.fhir.Testscript_assertDirection value = optional.orElse(null);
    if (this.direction == value) return this;
    return new ImmutableTestScript_Assert(
        this.compareToSourcePath,
        this.contentType,
        this.headerField,
        value,
        this.warningOnly,
        this.label,
        this.minimumId,
        this.modifierExtension,
        this.compareToSourceId,
        this.sourceId,
        this.description,
        this.path,
        this.resource,
        this.validateProfileId,
        this.compareToSourceExpression,
        this.responseCode,
        this.response,
        this.value,
        this.id,
        this.operator,
        this.expression,
        this.requestMethod,
        this.navigationLinks,
        this.extension,
        this.requestURL);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Assert#warningOnly() warningOnly} attribute.
   * @param value The value for warningOnly
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Assert withWarningOnly(boolean value) {
    @javax.annotation.Nullable java.lang.Boolean newValue = value;
    if (java.util.Objects.equals(this.warningOnly, newValue)) return this;
    return new ImmutableTestScript_Assert(
        this.compareToSourcePath,
        this.contentType,
        this.headerField,
        this.direction,
        newValue,
        this.label,
        this.minimumId,
        this.modifierExtension,
        this.compareToSourceId,
        this.sourceId,
        this.description,
        this.path,
        this.resource,
        this.validateProfileId,
        this.compareToSourceExpression,
        this.responseCode,
        this.response,
        this.value,
        this.id,
        this.operator,
        this.expression,
        this.requestMethod,
        this.navigationLinks,
        this.extension,
        this.requestURL);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Assert#warningOnly() warningOnly} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for warningOnly
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Assert withWarningOnly(java.util.Optional<java.lang.Boolean> optional) {
    @javax.annotation.Nullable java.lang.Boolean value = optional.orElse(null);
    if (java.util.Objects.equals(this.warningOnly, value)) return this;
    return new ImmutableTestScript_Assert(
        this.compareToSourcePath,
        this.contentType,
        this.headerField,
        this.direction,
        value,
        this.label,
        this.minimumId,
        this.modifierExtension,
        this.compareToSourceId,
        this.sourceId,
        this.description,
        this.path,
        this.resource,
        this.validateProfileId,
        this.compareToSourceExpression,
        this.responseCode,
        this.response,
        this.value,
        this.id,
        this.operator,
        this.expression,
        this.requestMethod,
        this.navigationLinks,
        this.extension,
        this.requestURL);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Assert#label() label} attribute.
   * @param value The value for label
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Assert withLabel(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "label");
    if (java.util.Objects.equals(this.label, newValue)) return this;
    return new ImmutableTestScript_Assert(
        this.compareToSourcePath,
        this.contentType,
        this.headerField,
        this.direction,
        this.warningOnly,
        newValue,
        this.minimumId,
        this.modifierExtension,
        this.compareToSourceId,
        this.sourceId,
        this.description,
        this.path,
        this.resource,
        this.validateProfileId,
        this.compareToSourceExpression,
        this.responseCode,
        this.response,
        this.value,
        this.id,
        this.operator,
        this.expression,
        this.requestMethod,
        this.navigationLinks,
        this.extension,
        this.requestURL);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Assert#label() label} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for label
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Assert withLabel(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.label, value)) return this;
    return new ImmutableTestScript_Assert(
        this.compareToSourcePath,
        this.contentType,
        this.headerField,
        this.direction,
        this.warningOnly,
        value,
        this.minimumId,
        this.modifierExtension,
        this.compareToSourceId,
        this.sourceId,
        this.description,
        this.path,
        this.resource,
        this.validateProfileId,
        this.compareToSourceExpression,
        this.responseCode,
        this.response,
        this.value,
        this.id,
        this.operator,
        this.expression,
        this.requestMethod,
        this.navigationLinks,
        this.extension,
        this.requestURL);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Assert#minimumId() minimumId} attribute.
   * @param value The value for minimumId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Assert withMinimumId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "minimumId");
    if (java.util.Objects.equals(this.minimumId, newValue)) return this;
    return new ImmutableTestScript_Assert(
        this.compareToSourcePath,
        this.contentType,
        this.headerField,
        this.direction,
        this.warningOnly,
        this.label,
        newValue,
        this.modifierExtension,
        this.compareToSourceId,
        this.sourceId,
        this.description,
        this.path,
        this.resource,
        this.validateProfileId,
        this.compareToSourceExpression,
        this.responseCode,
        this.response,
        this.value,
        this.id,
        this.operator,
        this.expression,
        this.requestMethod,
        this.navigationLinks,
        this.extension,
        this.requestURL);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Assert#minimumId() minimumId} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for minimumId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Assert withMinimumId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.minimumId, value)) return this;
    return new ImmutableTestScript_Assert(
        this.compareToSourcePath,
        this.contentType,
        this.headerField,
        this.direction,
        this.warningOnly,
        this.label,
        value,
        this.modifierExtension,
        this.compareToSourceId,
        this.sourceId,
        this.description,
        this.path,
        this.resource,
        this.validateProfileId,
        this.compareToSourceExpression,
        this.responseCode,
        this.response,
        this.value,
        this.id,
        this.operator,
        this.expression,
        this.requestMethod,
        this.navigationLinks,
        this.extension,
        this.requestURL);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Assert#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Assert withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableTestScript_Assert(
        this.compareToSourcePath,
        this.contentType,
        this.headerField,
        this.direction,
        this.warningOnly,
        this.label,
        this.minimumId,
        newValue,
        this.compareToSourceId,
        this.sourceId,
        this.description,
        this.path,
        this.resource,
        this.validateProfileId,
        this.compareToSourceExpression,
        this.responseCode,
        this.response,
        this.value,
        this.id,
        this.operator,
        this.expression,
        this.requestMethod,
        this.navigationLinks,
        this.extension,
        this.requestURL);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Assert#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript_Assert withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableTestScript_Assert(
        this.compareToSourcePath,
        this.contentType,
        this.headerField,
        this.direction,
        this.warningOnly,
        this.label,
        this.minimumId,
        value,
        this.compareToSourceId,
        this.sourceId,
        this.description,
        this.path,
        this.resource,
        this.validateProfileId,
        this.compareToSourceExpression,
        this.responseCode,
        this.response,
        this.value,
        this.id,
        this.operator,
        this.expression,
        this.requestMethod,
        this.navigationLinks,
        this.extension,
        this.requestURL);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Assert#compareToSourceId() compareToSourceId} attribute.
   * @param value The value for compareToSourceId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Assert withCompareToSourceId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "compareToSourceId");
    if (java.util.Objects.equals(this.compareToSourceId, newValue)) return this;
    return new ImmutableTestScript_Assert(
        this.compareToSourcePath,
        this.contentType,
        this.headerField,
        this.direction,
        this.warningOnly,
        this.label,
        this.minimumId,
        this.modifierExtension,
        newValue,
        this.sourceId,
        this.description,
        this.path,
        this.resource,
        this.validateProfileId,
        this.compareToSourceExpression,
        this.responseCode,
        this.response,
        this.value,
        this.id,
        this.operator,
        this.expression,
        this.requestMethod,
        this.navigationLinks,
        this.extension,
        this.requestURL);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Assert#compareToSourceId() compareToSourceId} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for compareToSourceId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Assert withCompareToSourceId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.compareToSourceId, value)) return this;
    return new ImmutableTestScript_Assert(
        this.compareToSourcePath,
        this.contentType,
        this.headerField,
        this.direction,
        this.warningOnly,
        this.label,
        this.minimumId,
        this.modifierExtension,
        value,
        this.sourceId,
        this.description,
        this.path,
        this.resource,
        this.validateProfileId,
        this.compareToSourceExpression,
        this.responseCode,
        this.response,
        this.value,
        this.id,
        this.operator,
        this.expression,
        this.requestMethod,
        this.navigationLinks,
        this.extension,
        this.requestURL);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Assert#sourceId() sourceId} attribute.
   * @param value The value for sourceId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Assert withSourceId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "sourceId");
    if (this.sourceId == newValue) return this;
    return new ImmutableTestScript_Assert(
        this.compareToSourcePath,
        this.contentType,
        this.headerField,
        this.direction,
        this.warningOnly,
        this.label,
        this.minimumId,
        this.modifierExtension,
        this.compareToSourceId,
        newValue,
        this.description,
        this.path,
        this.resource,
        this.validateProfileId,
        this.compareToSourceExpression,
        this.responseCode,
        this.response,
        this.value,
        this.id,
        this.operator,
        this.expression,
        this.requestMethod,
        this.navigationLinks,
        this.extension,
        this.requestURL);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Assert#sourceId() sourceId} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for sourceId
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript_Assert withSourceId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.sourceId == value) return this;
    return new ImmutableTestScript_Assert(
        this.compareToSourcePath,
        this.contentType,
        this.headerField,
        this.direction,
        this.warningOnly,
        this.label,
        this.minimumId,
        this.modifierExtension,
        this.compareToSourceId,
        value,
        this.description,
        this.path,
        this.resource,
        this.validateProfileId,
        this.compareToSourceExpression,
        this.responseCode,
        this.response,
        this.value,
        this.id,
        this.operator,
        this.expression,
        this.requestMethod,
        this.navigationLinks,
        this.extension,
        this.requestURL);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Assert#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Assert withDescription(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "description");
    if (java.util.Objects.equals(this.description, newValue)) return this;
    return new ImmutableTestScript_Assert(
        this.compareToSourcePath,
        this.contentType,
        this.headerField,
        this.direction,
        this.warningOnly,
        this.label,
        this.minimumId,
        this.modifierExtension,
        this.compareToSourceId,
        this.sourceId,
        newValue,
        this.path,
        this.resource,
        this.validateProfileId,
        this.compareToSourceExpression,
        this.responseCode,
        this.response,
        this.value,
        this.id,
        this.operator,
        this.expression,
        this.requestMethod,
        this.navigationLinks,
        this.extension,
        this.requestURL);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Assert#description() description} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Assert withDescription(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.description, value)) return this;
    return new ImmutableTestScript_Assert(
        this.compareToSourcePath,
        this.contentType,
        this.headerField,
        this.direction,
        this.warningOnly,
        this.label,
        this.minimumId,
        this.modifierExtension,
        this.compareToSourceId,
        this.sourceId,
        value,
        this.path,
        this.resource,
        this.validateProfileId,
        this.compareToSourceExpression,
        this.responseCode,
        this.response,
        this.value,
        this.id,
        this.operator,
        this.expression,
        this.requestMethod,
        this.navigationLinks,
        this.extension,
        this.requestURL);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Assert#path() path} attribute.
   * @param value The value for path
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Assert withPath(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "path");
    if (java.util.Objects.equals(this.path, newValue)) return this;
    return new ImmutableTestScript_Assert(
        this.compareToSourcePath,
        this.contentType,
        this.headerField,
        this.direction,
        this.warningOnly,
        this.label,
        this.minimumId,
        this.modifierExtension,
        this.compareToSourceId,
        this.sourceId,
        this.description,
        newValue,
        this.resource,
        this.validateProfileId,
        this.compareToSourceExpression,
        this.responseCode,
        this.response,
        this.value,
        this.id,
        this.operator,
        this.expression,
        this.requestMethod,
        this.navigationLinks,
        this.extension,
        this.requestURL);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Assert#path() path} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for path
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Assert withPath(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.path, value)) return this;
    return new ImmutableTestScript_Assert(
        this.compareToSourcePath,
        this.contentType,
        this.headerField,
        this.direction,
        this.warningOnly,
        this.label,
        this.minimumId,
        this.modifierExtension,
        this.compareToSourceId,
        this.sourceId,
        this.description,
        value,
        this.resource,
        this.validateProfileId,
        this.compareToSourceExpression,
        this.responseCode,
        this.response,
        this.value,
        this.id,
        this.operator,
        this.expression,
        this.requestMethod,
        this.navigationLinks,
        this.extension,
        this.requestURL);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Assert#resource() resource} attribute.
   * @param value The value for resource
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Assert withResource(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "resource");
    if (this.resource == newValue) return this;
    return new ImmutableTestScript_Assert(
        this.compareToSourcePath,
        this.contentType,
        this.headerField,
        this.direction,
        this.warningOnly,
        this.label,
        this.minimumId,
        this.modifierExtension,
        this.compareToSourceId,
        this.sourceId,
        this.description,
        this.path,
        newValue,
        this.validateProfileId,
        this.compareToSourceExpression,
        this.responseCode,
        this.response,
        this.value,
        this.id,
        this.operator,
        this.expression,
        this.requestMethod,
        this.navigationLinks,
        this.extension,
        this.requestURL);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Assert#resource() resource} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for resource
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript_Assert withResource(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.resource == value) return this;
    return new ImmutableTestScript_Assert(
        this.compareToSourcePath,
        this.contentType,
        this.headerField,
        this.direction,
        this.warningOnly,
        this.label,
        this.minimumId,
        this.modifierExtension,
        this.compareToSourceId,
        this.sourceId,
        this.description,
        this.path,
        value,
        this.validateProfileId,
        this.compareToSourceExpression,
        this.responseCode,
        this.response,
        this.value,
        this.id,
        this.operator,
        this.expression,
        this.requestMethod,
        this.navigationLinks,
        this.extension,
        this.requestURL);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Assert#validateProfileId() validateProfileId} attribute.
   * @param value The value for validateProfileId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Assert withValidateProfileId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "validateProfileId");
    if (this.validateProfileId == newValue) return this;
    return new ImmutableTestScript_Assert(
        this.compareToSourcePath,
        this.contentType,
        this.headerField,
        this.direction,
        this.warningOnly,
        this.label,
        this.minimumId,
        this.modifierExtension,
        this.compareToSourceId,
        this.sourceId,
        this.description,
        this.path,
        this.resource,
        newValue,
        this.compareToSourceExpression,
        this.responseCode,
        this.response,
        this.value,
        this.id,
        this.operator,
        this.expression,
        this.requestMethod,
        this.navigationLinks,
        this.extension,
        this.requestURL);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Assert#validateProfileId() validateProfileId} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for validateProfileId
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript_Assert withValidateProfileId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.validateProfileId == value) return this;
    return new ImmutableTestScript_Assert(
        this.compareToSourcePath,
        this.contentType,
        this.headerField,
        this.direction,
        this.warningOnly,
        this.label,
        this.minimumId,
        this.modifierExtension,
        this.compareToSourceId,
        this.sourceId,
        this.description,
        this.path,
        this.resource,
        value,
        this.compareToSourceExpression,
        this.responseCode,
        this.response,
        this.value,
        this.id,
        this.operator,
        this.expression,
        this.requestMethod,
        this.navigationLinks,
        this.extension,
        this.requestURL);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Assert#compareToSourceExpression() compareToSourceExpression} attribute.
   * @param value The value for compareToSourceExpression
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Assert withCompareToSourceExpression(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "compareToSourceExpression");
    if (java.util.Objects.equals(this.compareToSourceExpression, newValue)) return this;
    return new ImmutableTestScript_Assert(
        this.compareToSourcePath,
        this.contentType,
        this.headerField,
        this.direction,
        this.warningOnly,
        this.label,
        this.minimumId,
        this.modifierExtension,
        this.compareToSourceId,
        this.sourceId,
        this.description,
        this.path,
        this.resource,
        this.validateProfileId,
        newValue,
        this.responseCode,
        this.response,
        this.value,
        this.id,
        this.operator,
        this.expression,
        this.requestMethod,
        this.navigationLinks,
        this.extension,
        this.requestURL);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Assert#compareToSourceExpression() compareToSourceExpression} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for compareToSourceExpression
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Assert withCompareToSourceExpression(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.compareToSourceExpression, value)) return this;
    return new ImmutableTestScript_Assert(
        this.compareToSourcePath,
        this.contentType,
        this.headerField,
        this.direction,
        this.warningOnly,
        this.label,
        this.minimumId,
        this.modifierExtension,
        this.compareToSourceId,
        this.sourceId,
        this.description,
        this.path,
        this.resource,
        this.validateProfileId,
        value,
        this.responseCode,
        this.response,
        this.value,
        this.id,
        this.operator,
        this.expression,
        this.requestMethod,
        this.navigationLinks,
        this.extension,
        this.requestURL);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Assert#responseCode() responseCode} attribute.
   * @param value The value for responseCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Assert withResponseCode(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "responseCode");
    if (java.util.Objects.equals(this.responseCode, newValue)) return this;
    return new ImmutableTestScript_Assert(
        this.compareToSourcePath,
        this.contentType,
        this.headerField,
        this.direction,
        this.warningOnly,
        this.label,
        this.minimumId,
        this.modifierExtension,
        this.compareToSourceId,
        this.sourceId,
        this.description,
        this.path,
        this.resource,
        this.validateProfileId,
        this.compareToSourceExpression,
        newValue,
        this.response,
        this.value,
        this.id,
        this.operator,
        this.expression,
        this.requestMethod,
        this.navigationLinks,
        this.extension,
        this.requestURL);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Assert#responseCode() responseCode} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for responseCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Assert withResponseCode(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.responseCode, value)) return this;
    return new ImmutableTestScript_Assert(
        this.compareToSourcePath,
        this.contentType,
        this.headerField,
        this.direction,
        this.warningOnly,
        this.label,
        this.minimumId,
        this.modifierExtension,
        this.compareToSourceId,
        this.sourceId,
        this.description,
        this.path,
        this.resource,
        this.validateProfileId,
        this.compareToSourceExpression,
        value,
        this.response,
        this.value,
        this.id,
        this.operator,
        this.expression,
        this.requestMethod,
        this.navigationLinks,
        this.extension,
        this.requestURL);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Assert#response() response} attribute.
   * @param value The value for response
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Assert withResponse(com.fhir.Testscript_assertResponse value) {
    @javax.annotation.Nullable com.fhir.Testscript_assertResponse newValue = java.util.Objects.requireNonNull(value, "response");
    if (this.response == newValue) return this;
    return new ImmutableTestScript_Assert(
        this.compareToSourcePath,
        this.contentType,
        this.headerField,
        this.direction,
        this.warningOnly,
        this.label,
        this.minimumId,
        this.modifierExtension,
        this.compareToSourceId,
        this.sourceId,
        this.description,
        this.path,
        this.resource,
        this.validateProfileId,
        this.compareToSourceExpression,
        this.responseCode,
        newValue,
        this.value,
        this.id,
        this.operator,
        this.expression,
        this.requestMethod,
        this.navigationLinks,
        this.extension,
        this.requestURL);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Assert#response() response} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for response
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript_Assert withResponse(java.util.Optional<? extends com.fhir.Testscript_assertResponse> optional) {
    @javax.annotation.Nullable com.fhir.Testscript_assertResponse value = optional.orElse(null);
    if (this.response == value) return this;
    return new ImmutableTestScript_Assert(
        this.compareToSourcePath,
        this.contentType,
        this.headerField,
        this.direction,
        this.warningOnly,
        this.label,
        this.minimumId,
        this.modifierExtension,
        this.compareToSourceId,
        this.sourceId,
        this.description,
        this.path,
        this.resource,
        this.validateProfileId,
        this.compareToSourceExpression,
        this.responseCode,
        value,
        this.value,
        this.id,
        this.operator,
        this.expression,
        this.requestMethod,
        this.navigationLinks,
        this.extension,
        this.requestURL);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Assert#value() value} attribute.
   * @param value The value for value
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Assert withValue(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "value");
    if (java.util.Objects.equals(this.value, newValue)) return this;
    return new ImmutableTestScript_Assert(
        this.compareToSourcePath,
        this.contentType,
        this.headerField,
        this.direction,
        this.warningOnly,
        this.label,
        this.minimumId,
        this.modifierExtension,
        this.compareToSourceId,
        this.sourceId,
        this.description,
        this.path,
        this.resource,
        this.validateProfileId,
        this.compareToSourceExpression,
        this.responseCode,
        this.response,
        newValue,
        this.id,
        this.operator,
        this.expression,
        this.requestMethod,
        this.navigationLinks,
        this.extension,
        this.requestURL);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Assert#value() value} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for value
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Assert withValue(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.value, value)) return this;
    return new ImmutableTestScript_Assert(
        this.compareToSourcePath,
        this.contentType,
        this.headerField,
        this.direction,
        this.warningOnly,
        this.label,
        this.minimumId,
        this.modifierExtension,
        this.compareToSourceId,
        this.sourceId,
        this.description,
        this.path,
        this.resource,
        this.validateProfileId,
        this.compareToSourceExpression,
        this.responseCode,
        this.response,
        value,
        this.id,
        this.operator,
        this.expression,
        this.requestMethod,
        this.navigationLinks,
        this.extension,
        this.requestURL);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Assert#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Assert withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableTestScript_Assert(
        this.compareToSourcePath,
        this.contentType,
        this.headerField,
        this.direction,
        this.warningOnly,
        this.label,
        this.minimumId,
        this.modifierExtension,
        this.compareToSourceId,
        this.sourceId,
        this.description,
        this.path,
        this.resource,
        this.validateProfileId,
        this.compareToSourceExpression,
        this.responseCode,
        this.response,
        this.value,
        newValue,
        this.operator,
        this.expression,
        this.requestMethod,
        this.navigationLinks,
        this.extension,
        this.requestURL);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Assert#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Assert withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableTestScript_Assert(
        this.compareToSourcePath,
        this.contentType,
        this.headerField,
        this.direction,
        this.warningOnly,
        this.label,
        this.minimumId,
        this.modifierExtension,
        this.compareToSourceId,
        this.sourceId,
        this.description,
        this.path,
        this.resource,
        this.validateProfileId,
        this.compareToSourceExpression,
        this.responseCode,
        this.response,
        this.value,
        value,
        this.operator,
        this.expression,
        this.requestMethod,
        this.navigationLinks,
        this.extension,
        this.requestURL);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Assert#operator() operator} attribute.
   * @param value The value for operator
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Assert withOperator(com.fhir.Testscript_assertOperator value) {
    @javax.annotation.Nullable com.fhir.Testscript_assertOperator newValue = java.util.Objects.requireNonNull(value, "operator");
    if (this.operator == newValue) return this;
    return new ImmutableTestScript_Assert(
        this.compareToSourcePath,
        this.contentType,
        this.headerField,
        this.direction,
        this.warningOnly,
        this.label,
        this.minimumId,
        this.modifierExtension,
        this.compareToSourceId,
        this.sourceId,
        this.description,
        this.path,
        this.resource,
        this.validateProfileId,
        this.compareToSourceExpression,
        this.responseCode,
        this.response,
        this.value,
        this.id,
        newValue,
        this.expression,
        this.requestMethod,
        this.navigationLinks,
        this.extension,
        this.requestURL);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Assert#operator() operator} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for operator
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript_Assert withOperator(java.util.Optional<? extends com.fhir.Testscript_assertOperator> optional) {
    @javax.annotation.Nullable com.fhir.Testscript_assertOperator value = optional.orElse(null);
    if (this.operator == value) return this;
    return new ImmutableTestScript_Assert(
        this.compareToSourcePath,
        this.contentType,
        this.headerField,
        this.direction,
        this.warningOnly,
        this.label,
        this.minimumId,
        this.modifierExtension,
        this.compareToSourceId,
        this.sourceId,
        this.description,
        this.path,
        this.resource,
        this.validateProfileId,
        this.compareToSourceExpression,
        this.responseCode,
        this.response,
        this.value,
        this.id,
        value,
        this.expression,
        this.requestMethod,
        this.navigationLinks,
        this.extension,
        this.requestURL);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Assert#expression() expression} attribute.
   * @param value The value for expression
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Assert withExpression(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "expression");
    if (java.util.Objects.equals(this.expression, newValue)) return this;
    return new ImmutableTestScript_Assert(
        this.compareToSourcePath,
        this.contentType,
        this.headerField,
        this.direction,
        this.warningOnly,
        this.label,
        this.minimumId,
        this.modifierExtension,
        this.compareToSourceId,
        this.sourceId,
        this.description,
        this.path,
        this.resource,
        this.validateProfileId,
        this.compareToSourceExpression,
        this.responseCode,
        this.response,
        this.value,
        this.id,
        this.operator,
        newValue,
        this.requestMethod,
        this.navigationLinks,
        this.extension,
        this.requestURL);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Assert#expression() expression} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for expression
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Assert withExpression(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.expression, value)) return this;
    return new ImmutableTestScript_Assert(
        this.compareToSourcePath,
        this.contentType,
        this.headerField,
        this.direction,
        this.warningOnly,
        this.label,
        this.minimumId,
        this.modifierExtension,
        this.compareToSourceId,
        this.sourceId,
        this.description,
        this.path,
        this.resource,
        this.validateProfileId,
        this.compareToSourceExpression,
        this.responseCode,
        this.response,
        this.value,
        this.id,
        this.operator,
        value,
        this.requestMethod,
        this.navigationLinks,
        this.extension,
        this.requestURL);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Assert#requestMethod() requestMethod} attribute.
   * @param value The value for requestMethod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Assert withRequestMethod(com.fhir.Testscript_assertRequestmethod value) {
    @javax.annotation.Nullable com.fhir.Testscript_assertRequestmethod newValue = java.util.Objects.requireNonNull(value, "requestMethod");
    if (this.requestMethod == newValue) return this;
    return new ImmutableTestScript_Assert(
        this.compareToSourcePath,
        this.contentType,
        this.headerField,
        this.direction,
        this.warningOnly,
        this.label,
        this.minimumId,
        this.modifierExtension,
        this.compareToSourceId,
        this.sourceId,
        this.description,
        this.path,
        this.resource,
        this.validateProfileId,
        this.compareToSourceExpression,
        this.responseCode,
        this.response,
        this.value,
        this.id,
        this.operator,
        this.expression,
        newValue,
        this.navigationLinks,
        this.extension,
        this.requestURL);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Assert#requestMethod() requestMethod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for requestMethod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript_Assert withRequestMethod(java.util.Optional<? extends com.fhir.Testscript_assertRequestmethod> optional) {
    @javax.annotation.Nullable com.fhir.Testscript_assertRequestmethod value = optional.orElse(null);
    if (this.requestMethod == value) return this;
    return new ImmutableTestScript_Assert(
        this.compareToSourcePath,
        this.contentType,
        this.headerField,
        this.direction,
        this.warningOnly,
        this.label,
        this.minimumId,
        this.modifierExtension,
        this.compareToSourceId,
        this.sourceId,
        this.description,
        this.path,
        this.resource,
        this.validateProfileId,
        this.compareToSourceExpression,
        this.responseCode,
        this.response,
        this.value,
        this.id,
        this.operator,
        this.expression,
        value,
        this.navigationLinks,
        this.extension,
        this.requestURL);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Assert#navigationLinks() navigationLinks} attribute.
   * @param value The value for navigationLinks
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Assert withNavigationLinks(boolean value) {
    @javax.annotation.Nullable java.lang.Boolean newValue = value;
    if (java.util.Objects.equals(this.navigationLinks, newValue)) return this;
    return new ImmutableTestScript_Assert(
        this.compareToSourcePath,
        this.contentType,
        this.headerField,
        this.direction,
        this.warningOnly,
        this.label,
        this.minimumId,
        this.modifierExtension,
        this.compareToSourceId,
        this.sourceId,
        this.description,
        this.path,
        this.resource,
        this.validateProfileId,
        this.compareToSourceExpression,
        this.responseCode,
        this.response,
        this.value,
        this.id,
        this.operator,
        this.expression,
        this.requestMethod,
        newValue,
        this.extension,
        this.requestURL);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Assert#navigationLinks() navigationLinks} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for navigationLinks
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Assert withNavigationLinks(java.util.Optional<java.lang.Boolean> optional) {
    @javax.annotation.Nullable java.lang.Boolean value = optional.orElse(null);
    if (java.util.Objects.equals(this.navigationLinks, value)) return this;
    return new ImmutableTestScript_Assert(
        this.compareToSourcePath,
        this.contentType,
        this.headerField,
        this.direction,
        this.warningOnly,
        this.label,
        this.minimumId,
        this.modifierExtension,
        this.compareToSourceId,
        this.sourceId,
        this.description,
        this.path,
        this.resource,
        this.validateProfileId,
        this.compareToSourceExpression,
        this.responseCode,
        this.response,
        this.value,
        this.id,
        this.operator,
        this.expression,
        this.requestMethod,
        value,
        this.extension,
        this.requestURL);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Assert#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Assert withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableTestScript_Assert(
        this.compareToSourcePath,
        this.contentType,
        this.headerField,
        this.direction,
        this.warningOnly,
        this.label,
        this.minimumId,
        this.modifierExtension,
        this.compareToSourceId,
        this.sourceId,
        this.description,
        this.path,
        this.resource,
        this.validateProfileId,
        this.compareToSourceExpression,
        this.responseCode,
        this.response,
        this.value,
        this.id,
        this.operator,
        this.expression,
        this.requestMethod,
        this.navigationLinks,
        newValue,
        this.requestURL);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Assert#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript_Assert withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableTestScript_Assert(
        this.compareToSourcePath,
        this.contentType,
        this.headerField,
        this.direction,
        this.warningOnly,
        this.label,
        this.minimumId,
        this.modifierExtension,
        this.compareToSourceId,
        this.sourceId,
        this.description,
        this.path,
        this.resource,
        this.validateProfileId,
        this.compareToSourceExpression,
        this.responseCode,
        this.response,
        this.value,
        this.id,
        this.operator,
        this.expression,
        this.requestMethod,
        this.navigationLinks,
        value,
        this.requestURL);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Assert#requestURL() requestURL} attribute.
   * @param value The value for requestURL
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Assert withRequestURL(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "requestURL");
    if (java.util.Objects.equals(this.requestURL, newValue)) return this;
    return new ImmutableTestScript_Assert(
        this.compareToSourcePath,
        this.contentType,
        this.headerField,
        this.direction,
        this.warningOnly,
        this.label,
        this.minimumId,
        this.modifierExtension,
        this.compareToSourceId,
        this.sourceId,
        this.description,
        this.path,
        this.resource,
        this.validateProfileId,
        this.compareToSourceExpression,
        this.responseCode,
        this.response,
        this.value,
        this.id,
        this.operator,
        this.expression,
        this.requestMethod,
        this.navigationLinks,
        this.extension,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Assert#requestURL() requestURL} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for requestURL
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Assert withRequestURL(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.requestURL, value)) return this;
    return new ImmutableTestScript_Assert(
        this.compareToSourcePath,
        this.contentType,
        this.headerField,
        this.direction,
        this.warningOnly,
        this.label,
        this.minimumId,
        this.modifierExtension,
        this.compareToSourceId,
        this.sourceId,
        this.description,
        this.path,
        this.resource,
        this.validateProfileId,
        this.compareToSourceExpression,
        this.responseCode,
        this.response,
        this.value,
        this.id,
        this.operator,
        this.expression,
        this.requestMethod,
        this.navigationLinks,
        this.extension,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableTestScript_Assert} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableTestScript_Assert
        && equalTo((ImmutableTestScript_Assert) another);
  }

  private boolean equalTo(ImmutableTestScript_Assert another) {
    return java.util.Objects.equals(compareToSourcePath, another.compareToSourcePath)
        && java.util.Objects.equals(contentType, another.contentType)
        && java.util.Objects.equals(headerField, another.headerField)
        && java.util.Objects.equals(direction, another.direction)
        && java.util.Objects.equals(warningOnly, another.warningOnly)
        && java.util.Objects.equals(label, another.label)
        && java.util.Objects.equals(minimumId, another.minimumId)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(compareToSourceId, another.compareToSourceId)
        && java.util.Objects.equals(sourceId, another.sourceId)
        && java.util.Objects.equals(description, another.description)
        && java.util.Objects.equals(path, another.path)
        && java.util.Objects.equals(resource, another.resource)
        && java.util.Objects.equals(validateProfileId, another.validateProfileId)
        && java.util.Objects.equals(compareToSourceExpression, another.compareToSourceExpression)
        && java.util.Objects.equals(responseCode, another.responseCode)
        && java.util.Objects.equals(response, another.response)
        && java.util.Objects.equals(value, another.value)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(operator, another.operator)
        && java.util.Objects.equals(expression, another.expression)
        && java.util.Objects.equals(requestMethod, another.requestMethod)
        && java.util.Objects.equals(navigationLinks, another.navigationLinks)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(requestURL, another.requestURL);
  }

  /**
   * Computes a hash code from attributes: {@code compareToSourcePath}, {@code contentType}, {@code headerField}, {@code direction}, {@code warningOnly}, {@code label}, {@code minimumId}, {@code modifierExtension}, {@code compareToSourceId}, {@code sourceId}, {@code description}, {@code path}, {@code resource}, {@code validateProfileId}, {@code compareToSourceExpression}, {@code responseCode}, {@code response}, {@code value}, {@code id}, {@code operator}, {@code expression}, {@code requestMethod}, {@code navigationLinks}, {@code extension}, {@code requestURL}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(compareToSourcePath);
    h += (h << 5) + java.util.Objects.hashCode(contentType);
    h += (h << 5) + java.util.Objects.hashCode(headerField);
    h += (h << 5) + java.util.Objects.hashCode(direction);
    h += (h << 5) + java.util.Objects.hashCode(warningOnly);
    h += (h << 5) + java.util.Objects.hashCode(label);
    h += (h << 5) + java.util.Objects.hashCode(minimumId);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(compareToSourceId);
    h += (h << 5) + java.util.Objects.hashCode(sourceId);
    h += (h << 5) + java.util.Objects.hashCode(description);
    h += (h << 5) + java.util.Objects.hashCode(path);
    h += (h << 5) + java.util.Objects.hashCode(resource);
    h += (h << 5) + java.util.Objects.hashCode(validateProfileId);
    h += (h << 5) + java.util.Objects.hashCode(compareToSourceExpression);
    h += (h << 5) + java.util.Objects.hashCode(responseCode);
    h += (h << 5) + java.util.Objects.hashCode(response);
    h += (h << 5) + java.util.Objects.hashCode(value);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(operator);
    h += (h << 5) + java.util.Objects.hashCode(expression);
    h += (h << 5) + java.util.Objects.hashCode(requestMethod);
    h += (h << 5) + java.util.Objects.hashCode(navigationLinks);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(requestURL);
    return h;
  }

  /**
   * Prints the immutable value {@code TestScript_Assert} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("TestScript_Assert{");
    if (compareToSourcePath != null) {
      builder.append("compareToSourcePath=").append(compareToSourcePath);
    }
    if (contentType != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("contentType=").append(contentType);
    }
    if (headerField != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("headerField=").append(headerField);
    }
    if (direction != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("direction=").append(direction);
    }
    if (warningOnly != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("warningOnly=").append(warningOnly);
    }
    if (label != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("label=").append(label);
    }
    if (minimumId != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("minimumId=").append(minimumId);
    }
    if (modifierExtension != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (compareToSourceId != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("compareToSourceId=").append(compareToSourceId);
    }
    if (sourceId != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("sourceId=").append(sourceId);
    }
    if (description != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("description=").append(description);
    }
    if (path != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("path=").append(path);
    }
    if (resource != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("resource=").append(resource);
    }
    if (validateProfileId != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("validateProfileId=").append(validateProfileId);
    }
    if (compareToSourceExpression != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("compareToSourceExpression=").append(compareToSourceExpression);
    }
    if (responseCode != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("responseCode=").append(responseCode);
    }
    if (response != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("response=").append(response);
    }
    if (value != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("value=").append(value);
    }
    if (id != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (operator != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("operator=").append(operator);
    }
    if (expression != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("expression=").append(expression);
    }
    if (requestMethod != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("requestMethod=").append(requestMethod);
    }
    if (navigationLinks != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("navigationLinks=").append(navigationLinks);
    }
    if (extension != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (requestURL != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("requestURL=").append(requestURL);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "TestScript_Assert", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.TestScript_Assert {
    @javax.annotation.Nullable java.util.Optional<java.lang.String> compareToSourcePath = java.util.Optional.empty();
    boolean compareToSourcePathIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> contentType = java.util.Optional.empty();
    boolean contentTypeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> headerField = java.util.Optional.empty();
    boolean headerFieldIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Testscript_assertDirection> direction = java.util.Optional.empty();
    boolean directionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Boolean> warningOnly = java.util.Optional.empty();
    boolean warningOnlyIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> label = java.util.Optional.empty();
    boolean labelIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> minimumId = java.util.Optional.empty();
    boolean minimumIdIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> compareToSourceId = java.util.Optional.empty();
    boolean compareToSourceIdIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> sourceId = java.util.Optional.empty();
    boolean sourceIdIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> description = java.util.Optional.empty();
    boolean descriptionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> path = java.util.Optional.empty();
    boolean pathIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> resource = java.util.Optional.empty();
    boolean resourceIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> validateProfileId = java.util.Optional.empty();
    boolean validateProfileIdIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> compareToSourceExpression = java.util.Optional.empty();
    boolean compareToSourceExpressionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> responseCode = java.util.Optional.empty();
    boolean responseCodeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Testscript_assertResponse> response = java.util.Optional.empty();
    boolean responseIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> value = java.util.Optional.empty();
    boolean valueIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Testscript_assertOperator> operator = java.util.Optional.empty();
    boolean operatorIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> expression = java.util.Optional.empty();
    boolean expressionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Testscript_assertRequestmethod> requestMethod = java.util.Optional.empty();
    boolean requestMethodIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Boolean> navigationLinks = java.util.Optional.empty();
    boolean navigationLinksIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> requestURL = java.util.Optional.empty();
    boolean requestURLIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("compareToSourcePath")
    public void setCompareToSourcePath(java.util.Optional<java.lang.String> compareToSourcePath) {
      this.compareToSourcePath = compareToSourcePath;
      this.compareToSourcePathIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contentType")
    public void setContentType(java.util.Optional<com.fhir.code> contentType) {
      this.contentType = contentType;
      this.contentTypeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("headerField")
    public void setHeaderField(java.util.Optional<java.lang.String> headerField) {
      this.headerField = headerField;
      this.headerFieldIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("direction")
    public void setDirection(java.util.Optional<com.fhir.Testscript_assertDirection> direction) {
      this.direction = direction;
      this.directionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("warningOnly")
    public void setWarningOnly(java.util.Optional<java.lang.Boolean> warningOnly) {
      this.warningOnly = warningOnly;
      this.warningOnlyIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("label")
    public void setLabel(java.util.Optional<java.lang.String> label) {
      this.label = label;
      this.labelIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("minimumId")
    public void setMinimumId(java.util.Optional<java.lang.String> minimumId) {
      this.minimumId = minimumId;
      this.minimumIdIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("compareToSourceId")
    public void setCompareToSourceId(java.util.Optional<java.lang.String> compareToSourceId) {
      this.compareToSourceId = compareToSourceId;
      this.compareToSourceIdIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("sourceId")
    public void setSourceId(java.util.Optional<com.fhir.id> sourceId) {
      this.sourceId = sourceId;
      this.sourceIdIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    public void setDescription(java.util.Optional<java.lang.String> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("path")
    public void setPath(java.util.Optional<java.lang.String> path) {
      this.path = path;
      this.pathIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resource")
    public void setResource(java.util.Optional<com.fhir.code> resource) {
      this.resource = resource;
      this.resourceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("validateProfileId")
    public void setValidateProfileId(java.util.Optional<com.fhir.id> validateProfileId) {
      this.validateProfileId = validateProfileId;
      this.validateProfileIdIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("compareToSourceExpression")
    public void setCompareToSourceExpression(java.util.Optional<java.lang.String> compareToSourceExpression) {
      this.compareToSourceExpression = compareToSourceExpression;
      this.compareToSourceExpressionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("responseCode")
    public void setResponseCode(java.util.Optional<java.lang.String> responseCode) {
      this.responseCode = responseCode;
      this.responseCodeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("response")
    public void setResponse(java.util.Optional<com.fhir.Testscript_assertResponse> response) {
      this.response = response;
      this.responseIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    public void setValue(java.util.Optional<java.lang.String> value) {
      this.value = value;
      this.valueIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("operator")
    public void setOperator(java.util.Optional<com.fhir.Testscript_assertOperator> operator) {
      this.operator = operator;
      this.operatorIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("expression")
    public void setExpression(java.util.Optional<java.lang.String> expression) {
      this.expression = expression;
      this.expressionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("requestMethod")
    public void setRequestMethod(java.util.Optional<com.fhir.Testscript_assertRequestmethod> requestMethod) {
      this.requestMethod = requestMethod;
      this.requestMethodIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("navigationLinks")
    public void setNavigationLinks(java.util.Optional<java.lang.Boolean> navigationLinks) {
      this.navigationLinks = navigationLinks;
      this.navigationLinksIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("requestURL")
    public void setRequestURL(java.util.Optional<java.lang.String> requestURL) {
      this.requestURL = requestURL;
      this.requestURLIsSet = true;
    }
    @Override
    public java.util.Optional<java.lang.String> compareToSourcePath() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> contentType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> headerField() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Testscript_assertDirection> direction() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Boolean> warningOnly() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> label() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> minimumId() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> compareToSourceId() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> sourceId() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> description() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> path() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> resource() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> validateProfileId() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> compareToSourceExpression() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> responseCode() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Testscript_assertResponse> response() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> value() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Testscript_assertOperator> operator() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> expression() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Testscript_assertRequestmethod> requestMethod() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Boolean> navigationLinks() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> requestURL() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableTestScript_Assert fromJson(Json json) {
    ImmutableTestScript_Assert.Builder builder = ImmutableTestScript_Assert.builder();
    if (json.compareToSourcePathIsSet) {
      builder.compareToSourcePath(json.compareToSourcePath);
    }
    if (json.contentTypeIsSet) {
      builder.contentType(json.contentType);
    }
    if (json.headerFieldIsSet) {
      builder.headerField(json.headerField);
    }
    if (json.directionIsSet) {
      builder.direction(json.direction);
    }
    if (json.warningOnlyIsSet) {
      builder.warningOnly(json.warningOnly);
    }
    if (json.labelIsSet) {
      builder.label(json.label);
    }
    if (json.minimumIdIsSet) {
      builder.minimumId(json.minimumId);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.compareToSourceIdIsSet) {
      builder.compareToSourceId(json.compareToSourceId);
    }
    if (json.sourceIdIsSet) {
      builder.sourceId(json.sourceId);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.pathIsSet) {
      builder.path(json.path);
    }
    if (json.resourceIsSet) {
      builder.resource(json.resource);
    }
    if (json.validateProfileIdIsSet) {
      builder.validateProfileId(json.validateProfileId);
    }
    if (json.compareToSourceExpressionIsSet) {
      builder.compareToSourceExpression(json.compareToSourceExpression);
    }
    if (json.responseCodeIsSet) {
      builder.responseCode(json.responseCode);
    }
    if (json.responseIsSet) {
      builder.response(json.response);
    }
    if (json.valueIsSet) {
      builder.value(json.value);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.operatorIsSet) {
      builder.operator(json.operator);
    }
    if (json.expressionIsSet) {
      builder.expression(json.expression);
    }
    if (json.requestMethodIsSet) {
      builder.requestMethod(json.requestMethod);
    }
    if (json.navigationLinksIsSet) {
      builder.navigationLinks(json.navigationLinks);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.requestURLIsSet) {
      builder.requestURL(json.requestURL);
    }
    return (ImmutableTestScript_Assert) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link TestScript_Assert} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable TestScript_Assert instance
   */
  public static TestScript_Assert copyOf(TestScript_Assert instance) {
    if (instance instanceof ImmutableTestScript_Assert) {
      return (ImmutableTestScript_Assert) instance;
    }
    return ImmutableTestScript_Assert.builder()
        .compareToSourcePath(instance.compareToSourcePath())
        .contentType(instance.contentType())
        .headerField(instance.headerField())
        .direction(instance.direction())
        .warningOnly(instance.warningOnly())
        .label(instance.label())
        .minimumId(instance.minimumId())
        .modifierExtension(instance.modifierExtension())
        .compareToSourceId(instance.compareToSourceId())
        .sourceId(instance.sourceId())
        .description(instance.description())
        .path(instance.path())
        .resource(instance.resource())
        .validateProfileId(instance.validateProfileId())
        .compareToSourceExpression(instance.compareToSourceExpression())
        .responseCode(instance.responseCode())
        .response(instance.response())
        .value(instance.value())
        .id(instance.id())
        .operator(instance.operator())
        .expression(instance.expression())
        .requestMethod(instance.requestMethod())
        .navigationLinks(instance.navigationLinks())
        .extension(instance.extension())
        .requestURL(instance.requestURL())
        .build();
  }

  /**
   * Creates a builder for {@link TestScript_Assert TestScript_Assert}.
   * <pre>
   * ImmutableTestScript_Assert.builder()
   *    .compareToSourcePath(String) // optional {@link TestScript_Assert#compareToSourcePath() compareToSourcePath}
   *    .contentType(com.fhir.code) // optional {@link TestScript_Assert#contentType() contentType}
   *    .headerField(String) // optional {@link TestScript_Assert#headerField() headerField}
   *    .direction(com.fhir.Testscript_assertDirection) // optional {@link TestScript_Assert#direction() direction}
   *    .warningOnly(Boolean) // optional {@link TestScript_Assert#warningOnly() warningOnly}
   *    .label(String) // optional {@link TestScript_Assert#label() label}
   *    .minimumId(String) // optional {@link TestScript_Assert#minimumId() minimumId}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link TestScript_Assert#modifierExtension() modifierExtension}
   *    .compareToSourceId(String) // optional {@link TestScript_Assert#compareToSourceId() compareToSourceId}
   *    .sourceId(com.fhir.id) // optional {@link TestScript_Assert#sourceId() sourceId}
   *    .description(String) // optional {@link TestScript_Assert#description() description}
   *    .path(String) // optional {@link TestScript_Assert#path() path}
   *    .resource(com.fhir.code) // optional {@link TestScript_Assert#resource() resource}
   *    .validateProfileId(com.fhir.id) // optional {@link TestScript_Assert#validateProfileId() validateProfileId}
   *    .compareToSourceExpression(String) // optional {@link TestScript_Assert#compareToSourceExpression() compareToSourceExpression}
   *    .responseCode(String) // optional {@link TestScript_Assert#responseCode() responseCode}
   *    .response(com.fhir.Testscript_assertResponse) // optional {@link TestScript_Assert#response() response}
   *    .value(String) // optional {@link TestScript_Assert#value() value}
   *    .id(String) // optional {@link TestScript_Assert#id() id}
   *    .operator(com.fhir.Testscript_assertOperator) // optional {@link TestScript_Assert#operator() operator}
   *    .expression(String) // optional {@link TestScript_Assert#expression() expression}
   *    .requestMethod(com.fhir.Testscript_assertRequestmethod) // optional {@link TestScript_Assert#requestMethod() requestMethod}
   *    .navigationLinks(Boolean) // optional {@link TestScript_Assert#navigationLinks() navigationLinks}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link TestScript_Assert#extension() extension}
   *    .requestURL(String) // optional {@link TestScript_Assert#requestURL() requestURL}
   *    .build();
   * </pre>
   * @return A new TestScript_Assert builder
   */
  public static ImmutableTestScript_Assert.Builder builder() {
    return new ImmutableTestScript_Assert.Builder();
  }

  /**
   * Builds instances of type {@link TestScript_Assert TestScript_Assert}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "TestScript_Assert", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_COMPARE_TO_SOURCE_PATH = 0x1L;
    private static final long OPT_BIT_CONTENT_TYPE = 0x2L;
    private static final long OPT_BIT_HEADER_FIELD = 0x4L;
    private static final long OPT_BIT_DIRECTION = 0x8L;
    private static final long OPT_BIT_WARNING_ONLY = 0x10L;
    private static final long OPT_BIT_LABEL = 0x20L;
    private static final long OPT_BIT_MINIMUM_ID = 0x40L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x80L;
    private static final long OPT_BIT_COMPARE_TO_SOURCE_ID = 0x100L;
    private static final long OPT_BIT_SOURCE_ID = 0x200L;
    private static final long OPT_BIT_DESCRIPTION = 0x400L;
    private static final long OPT_BIT_PATH = 0x800L;
    private static final long OPT_BIT_RESOURCE = 0x1000L;
    private static final long OPT_BIT_VALIDATE_PROFILE_ID = 0x2000L;
    private static final long OPT_BIT_COMPARE_TO_SOURCE_EXPRESSION = 0x4000L;
    private static final long OPT_BIT_RESPONSE_CODE = 0x8000L;
    private static final long OPT_BIT_RESPONSE = 0x10000L;
    private static final long OPT_BIT_VALUE = 0x20000L;
    private static final long OPT_BIT_ID = 0x40000L;
    private static final long OPT_BIT_OPERATOR = 0x80000L;
    private static final long OPT_BIT_EXPRESSION = 0x100000L;
    private static final long OPT_BIT_REQUEST_METHOD = 0x200000L;
    private static final long OPT_BIT_NAVIGATION_LINKS = 0x400000L;
    private static final long OPT_BIT_EXTENSION = 0x800000L;
    private static final long OPT_BIT_REQUEST_U_R_L = 0x1000000L;
    private long optBits;

    private @javax.annotation.Nullable java.lang.String compareToSourcePath;
    private @javax.annotation.Nullable com.fhir.code contentType;
    private @javax.annotation.Nullable java.lang.String headerField;
    private @javax.annotation.Nullable com.fhir.Testscript_assertDirection direction;
    private @javax.annotation.Nullable java.lang.Boolean warningOnly;
    private @javax.annotation.Nullable java.lang.String label;
    private @javax.annotation.Nullable java.lang.String minimumId;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable java.lang.String compareToSourceId;
    private @javax.annotation.Nullable com.fhir.id sourceId;
    private @javax.annotation.Nullable java.lang.String description;
    private @javax.annotation.Nullable java.lang.String path;
    private @javax.annotation.Nullable com.fhir.code resource;
    private @javax.annotation.Nullable com.fhir.id validateProfileId;
    private @javax.annotation.Nullable java.lang.String compareToSourceExpression;
    private @javax.annotation.Nullable java.lang.String responseCode;
    private @javax.annotation.Nullable com.fhir.Testscript_assertResponse response;
    private @javax.annotation.Nullable java.lang.String value;
    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable com.fhir.Testscript_assertOperator operator;
    private @javax.annotation.Nullable java.lang.String expression;
    private @javax.annotation.Nullable com.fhir.Testscript_assertRequestmethod requestMethod;
    private @javax.annotation.Nullable java.lang.Boolean navigationLinks;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable java.lang.String requestURL;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link TestScript_Assert#compareToSourcePath() compareToSourcePath} to compareToSourcePath.
     * @param compareToSourcePath The value for compareToSourcePath
     * @return {@code this} builder for chained invocation
     */
    public final Builder compareToSourcePath(java.lang.String compareToSourcePath) {
      checkNotIsSet(compareToSourcePathIsSet(), "compareToSourcePath");
      this.compareToSourcePath = java.util.Objects.requireNonNull(compareToSourcePath, "compareToSourcePath");
      optBits |= OPT_BIT_COMPARE_TO_SOURCE_PATH;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Assert#compareToSourcePath() compareToSourcePath} to compareToSourcePath.
     * @param compareToSourcePath The value for compareToSourcePath
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compareToSourcePath")
    public final Builder compareToSourcePath(java.util.Optional<java.lang.String> compareToSourcePath) {
      checkNotIsSet(compareToSourcePathIsSet(), "compareToSourcePath");
      this.compareToSourcePath = compareToSourcePath.orElse(null);
      optBits |= OPT_BIT_COMPARE_TO_SOURCE_PATH;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Assert#contentType() contentType} to contentType.
     * @param contentType The value for contentType
     * @return {@code this} builder for chained invocation
     */
    public final Builder contentType(com.fhir.code contentType) {
      checkNotIsSet(contentTypeIsSet(), "contentType");
      this.contentType = java.util.Objects.requireNonNull(contentType, "contentType");
      optBits |= OPT_BIT_CONTENT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Assert#contentType() contentType} to contentType.
     * @param contentType The value for contentType
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("contentType")
    public final Builder contentType(java.util.Optional<? extends com.fhir.code> contentType) {
      checkNotIsSet(contentTypeIsSet(), "contentType");
      this.contentType = contentType.orElse(null);
      optBits |= OPT_BIT_CONTENT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Assert#headerField() headerField} to headerField.
     * @param headerField The value for headerField
     * @return {@code this} builder for chained invocation
     */
    public final Builder headerField(java.lang.String headerField) {
      checkNotIsSet(headerFieldIsSet(), "headerField");
      this.headerField = java.util.Objects.requireNonNull(headerField, "headerField");
      optBits |= OPT_BIT_HEADER_FIELD;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Assert#headerField() headerField} to headerField.
     * @param headerField The value for headerField
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("headerField")
    public final Builder headerField(java.util.Optional<java.lang.String> headerField) {
      checkNotIsSet(headerFieldIsSet(), "headerField");
      this.headerField = headerField.orElse(null);
      optBits |= OPT_BIT_HEADER_FIELD;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Assert#direction() direction} to direction.
     * @param direction The value for direction
     * @return {@code this} builder for chained invocation
     */
    public final Builder direction(com.fhir.Testscript_assertDirection direction) {
      checkNotIsSet(directionIsSet(), "direction");
      this.direction = java.util.Objects.requireNonNull(direction, "direction");
      optBits |= OPT_BIT_DIRECTION;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Assert#direction() direction} to direction.
     * @param direction The value for direction
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("direction")
    public final Builder direction(java.util.Optional<? extends com.fhir.Testscript_assertDirection> direction) {
      checkNotIsSet(directionIsSet(), "direction");
      this.direction = direction.orElse(null);
      optBits |= OPT_BIT_DIRECTION;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Assert#warningOnly() warningOnly} to warningOnly.
     * @param warningOnly The value for warningOnly
     * @return {@code this} builder for chained invocation
     */
    public final Builder warningOnly(boolean warningOnly) {
      checkNotIsSet(warningOnlyIsSet(), "warningOnly");
      this.warningOnly = warningOnly;
      optBits |= OPT_BIT_WARNING_ONLY;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Assert#warningOnly() warningOnly} to warningOnly.
     * @param warningOnly The value for warningOnly
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("warningOnly")
    public final Builder warningOnly(java.util.Optional<java.lang.Boolean> warningOnly) {
      checkNotIsSet(warningOnlyIsSet(), "warningOnly");
      this.warningOnly = warningOnly.orElse(null);
      optBits |= OPT_BIT_WARNING_ONLY;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Assert#label() label} to label.
     * @param label The value for label
     * @return {@code this} builder for chained invocation
     */
    public final Builder label(java.lang.String label) {
      checkNotIsSet(labelIsSet(), "label");
      this.label = java.util.Objects.requireNonNull(label, "label");
      optBits |= OPT_BIT_LABEL;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Assert#label() label} to label.
     * @param label The value for label
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("label")
    public final Builder label(java.util.Optional<java.lang.String> label) {
      checkNotIsSet(labelIsSet(), "label");
      this.label = label.orElse(null);
      optBits |= OPT_BIT_LABEL;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Assert#minimumId() minimumId} to minimumId.
     * @param minimumId The value for minimumId
     * @return {@code this} builder for chained invocation
     */
    public final Builder minimumId(java.lang.String minimumId) {
      checkNotIsSet(minimumIdIsSet(), "minimumId");
      this.minimumId = java.util.Objects.requireNonNull(minimumId, "minimumId");
      optBits |= OPT_BIT_MINIMUM_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Assert#minimumId() minimumId} to minimumId.
     * @param minimumId The value for minimumId
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("minimumId")
    public final Builder minimumId(java.util.Optional<java.lang.String> minimumId) {
      checkNotIsSet(minimumIdIsSet(), "minimumId");
      this.minimumId = minimumId.orElse(null);
      optBits |= OPT_BIT_MINIMUM_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Assert#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link TestScript_Assert#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link TestScript_Assert#compareToSourceId() compareToSourceId} to compareToSourceId.
     * @param compareToSourceId The value for compareToSourceId
     * @return {@code this} builder for chained invocation
     */
    public final Builder compareToSourceId(java.lang.String compareToSourceId) {
      checkNotIsSet(compareToSourceIdIsSet(), "compareToSourceId");
      this.compareToSourceId = java.util.Objects.requireNonNull(compareToSourceId, "compareToSourceId");
      optBits |= OPT_BIT_COMPARE_TO_SOURCE_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Assert#compareToSourceId() compareToSourceId} to compareToSourceId.
     * @param compareToSourceId The value for compareToSourceId
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compareToSourceId")
    public final Builder compareToSourceId(java.util.Optional<java.lang.String> compareToSourceId) {
      checkNotIsSet(compareToSourceIdIsSet(), "compareToSourceId");
      this.compareToSourceId = compareToSourceId.orElse(null);
      optBits |= OPT_BIT_COMPARE_TO_SOURCE_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Assert#sourceId() sourceId} to sourceId.
     * @param sourceId The value for sourceId
     * @return {@code this} builder for chained invocation
     */
    public final Builder sourceId(com.fhir.id sourceId) {
      checkNotIsSet(sourceIdIsSet(), "sourceId");
      this.sourceId = java.util.Objects.requireNonNull(sourceId, "sourceId");
      optBits |= OPT_BIT_SOURCE_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Assert#sourceId() sourceId} to sourceId.
     * @param sourceId The value for sourceId
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceId")
    public final Builder sourceId(java.util.Optional<? extends com.fhir.id> sourceId) {
      checkNotIsSet(sourceIdIsSet(), "sourceId");
      this.sourceId = sourceId.orElse(null);
      optBits |= OPT_BIT_SOURCE_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Assert#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    public final Builder description(java.lang.String description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = java.util.Objects.requireNonNull(description, "description");
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Assert#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    public final Builder description(java.util.Optional<java.lang.String> description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = description.orElse(null);
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Assert#path() path} to path.
     * @param path The value for path
     * @return {@code this} builder for chained invocation
     */
    public final Builder path(java.lang.String path) {
      checkNotIsSet(pathIsSet(), "path");
      this.path = java.util.Objects.requireNonNull(path, "path");
      optBits |= OPT_BIT_PATH;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Assert#path() path} to path.
     * @param path The value for path
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("path")
    public final Builder path(java.util.Optional<java.lang.String> path) {
      checkNotIsSet(pathIsSet(), "path");
      this.path = path.orElse(null);
      optBits |= OPT_BIT_PATH;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Assert#resource() resource} to resource.
     * @param resource The value for resource
     * @return {@code this} builder for chained invocation
     */
    public final Builder resource(com.fhir.code resource) {
      checkNotIsSet(resourceIsSet(), "resource");
      this.resource = java.util.Objects.requireNonNull(resource, "resource");
      optBits |= OPT_BIT_RESOURCE;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Assert#resource() resource} to resource.
     * @param resource The value for resource
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resource")
    public final Builder resource(java.util.Optional<? extends com.fhir.code> resource) {
      checkNotIsSet(resourceIsSet(), "resource");
      this.resource = resource.orElse(null);
      optBits |= OPT_BIT_RESOURCE;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Assert#validateProfileId() validateProfileId} to validateProfileId.
     * @param validateProfileId The value for validateProfileId
     * @return {@code this} builder for chained invocation
     */
    public final Builder validateProfileId(com.fhir.id validateProfileId) {
      checkNotIsSet(validateProfileIdIsSet(), "validateProfileId");
      this.validateProfileId = java.util.Objects.requireNonNull(validateProfileId, "validateProfileId");
      optBits |= OPT_BIT_VALIDATE_PROFILE_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Assert#validateProfileId() validateProfileId} to validateProfileId.
     * @param validateProfileId The value for validateProfileId
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("validateProfileId")
    public final Builder validateProfileId(java.util.Optional<? extends com.fhir.id> validateProfileId) {
      checkNotIsSet(validateProfileIdIsSet(), "validateProfileId");
      this.validateProfileId = validateProfileId.orElse(null);
      optBits |= OPT_BIT_VALIDATE_PROFILE_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Assert#compareToSourceExpression() compareToSourceExpression} to compareToSourceExpression.
     * @param compareToSourceExpression The value for compareToSourceExpression
     * @return {@code this} builder for chained invocation
     */
    public final Builder compareToSourceExpression(java.lang.String compareToSourceExpression) {
      checkNotIsSet(compareToSourceExpressionIsSet(), "compareToSourceExpression");
      this.compareToSourceExpression = java.util.Objects.requireNonNull(compareToSourceExpression, "compareToSourceExpression");
      optBits |= OPT_BIT_COMPARE_TO_SOURCE_EXPRESSION;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Assert#compareToSourceExpression() compareToSourceExpression} to compareToSourceExpression.
     * @param compareToSourceExpression The value for compareToSourceExpression
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compareToSourceExpression")
    public final Builder compareToSourceExpression(java.util.Optional<java.lang.String> compareToSourceExpression) {
      checkNotIsSet(compareToSourceExpressionIsSet(), "compareToSourceExpression");
      this.compareToSourceExpression = compareToSourceExpression.orElse(null);
      optBits |= OPT_BIT_COMPARE_TO_SOURCE_EXPRESSION;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Assert#responseCode() responseCode} to responseCode.
     * @param responseCode The value for responseCode
     * @return {@code this} builder for chained invocation
     */
    public final Builder responseCode(java.lang.String responseCode) {
      checkNotIsSet(responseCodeIsSet(), "responseCode");
      this.responseCode = java.util.Objects.requireNonNull(responseCode, "responseCode");
      optBits |= OPT_BIT_RESPONSE_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Assert#responseCode() responseCode} to responseCode.
     * @param responseCode The value for responseCode
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("responseCode")
    public final Builder responseCode(java.util.Optional<java.lang.String> responseCode) {
      checkNotIsSet(responseCodeIsSet(), "responseCode");
      this.responseCode = responseCode.orElse(null);
      optBits |= OPT_BIT_RESPONSE_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Assert#response() response} to response.
     * @param response The value for response
     * @return {@code this} builder for chained invocation
     */
    public final Builder response(com.fhir.Testscript_assertResponse response) {
      checkNotIsSet(responseIsSet(), "response");
      this.response = java.util.Objects.requireNonNull(response, "response");
      optBits |= OPT_BIT_RESPONSE;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Assert#response() response} to response.
     * @param response The value for response
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("response")
    public final Builder response(java.util.Optional<? extends com.fhir.Testscript_assertResponse> response) {
      checkNotIsSet(responseIsSet(), "response");
      this.response = response.orElse(null);
      optBits |= OPT_BIT_RESPONSE;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Assert#value() value} to value.
     * @param value The value for value
     * @return {@code this} builder for chained invocation
     */
    public final Builder value(java.lang.String value) {
      checkNotIsSet(valueIsSet(), "value");
      this.value = java.util.Objects.requireNonNull(value, "value");
      optBits |= OPT_BIT_VALUE;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Assert#value() value} to value.
     * @param value The value for value
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    public final Builder value(java.util.Optional<java.lang.String> value) {
      checkNotIsSet(valueIsSet(), "value");
      this.value = value.orElse(null);
      optBits |= OPT_BIT_VALUE;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Assert#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(java.lang.String id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = java.util.Objects.requireNonNull(id, "id");
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Assert#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public final Builder id(java.util.Optional<java.lang.String> id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = id.orElse(null);
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Assert#operator() operator} to operator.
     * @param operator The value for operator
     * @return {@code this} builder for chained invocation
     */
    public final Builder operator(com.fhir.Testscript_assertOperator operator) {
      checkNotIsSet(operatorIsSet(), "operator");
      this.operator = java.util.Objects.requireNonNull(operator, "operator");
      optBits |= OPT_BIT_OPERATOR;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Assert#operator() operator} to operator.
     * @param operator The value for operator
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("operator")
    public final Builder operator(java.util.Optional<? extends com.fhir.Testscript_assertOperator> operator) {
      checkNotIsSet(operatorIsSet(), "operator");
      this.operator = operator.orElse(null);
      optBits |= OPT_BIT_OPERATOR;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Assert#expression() expression} to expression.
     * @param expression The value for expression
     * @return {@code this} builder for chained invocation
     */
    public final Builder expression(java.lang.String expression) {
      checkNotIsSet(expressionIsSet(), "expression");
      this.expression = java.util.Objects.requireNonNull(expression, "expression");
      optBits |= OPT_BIT_EXPRESSION;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Assert#expression() expression} to expression.
     * @param expression The value for expression
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("expression")
    public final Builder expression(java.util.Optional<java.lang.String> expression) {
      checkNotIsSet(expressionIsSet(), "expression");
      this.expression = expression.orElse(null);
      optBits |= OPT_BIT_EXPRESSION;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Assert#requestMethod() requestMethod} to requestMethod.
     * @param requestMethod The value for requestMethod
     * @return {@code this} builder for chained invocation
     */
    public final Builder requestMethod(com.fhir.Testscript_assertRequestmethod requestMethod) {
      checkNotIsSet(requestMethodIsSet(), "requestMethod");
      this.requestMethod = java.util.Objects.requireNonNull(requestMethod, "requestMethod");
      optBits |= OPT_BIT_REQUEST_METHOD;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Assert#requestMethod() requestMethod} to requestMethod.
     * @param requestMethod The value for requestMethod
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("requestMethod")
    public final Builder requestMethod(java.util.Optional<? extends com.fhir.Testscript_assertRequestmethod> requestMethod) {
      checkNotIsSet(requestMethodIsSet(), "requestMethod");
      this.requestMethod = requestMethod.orElse(null);
      optBits |= OPT_BIT_REQUEST_METHOD;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Assert#navigationLinks() navigationLinks} to navigationLinks.
     * @param navigationLinks The value for navigationLinks
     * @return {@code this} builder for chained invocation
     */
    public final Builder navigationLinks(boolean navigationLinks) {
      checkNotIsSet(navigationLinksIsSet(), "navigationLinks");
      this.navigationLinks = navigationLinks;
      optBits |= OPT_BIT_NAVIGATION_LINKS;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Assert#navigationLinks() navigationLinks} to navigationLinks.
     * @param navigationLinks The value for navigationLinks
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("navigationLinks")
    public final Builder navigationLinks(java.util.Optional<java.lang.Boolean> navigationLinks) {
      checkNotIsSet(navigationLinksIsSet(), "navigationLinks");
      this.navigationLinks = navigationLinks.orElse(null);
      optBits |= OPT_BIT_NAVIGATION_LINKS;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Assert#extension() extension} to extension.
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
     * Initializes the optional value {@link TestScript_Assert#extension() extension} to extension.
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
     * Initializes the optional value {@link TestScript_Assert#requestURL() requestURL} to requestURL.
     * @param requestURL The value for requestURL
     * @return {@code this} builder for chained invocation
     */
    public final Builder requestURL(java.lang.String requestURL) {
      checkNotIsSet(requestURLIsSet(), "requestURL");
      this.requestURL = java.util.Objects.requireNonNull(requestURL, "requestURL");
      optBits |= OPT_BIT_REQUEST_U_R_L;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Assert#requestURL() requestURL} to requestURL.
     * @param requestURL The value for requestURL
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("requestURL")
    public final Builder requestURL(java.util.Optional<java.lang.String> requestURL) {
      checkNotIsSet(requestURLIsSet(), "requestURL");
      this.requestURL = requestURL.orElse(null);
      optBits |= OPT_BIT_REQUEST_U_R_L;
      return this;
    }

    /**
     * Builds a new {@link TestScript_Assert TestScript_Assert}.
     * @return An immutable instance of TestScript_Assert
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.TestScript_Assert build() {
      return new ImmutableTestScript_Assert(
          compareToSourcePath,
          contentType,
          headerField,
          direction,
          warningOnly,
          label,
          minimumId,
          modifierExtension,
          compareToSourceId,
          sourceId,
          description,
          path,
          resource,
          validateProfileId,
          compareToSourceExpression,
          responseCode,
          response,
          value,
          id,
          operator,
          expression,
          requestMethod,
          navigationLinks,
          extension,
          requestURL);
    }

    private boolean compareToSourcePathIsSet() {
      return (optBits & OPT_BIT_COMPARE_TO_SOURCE_PATH) != 0;
    }

    private boolean contentTypeIsSet() {
      return (optBits & OPT_BIT_CONTENT_TYPE) != 0;
    }

    private boolean headerFieldIsSet() {
      return (optBits & OPT_BIT_HEADER_FIELD) != 0;
    }

    private boolean directionIsSet() {
      return (optBits & OPT_BIT_DIRECTION) != 0;
    }

    private boolean warningOnlyIsSet() {
      return (optBits & OPT_BIT_WARNING_ONLY) != 0;
    }

    private boolean labelIsSet() {
      return (optBits & OPT_BIT_LABEL) != 0;
    }

    private boolean minimumIdIsSet() {
      return (optBits & OPT_BIT_MINIMUM_ID) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean compareToSourceIdIsSet() {
      return (optBits & OPT_BIT_COMPARE_TO_SOURCE_ID) != 0;
    }

    private boolean sourceIdIsSet() {
      return (optBits & OPT_BIT_SOURCE_ID) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean pathIsSet() {
      return (optBits & OPT_BIT_PATH) != 0;
    }

    private boolean resourceIsSet() {
      return (optBits & OPT_BIT_RESOURCE) != 0;
    }

    private boolean validateProfileIdIsSet() {
      return (optBits & OPT_BIT_VALIDATE_PROFILE_ID) != 0;
    }

    private boolean compareToSourceExpressionIsSet() {
      return (optBits & OPT_BIT_COMPARE_TO_SOURCE_EXPRESSION) != 0;
    }

    private boolean responseCodeIsSet() {
      return (optBits & OPT_BIT_RESPONSE_CODE) != 0;
    }

    private boolean responseIsSet() {
      return (optBits & OPT_BIT_RESPONSE) != 0;
    }

    private boolean valueIsSet() {
      return (optBits & OPT_BIT_VALUE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean operatorIsSet() {
      return (optBits & OPT_BIT_OPERATOR) != 0;
    }

    private boolean expressionIsSet() {
      return (optBits & OPT_BIT_EXPRESSION) != 0;
    }

    private boolean requestMethodIsSet() {
      return (optBits & OPT_BIT_REQUEST_METHOD) != 0;
    }

    private boolean navigationLinksIsSet() {
      return (optBits & OPT_BIT_NAVIGATION_LINKS) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean requestURLIsSet() {
      return (optBits & OPT_BIT_REQUEST_U_R_L) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of TestScript_Assert is strict, attribute is already set: ".concat(name));
    }
  }
}
