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
 * Immutable implementation of {@link PlanDefinition_Condition}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutablePlanDefinition_Condition.builder()}.
 */
@Generated(from = "PlanDefinition_Condition", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutablePlanDefinition_Condition implements PlanDefinition_Condition {
  private final @Nullable Expression expression;
  private final @Nullable Plandefinition_ConditionKind kind;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable String id;

  private ImmutablePlanDefinition_Condition(
      @Nullable Expression expression,
      @Nullable Plandefinition_ConditionKind kind,
      @Nullable List<Extension> extension,
      @Nullable List<Extension> modifierExtension,
      @Nullable String id) {
    this.expression = expression;
    this.kind = kind;
    this.extension = extension;
    this.modifierExtension = modifierExtension;
    this.id = id;
  }

  /**
   * @return The value of the {@code expression} attribute
   */
  @JsonProperty("expression")
  @Override
  public Optional<Expression> expression() {
    return Optional.ofNullable(expression);
  }

  /**
   * @return The value of the {@code kind} attribute
   */
  @JsonProperty("kind")
  @Override
  public Optional<Plandefinition_ConditionKind> kind() {
    return Optional.ofNullable(kind);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition_Condition#expression() expression} attribute.
   * @param value The value for expression
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Condition withExpression(Expression value) {
    @Nullable Expression newValue = Objects.requireNonNull(value, "expression");
    if (this.expression == newValue) return this;
    return new ImmutablePlanDefinition_Condition(newValue, this.kind, this.extension, this.modifierExtension, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition_Condition#expression() expression} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for expression
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition_Condition withExpression(Optional<? extends Expression> optional) {
    @Nullable Expression value = optional.orElse(null);
    if (this.expression == value) return this;
    return new ImmutablePlanDefinition_Condition(value, this.kind, this.extension, this.modifierExtension, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition_Condition#kind() kind} attribute.
   * @param value The value for kind
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Condition withKind(Plandefinition_ConditionKind value) {
    @Nullable Plandefinition_ConditionKind newValue = Objects.requireNonNull(value, "kind");
    if (this.kind == newValue) return this;
    return new ImmutablePlanDefinition_Condition(this.expression, newValue, this.extension, this.modifierExtension, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition_Condition#kind() kind} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for kind
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition_Condition withKind(Optional<? extends Plandefinition_ConditionKind> optional) {
    @Nullable Plandefinition_ConditionKind value = optional.orElse(null);
    if (this.kind == value) return this;
    return new ImmutablePlanDefinition_Condition(this.expression, value, this.extension, this.modifierExtension, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition_Condition#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Condition withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutablePlanDefinition_Condition(this.expression, this.kind, newValue, this.modifierExtension, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition_Condition#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition_Condition withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutablePlanDefinition_Condition(this.expression, this.kind, value, this.modifierExtension, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition_Condition#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Condition withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutablePlanDefinition_Condition(this.expression, this.kind, this.extension, newValue, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition_Condition#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition_Condition withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutablePlanDefinition_Condition(this.expression, this.kind, this.extension, value, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition_Condition#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Condition withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutablePlanDefinition_Condition(this.expression, this.kind, this.extension, this.modifierExtension, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition_Condition#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition_Condition withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutablePlanDefinition_Condition(this.expression, this.kind, this.extension, this.modifierExtension, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutablePlanDefinition_Condition} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePlanDefinition_Condition
        && equalTo((ImmutablePlanDefinition_Condition) another);
  }

  private boolean equalTo(ImmutablePlanDefinition_Condition another) {
    return Objects.equals(expression, another.expression)
        && Objects.equals(kind, another.kind)
        && Objects.equals(extension, another.extension)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(id, another.id);
  }

  /**
   * Computes a hash code from attributes: {@code expression}, {@code kind}, {@code extension}, {@code modifierExtension}, {@code id}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(expression);
    h += (h << 5) + Objects.hashCode(kind);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(id);
    return h;
  }

  /**
   * Prints the immutable value {@code PlanDefinition_Condition} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("PlanDefinition_Condition{");
    if (expression != null) {
      builder.append("expression=").append(expression);
    }
    if (kind != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("kind=").append(kind);
    }
    if (extension != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (modifierExtension != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (id != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("id=").append(id);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "PlanDefinition_Condition", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements PlanDefinition_Condition {
    @Nullable Optional<Expression> expression = Optional.empty();
    boolean expressionIsSet;
    @Nullable Optional<Plandefinition_ConditionKind> kind = Optional.empty();
    boolean kindIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @JsonProperty("expression")
    public void setExpression(Optional<Expression> expression) {
      this.expression = expression;
      this.expressionIsSet = true;
    }
    @JsonProperty("kind")
    public void setKind(Optional<Plandefinition_ConditionKind> kind) {
      this.kind = kind;
      this.kindIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
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
    @Override
    public Optional<Expression> expression() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Plandefinition_ConditionKind> kind() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutablePlanDefinition_Condition fromJson(Json json) {
    ImmutablePlanDefinition_Condition.Builder builder = ImmutablePlanDefinition_Condition.builder();
    if (json.expressionIsSet) {
      builder.expression(json.expression);
    }
    if (json.kindIsSet) {
      builder.kind(json.kind);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    return (ImmutablePlanDefinition_Condition) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link PlanDefinition_Condition} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable PlanDefinition_Condition instance
   */
  public static PlanDefinition_Condition copyOf(PlanDefinition_Condition instance) {
    if (instance instanceof ImmutablePlanDefinition_Condition) {
      return (ImmutablePlanDefinition_Condition) instance;
    }
    return ImmutablePlanDefinition_Condition.builder()
        .expression(instance.expression())
        .kind(instance.kind())
        .extension(instance.extension())
        .modifierExtension(instance.modifierExtension())
        .id(instance.id())
        .build();
  }

  /**
   * Creates a builder for {@link PlanDefinition_Condition PlanDefinition_Condition}.
   * <pre>
   * ImmutablePlanDefinition_Condition.builder()
   *    .expression(com.fhir.types.fhir.Expression) // optional {@link PlanDefinition_Condition#expression() expression}
   *    .kind(Plandefinition_ConditionKind) // optional {@link PlanDefinition_Condition#kind() kind}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link PlanDefinition_Condition#extension() extension}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link PlanDefinition_Condition#modifierExtension() modifierExtension}
   *    .id(String) // optional {@link PlanDefinition_Condition#id() id}
   *    .build();
   * </pre>
   * @return A new PlanDefinition_Condition builder
   */
  public static ImmutablePlanDefinition_Condition.Builder builder() {
    return new ImmutablePlanDefinition_Condition.Builder();
  }

  /**
   * Builds instances of type {@link PlanDefinition_Condition PlanDefinition_Condition}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "PlanDefinition_Condition", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_EXPRESSION = 0x1L;
    private static final long OPT_BIT_KIND = 0x2L;
    private static final long OPT_BIT_EXTENSION = 0x4L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x8L;
    private static final long OPT_BIT_ID = 0x10L;
    private long optBits;

    private @Nullable Expression expression;
    private @Nullable Plandefinition_ConditionKind kind;
    private @Nullable List<Extension> extension;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable String id;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Condition#expression() expression} to expression.
     * @param expression The value for expression
     * @return {@code this} builder for chained invocation
     */
    public final Builder expression(Expression expression) {
      checkNotIsSet(expressionIsSet(), "expression");
      this.expression = Objects.requireNonNull(expression, "expression");
      optBits |= OPT_BIT_EXPRESSION;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Condition#expression() expression} to expression.
     * @param expression The value for expression
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("expression")
    public final Builder expression(Optional<? extends Expression> expression) {
      checkNotIsSet(expressionIsSet(), "expression");
      this.expression = expression.orElse(null);
      optBits |= OPT_BIT_EXPRESSION;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Condition#kind() kind} to kind.
     * @param kind The value for kind
     * @return {@code this} builder for chained invocation
     */
    public final Builder kind(Plandefinition_ConditionKind kind) {
      checkNotIsSet(kindIsSet(), "kind");
      this.kind = Objects.requireNonNull(kind, "kind");
      optBits |= OPT_BIT_KIND;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Condition#kind() kind} to kind.
     * @param kind The value for kind
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("kind")
    public final Builder kind(Optional<? extends Plandefinition_ConditionKind> kind) {
      checkNotIsSet(kindIsSet(), "kind");
      this.kind = kind.orElse(null);
      optBits |= OPT_BIT_KIND;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition_Condition#extension() extension} to extension.
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
     * Initializes the optional value {@link PlanDefinition_Condition#extension() extension} to extension.
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
     * Initializes the optional value {@link PlanDefinition_Condition#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link PlanDefinition_Condition#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link PlanDefinition_Condition#id() id} to id.
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
     * Initializes the optional value {@link PlanDefinition_Condition#id() id} to id.
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
     * Builds a new {@link PlanDefinition_Condition PlanDefinition_Condition}.
     * @return An immutable instance of PlanDefinition_Condition
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public PlanDefinition_Condition build() {
      return new ImmutablePlanDefinition_Condition(expression, kind, extension, modifierExtension, id);
    }

    private boolean expressionIsSet() {
      return (optBits & OPT_BIT_EXPRESSION) != 0;
    }

    private boolean kindIsSet() {
      return (optBits & OPT_BIT_KIND) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of PlanDefinition_Condition is strict, attribute is already set: ".concat(name));
    }
  }
}
