package com.fhir;

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
 * Immutable implementation of {@link ActivityDefinition_DynamicValue}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableActivityDefinition_DynamicValue.builder()}.
 */
@Generated(from = "ActivityDefinition_DynamicValue", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableActivityDefinition_DynamicValue
    implements ActivityDefinition_DynamicValue {
  private final @Nullable String id;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable String path;
  private final @Nullable List<Extension> extension;
  private final Expression expression;

  private ImmutableActivityDefinition_DynamicValue(
      @Nullable String id,
      @Nullable List<Extension> modifierExtension,
      @Nullable String path,
      @Nullable List<Extension> extension,
      Expression expression) {
    this.id = id;
    this.modifierExtension = modifierExtension;
    this.path = path;
    this.extension = extension;
    this.expression = expression;
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
   * @return The value of the {@code path} attribute
   */
  @JsonProperty("path")
  @Override
  public Optional<String> path() {
    return Optional.ofNullable(path);
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
  public Expression expression() {
    return expression;
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition_DynamicValue#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition_DynamicValue withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableActivityDefinition_DynamicValue(newValue, this.modifierExtension, this.path, this.extension, this.expression);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition_DynamicValue#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition_DynamicValue withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableActivityDefinition_DynamicValue(value, this.modifierExtension, this.path, this.extension, this.expression);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition_DynamicValue#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition_DynamicValue withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableActivityDefinition_DynamicValue(this.id, newValue, this.path, this.extension, this.expression);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition_DynamicValue#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableActivityDefinition_DynamicValue withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableActivityDefinition_DynamicValue(this.id, value, this.path, this.extension, this.expression);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition_DynamicValue#path() path} attribute.
   * @param value The value for path
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition_DynamicValue withPath(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "path");
    if (Objects.equals(this.path, newValue)) return this;
    return new ImmutableActivityDefinition_DynamicValue(this.id, this.modifierExtension, newValue, this.extension, this.expression);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition_DynamicValue#path() path} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for path
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition_DynamicValue withPath(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.path, value)) return this;
    return new ImmutableActivityDefinition_DynamicValue(this.id, this.modifierExtension, value, this.extension, this.expression);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition_DynamicValue#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition_DynamicValue withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableActivityDefinition_DynamicValue(this.id, this.modifierExtension, this.path, newValue, this.expression);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition_DynamicValue#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableActivityDefinition_DynamicValue withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableActivityDefinition_DynamicValue(this.id, this.modifierExtension, this.path, value, this.expression);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ActivityDefinition_DynamicValue#expression() expression} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for expression
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableActivityDefinition_DynamicValue withExpression(Expression value) {
    if (this.expression == value) return this;
    Expression newValue = Objects.requireNonNull(value, "expression");
    return new ImmutableActivityDefinition_DynamicValue(this.id, this.modifierExtension, this.path, this.extension, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableActivityDefinition_DynamicValue} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableActivityDefinition_DynamicValue
        && equalTo((ImmutableActivityDefinition_DynamicValue) another);
  }

  private boolean equalTo(ImmutableActivityDefinition_DynamicValue another) {
    return Objects.equals(id, another.id)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(path, another.path)
        && Objects.equals(extension, another.extension)
        && expression.equals(another.expression);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code modifierExtension}, {@code path}, {@code extension}, {@code expression}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(path);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + expression.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code ActivityDefinition_DynamicValue} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("ActivityDefinition_DynamicValue{");
    if (id != null) {
      builder.append("id=").append(id);
    }
    if (modifierExtension != null) {
      if (builder.length() > 32) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (path != null) {
      if (builder.length() > 32) builder.append(", ");
      builder.append("path=").append(path);
    }
    if (extension != null) {
      if (builder.length() > 32) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (builder.length() > 32) builder.append(", ");
    builder.append("expression=").append(expression);
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "ActivityDefinition_DynamicValue", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ActivityDefinition_DynamicValue {
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<String> path = Optional.empty();
    boolean pathIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Expression expression;
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
    @JsonProperty("path")
    public void setPath(Optional<String> path) {
      this.path = path;
      this.pathIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("expression")
    public void setExpression(Expression expression) {
      this.expression = expression;
    }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> path() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Expression expression() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableActivityDefinition_DynamicValue fromJson(Json json) {
    ImmutableActivityDefinition_DynamicValue.Builder builder = ((ImmutableActivityDefinition_DynamicValue.Builder) ImmutableActivityDefinition_DynamicValue.builder());
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.pathIsSet) {
      builder.path(json.path);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.expression != null) {
      builder.expression(json.expression);
    }
    return (ImmutableActivityDefinition_DynamicValue) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ActivityDefinition_DynamicValue} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ActivityDefinition_DynamicValue instance
   */
  public static ActivityDefinition_DynamicValue copyOf(ActivityDefinition_DynamicValue instance) {
    if (instance instanceof ImmutableActivityDefinition_DynamicValue) {
      return (ImmutableActivityDefinition_DynamicValue) instance;
    }
    return ((ImmutableActivityDefinition_DynamicValue.Builder) ImmutableActivityDefinition_DynamicValue.builder())
        .id(instance.id())
        .modifierExtension(instance.modifierExtension())
        .path(instance.path())
        .extension(instance.extension())
        .expression(instance.expression())
        .build();
  }

  /**
   * Creates a builder for {@link ActivityDefinition_DynamicValue ActivityDefinition_DynamicValue}.
   * <pre>
   * ImmutableActivityDefinition_DynamicValue.builder()
   *    .id(String) // optional {@link ActivityDefinition_DynamicValue#id() id}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link ActivityDefinition_DynamicValue#modifierExtension() modifierExtension}
   *    .path(String) // optional {@link ActivityDefinition_DynamicValue#path() path}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link ActivityDefinition_DynamicValue#extension() extension}
   *    .expression(com.fhir.Expression) // required {@link ActivityDefinition_DynamicValue#expression() expression}
   *    .build();
   * </pre>
   * @return A new ActivityDefinition_DynamicValue builder
   */
  public static ExpressionBuildStage builder() {
    return new ImmutableActivityDefinition_DynamicValue.Builder();
  }

  /**
   * Builds instances of type {@link ActivityDefinition_DynamicValue ActivityDefinition_DynamicValue}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "ActivityDefinition_DynamicValue", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ExpressionBuildStage, BuildFinal {
    private static final long INIT_BIT_EXPRESSION = 0x1L;
    private static final long OPT_BIT_ID = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x2L;
    private static final long OPT_BIT_PATH = 0x4L;
    private static final long OPT_BIT_EXTENSION = 0x8L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable String id;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable String path;
    private @Nullable List<Extension> extension;
    private @Nullable Expression expression;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ActivityDefinition_DynamicValue#id() id} to id.
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
     * Initializes the optional value {@link ActivityDefinition_DynamicValue#id() id} to id.
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
     * Initializes the optional value {@link ActivityDefinition_DynamicValue#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ActivityDefinition_DynamicValue#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ActivityDefinition_DynamicValue#path() path} to path.
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
     * Initializes the optional value {@link ActivityDefinition_DynamicValue#path() path} to path.
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
     * Initializes the optional value {@link ActivityDefinition_DynamicValue#extension() extension} to extension.
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
     * Initializes the optional value {@link ActivityDefinition_DynamicValue#extension() extension} to extension.
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
     * Initializes the value for the {@link ActivityDefinition_DynamicValue#expression() expression} attribute.
     * @param expression The value for expression 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("expression")
    public final Builder expression(Expression expression) {
      checkNotIsSet(expressionIsSet(), "expression");
      this.expression = Objects.requireNonNull(expression, "expression");
      initBits &= ~INIT_BIT_EXPRESSION;
      return this;
    }

    /**
     * Builds a new {@link ActivityDefinition_DynamicValue ActivityDefinition_DynamicValue}.
     * @return An immutable instance of ActivityDefinition_DynamicValue
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ActivityDefinition_DynamicValue build() {
      checkRequiredAttributes();
      return new ImmutableActivityDefinition_DynamicValue(id, modifierExtension, path, extension, expression);
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean pathIsSet() {
      return (optBits & OPT_BIT_PATH) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean expressionIsSet() {
      return (initBits & INIT_BIT_EXPRESSION) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of ActivityDefinition_DynamicValue is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!expressionIsSet()) attributes.add("expression");
      return "Cannot build ActivityDefinition_DynamicValue, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "ActivityDefinition_DynamicValue", generator = "Immutables")
  public interface ExpressionBuildStage {
    /**
     * Initializes the value for the {@link ActivityDefinition_DynamicValue#expression() expression} attribute.
     * @param expression The value for expression 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal expression(Expression expression);
  }

  @Generated(from = "ActivityDefinition_DynamicValue", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link ActivityDefinition_DynamicValue#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(String id);

    /**
     * Initializes the optional value {@link ActivityDefinition_DynamicValue#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<String> id);

    /**
     * Initializes the optional value {@link ActivityDefinition_DynamicValue#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link ActivityDefinition_DynamicValue#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link ActivityDefinition_DynamicValue#path() path} to path.
     * @param path The value for path
     * @return {@code this} builder for chained invocation
     */
    BuildFinal path(String path);

    /**
     * Initializes the optional value {@link ActivityDefinition_DynamicValue#path() path} to path.
     * @param path The value for path
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal path(Optional<String> path);

    /**
     * Initializes the optional value {@link ActivityDefinition_DynamicValue#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link ActivityDefinition_DynamicValue#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Builds a new {@link ActivityDefinition_DynamicValue ActivityDefinition_DynamicValue}.
     * @return An immutable instance of ActivityDefinition_DynamicValue
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    ActivityDefinition_DynamicValue build();
  }
}
