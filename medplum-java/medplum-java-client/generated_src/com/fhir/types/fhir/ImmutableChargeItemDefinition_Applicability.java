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
 * Immutable implementation of {@link ChargeItemDefinition_Applicability}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableChargeItemDefinition_Applicability.builder()}.
 */
@Generated(from = "ChargeItemDefinition_Applicability", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableChargeItemDefinition_Applicability
    implements ChargeItemDefinition_Applicability {
  private final @Nullable List<Extension> extension;
  private final @Nullable String expression;
  private final @Nullable String description;
  private final @Nullable String language;
  private final @Nullable String id;
  private final @Nullable List<Extension> modifierExtension;

  private ImmutableChargeItemDefinition_Applicability(
      @Nullable List<Extension> extension,
      @Nullable String expression,
      @Nullable String description,
      @Nullable String language,
      @Nullable String id,
      @Nullable List<Extension> modifierExtension) {
    this.extension = extension;
    this.expression = expression;
    this.description = description;
    this.language = language;
    this.id = id;
    this.modifierExtension = modifierExtension;
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
   * @return The value of the {@code language} attribute
   */
  @JsonProperty("language")
  @Override
  public Optional<String> language() {
    return Optional.ofNullable(language);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItemDefinition_Applicability#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItemDefinition_Applicability withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableChargeItemDefinition_Applicability(newValue, this.expression, this.description, this.language, this.id, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItemDefinition_Applicability#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItemDefinition_Applicability withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableChargeItemDefinition_Applicability(value, this.expression, this.description, this.language, this.id, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItemDefinition_Applicability#expression() expression} attribute.
   * @param value The value for expression
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItemDefinition_Applicability withExpression(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "expression");
    if (Objects.equals(this.expression, newValue)) return this;
    return new ImmutableChargeItemDefinition_Applicability(this.extension, newValue, this.description, this.language, this.id, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItemDefinition_Applicability#expression() expression} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for expression
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItemDefinition_Applicability withExpression(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.expression, value)) return this;
    return new ImmutableChargeItemDefinition_Applicability(this.extension, value, this.description, this.language, this.id, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItemDefinition_Applicability#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItemDefinition_Applicability withDescription(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "description");
    if (Objects.equals(this.description, newValue)) return this;
    return new ImmutableChargeItemDefinition_Applicability(this.extension, this.expression, newValue, this.language, this.id, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItemDefinition_Applicability#description() description} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItemDefinition_Applicability withDescription(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.description, value)) return this;
    return new ImmutableChargeItemDefinition_Applicability(this.extension, this.expression, value, this.language, this.id, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItemDefinition_Applicability#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItemDefinition_Applicability withLanguage(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "language");
    if (Objects.equals(this.language, newValue)) return this;
    return new ImmutableChargeItemDefinition_Applicability(this.extension, this.expression, this.description, newValue, this.id, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItemDefinition_Applicability#language() language} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItemDefinition_Applicability withLanguage(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.language, value)) return this;
    return new ImmutableChargeItemDefinition_Applicability(this.extension, this.expression, this.description, value, this.id, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItemDefinition_Applicability#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItemDefinition_Applicability withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableChargeItemDefinition_Applicability(
        this.extension,
        this.expression,
        this.description,
        this.language,
        newValue,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItemDefinition_Applicability#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItemDefinition_Applicability withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableChargeItemDefinition_Applicability(this.extension, this.expression, this.description, this.language, value, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItemDefinition_Applicability#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItemDefinition_Applicability withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableChargeItemDefinition_Applicability(this.extension, this.expression, this.description, this.language, this.id, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItemDefinition_Applicability#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItemDefinition_Applicability withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableChargeItemDefinition_Applicability(this.extension, this.expression, this.description, this.language, this.id, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableChargeItemDefinition_Applicability} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableChargeItemDefinition_Applicability
        && equalTo((ImmutableChargeItemDefinition_Applicability) another);
  }

  private boolean equalTo(ImmutableChargeItemDefinition_Applicability another) {
    return Objects.equals(extension, another.extension)
        && Objects.equals(expression, another.expression)
        && Objects.equals(description, another.description)
        && Objects.equals(language, another.language)
        && Objects.equals(id, another.id)
        && Objects.equals(modifierExtension, another.modifierExtension);
  }

  /**
   * Computes a hash code from attributes: {@code extension}, {@code expression}, {@code description}, {@code language}, {@code id}, {@code modifierExtension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(expression);
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    return h;
  }

  /**
   * Prints the immutable value {@code ChargeItemDefinition_Applicability} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("ChargeItemDefinition_Applicability{");
    if (extension != null) {
      builder.append("extension=").append(extension);
    }
    if (expression != null) {
      if (builder.length() > 35) builder.append(", ");
      builder.append("expression=").append(expression);
    }
    if (description != null) {
      if (builder.length() > 35) builder.append(", ");
      builder.append("description=").append(description);
    }
    if (language != null) {
      if (builder.length() > 35) builder.append(", ");
      builder.append("language=").append(language);
    }
    if (id != null) {
      if (builder.length() > 35) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (modifierExtension != null) {
      if (builder.length() > 35) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "ChargeItemDefinition_Applicability", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ChargeItemDefinition_Applicability {
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<String> expression = Optional.empty();
    boolean expressionIsSet;
    @Nullable Optional<String> description = Optional.empty();
    boolean descriptionIsSet;
    @Nullable Optional<String> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
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
    @JsonProperty("language")
    public void setLanguage(Optional<String> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> expression() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> description() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableChargeItemDefinition_Applicability fromJson(Json json) {
    ImmutableChargeItemDefinition_Applicability.Builder builder = ImmutableChargeItemDefinition_Applicability.builder();
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.expressionIsSet) {
      builder.expression(json.expression);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    return (ImmutableChargeItemDefinition_Applicability) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ChargeItemDefinition_Applicability} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ChargeItemDefinition_Applicability instance
   */
  public static ChargeItemDefinition_Applicability copyOf(ChargeItemDefinition_Applicability instance) {
    if (instance instanceof ImmutableChargeItemDefinition_Applicability) {
      return (ImmutableChargeItemDefinition_Applicability) instance;
    }
    return ImmutableChargeItemDefinition_Applicability.builder()
        .extension(instance.extension())
        .expression(instance.expression())
        .description(instance.description())
        .language(instance.language())
        .id(instance.id())
        .modifierExtension(instance.modifierExtension())
        .build();
  }

  /**
   * Creates a builder for {@link ChargeItemDefinition_Applicability ChargeItemDefinition_Applicability}.
   * <pre>
   * ImmutableChargeItemDefinition_Applicability.builder()
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link ChargeItemDefinition_Applicability#extension() extension}
   *    .expression(String) // optional {@link ChargeItemDefinition_Applicability#expression() expression}
   *    .description(String) // optional {@link ChargeItemDefinition_Applicability#description() description}
   *    .language(String) // optional {@link ChargeItemDefinition_Applicability#language() language}
   *    .id(String) // optional {@link ChargeItemDefinition_Applicability#id() id}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link ChargeItemDefinition_Applicability#modifierExtension() modifierExtension}
   *    .build();
   * </pre>
   * @return A new ChargeItemDefinition_Applicability builder
   */
  public static ImmutableChargeItemDefinition_Applicability.Builder builder() {
    return new ImmutableChargeItemDefinition_Applicability.Builder();
  }

  /**
   * Builds instances of type {@link ChargeItemDefinition_Applicability ChargeItemDefinition_Applicability}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "ChargeItemDefinition_Applicability", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_EXTENSION = 0x1L;
    private static final long OPT_BIT_EXPRESSION = 0x2L;
    private static final long OPT_BIT_DESCRIPTION = 0x4L;
    private static final long OPT_BIT_LANGUAGE = 0x8L;
    private static final long OPT_BIT_ID = 0x10L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x20L;
    private long optBits;

    private @Nullable List<Extension> extension;
    private @Nullable String expression;
    private @Nullable String description;
    private @Nullable String language;
    private @Nullable String id;
    private @Nullable List<Extension> modifierExtension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ChargeItemDefinition_Applicability#extension() extension} to extension.
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
     * Initializes the optional value {@link ChargeItemDefinition_Applicability#extension() extension} to extension.
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
     * Initializes the optional value {@link ChargeItemDefinition_Applicability#expression() expression} to expression.
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
     * Initializes the optional value {@link ChargeItemDefinition_Applicability#expression() expression} to expression.
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
     * Initializes the optional value {@link ChargeItemDefinition_Applicability#description() description} to description.
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
     * Initializes the optional value {@link ChargeItemDefinition_Applicability#description() description} to description.
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
     * Initializes the optional value {@link ChargeItemDefinition_Applicability#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    public final Builder language(String language) {
      checkNotIsSet(languageIsSet(), "language");
      this.language = Objects.requireNonNull(language, "language");
      optBits |= OPT_BIT_LANGUAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItemDefinition_Applicability#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("language")
    public final Builder language(Optional<String> language) {
      checkNotIsSet(languageIsSet(), "language");
      this.language = language.orElse(null);
      optBits |= OPT_BIT_LANGUAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItemDefinition_Applicability#id() id} to id.
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
     * Initializes the optional value {@link ChargeItemDefinition_Applicability#id() id} to id.
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
     * Initializes the optional value {@link ChargeItemDefinition_Applicability#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ChargeItemDefinition_Applicability#modifierExtension() modifierExtension} to modifierExtension.
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
     * Builds a new {@link ChargeItemDefinition_Applicability ChargeItemDefinition_Applicability}.
     * @return An immutable instance of ChargeItemDefinition_Applicability
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ChargeItemDefinition_Applicability build() {
      return new ImmutableChargeItemDefinition_Applicability(extension, expression, description, language, id, modifierExtension);
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean expressionIsSet() {
      return (optBits & OPT_BIT_EXPRESSION) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of ChargeItemDefinition_Applicability is strict, attribute is already set: ".concat(name));
    }
  }
}
