package com.medplum.types.fhir;

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
 * Immutable implementation of {@link Expression}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableExpression.builder()}.
 */
@Generated(from = "Expression", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableExpression implements Expression {
  private final @Nullable String description;
  private final @Nullable ExpressionLanguage language;
  private final @Nullable Uri reference;
  private final @Nullable List<Extension> extension;
  private final @Nullable String id;
  private final @Nullable Id name;
  private final @Nullable String expression;

  private ImmutableExpression(
      @Nullable String description,
      @Nullable ExpressionLanguage language,
      @Nullable Uri reference,
      @Nullable List<Extension> extension,
      @Nullable String id,
      @Nullable Id name,
      @Nullable String expression) {
    this.description = description;
    this.language = language;
    this.reference = reference;
    this.extension = extension;
    this.id = id;
    this.name = name;
    this.expression = expression;
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
   * @return The value of the {@code language} attribute
   */
  @JsonProperty("language")
  @Override
  public Optional<ExpressionLanguage> language() {
    return Optional.ofNullable(language);
  }

  /**
   * @return The value of the {@code reference} attribute
   */
  @JsonProperty("reference")
  @Override
  public Optional<Uri> reference() {
    return Optional.ofNullable(reference);
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
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<String> id() {
    return Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code name} attribute
   */
  @JsonProperty("name")
  @Override
  public Optional<Id> name() {
    return Optional.ofNullable(name);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Expression#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExpression withDescription(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "description");
    if (Objects.equals(this.description, newValue)) return this;
    return new ImmutableExpression(newValue, this.language, this.reference, this.extension, this.id, this.name, this.expression);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Expression#description() description} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExpression withDescription(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.description, value)) return this;
    return new ImmutableExpression(value, this.language, this.reference, this.extension, this.id, this.name, this.expression);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Expression#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExpression withLanguage(ExpressionLanguage value) {
    @Nullable ExpressionLanguage newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableExpression(this.description, newValue, this.reference, this.extension, this.id, this.name, this.expression);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Expression#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExpression withLanguage(Optional<? extends ExpressionLanguage> optional) {
    @Nullable ExpressionLanguage value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableExpression(this.description, value, this.reference, this.extension, this.id, this.name, this.expression);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Expression#reference() reference} attribute.
   * @param value The value for reference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExpression withReference(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "reference");
    if (this.reference == newValue) return this;
    return new ImmutableExpression(this.description, this.language, newValue, this.extension, this.id, this.name, this.expression);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Expression#reference() reference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExpression withReference(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.reference == value) return this;
    return new ImmutableExpression(this.description, this.language, value, this.extension, this.id, this.name, this.expression);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Expression#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExpression withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableExpression(this.description, this.language, this.reference, newValue, this.id, this.name, this.expression);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Expression#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExpression withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableExpression(this.description, this.language, this.reference, value, this.id, this.name, this.expression);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Expression#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExpression withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableExpression(
        this.description,
        this.language,
        this.reference,
        this.extension,
        newValue,
        this.name,
        this.expression);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Expression#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExpression withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableExpression(
        this.description,
        this.language,
        this.reference,
        this.extension,
        value,
        this.name,
        this.expression);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Expression#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExpression withName(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "name");
    if (this.name == newValue) return this;
    return new ImmutableExpression(
        this.description,
        this.language,
        this.reference,
        this.extension,
        this.id,
        newValue,
        this.expression);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Expression#name() name} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExpression withName(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.name == value) return this;
    return new ImmutableExpression(
        this.description,
        this.language,
        this.reference,
        this.extension,
        this.id,
        value,
        this.expression);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Expression#expression() expression} attribute.
   * @param value The value for expression
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExpression withExpression(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "expression");
    if (Objects.equals(this.expression, newValue)) return this;
    return new ImmutableExpression(this.description, this.language, this.reference, this.extension, this.id, this.name, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Expression#expression() expression} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for expression
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExpression withExpression(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.expression, value)) return this;
    return new ImmutableExpression(this.description, this.language, this.reference, this.extension, this.id, this.name, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableExpression} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableExpression
        && equalTo((ImmutableExpression) another);
  }

  private boolean equalTo(ImmutableExpression another) {
    return Objects.equals(description, another.description)
        && Objects.equals(language, another.language)
        && Objects.equals(reference, another.reference)
        && Objects.equals(extension, another.extension)
        && Objects.equals(id, another.id)
        && Objects.equals(name, another.name)
        && Objects.equals(expression, another.expression);
  }

  /**
   * Computes a hash code from attributes: {@code description}, {@code language}, {@code reference}, {@code extension}, {@code id}, {@code name}, {@code expression}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(reference);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(name);
    h += (h << 5) + Objects.hashCode(expression);
    return h;
  }

  /**
   * Prints the immutable value {@code Expression} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Expression{");
    if (description != null) {
      builder.append("description=").append(description);
    }
    if (language != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("language=").append(language);
    }
    if (reference != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("reference=").append(reference);
    }
    if (extension != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (id != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (name != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("name=").append(name);
    }
    if (expression != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("expression=").append(expression);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Expression", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Expression {
    @Nullable Optional<String> description = Optional.empty();
    boolean descriptionIsSet;
    @Nullable Optional<ExpressionLanguage> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<Uri> reference = Optional.empty();
    boolean referenceIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Id> name = Optional.empty();
    boolean nameIsSet;
    @Nullable Optional<String> expression = Optional.empty();
    boolean expressionIsSet;
    @JsonProperty("description")
    public void setDescription(Optional<String> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<ExpressionLanguage> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("reference")
    public void setReference(Optional<Uri> reference) {
      this.reference = reference;
      this.referenceIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("name")
    public void setName(Optional<Id> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @JsonProperty("expression")
    public void setExpression(Optional<String> expression) {
      this.expression = expression;
      this.expressionIsSet = true;
    }
    @Override
    public Optional<String> description() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<ExpressionLanguage> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> reference() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> name() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> expression() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableExpression fromJson(Json json) {
    ImmutableExpression.Builder builder = ImmutableExpression.builder();
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.referenceIsSet) {
      builder.reference(json.reference);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.expressionIsSet) {
      builder.expression(json.expression);
    }
    return (ImmutableExpression) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Expression} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Expression instance
   */
  public static Expression copyOf(Expression instance) {
    if (instance instanceof ImmutableExpression) {
      return (ImmutableExpression) instance;
    }
    return ImmutableExpression.builder()
        .description(instance.description())
        .language(instance.language())
        .reference(instance.reference())
        .extension(instance.extension())
        .id(instance.id())
        .name(instance.name())
        .expression(instance.expression())
        .build();
  }

  /**
   * Creates a builder for {@link Expression Expression}.
   * <pre>
   * ImmutableExpression.builder()
   *    .description(String) // optional {@link Expression#description() description}
   *    .language(com.medplum.types.fhir.ExpressionLanguage) // optional {@link Expression#language() language}
   *    .reference(com.medplum.types.fhir.Uri) // optional {@link Expression#reference() reference}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link Expression#extension() extension}
   *    .id(String) // optional {@link Expression#id() id}
   *    .name(com.medplum.types.fhir.Id) // optional {@link Expression#name() name}
   *    .expression(String) // optional {@link Expression#expression() expression}
   *    .build();
   * </pre>
   * @return A new Expression builder
   */
  public static ImmutableExpression.Builder builder() {
    return new ImmutableExpression.Builder();
  }

  /**
   * Builds instances of type {@link Expression Expression}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Expression", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_DESCRIPTION = 0x1L;
    private static final long OPT_BIT_LANGUAGE = 0x2L;
    private static final long OPT_BIT_REFERENCE = 0x4L;
    private static final long OPT_BIT_EXTENSION = 0x8L;
    private static final long OPT_BIT_ID = 0x10L;
    private static final long OPT_BIT_NAME = 0x20L;
    private static final long OPT_BIT_EXPRESSION = 0x40L;
    private long optBits;

    private @Nullable String description;
    private @Nullable ExpressionLanguage language;
    private @Nullable Uri reference;
    private @Nullable List<Extension> extension;
    private @Nullable String id;
    private @Nullable Id name;
    private @Nullable String expression;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Expression#description() description} to description.
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
     * Initializes the optional value {@link Expression#description() description} to description.
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
     * Initializes the optional value {@link Expression#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    public final Builder language(ExpressionLanguage language) {
      checkNotIsSet(languageIsSet(), "language");
      this.language = Objects.requireNonNull(language, "language");
      optBits |= OPT_BIT_LANGUAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link Expression#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("language")
    public final Builder language(Optional<? extends ExpressionLanguage> language) {
      checkNotIsSet(languageIsSet(), "language");
      this.language = language.orElse(null);
      optBits |= OPT_BIT_LANGUAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link Expression#reference() reference} to reference.
     * @param reference The value for reference
     * @return {@code this} builder for chained invocation
     */
    public final Builder reference(Uri reference) {
      checkNotIsSet(referenceIsSet(), "reference");
      this.reference = Objects.requireNonNull(reference, "reference");
      optBits |= OPT_BIT_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Expression#reference() reference} to reference.
     * @param reference The value for reference
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("reference")
    public final Builder reference(Optional<? extends Uri> reference) {
      checkNotIsSet(referenceIsSet(), "reference");
      this.reference = reference.orElse(null);
      optBits |= OPT_BIT_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Expression#extension() extension} to extension.
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
     * Initializes the optional value {@link Expression#extension() extension} to extension.
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
     * Initializes the optional value {@link Expression#id() id} to id.
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
     * Initializes the optional value {@link Expression#id() id} to id.
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
     * Initializes the optional value {@link Expression#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    public final Builder name(Id name) {
      checkNotIsSet(nameIsSet(), "name");
      this.name = Objects.requireNonNull(name, "name");
      optBits |= OPT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link Expression#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("name")
    public final Builder name(Optional<? extends Id> name) {
      checkNotIsSet(nameIsSet(), "name");
      this.name = name.orElse(null);
      optBits |= OPT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link Expression#expression() expression} to expression.
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
     * Initializes the optional value {@link Expression#expression() expression} to expression.
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
     * Builds a new {@link Expression Expression}.
     * @return An immutable instance of Expression
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Expression build() {
      return new ImmutableExpression(description, language, reference, extension, id, name, expression);
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean referenceIsSet() {
      return (optBits & OPT_BIT_REFERENCE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean expressionIsSet() {
      return (optBits & OPT_BIT_EXPRESSION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Expression is strict, attribute is already set: ".concat(name));
    }
  }
}
