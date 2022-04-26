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
 * Immutable implementation of {@link ExampleScenario_Alternative}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableExampleScenario_Alternative.builder()}.
 */
@Generated(from = "ExampleScenario_Alternative", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableExampleScenario_Alternative
    implements ExampleScenario_Alternative {
  private final @Nullable Markdown description;
  private final @Nullable List<Extension> extension;
  private final @Nullable String title;
  private final @Nullable String id;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable List<ExampleScenario_Step> step;

  private ImmutableExampleScenario_Alternative(
      @Nullable Markdown description,
      @Nullable List<Extension> extension,
      @Nullable String title,
      @Nullable String id,
      @Nullable List<Extension> modifierExtension,
      @Nullable List<ExampleScenario_Step> step) {
    this.description = description;
    this.extension = extension;
    this.title = title;
    this.id = id;
    this.modifierExtension = modifierExtension;
    this.step = step;
  }

  /**
   * @return The value of the {@code description} attribute
   */
  @JsonProperty("description")
  @Override
  public Optional<Markdown> description() {
    return Optional.ofNullable(description);
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
   * @return The value of the {@code title} attribute
   */
  @JsonProperty("title")
  @Override
  public Optional<String> title() {
    return Optional.ofNullable(title);
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
   * @return The value of the {@code step} attribute
   */
  @JsonProperty("step")
  @Override
  public Optional<List<ExampleScenario_Step>> step() {
    return Optional.ofNullable(step);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario_Alternative#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Alternative withDescription(Markdown value) {
    @Nullable Markdown newValue = Objects.requireNonNull(value, "description");
    if (this.description == newValue) return this;
    return new ImmutableExampleScenario_Alternative(newValue, this.extension, this.title, this.id, this.modifierExtension, this.step);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario_Alternative#description() description} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExampleScenario_Alternative withDescription(Optional<? extends Markdown> optional) {
    @Nullable Markdown value = optional.orElse(null);
    if (this.description == value) return this;
    return new ImmutableExampleScenario_Alternative(value, this.extension, this.title, this.id, this.modifierExtension, this.step);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario_Alternative#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Alternative withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableExampleScenario_Alternative(this.description, newValue, this.title, this.id, this.modifierExtension, this.step);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario_Alternative#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExampleScenario_Alternative withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableExampleScenario_Alternative(this.description, value, this.title, this.id, this.modifierExtension, this.step);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario_Alternative#title() title} attribute.
   * @param value The value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Alternative withTitle(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "title");
    if (Objects.equals(this.title, newValue)) return this;
    return new ImmutableExampleScenario_Alternative(this.description, this.extension, newValue, this.id, this.modifierExtension, this.step);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario_Alternative#title() title} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Alternative withTitle(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.title, value)) return this;
    return new ImmutableExampleScenario_Alternative(this.description, this.extension, value, this.id, this.modifierExtension, this.step);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario_Alternative#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Alternative withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableExampleScenario_Alternative(this.description, this.extension, this.title, newValue, this.modifierExtension, this.step);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario_Alternative#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Alternative withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableExampleScenario_Alternative(this.description, this.extension, this.title, value, this.modifierExtension, this.step);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario_Alternative#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Alternative withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableExampleScenario_Alternative(this.description, this.extension, this.title, this.id, newValue, this.step);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario_Alternative#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExampleScenario_Alternative withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableExampleScenario_Alternative(this.description, this.extension, this.title, this.id, value, this.step);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario_Alternative#step() step} attribute.
   * @param value The value for step
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Alternative withStep(List<ExampleScenario_Step> value) {
    @Nullable List<ExampleScenario_Step> newValue = Objects.requireNonNull(value, "step");
    if (this.step == newValue) return this;
    return new ImmutableExampleScenario_Alternative(this.description, this.extension, this.title, this.id, this.modifierExtension, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario_Alternative#step() step} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for step
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExampleScenario_Alternative withStep(Optional<? extends List<ExampleScenario_Step>> optional) {
    @Nullable List<ExampleScenario_Step> value = optional.orElse(null);
    if (this.step == value) return this;
    return new ImmutableExampleScenario_Alternative(this.description, this.extension, this.title, this.id, this.modifierExtension, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableExampleScenario_Alternative} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableExampleScenario_Alternative
        && equalTo((ImmutableExampleScenario_Alternative) another);
  }

  private boolean equalTo(ImmutableExampleScenario_Alternative another) {
    return Objects.equals(description, another.description)
        && Objects.equals(extension, another.extension)
        && Objects.equals(title, another.title)
        && Objects.equals(id, another.id)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(step, another.step);
  }

  /**
   * Computes a hash code from attributes: {@code description}, {@code extension}, {@code title}, {@code id}, {@code modifierExtension}, {@code step}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(title);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(step);
    return h;
  }

  /**
   * Prints the immutable value {@code ExampleScenario_Alternative} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("ExampleScenario_Alternative{");
    if (description != null) {
      builder.append("description=").append(description);
    }
    if (extension != null) {
      if (builder.length() > 28) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (title != null) {
      if (builder.length() > 28) builder.append(", ");
      builder.append("title=").append(title);
    }
    if (id != null) {
      if (builder.length() > 28) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (modifierExtension != null) {
      if (builder.length() > 28) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (step != null) {
      if (builder.length() > 28) builder.append(", ");
      builder.append("step=").append(step);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "ExampleScenario_Alternative", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ExampleScenario_Alternative {
    @Nullable Optional<Markdown> description = Optional.empty();
    boolean descriptionIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<String> title = Optional.empty();
    boolean titleIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<List<ExampleScenario_Step>> step = Optional.empty();
    boolean stepIsSet;
    @JsonProperty("description")
    public void setDescription(Optional<Markdown> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("title")
    public void setTitle(Optional<String> title) {
      this.title = title;
      this.titleIsSet = true;
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
    @JsonProperty("step")
    public void setStep(Optional<List<ExampleScenario_Step>> step) {
      this.step = step;
      this.stepIsSet = true;
    }
    @Override
    public Optional<Markdown> description() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> title() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ExampleScenario_Step>> step() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableExampleScenario_Alternative fromJson(Json json) {
    ImmutableExampleScenario_Alternative.Builder builder = ImmutableExampleScenario_Alternative.builder();
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.titleIsSet) {
      builder.title(json.title);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.stepIsSet) {
      builder.step(json.step);
    }
    return (ImmutableExampleScenario_Alternative) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ExampleScenario_Alternative} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ExampleScenario_Alternative instance
   */
  public static ExampleScenario_Alternative copyOf(ExampleScenario_Alternative instance) {
    if (instance instanceof ImmutableExampleScenario_Alternative) {
      return (ImmutableExampleScenario_Alternative) instance;
    }
    return ImmutableExampleScenario_Alternative.builder()
        .description(instance.description())
        .extension(instance.extension())
        .title(instance.title())
        .id(instance.id())
        .modifierExtension(instance.modifierExtension())
        .step(instance.step())
        .build();
  }

  /**
   * Creates a builder for {@link ExampleScenario_Alternative ExampleScenario_Alternative}.
   * <pre>
   * ImmutableExampleScenario_Alternative.builder()
   *    .description(com.fhir.types.fhir.Markdown) // optional {@link ExampleScenario_Alternative#description() description}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link ExampleScenario_Alternative#extension() extension}
   *    .title(String) // optional {@link ExampleScenario_Alternative#title() title}
   *    .id(String) // optional {@link ExampleScenario_Alternative#id() id}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link ExampleScenario_Alternative#modifierExtension() modifierExtension}
   *    .step(List&amp;lt;com.fhir.types.fhir.ExampleScenario_Step&amp;gt;) // optional {@link ExampleScenario_Alternative#step() step}
   *    .build();
   * </pre>
   * @return A new ExampleScenario_Alternative builder
   */
  public static ImmutableExampleScenario_Alternative.Builder builder() {
    return new ImmutableExampleScenario_Alternative.Builder();
  }

  /**
   * Builds instances of type {@link ExampleScenario_Alternative ExampleScenario_Alternative}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "ExampleScenario_Alternative", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_DESCRIPTION = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x2L;
    private static final long OPT_BIT_TITLE = 0x4L;
    private static final long OPT_BIT_ID = 0x8L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x10L;
    private static final long OPT_BIT_STEP = 0x20L;
    private long optBits;

    private @Nullable Markdown description;
    private @Nullable List<Extension> extension;
    private @Nullable String title;
    private @Nullable String id;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable List<ExampleScenario_Step> step;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ExampleScenario_Alternative#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    public final Builder description(Markdown description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = Objects.requireNonNull(description, "description");
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario_Alternative#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("description")
    public final Builder description(Optional<? extends Markdown> description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = description.orElse(null);
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario_Alternative#extension() extension} to extension.
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
     * Initializes the optional value {@link ExampleScenario_Alternative#extension() extension} to extension.
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
     * Initializes the optional value {@link ExampleScenario_Alternative#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for chained invocation
     */
    public final Builder title(String title) {
      checkNotIsSet(titleIsSet(), "title");
      this.title = Objects.requireNonNull(title, "title");
      optBits |= OPT_BIT_TITLE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario_Alternative#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("title")
    public final Builder title(Optional<String> title) {
      checkNotIsSet(titleIsSet(), "title");
      this.title = title.orElse(null);
      optBits |= OPT_BIT_TITLE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario_Alternative#id() id} to id.
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
     * Initializes the optional value {@link ExampleScenario_Alternative#id() id} to id.
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
     * Initializes the optional value {@link ExampleScenario_Alternative#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ExampleScenario_Alternative#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ExampleScenario_Alternative#step() step} to step.
     * @param step The value for step
     * @return {@code this} builder for chained invocation
     */
    public final Builder step(List<ExampleScenario_Step> step) {
      checkNotIsSet(stepIsSet(), "step");
      this.step = Objects.requireNonNull(step, "step");
      optBits |= OPT_BIT_STEP;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario_Alternative#step() step} to step.
     * @param step The value for step
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("step")
    public final Builder step(Optional<? extends List<ExampleScenario_Step>> step) {
      checkNotIsSet(stepIsSet(), "step");
      this.step = step.orElse(null);
      optBits |= OPT_BIT_STEP;
      return this;
    }

    /**
     * Builds a new {@link ExampleScenario_Alternative ExampleScenario_Alternative}.
     * @return An immutable instance of ExampleScenario_Alternative
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ExampleScenario_Alternative build() {
      return new ImmutableExampleScenario_Alternative(description, extension, title, id, modifierExtension, step);
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean titleIsSet() {
      return (optBits & OPT_BIT_TITLE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean stepIsSet() {
      return (optBits & OPT_BIT_STEP) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of ExampleScenario_Alternative is strict, attribute is already set: ".concat(name));
    }
  }
}
