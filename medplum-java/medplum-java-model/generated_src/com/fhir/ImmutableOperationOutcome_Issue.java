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
 * Immutable implementation of {@link OperationOutcome_Issue}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableOperationOutcome_Issue.builder()}.
 */
@Generated(from = "OperationOutcome_Issue", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableOperationOutcome_Issue implements OperationOutcome_Issue {
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable String id;
  private final @Nullable Operationoutcome_issueSeverity severity;
  private final @Nullable CodeableConcept details;
  private final @Nullable Operationoutcome_issueCode code;
  private final @Nullable String diagnostics;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<String> expression;
  private final @Nullable List<String> location;

  private ImmutableOperationOutcome_Issue(
      @Nullable List<Extension> modifierExtension,
      @Nullable String id,
      @Nullable Operationoutcome_issueSeverity severity,
      @Nullable CodeableConcept details,
      @Nullable Operationoutcome_issueCode code,
      @Nullable String diagnostics,
      @Nullable List<Extension> extension,
      @Nullable List<String> expression,
      @Nullable List<String> location) {
    this.modifierExtension = modifierExtension;
    this.id = id;
    this.severity = severity;
    this.details = details;
    this.code = code;
    this.diagnostics = diagnostics;
    this.extension = extension;
    this.expression = expression;
    this.location = location;
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
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<String> id() {
    return Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code severity} attribute
   */
  @JsonProperty("severity")
  @Override
  public Optional<Operationoutcome_issueSeverity> severity() {
    return Optional.ofNullable(severity);
  }

  /**
   * @return The value of the {@code details} attribute
   */
  @JsonProperty("details")
  @Override
  public Optional<CodeableConcept> details() {
    return Optional.ofNullable(details);
  }

  /**
   * @return The value of the {@code code} attribute
   */
  @JsonProperty("code")
  @Override
  public Optional<Operationoutcome_issueCode> code() {
    return Optional.ofNullable(code);
  }

  /**
   * @return The value of the {@code diagnostics} attribute
   */
  @JsonProperty("diagnostics")
  @Override
  public Optional<String> diagnostics() {
    return Optional.ofNullable(diagnostics);
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
   * @return The value of the {@code expression} attribute
   */
  @JsonProperty("expression")
  @Override
  public Optional<List<String>> expression() {
    return Optional.ofNullable(expression);
  }

  /**
   * @return The value of the {@code location} attribute
   */
  @JsonProperty("location")
  @Override
  public Optional<List<String>> location() {
    return Optional.ofNullable(location);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationOutcome_Issue#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationOutcome_Issue withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableOperationOutcome_Issue(
        newValue,
        this.id,
        this.severity,
        this.details,
        this.code,
        this.diagnostics,
        this.extension,
        this.expression,
        this.location);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationOutcome_Issue#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOperationOutcome_Issue withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableOperationOutcome_Issue(
        value,
        this.id,
        this.severity,
        this.details,
        this.code,
        this.diagnostics,
        this.extension,
        this.expression,
        this.location);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationOutcome_Issue#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationOutcome_Issue withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableOperationOutcome_Issue(
        this.modifierExtension,
        newValue,
        this.severity,
        this.details,
        this.code,
        this.diagnostics,
        this.extension,
        this.expression,
        this.location);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationOutcome_Issue#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationOutcome_Issue withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableOperationOutcome_Issue(
        this.modifierExtension,
        value,
        this.severity,
        this.details,
        this.code,
        this.diagnostics,
        this.extension,
        this.expression,
        this.location);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationOutcome_Issue#severity() severity} attribute.
   * @param value The value for severity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationOutcome_Issue withSeverity(Operationoutcome_issueSeverity value) {
    @Nullable Operationoutcome_issueSeverity newValue = Objects.requireNonNull(value, "severity");
    if (this.severity == newValue) return this;
    return new ImmutableOperationOutcome_Issue(
        this.modifierExtension,
        this.id,
        newValue,
        this.details,
        this.code,
        this.diagnostics,
        this.extension,
        this.expression,
        this.location);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationOutcome_Issue#severity() severity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for severity
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOperationOutcome_Issue withSeverity(Optional<? extends Operationoutcome_issueSeverity> optional) {
    @Nullable Operationoutcome_issueSeverity value = optional.orElse(null);
    if (this.severity == value) return this;
    return new ImmutableOperationOutcome_Issue(
        this.modifierExtension,
        this.id,
        value,
        this.details,
        this.code,
        this.diagnostics,
        this.extension,
        this.expression,
        this.location);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationOutcome_Issue#details() details} attribute.
   * @param value The value for details
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationOutcome_Issue withDetails(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "details");
    if (this.details == newValue) return this;
    return new ImmutableOperationOutcome_Issue(
        this.modifierExtension,
        this.id,
        this.severity,
        newValue,
        this.code,
        this.diagnostics,
        this.extension,
        this.expression,
        this.location);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationOutcome_Issue#details() details} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for details
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOperationOutcome_Issue withDetails(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.details == value) return this;
    return new ImmutableOperationOutcome_Issue(
        this.modifierExtension,
        this.id,
        this.severity,
        value,
        this.code,
        this.diagnostics,
        this.extension,
        this.expression,
        this.location);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationOutcome_Issue#code() code} attribute.
   * @param value The value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationOutcome_Issue withCode(Operationoutcome_issueCode value) {
    @Nullable Operationoutcome_issueCode newValue = Objects.requireNonNull(value, "code");
    if (this.code == newValue) return this;
    return new ImmutableOperationOutcome_Issue(
        this.modifierExtension,
        this.id,
        this.severity,
        this.details,
        newValue,
        this.diagnostics,
        this.extension,
        this.expression,
        this.location);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationOutcome_Issue#code() code} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for code
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOperationOutcome_Issue withCode(Optional<? extends Operationoutcome_issueCode> optional) {
    @Nullable Operationoutcome_issueCode value = optional.orElse(null);
    if (this.code == value) return this;
    return new ImmutableOperationOutcome_Issue(
        this.modifierExtension,
        this.id,
        this.severity,
        this.details,
        value,
        this.diagnostics,
        this.extension,
        this.expression,
        this.location);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationOutcome_Issue#diagnostics() diagnostics} attribute.
   * @param value The value for diagnostics
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationOutcome_Issue withDiagnostics(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "diagnostics");
    if (Objects.equals(this.diagnostics, newValue)) return this;
    return new ImmutableOperationOutcome_Issue(
        this.modifierExtension,
        this.id,
        this.severity,
        this.details,
        this.code,
        newValue,
        this.extension,
        this.expression,
        this.location);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationOutcome_Issue#diagnostics() diagnostics} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for diagnostics
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationOutcome_Issue withDiagnostics(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.diagnostics, value)) return this;
    return new ImmutableOperationOutcome_Issue(
        this.modifierExtension,
        this.id,
        this.severity,
        this.details,
        this.code,
        value,
        this.extension,
        this.expression,
        this.location);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationOutcome_Issue#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationOutcome_Issue withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableOperationOutcome_Issue(
        this.modifierExtension,
        this.id,
        this.severity,
        this.details,
        this.code,
        this.diagnostics,
        newValue,
        this.expression,
        this.location);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationOutcome_Issue#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOperationOutcome_Issue withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableOperationOutcome_Issue(
        this.modifierExtension,
        this.id,
        this.severity,
        this.details,
        this.code,
        this.diagnostics,
        value,
        this.expression,
        this.location);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationOutcome_Issue#expression() expression} attribute.
   * @param value The value for expression
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationOutcome_Issue withExpression(List<String> value) {
    @Nullable List<String> newValue = Objects.requireNonNull(value, "expression");
    if (this.expression == newValue) return this;
    return new ImmutableOperationOutcome_Issue(
        this.modifierExtension,
        this.id,
        this.severity,
        this.details,
        this.code,
        this.diagnostics,
        this.extension,
        newValue,
        this.location);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationOutcome_Issue#expression() expression} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for expression
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOperationOutcome_Issue withExpression(Optional<? extends List<String>> optional) {
    @Nullable List<String> value = optional.orElse(null);
    if (this.expression == value) return this;
    return new ImmutableOperationOutcome_Issue(
        this.modifierExtension,
        this.id,
        this.severity,
        this.details,
        this.code,
        this.diagnostics,
        this.extension,
        value,
        this.location);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationOutcome_Issue#location() location} attribute.
   * @param value The value for location
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationOutcome_Issue withLocation(List<String> value) {
    @Nullable List<String> newValue = Objects.requireNonNull(value, "location");
    if (this.location == newValue) return this;
    return new ImmutableOperationOutcome_Issue(
        this.modifierExtension,
        this.id,
        this.severity,
        this.details,
        this.code,
        this.diagnostics,
        this.extension,
        this.expression,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationOutcome_Issue#location() location} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for location
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOperationOutcome_Issue withLocation(Optional<? extends List<String>> optional) {
    @Nullable List<String> value = optional.orElse(null);
    if (this.location == value) return this;
    return new ImmutableOperationOutcome_Issue(
        this.modifierExtension,
        this.id,
        this.severity,
        this.details,
        this.code,
        this.diagnostics,
        this.extension,
        this.expression,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableOperationOutcome_Issue} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableOperationOutcome_Issue
        && equalTo((ImmutableOperationOutcome_Issue) another);
  }

  private boolean equalTo(ImmutableOperationOutcome_Issue another) {
    return Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(id, another.id)
        && Objects.equals(severity, another.severity)
        && Objects.equals(details, another.details)
        && Objects.equals(code, another.code)
        && Objects.equals(diagnostics, another.diagnostics)
        && Objects.equals(extension, another.extension)
        && Objects.equals(expression, another.expression)
        && Objects.equals(location, another.location);
  }

  /**
   * Computes a hash code from attributes: {@code modifierExtension}, {@code id}, {@code severity}, {@code details}, {@code code}, {@code diagnostics}, {@code extension}, {@code expression}, {@code location}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(severity);
    h += (h << 5) + Objects.hashCode(details);
    h += (h << 5) + Objects.hashCode(code);
    h += (h << 5) + Objects.hashCode(diagnostics);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(expression);
    h += (h << 5) + Objects.hashCode(location);
    return h;
  }

  /**
   * Prints the immutable value {@code OperationOutcome_Issue} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("OperationOutcome_Issue{");
    if (modifierExtension != null) {
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (id != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (severity != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("severity=").append(severity);
    }
    if (details != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("details=").append(details);
    }
    if (code != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("code=").append(code);
    }
    if (diagnostics != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("diagnostics=").append(diagnostics);
    }
    if (extension != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (expression != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("expression=").append(expression);
    }
    if (location != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("location=").append(location);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "OperationOutcome_Issue", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements OperationOutcome_Issue {
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Operationoutcome_issueSeverity> severity = Optional.empty();
    boolean severityIsSet;
    @Nullable Optional<CodeableConcept> details = Optional.empty();
    boolean detailsIsSet;
    @Nullable Optional<Operationoutcome_issueCode> code = Optional.empty();
    boolean codeIsSet;
    @Nullable Optional<String> diagnostics = Optional.empty();
    boolean diagnosticsIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<String>> expression = Optional.empty();
    boolean expressionIsSet;
    @Nullable Optional<List<String>> location = Optional.empty();
    boolean locationIsSet;
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("severity")
    public void setSeverity(Optional<Operationoutcome_issueSeverity> severity) {
      this.severity = severity;
      this.severityIsSet = true;
    }
    @JsonProperty("details")
    public void setDetails(Optional<CodeableConcept> details) {
      this.details = details;
      this.detailsIsSet = true;
    }
    @JsonProperty("code")
    public void setCode(Optional<Operationoutcome_issueCode> code) {
      this.code = code;
      this.codeIsSet = true;
    }
    @JsonProperty("diagnostics")
    public void setDiagnostics(Optional<String> diagnostics) {
      this.diagnostics = diagnostics;
      this.diagnosticsIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("expression")
    public void setExpression(Optional<List<String>> expression) {
      this.expression = expression;
      this.expressionIsSet = true;
    }
    @JsonProperty("location")
    public void setLocation(Optional<List<String>> location) {
      this.location = location;
      this.locationIsSet = true;
    }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Operationoutcome_issueSeverity> severity() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> details() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Operationoutcome_issueCode> code() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> diagnostics() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<String>> expression() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<String>> location() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableOperationOutcome_Issue fromJson(Json json) {
    ImmutableOperationOutcome_Issue.Builder builder = ImmutableOperationOutcome_Issue.builder();
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.severityIsSet) {
      builder.severity(json.severity);
    }
    if (json.detailsIsSet) {
      builder.details(json.details);
    }
    if (json.codeIsSet) {
      builder.code(json.code);
    }
    if (json.diagnosticsIsSet) {
      builder.diagnostics(json.diagnostics);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.expressionIsSet) {
      builder.expression(json.expression);
    }
    if (json.locationIsSet) {
      builder.location(json.location);
    }
    return (ImmutableOperationOutcome_Issue) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link OperationOutcome_Issue} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable OperationOutcome_Issue instance
   */
  public static OperationOutcome_Issue copyOf(OperationOutcome_Issue instance) {
    if (instance instanceof ImmutableOperationOutcome_Issue) {
      return (ImmutableOperationOutcome_Issue) instance;
    }
    return ImmutableOperationOutcome_Issue.builder()
        .modifierExtension(instance.modifierExtension())
        .id(instance.id())
        .severity(instance.severity())
        .details(instance.details())
        .code(instance.code())
        .diagnostics(instance.diagnostics())
        .extension(instance.extension())
        .expression(instance.expression())
        .location(instance.location())
        .build();
  }

  /**
   * Creates a builder for {@link OperationOutcome_Issue OperationOutcome_Issue}.
   * <pre>
   * ImmutableOperationOutcome_Issue.builder()
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link OperationOutcome_Issue#modifierExtension() modifierExtension}
   *    .id(String) // optional {@link OperationOutcome_Issue#id() id}
   *    .severity(com.fhir.Operationoutcome_issueSeverity) // optional {@link OperationOutcome_Issue#severity() severity}
   *    .details(com.fhir.CodeableConcept) // optional {@link OperationOutcome_Issue#details() details}
   *    .code(com.fhir.Operationoutcome_issueCode) // optional {@link OperationOutcome_Issue#code() code}
   *    .diagnostics(String) // optional {@link OperationOutcome_Issue#diagnostics() diagnostics}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link OperationOutcome_Issue#extension() extension}
   *    .expression(List&amp;lt;String&amp;gt;) // optional {@link OperationOutcome_Issue#expression() expression}
   *    .location(List&amp;lt;String&amp;gt;) // optional {@link OperationOutcome_Issue#location() location}
   *    .build();
   * </pre>
   * @return A new OperationOutcome_Issue builder
   */
  public static ImmutableOperationOutcome_Issue.Builder builder() {
    return new ImmutableOperationOutcome_Issue.Builder();
  }

  /**
   * Builds instances of type {@link OperationOutcome_Issue OperationOutcome_Issue}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "OperationOutcome_Issue", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1L;
    private static final long OPT_BIT_ID = 0x2L;
    private static final long OPT_BIT_SEVERITY = 0x4L;
    private static final long OPT_BIT_DETAILS = 0x8L;
    private static final long OPT_BIT_CODE = 0x10L;
    private static final long OPT_BIT_DIAGNOSTICS = 0x20L;
    private static final long OPT_BIT_EXTENSION = 0x40L;
    private static final long OPT_BIT_EXPRESSION = 0x80L;
    private static final long OPT_BIT_LOCATION = 0x100L;
    private long optBits;

    private @Nullable List<Extension> modifierExtension;
    private @Nullable String id;
    private @Nullable Operationoutcome_issueSeverity severity;
    private @Nullable CodeableConcept details;
    private @Nullable Operationoutcome_issueCode code;
    private @Nullable String diagnostics;
    private @Nullable List<Extension> extension;
    private @Nullable List<String> expression;
    private @Nullable List<String> location;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link OperationOutcome_Issue#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link OperationOutcome_Issue#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link OperationOutcome_Issue#id() id} to id.
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
     * Initializes the optional value {@link OperationOutcome_Issue#id() id} to id.
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
     * Initializes the optional value {@link OperationOutcome_Issue#severity() severity} to severity.
     * @param severity The value for severity
     * @return {@code this} builder for chained invocation
     */
    public final Builder severity(Operationoutcome_issueSeverity severity) {
      checkNotIsSet(severityIsSet(), "severity");
      this.severity = Objects.requireNonNull(severity, "severity");
      optBits |= OPT_BIT_SEVERITY;
      return this;
    }

    /**
     * Initializes the optional value {@link OperationOutcome_Issue#severity() severity} to severity.
     * @param severity The value for severity
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("severity")
    public final Builder severity(Optional<? extends Operationoutcome_issueSeverity> severity) {
      checkNotIsSet(severityIsSet(), "severity");
      this.severity = severity.orElse(null);
      optBits |= OPT_BIT_SEVERITY;
      return this;
    }

    /**
     * Initializes the optional value {@link OperationOutcome_Issue#details() details} to details.
     * @param details The value for details
     * @return {@code this} builder for chained invocation
     */
    public final Builder details(CodeableConcept details) {
      checkNotIsSet(detailsIsSet(), "details");
      this.details = Objects.requireNonNull(details, "details");
      optBits |= OPT_BIT_DETAILS;
      return this;
    }

    /**
     * Initializes the optional value {@link OperationOutcome_Issue#details() details} to details.
     * @param details The value for details
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("details")
    public final Builder details(Optional<? extends CodeableConcept> details) {
      checkNotIsSet(detailsIsSet(), "details");
      this.details = details.orElse(null);
      optBits |= OPT_BIT_DETAILS;
      return this;
    }

    /**
     * Initializes the optional value {@link OperationOutcome_Issue#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    public final Builder code(Operationoutcome_issueCode code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = Objects.requireNonNull(code, "code");
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link OperationOutcome_Issue#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("code")
    public final Builder code(Optional<? extends Operationoutcome_issueCode> code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = code.orElse(null);
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link OperationOutcome_Issue#diagnostics() diagnostics} to diagnostics.
     * @param diagnostics The value for diagnostics
     * @return {@code this} builder for chained invocation
     */
    public final Builder diagnostics(String diagnostics) {
      checkNotIsSet(diagnosticsIsSet(), "diagnostics");
      this.diagnostics = Objects.requireNonNull(diagnostics, "diagnostics");
      optBits |= OPT_BIT_DIAGNOSTICS;
      return this;
    }

    /**
     * Initializes the optional value {@link OperationOutcome_Issue#diagnostics() diagnostics} to diagnostics.
     * @param diagnostics The value for diagnostics
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("diagnostics")
    public final Builder diagnostics(Optional<String> diagnostics) {
      checkNotIsSet(diagnosticsIsSet(), "diagnostics");
      this.diagnostics = diagnostics.orElse(null);
      optBits |= OPT_BIT_DIAGNOSTICS;
      return this;
    }

    /**
     * Initializes the optional value {@link OperationOutcome_Issue#extension() extension} to extension.
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
     * Initializes the optional value {@link OperationOutcome_Issue#extension() extension} to extension.
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
     * Initializes the optional value {@link OperationOutcome_Issue#expression() expression} to expression.
     * @param expression The value for expression
     * @return {@code this} builder for chained invocation
     */
    public final Builder expression(List<String> expression) {
      checkNotIsSet(expressionIsSet(), "expression");
      this.expression = Objects.requireNonNull(expression, "expression");
      optBits |= OPT_BIT_EXPRESSION;
      return this;
    }

    /**
     * Initializes the optional value {@link OperationOutcome_Issue#expression() expression} to expression.
     * @param expression The value for expression
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("expression")
    public final Builder expression(Optional<? extends List<String>> expression) {
      checkNotIsSet(expressionIsSet(), "expression");
      this.expression = expression.orElse(null);
      optBits |= OPT_BIT_EXPRESSION;
      return this;
    }

    /**
     * Initializes the optional value {@link OperationOutcome_Issue#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for chained invocation
     */
    public final Builder location(List<String> location) {
      checkNotIsSet(locationIsSet(), "location");
      this.location = Objects.requireNonNull(location, "location");
      optBits |= OPT_BIT_LOCATION;
      return this;
    }

    /**
     * Initializes the optional value {@link OperationOutcome_Issue#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("location")
    public final Builder location(Optional<? extends List<String>> location) {
      checkNotIsSet(locationIsSet(), "location");
      this.location = location.orElse(null);
      optBits |= OPT_BIT_LOCATION;
      return this;
    }

    /**
     * Builds a new {@link OperationOutcome_Issue OperationOutcome_Issue}.
     * @return An immutable instance of OperationOutcome_Issue
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public OperationOutcome_Issue build() {
      return new ImmutableOperationOutcome_Issue(modifierExtension, id, severity, details, code, diagnostics, extension, expression, location);
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean severityIsSet() {
      return (optBits & OPT_BIT_SEVERITY) != 0;
    }

    private boolean detailsIsSet() {
      return (optBits & OPT_BIT_DETAILS) != 0;
    }

    private boolean codeIsSet() {
      return (optBits & OPT_BIT_CODE) != 0;
    }

    private boolean diagnosticsIsSet() {
      return (optBits & OPT_BIT_DIAGNOSTICS) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean expressionIsSet() {
      return (optBits & OPT_BIT_EXPRESSION) != 0;
    }

    private boolean locationIsSet() {
      return (optBits & OPT_BIT_LOCATION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of OperationOutcome_Issue is strict, attribute is already set: ".concat(name));
    }
  }
}
