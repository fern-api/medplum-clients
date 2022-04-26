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
 * Immutable implementation of {@link TestScript_Assert}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableTestScript_Assert.builder()}.
 */
@Generated(from = "TestScript_Assert", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableTestScript_Assert implements TestScript_Assert {
  private final @Nullable Testscript_AssertRequestmethod requestMethod;
  private final @Nullable String headerField;
  private final @Nullable Boolean navigationLinks;
  private final @Nullable String compareToSourceId;
  private final @Nullable String minimumId;
  private final @Nullable String compareToSourceExpression;
  private final @Nullable Id validateProfileId;
  private final @Nullable String compareToSourcePath;
  private final @Nullable Testscript_AssertResponse response;
  private final @Nullable String path;
  private final @Nullable Code contentType;
  private final @Nullable String id;
  private final @Nullable String requestURL;
  private final @Nullable Testscript_AssertOperator operator;
  private final @Nullable Id sourceId;
  private final @Nullable String value;
  private final @Nullable Code resource;
  private final @Nullable String expression;
  private final @Nullable String description;
  private final @Nullable String responseCode;
  private final @Nullable List<Extension> extension;
  private final @Nullable String label;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Testscript_AssertDirection direction;
  private final @Nullable Boolean warningOnly;

  private ImmutableTestScript_Assert(
      @Nullable Testscript_AssertRequestmethod requestMethod,
      @Nullable String headerField,
      @Nullable Boolean navigationLinks,
      @Nullable String compareToSourceId,
      @Nullable String minimumId,
      @Nullable String compareToSourceExpression,
      @Nullable Id validateProfileId,
      @Nullable String compareToSourcePath,
      @Nullable Testscript_AssertResponse response,
      @Nullable String path,
      @Nullable Code contentType,
      @Nullable String id,
      @Nullable String requestURL,
      @Nullable Testscript_AssertOperator operator,
      @Nullable Id sourceId,
      @Nullable String value,
      @Nullable Code resource,
      @Nullable String expression,
      @Nullable String description,
      @Nullable String responseCode,
      @Nullable List<Extension> extension,
      @Nullable String label,
      @Nullable List<Extension> modifierExtension,
      @Nullable Testscript_AssertDirection direction,
      @Nullable Boolean warningOnly) {
    this.requestMethod = requestMethod;
    this.headerField = headerField;
    this.navigationLinks = navigationLinks;
    this.compareToSourceId = compareToSourceId;
    this.minimumId = minimumId;
    this.compareToSourceExpression = compareToSourceExpression;
    this.validateProfileId = validateProfileId;
    this.compareToSourcePath = compareToSourcePath;
    this.response = response;
    this.path = path;
    this.contentType = contentType;
    this.id = id;
    this.requestURL = requestURL;
    this.operator = operator;
    this.sourceId = sourceId;
    this.value = value;
    this.resource = resource;
    this.expression = expression;
    this.description = description;
    this.responseCode = responseCode;
    this.extension = extension;
    this.label = label;
    this.modifierExtension = modifierExtension;
    this.direction = direction;
    this.warningOnly = warningOnly;
  }

  /**
   * @return The value of the {@code requestMethod} attribute
   */
  @JsonProperty("requestMethod")
  @Override
  public Optional<Testscript_AssertRequestmethod> requestMethod() {
    return Optional.ofNullable(requestMethod);
  }

  /**
   * @return The value of the {@code headerField} attribute
   */
  @JsonProperty("headerField")
  @Override
  public Optional<String> headerField() {
    return Optional.ofNullable(headerField);
  }

  /**
   * @return The value of the {@code navigationLinks} attribute
   */
  @JsonProperty("navigationLinks")
  @Override
  public Optional<Boolean> navigationLinks() {
    return Optional.ofNullable(navigationLinks);
  }

  /**
   * @return The value of the {@code compareToSourceId} attribute
   */
  @JsonProperty("compareToSourceId")
  @Override
  public Optional<String> compareToSourceId() {
    return Optional.ofNullable(compareToSourceId);
  }

  /**
   * @return The value of the {@code minimumId} attribute
   */
  @JsonProperty("minimumId")
  @Override
  public Optional<String> minimumId() {
    return Optional.ofNullable(minimumId);
  }

  /**
   * @return The value of the {@code compareToSourceExpression} attribute
   */
  @JsonProperty("compareToSourceExpression")
  @Override
  public Optional<String> compareToSourceExpression() {
    return Optional.ofNullable(compareToSourceExpression);
  }

  /**
   * @return The value of the {@code validateProfileId} attribute
   */
  @JsonProperty("validateProfileId")
  @Override
  public Optional<Id> validateProfileId() {
    return Optional.ofNullable(validateProfileId);
  }

  /**
   * @return The value of the {@code compareToSourcePath} attribute
   */
  @JsonProperty("compareToSourcePath")
  @Override
  public Optional<String> compareToSourcePath() {
    return Optional.ofNullable(compareToSourcePath);
  }

  /**
   * @return The value of the {@code response} attribute
   */
  @JsonProperty("response")
  @Override
  public Optional<Testscript_AssertResponse> response() {
    return Optional.ofNullable(response);
  }

  /**
   * @return The value of the {@code path} attribute
   */
  @JsonProperty("path")
  @Override
  public Optional<String> path() {
    return Optional.ofNullable(path);
  }

  /**
   * @return The value of the {@code contentType} attribute
   */
  @JsonProperty("contentType")
  @Override
  public Optional<Code> contentType() {
    return Optional.ofNullable(contentType);
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
   * @return The value of the {@code requestURL} attribute
   */
  @JsonProperty("requestURL")
  @Override
  public Optional<String> requestURL() {
    return Optional.ofNullable(requestURL);
  }

  /**
   * @return The value of the {@code operator} attribute
   */
  @JsonProperty("operator")
  @Override
  public Optional<Testscript_AssertOperator> operator() {
    return Optional.ofNullable(operator);
  }

  /**
   * @return The value of the {@code sourceId} attribute
   */
  @JsonProperty("sourceId")
  @Override
  public Optional<Id> sourceId() {
    return Optional.ofNullable(sourceId);
  }

  /**
   * @return The value of the {@code value} attribute
   */
  @JsonProperty("value")
  @Override
  public Optional<String> value() {
    return Optional.ofNullable(value);
  }

  /**
   * @return The value of the {@code resource} attribute
   */
  @JsonProperty("resource")
  @Override
  public Optional<Code> resource() {
    return Optional.ofNullable(resource);
  }

  /**
   * @return The value of the {@code expression} attribute
   */
  @JsonProperty("expression")
  @Override
  public Optional<String> expression() {
    return Optional.ofNullable(expression);
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
   * @return The value of the {@code responseCode} attribute
   */
  @JsonProperty("responseCode")
  @Override
  public Optional<String> responseCode() {
    return Optional.ofNullable(responseCode);
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
   * @return The value of the {@code label} attribute
   */
  @JsonProperty("label")
  @Override
  public Optional<String> label() {
    return Optional.ofNullable(label);
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
   * @return The value of the {@code direction} attribute
   */
  @JsonProperty("direction")
  @Override
  public Optional<Testscript_AssertDirection> direction() {
    return Optional.ofNullable(direction);
  }

  /**
   * @return The value of the {@code warningOnly} attribute
   */
  @JsonProperty("warningOnly")
  @Override
  public Optional<Boolean> warningOnly() {
    return Optional.ofNullable(warningOnly);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Assert#requestMethod() requestMethod} attribute.
   * @param value The value for requestMethod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Assert withRequestMethod(Testscript_AssertRequestmethod value) {
    @Nullable Testscript_AssertRequestmethod newValue = Objects.requireNonNull(value, "requestMethod");
    if (this.requestMethod == newValue) return this;
    return new ImmutableTestScript_Assert(
        newValue,
        this.headerField,
        this.navigationLinks,
        this.compareToSourceId,
        this.minimumId,
        this.compareToSourceExpression,
        this.validateProfileId,
        this.compareToSourcePath,
        this.response,
        this.path,
        this.contentType,
        this.id,
        this.requestURL,
        this.operator,
        this.sourceId,
        this.value,
        this.resource,
        this.expression,
        this.description,
        this.responseCode,
        this.extension,
        this.label,
        this.modifierExtension,
        this.direction,
        this.warningOnly);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Assert#requestMethod() requestMethod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for requestMethod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript_Assert withRequestMethod(Optional<? extends Testscript_AssertRequestmethod> optional) {
    @Nullable Testscript_AssertRequestmethod value = optional.orElse(null);
    if (this.requestMethod == value) return this;
    return new ImmutableTestScript_Assert(
        value,
        this.headerField,
        this.navigationLinks,
        this.compareToSourceId,
        this.minimumId,
        this.compareToSourceExpression,
        this.validateProfileId,
        this.compareToSourcePath,
        this.response,
        this.path,
        this.contentType,
        this.id,
        this.requestURL,
        this.operator,
        this.sourceId,
        this.value,
        this.resource,
        this.expression,
        this.description,
        this.responseCode,
        this.extension,
        this.label,
        this.modifierExtension,
        this.direction,
        this.warningOnly);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Assert#headerField() headerField} attribute.
   * @param value The value for headerField
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Assert withHeaderField(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "headerField");
    if (Objects.equals(this.headerField, newValue)) return this;
    return new ImmutableTestScript_Assert(
        this.requestMethod,
        newValue,
        this.navigationLinks,
        this.compareToSourceId,
        this.minimumId,
        this.compareToSourceExpression,
        this.validateProfileId,
        this.compareToSourcePath,
        this.response,
        this.path,
        this.contentType,
        this.id,
        this.requestURL,
        this.operator,
        this.sourceId,
        this.value,
        this.resource,
        this.expression,
        this.description,
        this.responseCode,
        this.extension,
        this.label,
        this.modifierExtension,
        this.direction,
        this.warningOnly);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Assert#headerField() headerField} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for headerField
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Assert withHeaderField(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.headerField, value)) return this;
    return new ImmutableTestScript_Assert(
        this.requestMethod,
        value,
        this.navigationLinks,
        this.compareToSourceId,
        this.minimumId,
        this.compareToSourceExpression,
        this.validateProfileId,
        this.compareToSourcePath,
        this.response,
        this.path,
        this.contentType,
        this.id,
        this.requestURL,
        this.operator,
        this.sourceId,
        this.value,
        this.resource,
        this.expression,
        this.description,
        this.responseCode,
        this.extension,
        this.label,
        this.modifierExtension,
        this.direction,
        this.warningOnly);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Assert#navigationLinks() navigationLinks} attribute.
   * @param value The value for navigationLinks
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Assert withNavigationLinks(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.navigationLinks, newValue)) return this;
    return new ImmutableTestScript_Assert(
        this.requestMethod,
        this.headerField,
        newValue,
        this.compareToSourceId,
        this.minimumId,
        this.compareToSourceExpression,
        this.validateProfileId,
        this.compareToSourcePath,
        this.response,
        this.path,
        this.contentType,
        this.id,
        this.requestURL,
        this.operator,
        this.sourceId,
        this.value,
        this.resource,
        this.expression,
        this.description,
        this.responseCode,
        this.extension,
        this.label,
        this.modifierExtension,
        this.direction,
        this.warningOnly);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Assert#navigationLinks() navigationLinks} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for navigationLinks
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Assert withNavigationLinks(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.navigationLinks, value)) return this;
    return new ImmutableTestScript_Assert(
        this.requestMethod,
        this.headerField,
        value,
        this.compareToSourceId,
        this.minimumId,
        this.compareToSourceExpression,
        this.validateProfileId,
        this.compareToSourcePath,
        this.response,
        this.path,
        this.contentType,
        this.id,
        this.requestURL,
        this.operator,
        this.sourceId,
        this.value,
        this.resource,
        this.expression,
        this.description,
        this.responseCode,
        this.extension,
        this.label,
        this.modifierExtension,
        this.direction,
        this.warningOnly);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Assert#compareToSourceId() compareToSourceId} attribute.
   * @param value The value for compareToSourceId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Assert withCompareToSourceId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "compareToSourceId");
    if (Objects.equals(this.compareToSourceId, newValue)) return this;
    return new ImmutableTestScript_Assert(
        this.requestMethod,
        this.headerField,
        this.navigationLinks,
        newValue,
        this.minimumId,
        this.compareToSourceExpression,
        this.validateProfileId,
        this.compareToSourcePath,
        this.response,
        this.path,
        this.contentType,
        this.id,
        this.requestURL,
        this.operator,
        this.sourceId,
        this.value,
        this.resource,
        this.expression,
        this.description,
        this.responseCode,
        this.extension,
        this.label,
        this.modifierExtension,
        this.direction,
        this.warningOnly);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Assert#compareToSourceId() compareToSourceId} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for compareToSourceId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Assert withCompareToSourceId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.compareToSourceId, value)) return this;
    return new ImmutableTestScript_Assert(
        this.requestMethod,
        this.headerField,
        this.navigationLinks,
        value,
        this.minimumId,
        this.compareToSourceExpression,
        this.validateProfileId,
        this.compareToSourcePath,
        this.response,
        this.path,
        this.contentType,
        this.id,
        this.requestURL,
        this.operator,
        this.sourceId,
        this.value,
        this.resource,
        this.expression,
        this.description,
        this.responseCode,
        this.extension,
        this.label,
        this.modifierExtension,
        this.direction,
        this.warningOnly);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Assert#minimumId() minimumId} attribute.
   * @param value The value for minimumId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Assert withMinimumId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "minimumId");
    if (Objects.equals(this.minimumId, newValue)) return this;
    return new ImmutableTestScript_Assert(
        this.requestMethod,
        this.headerField,
        this.navigationLinks,
        this.compareToSourceId,
        newValue,
        this.compareToSourceExpression,
        this.validateProfileId,
        this.compareToSourcePath,
        this.response,
        this.path,
        this.contentType,
        this.id,
        this.requestURL,
        this.operator,
        this.sourceId,
        this.value,
        this.resource,
        this.expression,
        this.description,
        this.responseCode,
        this.extension,
        this.label,
        this.modifierExtension,
        this.direction,
        this.warningOnly);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Assert#minimumId() minimumId} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for minimumId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Assert withMinimumId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.minimumId, value)) return this;
    return new ImmutableTestScript_Assert(
        this.requestMethod,
        this.headerField,
        this.navigationLinks,
        this.compareToSourceId,
        value,
        this.compareToSourceExpression,
        this.validateProfileId,
        this.compareToSourcePath,
        this.response,
        this.path,
        this.contentType,
        this.id,
        this.requestURL,
        this.operator,
        this.sourceId,
        this.value,
        this.resource,
        this.expression,
        this.description,
        this.responseCode,
        this.extension,
        this.label,
        this.modifierExtension,
        this.direction,
        this.warningOnly);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Assert#compareToSourceExpression() compareToSourceExpression} attribute.
   * @param value The value for compareToSourceExpression
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Assert withCompareToSourceExpression(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "compareToSourceExpression");
    if (Objects.equals(this.compareToSourceExpression, newValue)) return this;
    return new ImmutableTestScript_Assert(
        this.requestMethod,
        this.headerField,
        this.navigationLinks,
        this.compareToSourceId,
        this.minimumId,
        newValue,
        this.validateProfileId,
        this.compareToSourcePath,
        this.response,
        this.path,
        this.contentType,
        this.id,
        this.requestURL,
        this.operator,
        this.sourceId,
        this.value,
        this.resource,
        this.expression,
        this.description,
        this.responseCode,
        this.extension,
        this.label,
        this.modifierExtension,
        this.direction,
        this.warningOnly);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Assert#compareToSourceExpression() compareToSourceExpression} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for compareToSourceExpression
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Assert withCompareToSourceExpression(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.compareToSourceExpression, value)) return this;
    return new ImmutableTestScript_Assert(
        this.requestMethod,
        this.headerField,
        this.navigationLinks,
        this.compareToSourceId,
        this.minimumId,
        value,
        this.validateProfileId,
        this.compareToSourcePath,
        this.response,
        this.path,
        this.contentType,
        this.id,
        this.requestURL,
        this.operator,
        this.sourceId,
        this.value,
        this.resource,
        this.expression,
        this.description,
        this.responseCode,
        this.extension,
        this.label,
        this.modifierExtension,
        this.direction,
        this.warningOnly);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Assert#validateProfileId() validateProfileId} attribute.
   * @param value The value for validateProfileId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Assert withValidateProfileId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "validateProfileId");
    if (this.validateProfileId == newValue) return this;
    return new ImmutableTestScript_Assert(
        this.requestMethod,
        this.headerField,
        this.navigationLinks,
        this.compareToSourceId,
        this.minimumId,
        this.compareToSourceExpression,
        newValue,
        this.compareToSourcePath,
        this.response,
        this.path,
        this.contentType,
        this.id,
        this.requestURL,
        this.operator,
        this.sourceId,
        this.value,
        this.resource,
        this.expression,
        this.description,
        this.responseCode,
        this.extension,
        this.label,
        this.modifierExtension,
        this.direction,
        this.warningOnly);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Assert#validateProfileId() validateProfileId} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for validateProfileId
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript_Assert withValidateProfileId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.validateProfileId == value) return this;
    return new ImmutableTestScript_Assert(
        this.requestMethod,
        this.headerField,
        this.navigationLinks,
        this.compareToSourceId,
        this.minimumId,
        this.compareToSourceExpression,
        value,
        this.compareToSourcePath,
        this.response,
        this.path,
        this.contentType,
        this.id,
        this.requestURL,
        this.operator,
        this.sourceId,
        this.value,
        this.resource,
        this.expression,
        this.description,
        this.responseCode,
        this.extension,
        this.label,
        this.modifierExtension,
        this.direction,
        this.warningOnly);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Assert#compareToSourcePath() compareToSourcePath} attribute.
   * @param value The value for compareToSourcePath
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Assert withCompareToSourcePath(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "compareToSourcePath");
    if (Objects.equals(this.compareToSourcePath, newValue)) return this;
    return new ImmutableTestScript_Assert(
        this.requestMethod,
        this.headerField,
        this.navigationLinks,
        this.compareToSourceId,
        this.minimumId,
        this.compareToSourceExpression,
        this.validateProfileId,
        newValue,
        this.response,
        this.path,
        this.contentType,
        this.id,
        this.requestURL,
        this.operator,
        this.sourceId,
        this.value,
        this.resource,
        this.expression,
        this.description,
        this.responseCode,
        this.extension,
        this.label,
        this.modifierExtension,
        this.direction,
        this.warningOnly);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Assert#compareToSourcePath() compareToSourcePath} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for compareToSourcePath
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Assert withCompareToSourcePath(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.compareToSourcePath, value)) return this;
    return new ImmutableTestScript_Assert(
        this.requestMethod,
        this.headerField,
        this.navigationLinks,
        this.compareToSourceId,
        this.minimumId,
        this.compareToSourceExpression,
        this.validateProfileId,
        value,
        this.response,
        this.path,
        this.contentType,
        this.id,
        this.requestURL,
        this.operator,
        this.sourceId,
        this.value,
        this.resource,
        this.expression,
        this.description,
        this.responseCode,
        this.extension,
        this.label,
        this.modifierExtension,
        this.direction,
        this.warningOnly);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Assert#response() response} attribute.
   * @param value The value for response
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Assert withResponse(Testscript_AssertResponse value) {
    @Nullable Testscript_AssertResponse newValue = Objects.requireNonNull(value, "response");
    if (this.response == newValue) return this;
    return new ImmutableTestScript_Assert(
        this.requestMethod,
        this.headerField,
        this.navigationLinks,
        this.compareToSourceId,
        this.minimumId,
        this.compareToSourceExpression,
        this.validateProfileId,
        this.compareToSourcePath,
        newValue,
        this.path,
        this.contentType,
        this.id,
        this.requestURL,
        this.operator,
        this.sourceId,
        this.value,
        this.resource,
        this.expression,
        this.description,
        this.responseCode,
        this.extension,
        this.label,
        this.modifierExtension,
        this.direction,
        this.warningOnly);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Assert#response() response} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for response
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript_Assert withResponse(Optional<? extends Testscript_AssertResponse> optional) {
    @Nullable Testscript_AssertResponse value = optional.orElse(null);
    if (this.response == value) return this;
    return new ImmutableTestScript_Assert(
        this.requestMethod,
        this.headerField,
        this.navigationLinks,
        this.compareToSourceId,
        this.minimumId,
        this.compareToSourceExpression,
        this.validateProfileId,
        this.compareToSourcePath,
        value,
        this.path,
        this.contentType,
        this.id,
        this.requestURL,
        this.operator,
        this.sourceId,
        this.value,
        this.resource,
        this.expression,
        this.description,
        this.responseCode,
        this.extension,
        this.label,
        this.modifierExtension,
        this.direction,
        this.warningOnly);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Assert#path() path} attribute.
   * @param value The value for path
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Assert withPath(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "path");
    if (Objects.equals(this.path, newValue)) return this;
    return new ImmutableTestScript_Assert(
        this.requestMethod,
        this.headerField,
        this.navigationLinks,
        this.compareToSourceId,
        this.minimumId,
        this.compareToSourceExpression,
        this.validateProfileId,
        this.compareToSourcePath,
        this.response,
        newValue,
        this.contentType,
        this.id,
        this.requestURL,
        this.operator,
        this.sourceId,
        this.value,
        this.resource,
        this.expression,
        this.description,
        this.responseCode,
        this.extension,
        this.label,
        this.modifierExtension,
        this.direction,
        this.warningOnly);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Assert#path() path} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for path
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Assert withPath(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.path, value)) return this;
    return new ImmutableTestScript_Assert(
        this.requestMethod,
        this.headerField,
        this.navigationLinks,
        this.compareToSourceId,
        this.minimumId,
        this.compareToSourceExpression,
        this.validateProfileId,
        this.compareToSourcePath,
        this.response,
        value,
        this.contentType,
        this.id,
        this.requestURL,
        this.operator,
        this.sourceId,
        this.value,
        this.resource,
        this.expression,
        this.description,
        this.responseCode,
        this.extension,
        this.label,
        this.modifierExtension,
        this.direction,
        this.warningOnly);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Assert#contentType() contentType} attribute.
   * @param value The value for contentType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Assert withContentType(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "contentType");
    if (this.contentType == newValue) return this;
    return new ImmutableTestScript_Assert(
        this.requestMethod,
        this.headerField,
        this.navigationLinks,
        this.compareToSourceId,
        this.minimumId,
        this.compareToSourceExpression,
        this.validateProfileId,
        this.compareToSourcePath,
        this.response,
        this.path,
        newValue,
        this.id,
        this.requestURL,
        this.operator,
        this.sourceId,
        this.value,
        this.resource,
        this.expression,
        this.description,
        this.responseCode,
        this.extension,
        this.label,
        this.modifierExtension,
        this.direction,
        this.warningOnly);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Assert#contentType() contentType} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contentType
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript_Assert withContentType(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.contentType == value) return this;
    return new ImmutableTestScript_Assert(
        this.requestMethod,
        this.headerField,
        this.navigationLinks,
        this.compareToSourceId,
        this.minimumId,
        this.compareToSourceExpression,
        this.validateProfileId,
        this.compareToSourcePath,
        this.response,
        this.path,
        value,
        this.id,
        this.requestURL,
        this.operator,
        this.sourceId,
        this.value,
        this.resource,
        this.expression,
        this.description,
        this.responseCode,
        this.extension,
        this.label,
        this.modifierExtension,
        this.direction,
        this.warningOnly);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Assert#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Assert withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableTestScript_Assert(
        this.requestMethod,
        this.headerField,
        this.navigationLinks,
        this.compareToSourceId,
        this.minimumId,
        this.compareToSourceExpression,
        this.validateProfileId,
        this.compareToSourcePath,
        this.response,
        this.path,
        this.contentType,
        newValue,
        this.requestURL,
        this.operator,
        this.sourceId,
        this.value,
        this.resource,
        this.expression,
        this.description,
        this.responseCode,
        this.extension,
        this.label,
        this.modifierExtension,
        this.direction,
        this.warningOnly);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Assert#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Assert withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableTestScript_Assert(
        this.requestMethod,
        this.headerField,
        this.navigationLinks,
        this.compareToSourceId,
        this.minimumId,
        this.compareToSourceExpression,
        this.validateProfileId,
        this.compareToSourcePath,
        this.response,
        this.path,
        this.contentType,
        value,
        this.requestURL,
        this.operator,
        this.sourceId,
        this.value,
        this.resource,
        this.expression,
        this.description,
        this.responseCode,
        this.extension,
        this.label,
        this.modifierExtension,
        this.direction,
        this.warningOnly);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Assert#requestURL() requestURL} attribute.
   * @param value The value for requestURL
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Assert withRequestURL(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "requestURL");
    if (Objects.equals(this.requestURL, newValue)) return this;
    return new ImmutableTestScript_Assert(
        this.requestMethod,
        this.headerField,
        this.navigationLinks,
        this.compareToSourceId,
        this.minimumId,
        this.compareToSourceExpression,
        this.validateProfileId,
        this.compareToSourcePath,
        this.response,
        this.path,
        this.contentType,
        this.id,
        newValue,
        this.operator,
        this.sourceId,
        this.value,
        this.resource,
        this.expression,
        this.description,
        this.responseCode,
        this.extension,
        this.label,
        this.modifierExtension,
        this.direction,
        this.warningOnly);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Assert#requestURL() requestURL} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for requestURL
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Assert withRequestURL(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.requestURL, value)) return this;
    return new ImmutableTestScript_Assert(
        this.requestMethod,
        this.headerField,
        this.navigationLinks,
        this.compareToSourceId,
        this.minimumId,
        this.compareToSourceExpression,
        this.validateProfileId,
        this.compareToSourcePath,
        this.response,
        this.path,
        this.contentType,
        this.id,
        value,
        this.operator,
        this.sourceId,
        this.value,
        this.resource,
        this.expression,
        this.description,
        this.responseCode,
        this.extension,
        this.label,
        this.modifierExtension,
        this.direction,
        this.warningOnly);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Assert#operator() operator} attribute.
   * @param value The value for operator
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Assert withOperator(Testscript_AssertOperator value) {
    @Nullable Testscript_AssertOperator newValue = Objects.requireNonNull(value, "operator");
    if (this.operator == newValue) return this;
    return new ImmutableTestScript_Assert(
        this.requestMethod,
        this.headerField,
        this.navigationLinks,
        this.compareToSourceId,
        this.minimumId,
        this.compareToSourceExpression,
        this.validateProfileId,
        this.compareToSourcePath,
        this.response,
        this.path,
        this.contentType,
        this.id,
        this.requestURL,
        newValue,
        this.sourceId,
        this.value,
        this.resource,
        this.expression,
        this.description,
        this.responseCode,
        this.extension,
        this.label,
        this.modifierExtension,
        this.direction,
        this.warningOnly);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Assert#operator() operator} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for operator
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript_Assert withOperator(Optional<? extends Testscript_AssertOperator> optional) {
    @Nullable Testscript_AssertOperator value = optional.orElse(null);
    if (this.operator == value) return this;
    return new ImmutableTestScript_Assert(
        this.requestMethod,
        this.headerField,
        this.navigationLinks,
        this.compareToSourceId,
        this.minimumId,
        this.compareToSourceExpression,
        this.validateProfileId,
        this.compareToSourcePath,
        this.response,
        this.path,
        this.contentType,
        this.id,
        this.requestURL,
        value,
        this.sourceId,
        this.value,
        this.resource,
        this.expression,
        this.description,
        this.responseCode,
        this.extension,
        this.label,
        this.modifierExtension,
        this.direction,
        this.warningOnly);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Assert#sourceId() sourceId} attribute.
   * @param value The value for sourceId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Assert withSourceId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "sourceId");
    if (this.sourceId == newValue) return this;
    return new ImmutableTestScript_Assert(
        this.requestMethod,
        this.headerField,
        this.navigationLinks,
        this.compareToSourceId,
        this.minimumId,
        this.compareToSourceExpression,
        this.validateProfileId,
        this.compareToSourcePath,
        this.response,
        this.path,
        this.contentType,
        this.id,
        this.requestURL,
        this.operator,
        newValue,
        this.value,
        this.resource,
        this.expression,
        this.description,
        this.responseCode,
        this.extension,
        this.label,
        this.modifierExtension,
        this.direction,
        this.warningOnly);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Assert#sourceId() sourceId} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for sourceId
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript_Assert withSourceId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.sourceId == value) return this;
    return new ImmutableTestScript_Assert(
        this.requestMethod,
        this.headerField,
        this.navigationLinks,
        this.compareToSourceId,
        this.minimumId,
        this.compareToSourceExpression,
        this.validateProfileId,
        this.compareToSourcePath,
        this.response,
        this.path,
        this.contentType,
        this.id,
        this.requestURL,
        this.operator,
        value,
        this.value,
        this.resource,
        this.expression,
        this.description,
        this.responseCode,
        this.extension,
        this.label,
        this.modifierExtension,
        this.direction,
        this.warningOnly);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Assert#value() value} attribute.
   * @param value The value for value
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Assert withValue(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "value");
    if (Objects.equals(this.value, newValue)) return this;
    return new ImmutableTestScript_Assert(
        this.requestMethod,
        this.headerField,
        this.navigationLinks,
        this.compareToSourceId,
        this.minimumId,
        this.compareToSourceExpression,
        this.validateProfileId,
        this.compareToSourcePath,
        this.response,
        this.path,
        this.contentType,
        this.id,
        this.requestURL,
        this.operator,
        this.sourceId,
        newValue,
        this.resource,
        this.expression,
        this.description,
        this.responseCode,
        this.extension,
        this.label,
        this.modifierExtension,
        this.direction,
        this.warningOnly);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Assert#value() value} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for value
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Assert withValue(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.value, value)) return this;
    return new ImmutableTestScript_Assert(
        this.requestMethod,
        this.headerField,
        this.navigationLinks,
        this.compareToSourceId,
        this.minimumId,
        this.compareToSourceExpression,
        this.validateProfileId,
        this.compareToSourcePath,
        this.response,
        this.path,
        this.contentType,
        this.id,
        this.requestURL,
        this.operator,
        this.sourceId,
        value,
        this.resource,
        this.expression,
        this.description,
        this.responseCode,
        this.extension,
        this.label,
        this.modifierExtension,
        this.direction,
        this.warningOnly);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Assert#resource() resource} attribute.
   * @param value The value for resource
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Assert withResource(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "resource");
    if (this.resource == newValue) return this;
    return new ImmutableTestScript_Assert(
        this.requestMethod,
        this.headerField,
        this.navigationLinks,
        this.compareToSourceId,
        this.minimumId,
        this.compareToSourceExpression,
        this.validateProfileId,
        this.compareToSourcePath,
        this.response,
        this.path,
        this.contentType,
        this.id,
        this.requestURL,
        this.operator,
        this.sourceId,
        this.value,
        newValue,
        this.expression,
        this.description,
        this.responseCode,
        this.extension,
        this.label,
        this.modifierExtension,
        this.direction,
        this.warningOnly);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Assert#resource() resource} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for resource
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript_Assert withResource(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.resource == value) return this;
    return new ImmutableTestScript_Assert(
        this.requestMethod,
        this.headerField,
        this.navigationLinks,
        this.compareToSourceId,
        this.minimumId,
        this.compareToSourceExpression,
        this.validateProfileId,
        this.compareToSourcePath,
        this.response,
        this.path,
        this.contentType,
        this.id,
        this.requestURL,
        this.operator,
        this.sourceId,
        this.value,
        value,
        this.expression,
        this.description,
        this.responseCode,
        this.extension,
        this.label,
        this.modifierExtension,
        this.direction,
        this.warningOnly);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Assert#expression() expression} attribute.
   * @param value The value for expression
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Assert withExpression(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "expression");
    if (Objects.equals(this.expression, newValue)) return this;
    return new ImmutableTestScript_Assert(
        this.requestMethod,
        this.headerField,
        this.navigationLinks,
        this.compareToSourceId,
        this.minimumId,
        this.compareToSourceExpression,
        this.validateProfileId,
        this.compareToSourcePath,
        this.response,
        this.path,
        this.contentType,
        this.id,
        this.requestURL,
        this.operator,
        this.sourceId,
        this.value,
        this.resource,
        newValue,
        this.description,
        this.responseCode,
        this.extension,
        this.label,
        this.modifierExtension,
        this.direction,
        this.warningOnly);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Assert#expression() expression} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for expression
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Assert withExpression(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.expression, value)) return this;
    return new ImmutableTestScript_Assert(
        this.requestMethod,
        this.headerField,
        this.navigationLinks,
        this.compareToSourceId,
        this.minimumId,
        this.compareToSourceExpression,
        this.validateProfileId,
        this.compareToSourcePath,
        this.response,
        this.path,
        this.contentType,
        this.id,
        this.requestURL,
        this.operator,
        this.sourceId,
        this.value,
        this.resource,
        value,
        this.description,
        this.responseCode,
        this.extension,
        this.label,
        this.modifierExtension,
        this.direction,
        this.warningOnly);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Assert#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Assert withDescription(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "description");
    if (Objects.equals(this.description, newValue)) return this;
    return new ImmutableTestScript_Assert(
        this.requestMethod,
        this.headerField,
        this.navigationLinks,
        this.compareToSourceId,
        this.minimumId,
        this.compareToSourceExpression,
        this.validateProfileId,
        this.compareToSourcePath,
        this.response,
        this.path,
        this.contentType,
        this.id,
        this.requestURL,
        this.operator,
        this.sourceId,
        this.value,
        this.resource,
        this.expression,
        newValue,
        this.responseCode,
        this.extension,
        this.label,
        this.modifierExtension,
        this.direction,
        this.warningOnly);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Assert#description() description} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Assert withDescription(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.description, value)) return this;
    return new ImmutableTestScript_Assert(
        this.requestMethod,
        this.headerField,
        this.navigationLinks,
        this.compareToSourceId,
        this.minimumId,
        this.compareToSourceExpression,
        this.validateProfileId,
        this.compareToSourcePath,
        this.response,
        this.path,
        this.contentType,
        this.id,
        this.requestURL,
        this.operator,
        this.sourceId,
        this.value,
        this.resource,
        this.expression,
        value,
        this.responseCode,
        this.extension,
        this.label,
        this.modifierExtension,
        this.direction,
        this.warningOnly);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Assert#responseCode() responseCode} attribute.
   * @param value The value for responseCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Assert withResponseCode(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "responseCode");
    if (Objects.equals(this.responseCode, newValue)) return this;
    return new ImmutableTestScript_Assert(
        this.requestMethod,
        this.headerField,
        this.navigationLinks,
        this.compareToSourceId,
        this.minimumId,
        this.compareToSourceExpression,
        this.validateProfileId,
        this.compareToSourcePath,
        this.response,
        this.path,
        this.contentType,
        this.id,
        this.requestURL,
        this.operator,
        this.sourceId,
        this.value,
        this.resource,
        this.expression,
        this.description,
        newValue,
        this.extension,
        this.label,
        this.modifierExtension,
        this.direction,
        this.warningOnly);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Assert#responseCode() responseCode} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for responseCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Assert withResponseCode(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.responseCode, value)) return this;
    return new ImmutableTestScript_Assert(
        this.requestMethod,
        this.headerField,
        this.navigationLinks,
        this.compareToSourceId,
        this.minimumId,
        this.compareToSourceExpression,
        this.validateProfileId,
        this.compareToSourcePath,
        this.response,
        this.path,
        this.contentType,
        this.id,
        this.requestURL,
        this.operator,
        this.sourceId,
        this.value,
        this.resource,
        this.expression,
        this.description,
        value,
        this.extension,
        this.label,
        this.modifierExtension,
        this.direction,
        this.warningOnly);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Assert#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Assert withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableTestScript_Assert(
        this.requestMethod,
        this.headerField,
        this.navigationLinks,
        this.compareToSourceId,
        this.minimumId,
        this.compareToSourceExpression,
        this.validateProfileId,
        this.compareToSourcePath,
        this.response,
        this.path,
        this.contentType,
        this.id,
        this.requestURL,
        this.operator,
        this.sourceId,
        this.value,
        this.resource,
        this.expression,
        this.description,
        this.responseCode,
        newValue,
        this.label,
        this.modifierExtension,
        this.direction,
        this.warningOnly);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Assert#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript_Assert withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableTestScript_Assert(
        this.requestMethod,
        this.headerField,
        this.navigationLinks,
        this.compareToSourceId,
        this.minimumId,
        this.compareToSourceExpression,
        this.validateProfileId,
        this.compareToSourcePath,
        this.response,
        this.path,
        this.contentType,
        this.id,
        this.requestURL,
        this.operator,
        this.sourceId,
        this.value,
        this.resource,
        this.expression,
        this.description,
        this.responseCode,
        value,
        this.label,
        this.modifierExtension,
        this.direction,
        this.warningOnly);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Assert#label() label} attribute.
   * @param value The value for label
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Assert withLabel(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "label");
    if (Objects.equals(this.label, newValue)) return this;
    return new ImmutableTestScript_Assert(
        this.requestMethod,
        this.headerField,
        this.navigationLinks,
        this.compareToSourceId,
        this.minimumId,
        this.compareToSourceExpression,
        this.validateProfileId,
        this.compareToSourcePath,
        this.response,
        this.path,
        this.contentType,
        this.id,
        this.requestURL,
        this.operator,
        this.sourceId,
        this.value,
        this.resource,
        this.expression,
        this.description,
        this.responseCode,
        this.extension,
        newValue,
        this.modifierExtension,
        this.direction,
        this.warningOnly);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Assert#label() label} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for label
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Assert withLabel(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.label, value)) return this;
    return new ImmutableTestScript_Assert(
        this.requestMethod,
        this.headerField,
        this.navigationLinks,
        this.compareToSourceId,
        this.minimumId,
        this.compareToSourceExpression,
        this.validateProfileId,
        this.compareToSourcePath,
        this.response,
        this.path,
        this.contentType,
        this.id,
        this.requestURL,
        this.operator,
        this.sourceId,
        this.value,
        this.resource,
        this.expression,
        this.description,
        this.responseCode,
        this.extension,
        value,
        this.modifierExtension,
        this.direction,
        this.warningOnly);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Assert#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Assert withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableTestScript_Assert(
        this.requestMethod,
        this.headerField,
        this.navigationLinks,
        this.compareToSourceId,
        this.minimumId,
        this.compareToSourceExpression,
        this.validateProfileId,
        this.compareToSourcePath,
        this.response,
        this.path,
        this.contentType,
        this.id,
        this.requestURL,
        this.operator,
        this.sourceId,
        this.value,
        this.resource,
        this.expression,
        this.description,
        this.responseCode,
        this.extension,
        this.label,
        newValue,
        this.direction,
        this.warningOnly);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Assert#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript_Assert withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableTestScript_Assert(
        this.requestMethod,
        this.headerField,
        this.navigationLinks,
        this.compareToSourceId,
        this.minimumId,
        this.compareToSourceExpression,
        this.validateProfileId,
        this.compareToSourcePath,
        this.response,
        this.path,
        this.contentType,
        this.id,
        this.requestURL,
        this.operator,
        this.sourceId,
        this.value,
        this.resource,
        this.expression,
        this.description,
        this.responseCode,
        this.extension,
        this.label,
        value,
        this.direction,
        this.warningOnly);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Assert#direction() direction} attribute.
   * @param value The value for direction
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Assert withDirection(Testscript_AssertDirection value) {
    @Nullable Testscript_AssertDirection newValue = Objects.requireNonNull(value, "direction");
    if (this.direction == newValue) return this;
    return new ImmutableTestScript_Assert(
        this.requestMethod,
        this.headerField,
        this.navigationLinks,
        this.compareToSourceId,
        this.minimumId,
        this.compareToSourceExpression,
        this.validateProfileId,
        this.compareToSourcePath,
        this.response,
        this.path,
        this.contentType,
        this.id,
        this.requestURL,
        this.operator,
        this.sourceId,
        this.value,
        this.resource,
        this.expression,
        this.description,
        this.responseCode,
        this.extension,
        this.label,
        this.modifierExtension,
        newValue,
        this.warningOnly);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Assert#direction() direction} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for direction
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript_Assert withDirection(Optional<? extends Testscript_AssertDirection> optional) {
    @Nullable Testscript_AssertDirection value = optional.orElse(null);
    if (this.direction == value) return this;
    return new ImmutableTestScript_Assert(
        this.requestMethod,
        this.headerField,
        this.navigationLinks,
        this.compareToSourceId,
        this.minimumId,
        this.compareToSourceExpression,
        this.validateProfileId,
        this.compareToSourcePath,
        this.response,
        this.path,
        this.contentType,
        this.id,
        this.requestURL,
        this.operator,
        this.sourceId,
        this.value,
        this.resource,
        this.expression,
        this.description,
        this.responseCode,
        this.extension,
        this.label,
        this.modifierExtension,
        value,
        this.warningOnly);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Assert#warningOnly() warningOnly} attribute.
   * @param value The value for warningOnly
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Assert withWarningOnly(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.warningOnly, newValue)) return this;
    return new ImmutableTestScript_Assert(
        this.requestMethod,
        this.headerField,
        this.navigationLinks,
        this.compareToSourceId,
        this.minimumId,
        this.compareToSourceExpression,
        this.validateProfileId,
        this.compareToSourcePath,
        this.response,
        this.path,
        this.contentType,
        this.id,
        this.requestURL,
        this.operator,
        this.sourceId,
        this.value,
        this.resource,
        this.expression,
        this.description,
        this.responseCode,
        this.extension,
        this.label,
        this.modifierExtension,
        this.direction,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Assert#warningOnly() warningOnly} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for warningOnly
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Assert withWarningOnly(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.warningOnly, value)) return this;
    return new ImmutableTestScript_Assert(
        this.requestMethod,
        this.headerField,
        this.navigationLinks,
        this.compareToSourceId,
        this.minimumId,
        this.compareToSourceExpression,
        this.validateProfileId,
        this.compareToSourcePath,
        this.response,
        this.path,
        this.contentType,
        this.id,
        this.requestURL,
        this.operator,
        this.sourceId,
        this.value,
        this.resource,
        this.expression,
        this.description,
        this.responseCode,
        this.extension,
        this.label,
        this.modifierExtension,
        this.direction,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableTestScript_Assert} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableTestScript_Assert
        && equalTo((ImmutableTestScript_Assert) another);
  }

  private boolean equalTo(ImmutableTestScript_Assert another) {
    return Objects.equals(requestMethod, another.requestMethod)
        && Objects.equals(headerField, another.headerField)
        && Objects.equals(navigationLinks, another.navigationLinks)
        && Objects.equals(compareToSourceId, another.compareToSourceId)
        && Objects.equals(minimumId, another.minimumId)
        && Objects.equals(compareToSourceExpression, another.compareToSourceExpression)
        && Objects.equals(validateProfileId, another.validateProfileId)
        && Objects.equals(compareToSourcePath, another.compareToSourcePath)
        && Objects.equals(response, another.response)
        && Objects.equals(path, another.path)
        && Objects.equals(contentType, another.contentType)
        && Objects.equals(id, another.id)
        && Objects.equals(requestURL, another.requestURL)
        && Objects.equals(operator, another.operator)
        && Objects.equals(sourceId, another.sourceId)
        && Objects.equals(value, another.value)
        && Objects.equals(resource, another.resource)
        && Objects.equals(expression, another.expression)
        && Objects.equals(description, another.description)
        && Objects.equals(responseCode, another.responseCode)
        && Objects.equals(extension, another.extension)
        && Objects.equals(label, another.label)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(direction, another.direction)
        && Objects.equals(warningOnly, another.warningOnly);
  }

  /**
   * Computes a hash code from attributes: {@code requestMethod}, {@code headerField}, {@code navigationLinks}, {@code compareToSourceId}, {@code minimumId}, {@code compareToSourceExpression}, {@code validateProfileId}, {@code compareToSourcePath}, {@code response}, {@code path}, {@code contentType}, {@code id}, {@code requestURL}, {@code operator}, {@code sourceId}, {@code value}, {@code resource}, {@code expression}, {@code description}, {@code responseCode}, {@code extension}, {@code label}, {@code modifierExtension}, {@code direction}, {@code warningOnly}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(requestMethod);
    h += (h << 5) + Objects.hashCode(headerField);
    h += (h << 5) + Objects.hashCode(navigationLinks);
    h += (h << 5) + Objects.hashCode(compareToSourceId);
    h += (h << 5) + Objects.hashCode(minimumId);
    h += (h << 5) + Objects.hashCode(compareToSourceExpression);
    h += (h << 5) + Objects.hashCode(validateProfileId);
    h += (h << 5) + Objects.hashCode(compareToSourcePath);
    h += (h << 5) + Objects.hashCode(response);
    h += (h << 5) + Objects.hashCode(path);
    h += (h << 5) + Objects.hashCode(contentType);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(requestURL);
    h += (h << 5) + Objects.hashCode(operator);
    h += (h << 5) + Objects.hashCode(sourceId);
    h += (h << 5) + Objects.hashCode(value);
    h += (h << 5) + Objects.hashCode(resource);
    h += (h << 5) + Objects.hashCode(expression);
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + Objects.hashCode(responseCode);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(label);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(direction);
    h += (h << 5) + Objects.hashCode(warningOnly);
    return h;
  }

  /**
   * Prints the immutable value {@code TestScript_Assert} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("TestScript_Assert{");
    if (requestMethod != null) {
      builder.append("requestMethod=").append(requestMethod);
    }
    if (headerField != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("headerField=").append(headerField);
    }
    if (navigationLinks != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("navigationLinks=").append(navigationLinks);
    }
    if (compareToSourceId != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("compareToSourceId=").append(compareToSourceId);
    }
    if (minimumId != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("minimumId=").append(minimumId);
    }
    if (compareToSourceExpression != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("compareToSourceExpression=").append(compareToSourceExpression);
    }
    if (validateProfileId != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("validateProfileId=").append(validateProfileId);
    }
    if (compareToSourcePath != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("compareToSourcePath=").append(compareToSourcePath);
    }
    if (response != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("response=").append(response);
    }
    if (path != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("path=").append(path);
    }
    if (contentType != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("contentType=").append(contentType);
    }
    if (id != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (requestURL != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("requestURL=").append(requestURL);
    }
    if (operator != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("operator=").append(operator);
    }
    if (sourceId != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("sourceId=").append(sourceId);
    }
    if (value != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("value=").append(value);
    }
    if (resource != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("resource=").append(resource);
    }
    if (expression != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("expression=").append(expression);
    }
    if (description != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("description=").append(description);
    }
    if (responseCode != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("responseCode=").append(responseCode);
    }
    if (extension != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (label != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("label=").append(label);
    }
    if (modifierExtension != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (direction != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("direction=").append(direction);
    }
    if (warningOnly != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("warningOnly=").append(warningOnly);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "TestScript_Assert", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements TestScript_Assert {
    @Nullable Optional<Testscript_AssertRequestmethod> requestMethod = Optional.empty();
    boolean requestMethodIsSet;
    @Nullable Optional<String> headerField = Optional.empty();
    boolean headerFieldIsSet;
    @Nullable Optional<Boolean> navigationLinks = Optional.empty();
    boolean navigationLinksIsSet;
    @Nullable Optional<String> compareToSourceId = Optional.empty();
    boolean compareToSourceIdIsSet;
    @Nullable Optional<String> minimumId = Optional.empty();
    boolean minimumIdIsSet;
    @Nullable Optional<String> compareToSourceExpression = Optional.empty();
    boolean compareToSourceExpressionIsSet;
    @Nullable Optional<Id> validateProfileId = Optional.empty();
    boolean validateProfileIdIsSet;
    @Nullable Optional<String> compareToSourcePath = Optional.empty();
    boolean compareToSourcePathIsSet;
    @Nullable Optional<Testscript_AssertResponse> response = Optional.empty();
    boolean responseIsSet;
    @Nullable Optional<String> path = Optional.empty();
    boolean pathIsSet;
    @Nullable Optional<Code> contentType = Optional.empty();
    boolean contentTypeIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<String> requestURL = Optional.empty();
    boolean requestURLIsSet;
    @Nullable Optional<Testscript_AssertOperator> operator = Optional.empty();
    boolean operatorIsSet;
    @Nullable Optional<Id> sourceId = Optional.empty();
    boolean sourceIdIsSet;
    @Nullable Optional<String> value = Optional.empty();
    boolean valueIsSet;
    @Nullable Optional<Code> resource = Optional.empty();
    boolean resourceIsSet;
    @Nullable Optional<String> expression = Optional.empty();
    boolean expressionIsSet;
    @Nullable Optional<String> description = Optional.empty();
    boolean descriptionIsSet;
    @Nullable Optional<String> responseCode = Optional.empty();
    boolean responseCodeIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<String> label = Optional.empty();
    boolean labelIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Testscript_AssertDirection> direction = Optional.empty();
    boolean directionIsSet;
    @Nullable Optional<Boolean> warningOnly = Optional.empty();
    boolean warningOnlyIsSet;
    @JsonProperty("requestMethod")
    public void setRequestMethod(Optional<Testscript_AssertRequestmethod> requestMethod) {
      this.requestMethod = requestMethod;
      this.requestMethodIsSet = true;
    }
    @JsonProperty("headerField")
    public void setHeaderField(Optional<String> headerField) {
      this.headerField = headerField;
      this.headerFieldIsSet = true;
    }
    @JsonProperty("navigationLinks")
    public void setNavigationLinks(Optional<Boolean> navigationLinks) {
      this.navigationLinks = navigationLinks;
      this.navigationLinksIsSet = true;
    }
    @JsonProperty("compareToSourceId")
    public void setCompareToSourceId(Optional<String> compareToSourceId) {
      this.compareToSourceId = compareToSourceId;
      this.compareToSourceIdIsSet = true;
    }
    @JsonProperty("minimumId")
    public void setMinimumId(Optional<String> minimumId) {
      this.minimumId = minimumId;
      this.minimumIdIsSet = true;
    }
    @JsonProperty("compareToSourceExpression")
    public void setCompareToSourceExpression(Optional<String> compareToSourceExpression) {
      this.compareToSourceExpression = compareToSourceExpression;
      this.compareToSourceExpressionIsSet = true;
    }
    @JsonProperty("validateProfileId")
    public void setValidateProfileId(Optional<Id> validateProfileId) {
      this.validateProfileId = validateProfileId;
      this.validateProfileIdIsSet = true;
    }
    @JsonProperty("compareToSourcePath")
    public void setCompareToSourcePath(Optional<String> compareToSourcePath) {
      this.compareToSourcePath = compareToSourcePath;
      this.compareToSourcePathIsSet = true;
    }
    @JsonProperty("response")
    public void setResponse(Optional<Testscript_AssertResponse> response) {
      this.response = response;
      this.responseIsSet = true;
    }
    @JsonProperty("path")
    public void setPath(Optional<String> path) {
      this.path = path;
      this.pathIsSet = true;
    }
    @JsonProperty("contentType")
    public void setContentType(Optional<Code> contentType) {
      this.contentType = contentType;
      this.contentTypeIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("requestURL")
    public void setRequestURL(Optional<String> requestURL) {
      this.requestURL = requestURL;
      this.requestURLIsSet = true;
    }
    @JsonProperty("operator")
    public void setOperator(Optional<Testscript_AssertOperator> operator) {
      this.operator = operator;
      this.operatorIsSet = true;
    }
    @JsonProperty("sourceId")
    public void setSourceId(Optional<Id> sourceId) {
      this.sourceId = sourceId;
      this.sourceIdIsSet = true;
    }
    @JsonProperty("value")
    public void setValue(Optional<String> value) {
      this.value = value;
      this.valueIsSet = true;
    }
    @JsonProperty("resource")
    public void setResource(Optional<Code> resource) {
      this.resource = resource;
      this.resourceIsSet = true;
    }
    @JsonProperty("expression")
    public void setExpression(Optional<String> expression) {
      this.expression = expression;
      this.expressionIsSet = true;
    }
    @JsonProperty("description")
    public void setDescription(Optional<String> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @JsonProperty("responseCode")
    public void setResponseCode(Optional<String> responseCode) {
      this.responseCode = responseCode;
      this.responseCodeIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("label")
    public void setLabel(Optional<String> label) {
      this.label = label;
      this.labelIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("direction")
    public void setDirection(Optional<Testscript_AssertDirection> direction) {
      this.direction = direction;
      this.directionIsSet = true;
    }
    @JsonProperty("warningOnly")
    public void setWarningOnly(Optional<Boolean> warningOnly) {
      this.warningOnly = warningOnly;
      this.warningOnlyIsSet = true;
    }
    @Override
    public Optional<Testscript_AssertRequestmethod> requestMethod() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> headerField() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> navigationLinks() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> compareToSourceId() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> minimumId() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> compareToSourceExpression() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> validateProfileId() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> compareToSourcePath() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Testscript_AssertResponse> response() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> path() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> contentType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> requestURL() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Testscript_AssertOperator> operator() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> sourceId() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> value() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> resource() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> expression() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> description() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> responseCode() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> label() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Testscript_AssertDirection> direction() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> warningOnly() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableTestScript_Assert fromJson(Json json) {
    ImmutableTestScript_Assert.Builder builder = ImmutableTestScript_Assert.builder();
    if (json.requestMethodIsSet) {
      builder.requestMethod(json.requestMethod);
    }
    if (json.headerFieldIsSet) {
      builder.headerField(json.headerField);
    }
    if (json.navigationLinksIsSet) {
      builder.navigationLinks(json.navigationLinks);
    }
    if (json.compareToSourceIdIsSet) {
      builder.compareToSourceId(json.compareToSourceId);
    }
    if (json.minimumIdIsSet) {
      builder.minimumId(json.minimumId);
    }
    if (json.compareToSourceExpressionIsSet) {
      builder.compareToSourceExpression(json.compareToSourceExpression);
    }
    if (json.validateProfileIdIsSet) {
      builder.validateProfileId(json.validateProfileId);
    }
    if (json.compareToSourcePathIsSet) {
      builder.compareToSourcePath(json.compareToSourcePath);
    }
    if (json.responseIsSet) {
      builder.response(json.response);
    }
    if (json.pathIsSet) {
      builder.path(json.path);
    }
    if (json.contentTypeIsSet) {
      builder.contentType(json.contentType);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.requestURLIsSet) {
      builder.requestURL(json.requestURL);
    }
    if (json.operatorIsSet) {
      builder.operator(json.operator);
    }
    if (json.sourceIdIsSet) {
      builder.sourceId(json.sourceId);
    }
    if (json.valueIsSet) {
      builder.value(json.value);
    }
    if (json.resourceIsSet) {
      builder.resource(json.resource);
    }
    if (json.expressionIsSet) {
      builder.expression(json.expression);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.responseCodeIsSet) {
      builder.responseCode(json.responseCode);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.labelIsSet) {
      builder.label(json.label);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.directionIsSet) {
      builder.direction(json.direction);
    }
    if (json.warningOnlyIsSet) {
      builder.warningOnly(json.warningOnly);
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
        .requestMethod(instance.requestMethod())
        .headerField(instance.headerField())
        .navigationLinks(instance.navigationLinks())
        .compareToSourceId(instance.compareToSourceId())
        .minimumId(instance.minimumId())
        .compareToSourceExpression(instance.compareToSourceExpression())
        .validateProfileId(instance.validateProfileId())
        .compareToSourcePath(instance.compareToSourcePath())
        .response(instance.response())
        .path(instance.path())
        .contentType(instance.contentType())
        .id(instance.id())
        .requestURL(instance.requestURL())
        .operator(instance.operator())
        .sourceId(instance.sourceId())
        .value(instance.value())
        .resource(instance.resource())
        .expression(instance.expression())
        .description(instance.description())
        .responseCode(instance.responseCode())
        .extension(instance.extension())
        .label(instance.label())
        .modifierExtension(instance.modifierExtension())
        .direction(instance.direction())
        .warningOnly(instance.warningOnly())
        .build();
  }

  /**
   * Creates a builder for {@link TestScript_Assert TestScript_Assert}.
   * <pre>
   * ImmutableTestScript_Assert.builder()
   *    .requestMethod(Testscript_AssertRequestmethod) // optional {@link TestScript_Assert#requestMethod() requestMethod}
   *    .headerField(String) // optional {@link TestScript_Assert#headerField() headerField}
   *    .navigationLinks(Boolean) // optional {@link TestScript_Assert#navigationLinks() navigationLinks}
   *    .compareToSourceId(String) // optional {@link TestScript_Assert#compareToSourceId() compareToSourceId}
   *    .minimumId(String) // optional {@link TestScript_Assert#minimumId() minimumId}
   *    .compareToSourceExpression(String) // optional {@link TestScript_Assert#compareToSourceExpression() compareToSourceExpression}
   *    .validateProfileId(com.fhir.types.fhir.Id) // optional {@link TestScript_Assert#validateProfileId() validateProfileId}
   *    .compareToSourcePath(String) // optional {@link TestScript_Assert#compareToSourcePath() compareToSourcePath}
   *    .response(Testscript_AssertResponse) // optional {@link TestScript_Assert#response() response}
   *    .path(String) // optional {@link TestScript_Assert#path() path}
   *    .contentType(com.fhir.types.fhir.Code) // optional {@link TestScript_Assert#contentType() contentType}
   *    .id(String) // optional {@link TestScript_Assert#id() id}
   *    .requestURL(String) // optional {@link TestScript_Assert#requestURL() requestURL}
   *    .operator(Testscript_AssertOperator) // optional {@link TestScript_Assert#operator() operator}
   *    .sourceId(com.fhir.types.fhir.Id) // optional {@link TestScript_Assert#sourceId() sourceId}
   *    .value(String) // optional {@link TestScript_Assert#value() value}
   *    .resource(com.fhir.types.fhir.Code) // optional {@link TestScript_Assert#resource() resource}
   *    .expression(String) // optional {@link TestScript_Assert#expression() expression}
   *    .description(String) // optional {@link TestScript_Assert#description() description}
   *    .responseCode(String) // optional {@link TestScript_Assert#responseCode() responseCode}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link TestScript_Assert#extension() extension}
   *    .label(String) // optional {@link TestScript_Assert#label() label}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link TestScript_Assert#modifierExtension() modifierExtension}
   *    .direction(Testscript_AssertDirection) // optional {@link TestScript_Assert#direction() direction}
   *    .warningOnly(Boolean) // optional {@link TestScript_Assert#warningOnly() warningOnly}
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
  @Generated(from = "TestScript_Assert", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_REQUEST_METHOD = 0x1L;
    private static final long OPT_BIT_HEADER_FIELD = 0x2L;
    private static final long OPT_BIT_NAVIGATION_LINKS = 0x4L;
    private static final long OPT_BIT_COMPARE_TO_SOURCE_ID = 0x8L;
    private static final long OPT_BIT_MINIMUM_ID = 0x10L;
    private static final long OPT_BIT_COMPARE_TO_SOURCE_EXPRESSION = 0x20L;
    private static final long OPT_BIT_VALIDATE_PROFILE_ID = 0x40L;
    private static final long OPT_BIT_COMPARE_TO_SOURCE_PATH = 0x80L;
    private static final long OPT_BIT_RESPONSE = 0x100L;
    private static final long OPT_BIT_PATH = 0x200L;
    private static final long OPT_BIT_CONTENT_TYPE = 0x400L;
    private static final long OPT_BIT_ID = 0x800L;
    private static final long OPT_BIT_REQUEST_U_R_L = 0x1000L;
    private static final long OPT_BIT_OPERATOR = 0x2000L;
    private static final long OPT_BIT_SOURCE_ID = 0x4000L;
    private static final long OPT_BIT_VALUE = 0x8000L;
    private static final long OPT_BIT_RESOURCE = 0x10000L;
    private static final long OPT_BIT_EXPRESSION = 0x20000L;
    private static final long OPT_BIT_DESCRIPTION = 0x40000L;
    private static final long OPT_BIT_RESPONSE_CODE = 0x80000L;
    private static final long OPT_BIT_EXTENSION = 0x100000L;
    private static final long OPT_BIT_LABEL = 0x200000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x400000L;
    private static final long OPT_BIT_DIRECTION = 0x800000L;
    private static final long OPT_BIT_WARNING_ONLY = 0x1000000L;
    private long optBits;

    private @Nullable Testscript_AssertRequestmethod requestMethod;
    private @Nullable String headerField;
    private @Nullable Boolean navigationLinks;
    private @Nullable String compareToSourceId;
    private @Nullable String minimumId;
    private @Nullable String compareToSourceExpression;
    private @Nullable Id validateProfileId;
    private @Nullable String compareToSourcePath;
    private @Nullable Testscript_AssertResponse response;
    private @Nullable String path;
    private @Nullable Code contentType;
    private @Nullable String id;
    private @Nullable String requestURL;
    private @Nullable Testscript_AssertOperator operator;
    private @Nullable Id sourceId;
    private @Nullable String value;
    private @Nullable Code resource;
    private @Nullable String expression;
    private @Nullable String description;
    private @Nullable String responseCode;
    private @Nullable List<Extension> extension;
    private @Nullable String label;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Testscript_AssertDirection direction;
    private @Nullable Boolean warningOnly;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link TestScript_Assert#requestMethod() requestMethod} to requestMethod.
     * @param requestMethod The value for requestMethod
     * @return {@code this} builder for chained invocation
     */
    public final Builder requestMethod(Testscript_AssertRequestmethod requestMethod) {
      checkNotIsSet(requestMethodIsSet(), "requestMethod");
      this.requestMethod = Objects.requireNonNull(requestMethod, "requestMethod");
      optBits |= OPT_BIT_REQUEST_METHOD;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Assert#requestMethod() requestMethod} to requestMethod.
     * @param requestMethod The value for requestMethod
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("requestMethod")
    public final Builder requestMethod(Optional<? extends Testscript_AssertRequestmethod> requestMethod) {
      checkNotIsSet(requestMethodIsSet(), "requestMethod");
      this.requestMethod = requestMethod.orElse(null);
      optBits |= OPT_BIT_REQUEST_METHOD;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Assert#headerField() headerField} to headerField.
     * @param headerField The value for headerField
     * @return {@code this} builder for chained invocation
     */
    public final Builder headerField(String headerField) {
      checkNotIsSet(headerFieldIsSet(), "headerField");
      this.headerField = Objects.requireNonNull(headerField, "headerField");
      optBits |= OPT_BIT_HEADER_FIELD;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Assert#headerField() headerField} to headerField.
     * @param headerField The value for headerField
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("headerField")
    public final Builder headerField(Optional<String> headerField) {
      checkNotIsSet(headerFieldIsSet(), "headerField");
      this.headerField = headerField.orElse(null);
      optBits |= OPT_BIT_HEADER_FIELD;
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
    @JsonProperty("navigationLinks")
    public final Builder navigationLinks(Optional<Boolean> navigationLinks) {
      checkNotIsSet(navigationLinksIsSet(), "navigationLinks");
      this.navigationLinks = navigationLinks.orElse(null);
      optBits |= OPT_BIT_NAVIGATION_LINKS;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Assert#compareToSourceId() compareToSourceId} to compareToSourceId.
     * @param compareToSourceId The value for compareToSourceId
     * @return {@code this} builder for chained invocation
     */
    public final Builder compareToSourceId(String compareToSourceId) {
      checkNotIsSet(compareToSourceIdIsSet(), "compareToSourceId");
      this.compareToSourceId = Objects.requireNonNull(compareToSourceId, "compareToSourceId");
      optBits |= OPT_BIT_COMPARE_TO_SOURCE_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Assert#compareToSourceId() compareToSourceId} to compareToSourceId.
     * @param compareToSourceId The value for compareToSourceId
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("compareToSourceId")
    public final Builder compareToSourceId(Optional<String> compareToSourceId) {
      checkNotIsSet(compareToSourceIdIsSet(), "compareToSourceId");
      this.compareToSourceId = compareToSourceId.orElse(null);
      optBits |= OPT_BIT_COMPARE_TO_SOURCE_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Assert#minimumId() minimumId} to minimumId.
     * @param minimumId The value for minimumId
     * @return {@code this} builder for chained invocation
     */
    public final Builder minimumId(String minimumId) {
      checkNotIsSet(minimumIdIsSet(), "minimumId");
      this.minimumId = Objects.requireNonNull(minimumId, "minimumId");
      optBits |= OPT_BIT_MINIMUM_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Assert#minimumId() minimumId} to minimumId.
     * @param minimumId The value for minimumId
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("minimumId")
    public final Builder minimumId(Optional<String> minimumId) {
      checkNotIsSet(minimumIdIsSet(), "minimumId");
      this.minimumId = minimumId.orElse(null);
      optBits |= OPT_BIT_MINIMUM_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Assert#compareToSourceExpression() compareToSourceExpression} to compareToSourceExpression.
     * @param compareToSourceExpression The value for compareToSourceExpression
     * @return {@code this} builder for chained invocation
     */
    public final Builder compareToSourceExpression(String compareToSourceExpression) {
      checkNotIsSet(compareToSourceExpressionIsSet(), "compareToSourceExpression");
      this.compareToSourceExpression = Objects.requireNonNull(compareToSourceExpression, "compareToSourceExpression");
      optBits |= OPT_BIT_COMPARE_TO_SOURCE_EXPRESSION;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Assert#compareToSourceExpression() compareToSourceExpression} to compareToSourceExpression.
     * @param compareToSourceExpression The value for compareToSourceExpression
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("compareToSourceExpression")
    public final Builder compareToSourceExpression(Optional<String> compareToSourceExpression) {
      checkNotIsSet(compareToSourceExpressionIsSet(), "compareToSourceExpression");
      this.compareToSourceExpression = compareToSourceExpression.orElse(null);
      optBits |= OPT_BIT_COMPARE_TO_SOURCE_EXPRESSION;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Assert#validateProfileId() validateProfileId} to validateProfileId.
     * @param validateProfileId The value for validateProfileId
     * @return {@code this} builder for chained invocation
     */
    public final Builder validateProfileId(Id validateProfileId) {
      checkNotIsSet(validateProfileIdIsSet(), "validateProfileId");
      this.validateProfileId = Objects.requireNonNull(validateProfileId, "validateProfileId");
      optBits |= OPT_BIT_VALIDATE_PROFILE_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Assert#validateProfileId() validateProfileId} to validateProfileId.
     * @param validateProfileId The value for validateProfileId
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("validateProfileId")
    public final Builder validateProfileId(Optional<? extends Id> validateProfileId) {
      checkNotIsSet(validateProfileIdIsSet(), "validateProfileId");
      this.validateProfileId = validateProfileId.orElse(null);
      optBits |= OPT_BIT_VALIDATE_PROFILE_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Assert#compareToSourcePath() compareToSourcePath} to compareToSourcePath.
     * @param compareToSourcePath The value for compareToSourcePath
     * @return {@code this} builder for chained invocation
     */
    public final Builder compareToSourcePath(String compareToSourcePath) {
      checkNotIsSet(compareToSourcePathIsSet(), "compareToSourcePath");
      this.compareToSourcePath = Objects.requireNonNull(compareToSourcePath, "compareToSourcePath");
      optBits |= OPT_BIT_COMPARE_TO_SOURCE_PATH;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Assert#compareToSourcePath() compareToSourcePath} to compareToSourcePath.
     * @param compareToSourcePath The value for compareToSourcePath
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("compareToSourcePath")
    public final Builder compareToSourcePath(Optional<String> compareToSourcePath) {
      checkNotIsSet(compareToSourcePathIsSet(), "compareToSourcePath");
      this.compareToSourcePath = compareToSourcePath.orElse(null);
      optBits |= OPT_BIT_COMPARE_TO_SOURCE_PATH;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Assert#response() response} to response.
     * @param response The value for response
     * @return {@code this} builder for chained invocation
     */
    public final Builder response(Testscript_AssertResponse response) {
      checkNotIsSet(responseIsSet(), "response");
      this.response = Objects.requireNonNull(response, "response");
      optBits |= OPT_BIT_RESPONSE;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Assert#response() response} to response.
     * @param response The value for response
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("response")
    public final Builder response(Optional<? extends Testscript_AssertResponse> response) {
      checkNotIsSet(responseIsSet(), "response");
      this.response = response.orElse(null);
      optBits |= OPT_BIT_RESPONSE;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Assert#path() path} to path.
     * @param path The value for path
     * @return {@code this} builder for chained invocation
     */
    public final Builder path(String path) {
      checkNotIsSet(pathIsSet(), "path");
      this.path = Objects.requireNonNull(path, "path");
      optBits |= OPT_BIT_PATH;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Assert#path() path} to path.
     * @param path The value for path
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("path")
    public final Builder path(Optional<String> path) {
      checkNotIsSet(pathIsSet(), "path");
      this.path = path.orElse(null);
      optBits |= OPT_BIT_PATH;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Assert#contentType() contentType} to contentType.
     * @param contentType The value for contentType
     * @return {@code this} builder for chained invocation
     */
    public final Builder contentType(Code contentType) {
      checkNotIsSet(contentTypeIsSet(), "contentType");
      this.contentType = Objects.requireNonNull(contentType, "contentType");
      optBits |= OPT_BIT_CONTENT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Assert#contentType() contentType} to contentType.
     * @param contentType The value for contentType
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("contentType")
    public final Builder contentType(Optional<? extends Code> contentType) {
      checkNotIsSet(contentTypeIsSet(), "contentType");
      this.contentType = contentType.orElse(null);
      optBits |= OPT_BIT_CONTENT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Assert#id() id} to id.
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
     * Initializes the optional value {@link TestScript_Assert#id() id} to id.
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
     * Initializes the optional value {@link TestScript_Assert#requestURL() requestURL} to requestURL.
     * @param requestURL The value for requestURL
     * @return {@code this} builder for chained invocation
     */
    public final Builder requestURL(String requestURL) {
      checkNotIsSet(requestURLIsSet(), "requestURL");
      this.requestURL = Objects.requireNonNull(requestURL, "requestURL");
      optBits |= OPT_BIT_REQUEST_U_R_L;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Assert#requestURL() requestURL} to requestURL.
     * @param requestURL The value for requestURL
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("requestURL")
    public final Builder requestURL(Optional<String> requestURL) {
      checkNotIsSet(requestURLIsSet(), "requestURL");
      this.requestURL = requestURL.orElse(null);
      optBits |= OPT_BIT_REQUEST_U_R_L;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Assert#operator() operator} to operator.
     * @param operator The value for operator
     * @return {@code this} builder for chained invocation
     */
    public final Builder operator(Testscript_AssertOperator operator) {
      checkNotIsSet(operatorIsSet(), "operator");
      this.operator = Objects.requireNonNull(operator, "operator");
      optBits |= OPT_BIT_OPERATOR;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Assert#operator() operator} to operator.
     * @param operator The value for operator
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("operator")
    public final Builder operator(Optional<? extends Testscript_AssertOperator> operator) {
      checkNotIsSet(operatorIsSet(), "operator");
      this.operator = operator.orElse(null);
      optBits |= OPT_BIT_OPERATOR;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Assert#sourceId() sourceId} to sourceId.
     * @param sourceId The value for sourceId
     * @return {@code this} builder for chained invocation
     */
    public final Builder sourceId(Id sourceId) {
      checkNotIsSet(sourceIdIsSet(), "sourceId");
      this.sourceId = Objects.requireNonNull(sourceId, "sourceId");
      optBits |= OPT_BIT_SOURCE_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Assert#sourceId() sourceId} to sourceId.
     * @param sourceId The value for sourceId
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("sourceId")
    public final Builder sourceId(Optional<? extends Id> sourceId) {
      checkNotIsSet(sourceIdIsSet(), "sourceId");
      this.sourceId = sourceId.orElse(null);
      optBits |= OPT_BIT_SOURCE_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Assert#value() value} to value.
     * @param value The value for value
     * @return {@code this} builder for chained invocation
     */
    public final Builder value(String value) {
      checkNotIsSet(valueIsSet(), "value");
      this.value = Objects.requireNonNull(value, "value");
      optBits |= OPT_BIT_VALUE;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Assert#value() value} to value.
     * @param value The value for value
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("value")
    public final Builder value(Optional<String> value) {
      checkNotIsSet(valueIsSet(), "value");
      this.value = value.orElse(null);
      optBits |= OPT_BIT_VALUE;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Assert#resource() resource} to resource.
     * @param resource The value for resource
     * @return {@code this} builder for chained invocation
     */
    public final Builder resource(Code resource) {
      checkNotIsSet(resourceIsSet(), "resource");
      this.resource = Objects.requireNonNull(resource, "resource");
      optBits |= OPT_BIT_RESOURCE;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Assert#resource() resource} to resource.
     * @param resource The value for resource
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("resource")
    public final Builder resource(Optional<? extends Code> resource) {
      checkNotIsSet(resourceIsSet(), "resource");
      this.resource = resource.orElse(null);
      optBits |= OPT_BIT_RESOURCE;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Assert#expression() expression} to expression.
     * @param expression The value for expression
     * @return {@code this} builder for chained invocation
     */
    public final Builder expression(String expression) {
      checkNotIsSet(expressionIsSet(), "expression");
      this.expression = Objects.requireNonNull(expression, "expression");
      optBits |= OPT_BIT_EXPRESSION;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Assert#expression() expression} to expression.
     * @param expression The value for expression
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("expression")
    public final Builder expression(Optional<String> expression) {
      checkNotIsSet(expressionIsSet(), "expression");
      this.expression = expression.orElse(null);
      optBits |= OPT_BIT_EXPRESSION;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Assert#description() description} to description.
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
     * Initializes the optional value {@link TestScript_Assert#description() description} to description.
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
     * Initializes the optional value {@link TestScript_Assert#responseCode() responseCode} to responseCode.
     * @param responseCode The value for responseCode
     * @return {@code this} builder for chained invocation
     */
    public final Builder responseCode(String responseCode) {
      checkNotIsSet(responseCodeIsSet(), "responseCode");
      this.responseCode = Objects.requireNonNull(responseCode, "responseCode");
      optBits |= OPT_BIT_RESPONSE_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Assert#responseCode() responseCode} to responseCode.
     * @param responseCode The value for responseCode
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("responseCode")
    public final Builder responseCode(Optional<String> responseCode) {
      checkNotIsSet(responseCodeIsSet(), "responseCode");
      this.responseCode = responseCode.orElse(null);
      optBits |= OPT_BIT_RESPONSE_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Assert#extension() extension} to extension.
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
     * Initializes the optional value {@link TestScript_Assert#extension() extension} to extension.
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
     * Initializes the optional value {@link TestScript_Assert#label() label} to label.
     * @param label The value for label
     * @return {@code this} builder for chained invocation
     */
    public final Builder label(String label) {
      checkNotIsSet(labelIsSet(), "label");
      this.label = Objects.requireNonNull(label, "label");
      optBits |= OPT_BIT_LABEL;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Assert#label() label} to label.
     * @param label The value for label
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("label")
    public final Builder label(Optional<String> label) {
      checkNotIsSet(labelIsSet(), "label");
      this.label = label.orElse(null);
      optBits |= OPT_BIT_LABEL;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Assert#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link TestScript_Assert#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link TestScript_Assert#direction() direction} to direction.
     * @param direction The value for direction
     * @return {@code this} builder for chained invocation
     */
    public final Builder direction(Testscript_AssertDirection direction) {
      checkNotIsSet(directionIsSet(), "direction");
      this.direction = Objects.requireNonNull(direction, "direction");
      optBits |= OPT_BIT_DIRECTION;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Assert#direction() direction} to direction.
     * @param direction The value for direction
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("direction")
    public final Builder direction(Optional<? extends Testscript_AssertDirection> direction) {
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
    @JsonProperty("warningOnly")
    public final Builder warningOnly(Optional<Boolean> warningOnly) {
      checkNotIsSet(warningOnlyIsSet(), "warningOnly");
      this.warningOnly = warningOnly.orElse(null);
      optBits |= OPT_BIT_WARNING_ONLY;
      return this;
    }

    /**
     * Builds a new {@link TestScript_Assert TestScript_Assert}.
     * @return An immutable instance of TestScript_Assert
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public TestScript_Assert build() {
      return new ImmutableTestScript_Assert(
          requestMethod,
          headerField,
          navigationLinks,
          compareToSourceId,
          minimumId,
          compareToSourceExpression,
          validateProfileId,
          compareToSourcePath,
          response,
          path,
          contentType,
          id,
          requestURL,
          operator,
          sourceId,
          value,
          resource,
          expression,
          description,
          responseCode,
          extension,
          label,
          modifierExtension,
          direction,
          warningOnly);
    }

    private boolean requestMethodIsSet() {
      return (optBits & OPT_BIT_REQUEST_METHOD) != 0;
    }

    private boolean headerFieldIsSet() {
      return (optBits & OPT_BIT_HEADER_FIELD) != 0;
    }

    private boolean navigationLinksIsSet() {
      return (optBits & OPT_BIT_NAVIGATION_LINKS) != 0;
    }

    private boolean compareToSourceIdIsSet() {
      return (optBits & OPT_BIT_COMPARE_TO_SOURCE_ID) != 0;
    }

    private boolean minimumIdIsSet() {
      return (optBits & OPT_BIT_MINIMUM_ID) != 0;
    }

    private boolean compareToSourceExpressionIsSet() {
      return (optBits & OPT_BIT_COMPARE_TO_SOURCE_EXPRESSION) != 0;
    }

    private boolean validateProfileIdIsSet() {
      return (optBits & OPT_BIT_VALIDATE_PROFILE_ID) != 0;
    }

    private boolean compareToSourcePathIsSet() {
      return (optBits & OPT_BIT_COMPARE_TO_SOURCE_PATH) != 0;
    }

    private boolean responseIsSet() {
      return (optBits & OPT_BIT_RESPONSE) != 0;
    }

    private boolean pathIsSet() {
      return (optBits & OPT_BIT_PATH) != 0;
    }

    private boolean contentTypeIsSet() {
      return (optBits & OPT_BIT_CONTENT_TYPE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean requestURLIsSet() {
      return (optBits & OPT_BIT_REQUEST_U_R_L) != 0;
    }

    private boolean operatorIsSet() {
      return (optBits & OPT_BIT_OPERATOR) != 0;
    }

    private boolean sourceIdIsSet() {
      return (optBits & OPT_BIT_SOURCE_ID) != 0;
    }

    private boolean valueIsSet() {
      return (optBits & OPT_BIT_VALUE) != 0;
    }

    private boolean resourceIsSet() {
      return (optBits & OPT_BIT_RESOURCE) != 0;
    }

    private boolean expressionIsSet() {
      return (optBits & OPT_BIT_EXPRESSION) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean responseCodeIsSet() {
      return (optBits & OPT_BIT_RESPONSE_CODE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean labelIsSet() {
      return (optBits & OPT_BIT_LABEL) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean directionIsSet() {
      return (optBits & OPT_BIT_DIRECTION) != 0;
    }

    private boolean warningOnlyIsSet() {
      return (optBits & OPT_BIT_WARNING_ONLY) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of TestScript_Assert is strict, attribute is already set: ".concat(name));
    }
  }
}
