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
 * Immutable implementation of {@link ExampleScenario_Process}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableExampleScenario_Process.builder()}.
 */
@Generated(from = "ExampleScenario_Process", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableExampleScenario_Process implements ExampleScenario_Process {
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Markdown postConditions;
  private final @Nullable String title;
  private final @Nullable Markdown description;
  private final @Nullable Markdown preConditions;
  private final @Nullable List<Extension> extension;
  private final @Nullable String id;
  private final @Nullable List<ExampleScenario_Step> step;

  private ImmutableExampleScenario_Process(
      @Nullable List<Extension> modifierExtension,
      @Nullable Markdown postConditions,
      @Nullable String title,
      @Nullable Markdown description,
      @Nullable Markdown preConditions,
      @Nullable List<Extension> extension,
      @Nullable String id,
      @Nullable List<ExampleScenario_Step> step) {
    this.modifierExtension = modifierExtension;
    this.postConditions = postConditions;
    this.title = title;
    this.description = description;
    this.preConditions = preConditions;
    this.extension = extension;
    this.id = id;
    this.step = step;
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
   * @return The value of the {@code postConditions} attribute
   */
  @JsonProperty("postConditions")
  @Override
  public Optional<Markdown> postConditions() {
    return Optional.ofNullable(postConditions);
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
   * @return The value of the {@code description} attribute
   */
  @JsonProperty("description")
  @Override
  public Optional<Markdown> description() {
    return Optional.ofNullable(description);
  }

  /**
   * @return The value of the {@code preConditions} attribute
   */
  @JsonProperty("preConditions")
  @Override
  public Optional<Markdown> preConditions() {
    return Optional.ofNullable(preConditions);
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
   * @return The value of the {@code step} attribute
   */
  @JsonProperty("step")
  @Override
  public Optional<List<ExampleScenario_Step>> step() {
    return Optional.ofNullable(step);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario_Process#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Process withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableExampleScenario_Process(
        newValue,
        this.postConditions,
        this.title,
        this.description,
        this.preConditions,
        this.extension,
        this.id,
        this.step);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario_Process#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExampleScenario_Process withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableExampleScenario_Process(
        value,
        this.postConditions,
        this.title,
        this.description,
        this.preConditions,
        this.extension,
        this.id,
        this.step);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario_Process#postConditions() postConditions} attribute.
   * @param value The value for postConditions
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Process withPostConditions(Markdown value) {
    @Nullable Markdown newValue = Objects.requireNonNull(value, "postConditions");
    if (this.postConditions == newValue) return this;
    return new ImmutableExampleScenario_Process(
        this.modifierExtension,
        newValue,
        this.title,
        this.description,
        this.preConditions,
        this.extension,
        this.id,
        this.step);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario_Process#postConditions() postConditions} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for postConditions
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExampleScenario_Process withPostConditions(Optional<? extends Markdown> optional) {
    @Nullable Markdown value = optional.orElse(null);
    if (this.postConditions == value) return this;
    return new ImmutableExampleScenario_Process(
        this.modifierExtension,
        value,
        this.title,
        this.description,
        this.preConditions,
        this.extension,
        this.id,
        this.step);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario_Process#title() title} attribute.
   * @param value The value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Process withTitle(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "title");
    if (Objects.equals(this.title, newValue)) return this;
    return new ImmutableExampleScenario_Process(
        this.modifierExtension,
        this.postConditions,
        newValue,
        this.description,
        this.preConditions,
        this.extension,
        this.id,
        this.step);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario_Process#title() title} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Process withTitle(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.title, value)) return this;
    return new ImmutableExampleScenario_Process(
        this.modifierExtension,
        this.postConditions,
        value,
        this.description,
        this.preConditions,
        this.extension,
        this.id,
        this.step);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario_Process#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Process withDescription(Markdown value) {
    @Nullable Markdown newValue = Objects.requireNonNull(value, "description");
    if (this.description == newValue) return this;
    return new ImmutableExampleScenario_Process(
        this.modifierExtension,
        this.postConditions,
        this.title,
        newValue,
        this.preConditions,
        this.extension,
        this.id,
        this.step);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario_Process#description() description} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExampleScenario_Process withDescription(Optional<? extends Markdown> optional) {
    @Nullable Markdown value = optional.orElse(null);
    if (this.description == value) return this;
    return new ImmutableExampleScenario_Process(
        this.modifierExtension,
        this.postConditions,
        this.title,
        value,
        this.preConditions,
        this.extension,
        this.id,
        this.step);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario_Process#preConditions() preConditions} attribute.
   * @param value The value for preConditions
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Process withPreConditions(Markdown value) {
    @Nullable Markdown newValue = Objects.requireNonNull(value, "preConditions");
    if (this.preConditions == newValue) return this;
    return new ImmutableExampleScenario_Process(
        this.modifierExtension,
        this.postConditions,
        this.title,
        this.description,
        newValue,
        this.extension,
        this.id,
        this.step);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario_Process#preConditions() preConditions} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for preConditions
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExampleScenario_Process withPreConditions(Optional<? extends Markdown> optional) {
    @Nullable Markdown value = optional.orElse(null);
    if (this.preConditions == value) return this;
    return new ImmutableExampleScenario_Process(
        this.modifierExtension,
        this.postConditions,
        this.title,
        this.description,
        value,
        this.extension,
        this.id,
        this.step);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario_Process#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Process withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableExampleScenario_Process(
        this.modifierExtension,
        this.postConditions,
        this.title,
        this.description,
        this.preConditions,
        newValue,
        this.id,
        this.step);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario_Process#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExampleScenario_Process withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableExampleScenario_Process(
        this.modifierExtension,
        this.postConditions,
        this.title,
        this.description,
        this.preConditions,
        value,
        this.id,
        this.step);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario_Process#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Process withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableExampleScenario_Process(
        this.modifierExtension,
        this.postConditions,
        this.title,
        this.description,
        this.preConditions,
        this.extension,
        newValue,
        this.step);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario_Process#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Process withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableExampleScenario_Process(
        this.modifierExtension,
        this.postConditions,
        this.title,
        this.description,
        this.preConditions,
        this.extension,
        value,
        this.step);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario_Process#step() step} attribute.
   * @param value The value for step
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Process withStep(List<ExampleScenario_Step> value) {
    @Nullable List<ExampleScenario_Step> newValue = Objects.requireNonNull(value, "step");
    if (this.step == newValue) return this;
    return new ImmutableExampleScenario_Process(
        this.modifierExtension,
        this.postConditions,
        this.title,
        this.description,
        this.preConditions,
        this.extension,
        this.id,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario_Process#step() step} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for step
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExampleScenario_Process withStep(Optional<? extends List<ExampleScenario_Step>> optional) {
    @Nullable List<ExampleScenario_Step> value = optional.orElse(null);
    if (this.step == value) return this;
    return new ImmutableExampleScenario_Process(
        this.modifierExtension,
        this.postConditions,
        this.title,
        this.description,
        this.preConditions,
        this.extension,
        this.id,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableExampleScenario_Process} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableExampleScenario_Process
        && equalTo((ImmutableExampleScenario_Process) another);
  }

  private boolean equalTo(ImmutableExampleScenario_Process another) {
    return Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(postConditions, another.postConditions)
        && Objects.equals(title, another.title)
        && Objects.equals(description, another.description)
        && Objects.equals(preConditions, another.preConditions)
        && Objects.equals(extension, another.extension)
        && Objects.equals(id, another.id)
        && Objects.equals(step, another.step);
  }

  /**
   * Computes a hash code from attributes: {@code modifierExtension}, {@code postConditions}, {@code title}, {@code description}, {@code preConditions}, {@code extension}, {@code id}, {@code step}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(postConditions);
    h += (h << 5) + Objects.hashCode(title);
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + Objects.hashCode(preConditions);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(step);
    return h;
  }

  /**
   * Prints the immutable value {@code ExampleScenario_Process} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("ExampleScenario_Process{");
    if (modifierExtension != null) {
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (postConditions != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("postConditions=").append(postConditions);
    }
    if (title != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("title=").append(title);
    }
    if (description != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("description=").append(description);
    }
    if (preConditions != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("preConditions=").append(preConditions);
    }
    if (extension != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (id != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (step != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("step=").append(step);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "ExampleScenario_Process", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ExampleScenario_Process {
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Markdown> postConditions = Optional.empty();
    boolean postConditionsIsSet;
    @Nullable Optional<String> title = Optional.empty();
    boolean titleIsSet;
    @Nullable Optional<Markdown> description = Optional.empty();
    boolean descriptionIsSet;
    @Nullable Optional<Markdown> preConditions = Optional.empty();
    boolean preConditionsIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<ExampleScenario_Step>> step = Optional.empty();
    boolean stepIsSet;
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("postConditions")
    public void setPostConditions(Optional<Markdown> postConditions) {
      this.postConditions = postConditions;
      this.postConditionsIsSet = true;
    }
    @JsonProperty("title")
    public void setTitle(Optional<String> title) {
      this.title = title;
      this.titleIsSet = true;
    }
    @JsonProperty("description")
    public void setDescription(Optional<Markdown> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @JsonProperty("preConditions")
    public void setPreConditions(Optional<Markdown> preConditions) {
      this.preConditions = preConditions;
      this.preConditionsIsSet = true;
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
    @JsonProperty("step")
    public void setStep(Optional<List<ExampleScenario_Step>> step) {
      this.step = step;
      this.stepIsSet = true;
    }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Markdown> postConditions() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> title() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Markdown> description() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Markdown> preConditions() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
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
  static ImmutableExampleScenario_Process fromJson(Json json) {
    ImmutableExampleScenario_Process.Builder builder = ImmutableExampleScenario_Process.builder();
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.postConditionsIsSet) {
      builder.postConditions(json.postConditions);
    }
    if (json.titleIsSet) {
      builder.title(json.title);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.preConditionsIsSet) {
      builder.preConditions(json.preConditions);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.stepIsSet) {
      builder.step(json.step);
    }
    return (ImmutableExampleScenario_Process) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ExampleScenario_Process} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ExampleScenario_Process instance
   */
  public static ExampleScenario_Process copyOf(ExampleScenario_Process instance) {
    if (instance instanceof ImmutableExampleScenario_Process) {
      return (ImmutableExampleScenario_Process) instance;
    }
    return ImmutableExampleScenario_Process.builder()
        .modifierExtension(instance.modifierExtension())
        .postConditions(instance.postConditions())
        .title(instance.title())
        .description(instance.description())
        .preConditions(instance.preConditions())
        .extension(instance.extension())
        .id(instance.id())
        .step(instance.step())
        .build();
  }

  /**
   * Creates a builder for {@link ExampleScenario_Process ExampleScenario_Process}.
   * <pre>
   * ImmutableExampleScenario_Process.builder()
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link ExampleScenario_Process#modifierExtension() modifierExtension}
   *    .postConditions(com.fhir.types.fhir.Markdown) // optional {@link ExampleScenario_Process#postConditions() postConditions}
   *    .title(String) // optional {@link ExampleScenario_Process#title() title}
   *    .description(com.fhir.types.fhir.Markdown) // optional {@link ExampleScenario_Process#description() description}
   *    .preConditions(com.fhir.types.fhir.Markdown) // optional {@link ExampleScenario_Process#preConditions() preConditions}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link ExampleScenario_Process#extension() extension}
   *    .id(String) // optional {@link ExampleScenario_Process#id() id}
   *    .step(List&amp;lt;com.fhir.types.fhir.ExampleScenario_Step&amp;gt;) // optional {@link ExampleScenario_Process#step() step}
   *    .build();
   * </pre>
   * @return A new ExampleScenario_Process builder
   */
  public static ImmutableExampleScenario_Process.Builder builder() {
    return new ImmutableExampleScenario_Process.Builder();
  }

  /**
   * Builds instances of type {@link ExampleScenario_Process ExampleScenario_Process}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "ExampleScenario_Process", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1L;
    private static final long OPT_BIT_POST_CONDITIONS = 0x2L;
    private static final long OPT_BIT_TITLE = 0x4L;
    private static final long OPT_BIT_DESCRIPTION = 0x8L;
    private static final long OPT_BIT_PRE_CONDITIONS = 0x10L;
    private static final long OPT_BIT_EXTENSION = 0x20L;
    private static final long OPT_BIT_ID = 0x40L;
    private static final long OPT_BIT_STEP = 0x80L;
    private long optBits;

    private @Nullable List<Extension> modifierExtension;
    private @Nullable Markdown postConditions;
    private @Nullable String title;
    private @Nullable Markdown description;
    private @Nullable Markdown preConditions;
    private @Nullable List<Extension> extension;
    private @Nullable String id;
    private @Nullable List<ExampleScenario_Step> step;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ExampleScenario_Process#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ExampleScenario_Process#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ExampleScenario_Process#postConditions() postConditions} to postConditions.
     * @param postConditions The value for postConditions
     * @return {@code this} builder for chained invocation
     */
    public final Builder postConditions(Markdown postConditions) {
      checkNotIsSet(postConditionsIsSet(), "postConditions");
      this.postConditions = Objects.requireNonNull(postConditions, "postConditions");
      optBits |= OPT_BIT_POST_CONDITIONS;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario_Process#postConditions() postConditions} to postConditions.
     * @param postConditions The value for postConditions
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("postConditions")
    public final Builder postConditions(Optional<? extends Markdown> postConditions) {
      checkNotIsSet(postConditionsIsSet(), "postConditions");
      this.postConditions = postConditions.orElse(null);
      optBits |= OPT_BIT_POST_CONDITIONS;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario_Process#title() title} to title.
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
     * Initializes the optional value {@link ExampleScenario_Process#title() title} to title.
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
     * Initializes the optional value {@link ExampleScenario_Process#description() description} to description.
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
     * Initializes the optional value {@link ExampleScenario_Process#description() description} to description.
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
     * Initializes the optional value {@link ExampleScenario_Process#preConditions() preConditions} to preConditions.
     * @param preConditions The value for preConditions
     * @return {@code this} builder for chained invocation
     */
    public final Builder preConditions(Markdown preConditions) {
      checkNotIsSet(preConditionsIsSet(), "preConditions");
      this.preConditions = Objects.requireNonNull(preConditions, "preConditions");
      optBits |= OPT_BIT_PRE_CONDITIONS;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario_Process#preConditions() preConditions} to preConditions.
     * @param preConditions The value for preConditions
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("preConditions")
    public final Builder preConditions(Optional<? extends Markdown> preConditions) {
      checkNotIsSet(preConditionsIsSet(), "preConditions");
      this.preConditions = preConditions.orElse(null);
      optBits |= OPT_BIT_PRE_CONDITIONS;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario_Process#extension() extension} to extension.
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
     * Initializes the optional value {@link ExampleScenario_Process#extension() extension} to extension.
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
     * Initializes the optional value {@link ExampleScenario_Process#id() id} to id.
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
     * Initializes the optional value {@link ExampleScenario_Process#id() id} to id.
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
     * Initializes the optional value {@link ExampleScenario_Process#step() step} to step.
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
     * Initializes the optional value {@link ExampleScenario_Process#step() step} to step.
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
     * Builds a new {@link ExampleScenario_Process ExampleScenario_Process}.
     * @return An immutable instance of ExampleScenario_Process
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ExampleScenario_Process build() {
      return new ImmutableExampleScenario_Process(modifierExtension, postConditions, title, description, preConditions, extension, id, step);
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean postConditionsIsSet() {
      return (optBits & OPT_BIT_POST_CONDITIONS) != 0;
    }

    private boolean titleIsSet() {
      return (optBits & OPT_BIT_TITLE) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean preConditionsIsSet() {
      return (optBits & OPT_BIT_PRE_CONDITIONS) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean stepIsSet() {
      return (optBits & OPT_BIT_STEP) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of ExampleScenario_Process is strict, attribute is already set: ".concat(name));
    }
  }
}
