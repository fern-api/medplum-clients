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
 * Immutable implementation of {@link ElementDefinition_Constraint}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableElementDefinition_Constraint.builder()}.
 */
@Generated(from = "ElementDefinition_Constraint", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableElementDefinition_Constraint
    implements ElementDefinition_Constraint {
  private final @Nullable List<Extension> extension;
  private final @Nullable String xpath;
  private final @Nullable String id;
  private final @Nullable String expression;
  private final @Nullable String human;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Elementdefinition_ConstraintSeverity severity;
  private final @Nullable Id key;
  private final @Nullable String requirements;
  private final @Nullable Canonical source;

  private ImmutableElementDefinition_Constraint(
      @Nullable List<Extension> extension,
      @Nullable String xpath,
      @Nullable String id,
      @Nullable String expression,
      @Nullable String human,
      @Nullable List<Extension> modifierExtension,
      @Nullable Elementdefinition_ConstraintSeverity severity,
      @Nullable Id key,
      @Nullable String requirements,
      @Nullable Canonical source) {
    this.extension = extension;
    this.xpath = xpath;
    this.id = id;
    this.expression = expression;
    this.human = human;
    this.modifierExtension = modifierExtension;
    this.severity = severity;
    this.key = key;
    this.requirements = requirements;
    this.source = source;
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
   * @return The value of the {@code xpath} attribute
   */
  @JsonProperty("xpath")
  @Override
  public Optional<String> xpath() {
    return Optional.ofNullable(xpath);
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
   * @return The value of the {@code expression} attribute
   */
  @JsonProperty("expression")
  @Override
  public Optional<String> expression() {
    return Optional.ofNullable(expression);
  }

  /**
   * @return The value of the {@code human} attribute
   */
  @JsonProperty("human")
  @Override
  public Optional<String> human() {
    return Optional.ofNullable(human);
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
   * @return The value of the {@code severity} attribute
   */
  @JsonProperty("severity")
  @Override
  public Optional<Elementdefinition_ConstraintSeverity> severity() {
    return Optional.ofNullable(severity);
  }

  /**
   * @return The value of the {@code key} attribute
   */
  @JsonProperty("key")
  @Override
  public Optional<Id> key() {
    return Optional.ofNullable(key);
  }

  /**
   * @return The value of the {@code requirements} attribute
   */
  @JsonProperty("requirements")
  @Override
  public Optional<String> requirements() {
    return Optional.ofNullable(requirements);
  }

  /**
   * @return The value of the {@code source} attribute
   */
  @JsonProperty("source")
  @Override
  public Optional<Canonical> source() {
    return Optional.ofNullable(source);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ElementDefinition_Constraint#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableElementDefinition_Constraint withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableElementDefinition_Constraint(
        newValue,
        this.xpath,
        this.id,
        this.expression,
        this.human,
        this.modifierExtension,
        this.severity,
        this.key,
        this.requirements,
        this.source);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ElementDefinition_Constraint#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableElementDefinition_Constraint withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableElementDefinition_Constraint(
        value,
        this.xpath,
        this.id,
        this.expression,
        this.human,
        this.modifierExtension,
        this.severity,
        this.key,
        this.requirements,
        this.source);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ElementDefinition_Constraint#xpath() xpath} attribute.
   * @param value The value for xpath
   * @return A modified copy of {@code this} object
   */
  public final ImmutableElementDefinition_Constraint withXpath(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "xpath");
    if (Objects.equals(this.xpath, newValue)) return this;
    return new ImmutableElementDefinition_Constraint(
        this.extension,
        newValue,
        this.id,
        this.expression,
        this.human,
        this.modifierExtension,
        this.severity,
        this.key,
        this.requirements,
        this.source);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ElementDefinition_Constraint#xpath() xpath} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for xpath
   * @return A modified copy of {@code this} object
   */
  public final ImmutableElementDefinition_Constraint withXpath(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.xpath, value)) return this;
    return new ImmutableElementDefinition_Constraint(
        this.extension,
        value,
        this.id,
        this.expression,
        this.human,
        this.modifierExtension,
        this.severity,
        this.key,
        this.requirements,
        this.source);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ElementDefinition_Constraint#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableElementDefinition_Constraint withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableElementDefinition_Constraint(
        this.extension,
        this.xpath,
        newValue,
        this.expression,
        this.human,
        this.modifierExtension,
        this.severity,
        this.key,
        this.requirements,
        this.source);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ElementDefinition_Constraint#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableElementDefinition_Constraint withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableElementDefinition_Constraint(
        this.extension,
        this.xpath,
        value,
        this.expression,
        this.human,
        this.modifierExtension,
        this.severity,
        this.key,
        this.requirements,
        this.source);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ElementDefinition_Constraint#expression() expression} attribute.
   * @param value The value for expression
   * @return A modified copy of {@code this} object
   */
  public final ImmutableElementDefinition_Constraint withExpression(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "expression");
    if (Objects.equals(this.expression, newValue)) return this;
    return new ImmutableElementDefinition_Constraint(
        this.extension,
        this.xpath,
        this.id,
        newValue,
        this.human,
        this.modifierExtension,
        this.severity,
        this.key,
        this.requirements,
        this.source);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ElementDefinition_Constraint#expression() expression} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for expression
   * @return A modified copy of {@code this} object
   */
  public final ImmutableElementDefinition_Constraint withExpression(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.expression, value)) return this;
    return new ImmutableElementDefinition_Constraint(
        this.extension,
        this.xpath,
        this.id,
        value,
        this.human,
        this.modifierExtension,
        this.severity,
        this.key,
        this.requirements,
        this.source);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ElementDefinition_Constraint#human() human} attribute.
   * @param value The value for human
   * @return A modified copy of {@code this} object
   */
  public final ImmutableElementDefinition_Constraint withHuman(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "human");
    if (Objects.equals(this.human, newValue)) return this;
    return new ImmutableElementDefinition_Constraint(
        this.extension,
        this.xpath,
        this.id,
        this.expression,
        newValue,
        this.modifierExtension,
        this.severity,
        this.key,
        this.requirements,
        this.source);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ElementDefinition_Constraint#human() human} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for human
   * @return A modified copy of {@code this} object
   */
  public final ImmutableElementDefinition_Constraint withHuman(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.human, value)) return this;
    return new ImmutableElementDefinition_Constraint(
        this.extension,
        this.xpath,
        this.id,
        this.expression,
        value,
        this.modifierExtension,
        this.severity,
        this.key,
        this.requirements,
        this.source);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ElementDefinition_Constraint#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableElementDefinition_Constraint withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableElementDefinition_Constraint(
        this.extension,
        this.xpath,
        this.id,
        this.expression,
        this.human,
        newValue,
        this.severity,
        this.key,
        this.requirements,
        this.source);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ElementDefinition_Constraint#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableElementDefinition_Constraint withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableElementDefinition_Constraint(
        this.extension,
        this.xpath,
        this.id,
        this.expression,
        this.human,
        value,
        this.severity,
        this.key,
        this.requirements,
        this.source);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ElementDefinition_Constraint#severity() severity} attribute.
   * @param value The value for severity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableElementDefinition_Constraint withSeverity(Elementdefinition_ConstraintSeverity value) {
    @Nullable Elementdefinition_ConstraintSeverity newValue = Objects.requireNonNull(value, "severity");
    if (this.severity == newValue) return this;
    return new ImmutableElementDefinition_Constraint(
        this.extension,
        this.xpath,
        this.id,
        this.expression,
        this.human,
        this.modifierExtension,
        newValue,
        this.key,
        this.requirements,
        this.source);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ElementDefinition_Constraint#severity() severity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for severity
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableElementDefinition_Constraint withSeverity(Optional<? extends Elementdefinition_ConstraintSeverity> optional) {
    @Nullable Elementdefinition_ConstraintSeverity value = optional.orElse(null);
    if (this.severity == value) return this;
    return new ImmutableElementDefinition_Constraint(
        this.extension,
        this.xpath,
        this.id,
        this.expression,
        this.human,
        this.modifierExtension,
        value,
        this.key,
        this.requirements,
        this.source);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ElementDefinition_Constraint#key() key} attribute.
   * @param value The value for key
   * @return A modified copy of {@code this} object
   */
  public final ImmutableElementDefinition_Constraint withKey(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "key");
    if (this.key == newValue) return this;
    return new ImmutableElementDefinition_Constraint(
        this.extension,
        this.xpath,
        this.id,
        this.expression,
        this.human,
        this.modifierExtension,
        this.severity,
        newValue,
        this.requirements,
        this.source);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ElementDefinition_Constraint#key() key} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for key
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableElementDefinition_Constraint withKey(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.key == value) return this;
    return new ImmutableElementDefinition_Constraint(
        this.extension,
        this.xpath,
        this.id,
        this.expression,
        this.human,
        this.modifierExtension,
        this.severity,
        value,
        this.requirements,
        this.source);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ElementDefinition_Constraint#requirements() requirements} attribute.
   * @param value The value for requirements
   * @return A modified copy of {@code this} object
   */
  public final ImmutableElementDefinition_Constraint withRequirements(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "requirements");
    if (Objects.equals(this.requirements, newValue)) return this;
    return new ImmutableElementDefinition_Constraint(
        this.extension,
        this.xpath,
        this.id,
        this.expression,
        this.human,
        this.modifierExtension,
        this.severity,
        this.key,
        newValue,
        this.source);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ElementDefinition_Constraint#requirements() requirements} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for requirements
   * @return A modified copy of {@code this} object
   */
  public final ImmutableElementDefinition_Constraint withRequirements(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.requirements, value)) return this;
    return new ImmutableElementDefinition_Constraint(
        this.extension,
        this.xpath,
        this.id,
        this.expression,
        this.human,
        this.modifierExtension,
        this.severity,
        this.key,
        value,
        this.source);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ElementDefinition_Constraint#source() source} attribute.
   * @param value The value for source
   * @return A modified copy of {@code this} object
   */
  public final ImmutableElementDefinition_Constraint withSource(Canonical value) {
    @Nullable Canonical newValue = Objects.requireNonNull(value, "source");
    if (this.source == newValue) return this;
    return new ImmutableElementDefinition_Constraint(
        this.extension,
        this.xpath,
        this.id,
        this.expression,
        this.human,
        this.modifierExtension,
        this.severity,
        this.key,
        this.requirements,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ElementDefinition_Constraint#source() source} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for source
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableElementDefinition_Constraint withSource(Optional<? extends Canonical> optional) {
    @Nullable Canonical value = optional.orElse(null);
    if (this.source == value) return this;
    return new ImmutableElementDefinition_Constraint(
        this.extension,
        this.xpath,
        this.id,
        this.expression,
        this.human,
        this.modifierExtension,
        this.severity,
        this.key,
        this.requirements,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableElementDefinition_Constraint} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableElementDefinition_Constraint
        && equalTo((ImmutableElementDefinition_Constraint) another);
  }

  private boolean equalTo(ImmutableElementDefinition_Constraint another) {
    return Objects.equals(extension, another.extension)
        && Objects.equals(xpath, another.xpath)
        && Objects.equals(id, another.id)
        && Objects.equals(expression, another.expression)
        && Objects.equals(human, another.human)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(severity, another.severity)
        && Objects.equals(key, another.key)
        && Objects.equals(requirements, another.requirements)
        && Objects.equals(source, another.source);
  }

  /**
   * Computes a hash code from attributes: {@code extension}, {@code xpath}, {@code id}, {@code expression}, {@code human}, {@code modifierExtension}, {@code severity}, {@code key}, {@code requirements}, {@code source}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(xpath);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(expression);
    h += (h << 5) + Objects.hashCode(human);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(severity);
    h += (h << 5) + Objects.hashCode(key);
    h += (h << 5) + Objects.hashCode(requirements);
    h += (h << 5) + Objects.hashCode(source);
    return h;
  }

  /**
   * Prints the immutable value {@code ElementDefinition_Constraint} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("ElementDefinition_Constraint{");
    if (extension != null) {
      builder.append("extension=").append(extension);
    }
    if (xpath != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("xpath=").append(xpath);
    }
    if (id != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (expression != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("expression=").append(expression);
    }
    if (human != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("human=").append(human);
    }
    if (modifierExtension != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (severity != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("severity=").append(severity);
    }
    if (key != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("key=").append(key);
    }
    if (requirements != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("requirements=").append(requirements);
    }
    if (source != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("source=").append(source);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "ElementDefinition_Constraint", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ElementDefinition_Constraint {
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<String> xpath = Optional.empty();
    boolean xpathIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<String> expression = Optional.empty();
    boolean expressionIsSet;
    @Nullable Optional<String> human = Optional.empty();
    boolean humanIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Elementdefinition_ConstraintSeverity> severity = Optional.empty();
    boolean severityIsSet;
    @Nullable Optional<Id> key = Optional.empty();
    boolean keyIsSet;
    @Nullable Optional<String> requirements = Optional.empty();
    boolean requirementsIsSet;
    @Nullable Optional<Canonical> source = Optional.empty();
    boolean sourceIsSet;
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("xpath")
    public void setXpath(Optional<String> xpath) {
      this.xpath = xpath;
      this.xpathIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("expression")
    public void setExpression(Optional<String> expression) {
      this.expression = expression;
      this.expressionIsSet = true;
    }
    @JsonProperty("human")
    public void setHuman(Optional<String> human) {
      this.human = human;
      this.humanIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("severity")
    public void setSeverity(Optional<Elementdefinition_ConstraintSeverity> severity) {
      this.severity = severity;
      this.severityIsSet = true;
    }
    @JsonProperty("key")
    public void setKey(Optional<Id> key) {
      this.key = key;
      this.keyIsSet = true;
    }
    @JsonProperty("requirements")
    public void setRequirements(Optional<String> requirements) {
      this.requirements = requirements;
      this.requirementsIsSet = true;
    }
    @JsonProperty("source")
    public void setSource(Optional<Canonical> source) {
      this.source = source;
      this.sourceIsSet = true;
    }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> xpath() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> expression() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> human() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Elementdefinition_ConstraintSeverity> severity() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> key() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> requirements() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Canonical> source() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableElementDefinition_Constraint fromJson(Json json) {
    ImmutableElementDefinition_Constraint.Builder builder = ImmutableElementDefinition_Constraint.builder();
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.xpathIsSet) {
      builder.xpath(json.xpath);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.expressionIsSet) {
      builder.expression(json.expression);
    }
    if (json.humanIsSet) {
      builder.human(json.human);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.severityIsSet) {
      builder.severity(json.severity);
    }
    if (json.keyIsSet) {
      builder.key(json.key);
    }
    if (json.requirementsIsSet) {
      builder.requirements(json.requirements);
    }
    if (json.sourceIsSet) {
      builder.source(json.source);
    }
    return (ImmutableElementDefinition_Constraint) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ElementDefinition_Constraint} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ElementDefinition_Constraint instance
   */
  public static ElementDefinition_Constraint copyOf(ElementDefinition_Constraint instance) {
    if (instance instanceof ImmutableElementDefinition_Constraint) {
      return (ImmutableElementDefinition_Constraint) instance;
    }
    return ImmutableElementDefinition_Constraint.builder()
        .extension(instance.extension())
        .xpath(instance.xpath())
        .id(instance.id())
        .expression(instance.expression())
        .human(instance.human())
        .modifierExtension(instance.modifierExtension())
        .severity(instance.severity())
        .key(instance.key())
        .requirements(instance.requirements())
        .source(instance.source())
        .build();
  }

  /**
   * Creates a builder for {@link ElementDefinition_Constraint ElementDefinition_Constraint}.
   * <pre>
   * ImmutableElementDefinition_Constraint.builder()
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link ElementDefinition_Constraint#extension() extension}
   *    .xpath(String) // optional {@link ElementDefinition_Constraint#xpath() xpath}
   *    .id(String) // optional {@link ElementDefinition_Constraint#id() id}
   *    .expression(String) // optional {@link ElementDefinition_Constraint#expression() expression}
   *    .human(String) // optional {@link ElementDefinition_Constraint#human() human}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link ElementDefinition_Constraint#modifierExtension() modifierExtension}
   *    .severity(Elementdefinition_ConstraintSeverity) // optional {@link ElementDefinition_Constraint#severity() severity}
   *    .key(com.fhir.types.fhir.Id) // optional {@link ElementDefinition_Constraint#key() key}
   *    .requirements(String) // optional {@link ElementDefinition_Constraint#requirements() requirements}
   *    .source(com.fhir.types.fhir.Canonical) // optional {@link ElementDefinition_Constraint#source() source}
   *    .build();
   * </pre>
   * @return A new ElementDefinition_Constraint builder
   */
  public static ImmutableElementDefinition_Constraint.Builder builder() {
    return new ImmutableElementDefinition_Constraint.Builder();
  }

  /**
   * Builds instances of type {@link ElementDefinition_Constraint ElementDefinition_Constraint}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "ElementDefinition_Constraint", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_EXTENSION = 0x1L;
    private static final long OPT_BIT_XPATH = 0x2L;
    private static final long OPT_BIT_ID = 0x4L;
    private static final long OPT_BIT_EXPRESSION = 0x8L;
    private static final long OPT_BIT_HUMAN = 0x10L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x20L;
    private static final long OPT_BIT_SEVERITY = 0x40L;
    private static final long OPT_BIT_KEY = 0x80L;
    private static final long OPT_BIT_REQUIREMENTS = 0x100L;
    private static final long OPT_BIT_SOURCE = 0x200L;
    private long optBits;

    private @Nullable List<Extension> extension;
    private @Nullable String xpath;
    private @Nullable String id;
    private @Nullable String expression;
    private @Nullable String human;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Elementdefinition_ConstraintSeverity severity;
    private @Nullable Id key;
    private @Nullable String requirements;
    private @Nullable Canonical source;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ElementDefinition_Constraint#extension() extension} to extension.
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
     * Initializes the optional value {@link ElementDefinition_Constraint#extension() extension} to extension.
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
     * Initializes the optional value {@link ElementDefinition_Constraint#xpath() xpath} to xpath.
     * @param xpath The value for xpath
     * @return {@code this} builder for chained invocation
     */
    public final Builder xpath(String xpath) {
      checkNotIsSet(xpathIsSet(), "xpath");
      this.xpath = Objects.requireNonNull(xpath, "xpath");
      optBits |= OPT_BIT_XPATH;
      return this;
    }

    /**
     * Initializes the optional value {@link ElementDefinition_Constraint#xpath() xpath} to xpath.
     * @param xpath The value for xpath
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("xpath")
    public final Builder xpath(Optional<String> xpath) {
      checkNotIsSet(xpathIsSet(), "xpath");
      this.xpath = xpath.orElse(null);
      optBits |= OPT_BIT_XPATH;
      return this;
    }

    /**
     * Initializes the optional value {@link ElementDefinition_Constraint#id() id} to id.
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
     * Initializes the optional value {@link ElementDefinition_Constraint#id() id} to id.
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
     * Initializes the optional value {@link ElementDefinition_Constraint#expression() expression} to expression.
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
     * Initializes the optional value {@link ElementDefinition_Constraint#expression() expression} to expression.
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
     * Initializes the optional value {@link ElementDefinition_Constraint#human() human} to human.
     * @param human The value for human
     * @return {@code this} builder for chained invocation
     */
    public final Builder human(String human) {
      checkNotIsSet(humanIsSet(), "human");
      this.human = Objects.requireNonNull(human, "human");
      optBits |= OPT_BIT_HUMAN;
      return this;
    }

    /**
     * Initializes the optional value {@link ElementDefinition_Constraint#human() human} to human.
     * @param human The value for human
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("human")
    public final Builder human(Optional<String> human) {
      checkNotIsSet(humanIsSet(), "human");
      this.human = human.orElse(null);
      optBits |= OPT_BIT_HUMAN;
      return this;
    }

    /**
     * Initializes the optional value {@link ElementDefinition_Constraint#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ElementDefinition_Constraint#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ElementDefinition_Constraint#severity() severity} to severity.
     * @param severity The value for severity
     * @return {@code this} builder for chained invocation
     */
    public final Builder severity(Elementdefinition_ConstraintSeverity severity) {
      checkNotIsSet(severityIsSet(), "severity");
      this.severity = Objects.requireNonNull(severity, "severity");
      optBits |= OPT_BIT_SEVERITY;
      return this;
    }

    /**
     * Initializes the optional value {@link ElementDefinition_Constraint#severity() severity} to severity.
     * @param severity The value for severity
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("severity")
    public final Builder severity(Optional<? extends Elementdefinition_ConstraintSeverity> severity) {
      checkNotIsSet(severityIsSet(), "severity");
      this.severity = severity.orElse(null);
      optBits |= OPT_BIT_SEVERITY;
      return this;
    }

    /**
     * Initializes the optional value {@link ElementDefinition_Constraint#key() key} to key.
     * @param key The value for key
     * @return {@code this} builder for chained invocation
     */
    public final Builder key(Id key) {
      checkNotIsSet(keyIsSet(), "key");
      this.key = Objects.requireNonNull(key, "key");
      optBits |= OPT_BIT_KEY;
      return this;
    }

    /**
     * Initializes the optional value {@link ElementDefinition_Constraint#key() key} to key.
     * @param key The value for key
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("key")
    public final Builder key(Optional<? extends Id> key) {
      checkNotIsSet(keyIsSet(), "key");
      this.key = key.orElse(null);
      optBits |= OPT_BIT_KEY;
      return this;
    }

    /**
     * Initializes the optional value {@link ElementDefinition_Constraint#requirements() requirements} to requirements.
     * @param requirements The value for requirements
     * @return {@code this} builder for chained invocation
     */
    public final Builder requirements(String requirements) {
      checkNotIsSet(requirementsIsSet(), "requirements");
      this.requirements = Objects.requireNonNull(requirements, "requirements");
      optBits |= OPT_BIT_REQUIREMENTS;
      return this;
    }

    /**
     * Initializes the optional value {@link ElementDefinition_Constraint#requirements() requirements} to requirements.
     * @param requirements The value for requirements
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("requirements")
    public final Builder requirements(Optional<String> requirements) {
      checkNotIsSet(requirementsIsSet(), "requirements");
      this.requirements = requirements.orElse(null);
      optBits |= OPT_BIT_REQUIREMENTS;
      return this;
    }

    /**
     * Initializes the optional value {@link ElementDefinition_Constraint#source() source} to source.
     * @param source The value for source
     * @return {@code this} builder for chained invocation
     */
    public final Builder source(Canonical source) {
      checkNotIsSet(sourceIsSet(), "source");
      this.source = Objects.requireNonNull(source, "source");
      optBits |= OPT_BIT_SOURCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ElementDefinition_Constraint#source() source} to source.
     * @param source The value for source
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("source")
    public final Builder source(Optional<? extends Canonical> source) {
      checkNotIsSet(sourceIsSet(), "source");
      this.source = source.orElse(null);
      optBits |= OPT_BIT_SOURCE;
      return this;
    }

    /**
     * Builds a new {@link ElementDefinition_Constraint ElementDefinition_Constraint}.
     * @return An immutable instance of ElementDefinition_Constraint
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ElementDefinition_Constraint build() {
      return new ImmutableElementDefinition_Constraint(
          extension,
          xpath,
          id,
          expression,
          human,
          modifierExtension,
          severity,
          key,
          requirements,
          source);
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean xpathIsSet() {
      return (optBits & OPT_BIT_XPATH) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean expressionIsSet() {
      return (optBits & OPT_BIT_EXPRESSION) != 0;
    }

    private boolean humanIsSet() {
      return (optBits & OPT_BIT_HUMAN) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean severityIsSet() {
      return (optBits & OPT_BIT_SEVERITY) != 0;
    }

    private boolean keyIsSet() {
      return (optBits & OPT_BIT_KEY) != 0;
    }

    private boolean requirementsIsSet() {
      return (optBits & OPT_BIT_REQUIREMENTS) != 0;
    }

    private boolean sourceIsSet() {
      return (optBits & OPT_BIT_SOURCE) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of ElementDefinition_Constraint is strict, attribute is already set: ".concat(name));
    }
  }
}
