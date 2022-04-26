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
 * Immutable implementation of {@link ExampleScenario_Step}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableExampleScenario_Step.builder()}.
 */
@Generated(from = "ExampleScenario_Step", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableExampleScenario_Step implements ExampleScenario_Step {
  private final @Nullable List<Extension> extension;
  private final @Nullable String id;
  private final @Nullable Boolean pause;
  private final @Nullable List<ExampleScenario_Alternative> alternative;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable ExampleScenario_Operation operation;
  private final @Nullable List<ExampleScenario_Process> process;

  private ImmutableExampleScenario_Step(
      @Nullable List<Extension> extension,
      @Nullable String id,
      @Nullable Boolean pause,
      @Nullable List<ExampleScenario_Alternative> alternative,
      @Nullable List<Extension> modifierExtension,
      @Nullable ExampleScenario_Operation operation,
      @Nullable List<ExampleScenario_Process> process) {
    this.extension = extension;
    this.id = id;
    this.pause = pause;
    this.alternative = alternative;
    this.modifierExtension = modifierExtension;
    this.operation = operation;
    this.process = process;
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
   * @return The value of the {@code pause} attribute
   */
  @JsonProperty("pause")
  @Override
  public Optional<Boolean> pause() {
    return Optional.ofNullable(pause);
  }

  /**
   * @return The value of the {@code alternative} attribute
   */
  @JsonProperty("alternative")
  @Override
  public Optional<List<ExampleScenario_Alternative>> alternative() {
    return Optional.ofNullable(alternative);
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
   * @return The value of the {@code operation} attribute
   */
  @JsonProperty("operation")
  @Override
  public Optional<ExampleScenario_Operation> operation() {
    return Optional.ofNullable(operation);
  }

  /**
   * @return The value of the {@code process} attribute
   */
  @JsonProperty("process")
  @Override
  public Optional<List<ExampleScenario_Process>> process() {
    return Optional.ofNullable(process);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario_Step#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Step withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableExampleScenario_Step(
        newValue,
        this.id,
        this.pause,
        this.alternative,
        this.modifierExtension,
        this.operation,
        this.process);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario_Step#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExampleScenario_Step withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableExampleScenario_Step(
        value,
        this.id,
        this.pause,
        this.alternative,
        this.modifierExtension,
        this.operation,
        this.process);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario_Step#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Step withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableExampleScenario_Step(
        this.extension,
        newValue,
        this.pause,
        this.alternative,
        this.modifierExtension,
        this.operation,
        this.process);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario_Step#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Step withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableExampleScenario_Step(
        this.extension,
        value,
        this.pause,
        this.alternative,
        this.modifierExtension,
        this.operation,
        this.process);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario_Step#pause() pause} attribute.
   * @param value The value for pause
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Step withPause(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.pause, newValue)) return this;
    return new ImmutableExampleScenario_Step(
        this.extension,
        this.id,
        newValue,
        this.alternative,
        this.modifierExtension,
        this.operation,
        this.process);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario_Step#pause() pause} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for pause
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Step withPause(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.pause, value)) return this;
    return new ImmutableExampleScenario_Step(
        this.extension,
        this.id,
        value,
        this.alternative,
        this.modifierExtension,
        this.operation,
        this.process);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario_Step#alternative() alternative} attribute.
   * @param value The value for alternative
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Step withAlternative(List<ExampleScenario_Alternative> value) {
    @Nullable List<ExampleScenario_Alternative> newValue = Objects.requireNonNull(value, "alternative");
    if (this.alternative == newValue) return this;
    return new ImmutableExampleScenario_Step(
        this.extension,
        this.id,
        this.pause,
        newValue,
        this.modifierExtension,
        this.operation,
        this.process);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario_Step#alternative() alternative} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for alternative
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExampleScenario_Step withAlternative(Optional<? extends List<ExampleScenario_Alternative>> optional) {
    @Nullable List<ExampleScenario_Alternative> value = optional.orElse(null);
    if (this.alternative == value) return this;
    return new ImmutableExampleScenario_Step(
        this.extension,
        this.id,
        this.pause,
        value,
        this.modifierExtension,
        this.operation,
        this.process);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario_Step#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Step withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableExampleScenario_Step(this.extension, this.id, this.pause, this.alternative, newValue, this.operation, this.process);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario_Step#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExampleScenario_Step withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableExampleScenario_Step(this.extension, this.id, this.pause, this.alternative, value, this.operation, this.process);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario_Step#operation() operation} attribute.
   * @param value The value for operation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Step withOperation(ExampleScenario_Operation value) {
    @Nullable ExampleScenario_Operation newValue = Objects.requireNonNull(value, "operation");
    if (this.operation == newValue) return this;
    return new ImmutableExampleScenario_Step(
        this.extension,
        this.id,
        this.pause,
        this.alternative,
        this.modifierExtension,
        newValue,
        this.process);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario_Step#operation() operation} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for operation
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExampleScenario_Step withOperation(Optional<? extends ExampleScenario_Operation> optional) {
    @Nullable ExampleScenario_Operation value = optional.orElse(null);
    if (this.operation == value) return this;
    return new ImmutableExampleScenario_Step(
        this.extension,
        this.id,
        this.pause,
        this.alternative,
        this.modifierExtension,
        value,
        this.process);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario_Step#process() process} attribute.
   * @param value The value for process
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Step withProcess(List<ExampleScenario_Process> value) {
    @Nullable List<ExampleScenario_Process> newValue = Objects.requireNonNull(value, "process");
    if (this.process == newValue) return this;
    return new ImmutableExampleScenario_Step(
        this.extension,
        this.id,
        this.pause,
        this.alternative,
        this.modifierExtension,
        this.operation,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario_Step#process() process} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for process
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExampleScenario_Step withProcess(Optional<? extends List<ExampleScenario_Process>> optional) {
    @Nullable List<ExampleScenario_Process> value = optional.orElse(null);
    if (this.process == value) return this;
    return new ImmutableExampleScenario_Step(
        this.extension,
        this.id,
        this.pause,
        this.alternative,
        this.modifierExtension,
        this.operation,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableExampleScenario_Step} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableExampleScenario_Step
        && equalTo((ImmutableExampleScenario_Step) another);
  }

  private boolean equalTo(ImmutableExampleScenario_Step another) {
    return Objects.equals(extension, another.extension)
        && Objects.equals(id, another.id)
        && Objects.equals(pause, another.pause)
        && Objects.equals(alternative, another.alternative)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(operation, another.operation)
        && Objects.equals(process, another.process);
  }

  /**
   * Computes a hash code from attributes: {@code extension}, {@code id}, {@code pause}, {@code alternative}, {@code modifierExtension}, {@code operation}, {@code process}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(pause);
    h += (h << 5) + Objects.hashCode(alternative);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(operation);
    h += (h << 5) + Objects.hashCode(process);
    return h;
  }

  /**
   * Prints the immutable value {@code ExampleScenario_Step} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("ExampleScenario_Step{");
    if (extension != null) {
      builder.append("extension=").append(extension);
    }
    if (id != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (pause != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("pause=").append(pause);
    }
    if (alternative != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("alternative=").append(alternative);
    }
    if (modifierExtension != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (operation != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("operation=").append(operation);
    }
    if (process != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("process=").append(process);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "ExampleScenario_Step", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ExampleScenario_Step {
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Boolean> pause = Optional.empty();
    boolean pauseIsSet;
    @Nullable Optional<List<ExampleScenario_Alternative>> alternative = Optional.empty();
    boolean alternativeIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<ExampleScenario_Operation> operation = Optional.empty();
    boolean operationIsSet;
    @Nullable Optional<List<ExampleScenario_Process>> process = Optional.empty();
    boolean processIsSet;
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
    @JsonProperty("pause")
    public void setPause(Optional<Boolean> pause) {
      this.pause = pause;
      this.pauseIsSet = true;
    }
    @JsonProperty("alternative")
    public void setAlternative(Optional<List<ExampleScenario_Alternative>> alternative) {
      this.alternative = alternative;
      this.alternativeIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("operation")
    public void setOperation(Optional<ExampleScenario_Operation> operation) {
      this.operation = operation;
      this.operationIsSet = true;
    }
    @JsonProperty("process")
    public void setProcess(Optional<List<ExampleScenario_Process>> process) {
      this.process = process;
      this.processIsSet = true;
    }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> pause() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ExampleScenario_Alternative>> alternative() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<ExampleScenario_Operation> operation() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ExampleScenario_Process>> process() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableExampleScenario_Step fromJson(Json json) {
    ImmutableExampleScenario_Step.Builder builder = ImmutableExampleScenario_Step.builder();
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.pauseIsSet) {
      builder.pause(json.pause);
    }
    if (json.alternativeIsSet) {
      builder.alternative(json.alternative);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.operationIsSet) {
      builder.operation(json.operation);
    }
    if (json.processIsSet) {
      builder.process(json.process);
    }
    return (ImmutableExampleScenario_Step) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ExampleScenario_Step} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ExampleScenario_Step instance
   */
  public static ExampleScenario_Step copyOf(ExampleScenario_Step instance) {
    if (instance instanceof ImmutableExampleScenario_Step) {
      return (ImmutableExampleScenario_Step) instance;
    }
    return ImmutableExampleScenario_Step.builder()
        .extension(instance.extension())
        .id(instance.id())
        .pause(instance.pause())
        .alternative(instance.alternative())
        .modifierExtension(instance.modifierExtension())
        .operation(instance.operation())
        .process(instance.process())
        .build();
  }

  /**
   * Creates a builder for {@link ExampleScenario_Step ExampleScenario_Step}.
   * <pre>
   * ImmutableExampleScenario_Step.builder()
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link ExampleScenario_Step#extension() extension}
   *    .id(String) // optional {@link ExampleScenario_Step#id() id}
   *    .pause(Boolean) // optional {@link ExampleScenario_Step#pause() pause}
   *    .alternative(List&amp;lt;com.medplum.types.fhir.ExampleScenario_Alternative&amp;gt;) // optional {@link ExampleScenario_Step#alternative() alternative}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link ExampleScenario_Step#modifierExtension() modifierExtension}
   *    .operation(com.medplum.types.fhir.ExampleScenario_Operation) // optional {@link ExampleScenario_Step#operation() operation}
   *    .process(List&amp;lt;com.medplum.types.fhir.ExampleScenario_Process&amp;gt;) // optional {@link ExampleScenario_Step#process() process}
   *    .build();
   * </pre>
   * @return A new ExampleScenario_Step builder
   */
  public static ImmutableExampleScenario_Step.Builder builder() {
    return new ImmutableExampleScenario_Step.Builder();
  }

  /**
   * Builds instances of type {@link ExampleScenario_Step ExampleScenario_Step}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "ExampleScenario_Step", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_EXTENSION = 0x1L;
    private static final long OPT_BIT_ID = 0x2L;
    private static final long OPT_BIT_PAUSE = 0x4L;
    private static final long OPT_BIT_ALTERNATIVE = 0x8L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x10L;
    private static final long OPT_BIT_OPERATION = 0x20L;
    private static final long OPT_BIT_PROCESS = 0x40L;
    private long optBits;

    private @Nullable List<Extension> extension;
    private @Nullable String id;
    private @Nullable Boolean pause;
    private @Nullable List<ExampleScenario_Alternative> alternative;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable ExampleScenario_Operation operation;
    private @Nullable List<ExampleScenario_Process> process;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ExampleScenario_Step#extension() extension} to extension.
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
     * Initializes the optional value {@link ExampleScenario_Step#extension() extension} to extension.
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
     * Initializes the optional value {@link ExampleScenario_Step#id() id} to id.
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
     * Initializes the optional value {@link ExampleScenario_Step#id() id} to id.
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
     * Initializes the optional value {@link ExampleScenario_Step#pause() pause} to pause.
     * @param pause The value for pause
     * @return {@code this} builder for chained invocation
     */
    public final Builder pause(boolean pause) {
      checkNotIsSet(pauseIsSet(), "pause");
      this.pause = pause;
      optBits |= OPT_BIT_PAUSE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario_Step#pause() pause} to pause.
     * @param pause The value for pause
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("pause")
    public final Builder pause(Optional<Boolean> pause) {
      checkNotIsSet(pauseIsSet(), "pause");
      this.pause = pause.orElse(null);
      optBits |= OPT_BIT_PAUSE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario_Step#alternative() alternative} to alternative.
     * @param alternative The value for alternative
     * @return {@code this} builder for chained invocation
     */
    public final Builder alternative(List<ExampleScenario_Alternative> alternative) {
      checkNotIsSet(alternativeIsSet(), "alternative");
      this.alternative = Objects.requireNonNull(alternative, "alternative");
      optBits |= OPT_BIT_ALTERNATIVE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario_Step#alternative() alternative} to alternative.
     * @param alternative The value for alternative
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("alternative")
    public final Builder alternative(Optional<? extends List<ExampleScenario_Alternative>> alternative) {
      checkNotIsSet(alternativeIsSet(), "alternative");
      this.alternative = alternative.orElse(null);
      optBits |= OPT_BIT_ALTERNATIVE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario_Step#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ExampleScenario_Step#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ExampleScenario_Step#operation() operation} to operation.
     * @param operation The value for operation
     * @return {@code this} builder for chained invocation
     */
    public final Builder operation(ExampleScenario_Operation operation) {
      checkNotIsSet(operationIsSet(), "operation");
      this.operation = Objects.requireNonNull(operation, "operation");
      optBits |= OPT_BIT_OPERATION;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario_Step#operation() operation} to operation.
     * @param operation The value for operation
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("operation")
    public final Builder operation(Optional<? extends ExampleScenario_Operation> operation) {
      checkNotIsSet(operationIsSet(), "operation");
      this.operation = operation.orElse(null);
      optBits |= OPT_BIT_OPERATION;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario_Step#process() process} to process.
     * @param process The value for process
     * @return {@code this} builder for chained invocation
     */
    public final Builder process(List<ExampleScenario_Process> process) {
      checkNotIsSet(processIsSet(), "process");
      this.process = Objects.requireNonNull(process, "process");
      optBits |= OPT_BIT_PROCESS;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario_Step#process() process} to process.
     * @param process The value for process
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("process")
    public final Builder process(Optional<? extends List<ExampleScenario_Process>> process) {
      checkNotIsSet(processIsSet(), "process");
      this.process = process.orElse(null);
      optBits |= OPT_BIT_PROCESS;
      return this;
    }

    /**
     * Builds a new {@link ExampleScenario_Step ExampleScenario_Step}.
     * @return An immutable instance of ExampleScenario_Step
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ExampleScenario_Step build() {
      return new ImmutableExampleScenario_Step(extension, id, pause, alternative, modifierExtension, operation, process);
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean pauseIsSet() {
      return (optBits & OPT_BIT_PAUSE) != 0;
    }

    private boolean alternativeIsSet() {
      return (optBits & OPT_BIT_ALTERNATIVE) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean operationIsSet() {
      return (optBits & OPT_BIT_OPERATION) != 0;
    }

    private boolean processIsSet() {
      return (optBits & OPT_BIT_PROCESS) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of ExampleScenario_Step is strict, attribute is already set: ".concat(name));
    }
  }
}
