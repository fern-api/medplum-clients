//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link ExampleScenario_Process}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableExampleScenario_Process.builder()}.
 */
@org.immutables.value.Generated(from = "ExampleScenario_Process", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableExampleScenario_Process implements com.fhir.ExampleScenario_Process {
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable com.fhir.markdown description;
  private final @javax.annotation.Nullable com.fhir.markdown postConditions;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ExampleScenario_Step> step;
  private final @javax.annotation.Nullable java.lang.String title;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.markdown preConditions;

  private ImmutableExampleScenario_Process(
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable com.fhir.markdown description,
      @javax.annotation.Nullable com.fhir.markdown postConditions,
      @javax.annotation.Nullable java.util.List<com.fhir.ExampleScenario_Step> step,
      @javax.annotation.Nullable java.lang.String title,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.markdown preConditions) {
    this.id = id;
    this.description = description;
    this.postConditions = postConditions;
    this.step = step;
    this.title = title;
    this.extension = extension;
    this.modifierExtension = modifierExtension;
    this.preConditions = preConditions;
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("id")
  @Override
  public java.util.Optional<java.lang.String> id() {
    return java.util.Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code description} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("description")
  @Override
  public java.util.Optional<com.fhir.markdown> description() {
    return java.util.Optional.ofNullable(description);
  }

  /**
   * @return The value of the {@code postConditions} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("postConditions")
  @Override
  public java.util.Optional<com.fhir.markdown> postConditions() {
    return java.util.Optional.ofNullable(postConditions);
  }

  /**
   * @return The value of the {@code step} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("step")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ExampleScenario_Step>> step() {
    return java.util.Optional.ofNullable(step);
  }

  /**
   * @return The value of the {@code title} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("title")
  @Override
  public java.util.Optional<java.lang.String> title() {
    return java.util.Optional.ofNullable(title);
  }

  /**
   * @return The value of the {@code extension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("extension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> extension() {
    return java.util.Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code modifierExtension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() {
    return java.util.Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code preConditions} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("preConditions")
  @Override
  public java.util.Optional<com.fhir.markdown> preConditions() {
    return java.util.Optional.ofNullable(preConditions);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario_Process#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Process withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableExampleScenario_Process(
        newValue,
        this.description,
        this.postConditions,
        this.step,
        this.title,
        this.extension,
        this.modifierExtension,
        this.preConditions);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario_Process#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Process withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableExampleScenario_Process(
        value,
        this.description,
        this.postConditions,
        this.step,
        this.title,
        this.extension,
        this.modifierExtension,
        this.preConditions);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario_Process#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Process withDescription(com.fhir.markdown value) {
    @javax.annotation.Nullable com.fhir.markdown newValue = java.util.Objects.requireNonNull(value, "description");
    if (this.description == newValue) return this;
    return new ImmutableExampleScenario_Process(
        this.id,
        newValue,
        this.postConditions,
        this.step,
        this.title,
        this.extension,
        this.modifierExtension,
        this.preConditions);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario_Process#description() description} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExampleScenario_Process withDescription(java.util.Optional<? extends com.fhir.markdown> optional) {
    @javax.annotation.Nullable com.fhir.markdown value = optional.orElse(null);
    if (this.description == value) return this;
    return new ImmutableExampleScenario_Process(
        this.id,
        value,
        this.postConditions,
        this.step,
        this.title,
        this.extension,
        this.modifierExtension,
        this.preConditions);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario_Process#postConditions() postConditions} attribute.
   * @param value The value for postConditions
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Process withPostConditions(com.fhir.markdown value) {
    @javax.annotation.Nullable com.fhir.markdown newValue = java.util.Objects.requireNonNull(value, "postConditions");
    if (this.postConditions == newValue) return this;
    return new ImmutableExampleScenario_Process(
        this.id,
        this.description,
        newValue,
        this.step,
        this.title,
        this.extension,
        this.modifierExtension,
        this.preConditions);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario_Process#postConditions() postConditions} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for postConditions
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExampleScenario_Process withPostConditions(java.util.Optional<? extends com.fhir.markdown> optional) {
    @javax.annotation.Nullable com.fhir.markdown value = optional.orElse(null);
    if (this.postConditions == value) return this;
    return new ImmutableExampleScenario_Process(
        this.id,
        this.description,
        value,
        this.step,
        this.title,
        this.extension,
        this.modifierExtension,
        this.preConditions);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario_Process#step() step} attribute.
   * @param value The value for step
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Process withStep(java.util.List<com.fhir.ExampleScenario_Step> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ExampleScenario_Step> newValue = java.util.Objects.requireNonNull(value, "step");
    if (this.step == newValue) return this;
    return new ImmutableExampleScenario_Process(
        this.id,
        this.description,
        this.postConditions,
        newValue,
        this.title,
        this.extension,
        this.modifierExtension,
        this.preConditions);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario_Process#step() step} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for step
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExampleScenario_Process withStep(java.util.Optional<? extends java.util.List<com.fhir.ExampleScenario_Step>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ExampleScenario_Step> value = optional.orElse(null);
    if (this.step == value) return this;
    return new ImmutableExampleScenario_Process(
        this.id,
        this.description,
        this.postConditions,
        value,
        this.title,
        this.extension,
        this.modifierExtension,
        this.preConditions);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario_Process#title() title} attribute.
   * @param value The value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Process withTitle(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "title");
    if (java.util.Objects.equals(this.title, newValue)) return this;
    return new ImmutableExampleScenario_Process(
        this.id,
        this.description,
        this.postConditions,
        this.step,
        newValue,
        this.extension,
        this.modifierExtension,
        this.preConditions);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario_Process#title() title} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Process withTitle(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.title, value)) return this;
    return new ImmutableExampleScenario_Process(
        this.id,
        this.description,
        this.postConditions,
        this.step,
        value,
        this.extension,
        this.modifierExtension,
        this.preConditions);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario_Process#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Process withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableExampleScenario_Process(
        this.id,
        this.description,
        this.postConditions,
        this.step,
        this.title,
        newValue,
        this.modifierExtension,
        this.preConditions);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario_Process#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExampleScenario_Process withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableExampleScenario_Process(
        this.id,
        this.description,
        this.postConditions,
        this.step,
        this.title,
        value,
        this.modifierExtension,
        this.preConditions);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario_Process#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Process withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableExampleScenario_Process(
        this.id,
        this.description,
        this.postConditions,
        this.step,
        this.title,
        this.extension,
        newValue,
        this.preConditions);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario_Process#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExampleScenario_Process withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableExampleScenario_Process(
        this.id,
        this.description,
        this.postConditions,
        this.step,
        this.title,
        this.extension,
        value,
        this.preConditions);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario_Process#preConditions() preConditions} attribute.
   * @param value The value for preConditions
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Process withPreConditions(com.fhir.markdown value) {
    @javax.annotation.Nullable com.fhir.markdown newValue = java.util.Objects.requireNonNull(value, "preConditions");
    if (this.preConditions == newValue) return this;
    return new ImmutableExampleScenario_Process(
        this.id,
        this.description,
        this.postConditions,
        this.step,
        this.title,
        this.extension,
        this.modifierExtension,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario_Process#preConditions() preConditions} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for preConditions
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExampleScenario_Process withPreConditions(java.util.Optional<? extends com.fhir.markdown> optional) {
    @javax.annotation.Nullable com.fhir.markdown value = optional.orElse(null);
    if (this.preConditions == value) return this;
    return new ImmutableExampleScenario_Process(
        this.id,
        this.description,
        this.postConditions,
        this.step,
        this.title,
        this.extension,
        this.modifierExtension,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableExampleScenario_Process} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableExampleScenario_Process
        && equalTo((ImmutableExampleScenario_Process) another);
  }

  private boolean equalTo(ImmutableExampleScenario_Process another) {
    return java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(description, another.description)
        && java.util.Objects.equals(postConditions, another.postConditions)
        && java.util.Objects.equals(step, another.step)
        && java.util.Objects.equals(title, another.title)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(preConditions, another.preConditions);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code description}, {@code postConditions}, {@code step}, {@code title}, {@code extension}, {@code modifierExtension}, {@code preConditions}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(description);
    h += (h << 5) + java.util.Objects.hashCode(postConditions);
    h += (h << 5) + java.util.Objects.hashCode(step);
    h += (h << 5) + java.util.Objects.hashCode(title);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(preConditions);
    return h;
  }

  /**
   * Prints the immutable value {@code ExampleScenario_Process} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("ExampleScenario_Process{");
    if (id != null) {
      builder.append("id=").append(id);
    }
    if (description != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("description=").append(description);
    }
    if (postConditions != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("postConditions=").append(postConditions);
    }
    if (step != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("step=").append(step);
    }
    if (title != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("title=").append(title);
    }
    if (extension != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (modifierExtension != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (preConditions != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("preConditions=").append(preConditions);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "ExampleScenario_Process", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.ExampleScenario_Process {
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.markdown> description = java.util.Optional.empty();
    boolean descriptionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.markdown> postConditions = java.util.Optional.empty();
    boolean postConditionsIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ExampleScenario_Step>> step = java.util.Optional.empty();
    boolean stepIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> title = java.util.Optional.empty();
    boolean titleIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.markdown> preConditions = java.util.Optional.empty();
    boolean preConditionsIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    public void setDescription(java.util.Optional<com.fhir.markdown> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("postConditions")
    public void setPostConditions(java.util.Optional<com.fhir.markdown> postConditions) {
      this.postConditions = postConditions;
      this.postConditionsIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("step")
    public void setStep(java.util.Optional<java.util.List<com.fhir.ExampleScenario_Step>> step) {
      this.step = step;
      this.stepIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("title")
    public void setTitle(java.util.Optional<java.lang.String> title) {
      this.title = title;
      this.titleIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("preConditions")
    public void setPreConditions(java.util.Optional<com.fhir.markdown> preConditions) {
      this.preConditions = preConditions;
      this.preConditionsIsSet = true;
    }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.markdown> description() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.markdown> postConditions() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ExampleScenario_Step>> step() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> title() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.markdown> preConditions() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableExampleScenario_Process fromJson(Json json) {
    ImmutableExampleScenario_Process.Builder builder = ImmutableExampleScenario_Process.builder();
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.postConditionsIsSet) {
      builder.postConditions(json.postConditions);
    }
    if (json.stepIsSet) {
      builder.step(json.step);
    }
    if (json.titleIsSet) {
      builder.title(json.title);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.preConditionsIsSet) {
      builder.preConditions(json.preConditions);
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
        .id(instance.id())
        .description(instance.description())
        .postConditions(instance.postConditions())
        .step(instance.step())
        .title(instance.title())
        .extension(instance.extension())
        .modifierExtension(instance.modifierExtension())
        .preConditions(instance.preConditions())
        .build();
  }

  /**
   * Creates a builder for {@link ExampleScenario_Process ExampleScenario_Process}.
   * <pre>
   * ImmutableExampleScenario_Process.builder()
   *    .id(String) // optional {@link ExampleScenario_Process#id() id}
   *    .description(com.fhir.markdown) // optional {@link ExampleScenario_Process#description() description}
   *    .postConditions(com.fhir.markdown) // optional {@link ExampleScenario_Process#postConditions() postConditions}
   *    .step(List&amp;lt;com.fhir.ExampleScenario_Step&amp;gt;) // optional {@link ExampleScenario_Process#step() step}
   *    .title(String) // optional {@link ExampleScenario_Process#title() title}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link ExampleScenario_Process#extension() extension}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link ExampleScenario_Process#modifierExtension() modifierExtension}
   *    .preConditions(com.fhir.markdown) // optional {@link ExampleScenario_Process#preConditions() preConditions}
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
  @org.immutables.value.Generated(from = "ExampleScenario_Process", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_ID = 0x1L;
    private static final long OPT_BIT_DESCRIPTION = 0x2L;
    private static final long OPT_BIT_POST_CONDITIONS = 0x4L;
    private static final long OPT_BIT_STEP = 0x8L;
    private static final long OPT_BIT_TITLE = 0x10L;
    private static final long OPT_BIT_EXTENSION = 0x20L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x40L;
    private static final long OPT_BIT_PRE_CONDITIONS = 0x80L;
    private long optBits;

    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable com.fhir.markdown description;
    private @javax.annotation.Nullable com.fhir.markdown postConditions;
    private @javax.annotation.Nullable java.util.List<com.fhir.ExampleScenario_Step> step;
    private @javax.annotation.Nullable java.lang.String title;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.markdown preConditions;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ExampleScenario_Process#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(java.lang.String id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = java.util.Objects.requireNonNull(id, "id");
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario_Process#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public final Builder id(java.util.Optional<java.lang.String> id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = id.orElse(null);
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario_Process#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    public final Builder description(com.fhir.markdown description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = java.util.Objects.requireNonNull(description, "description");
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario_Process#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    public final Builder description(java.util.Optional<? extends com.fhir.markdown> description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = description.orElse(null);
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario_Process#postConditions() postConditions} to postConditions.
     * @param postConditions The value for postConditions
     * @return {@code this} builder for chained invocation
     */
    public final Builder postConditions(com.fhir.markdown postConditions) {
      checkNotIsSet(postConditionsIsSet(), "postConditions");
      this.postConditions = java.util.Objects.requireNonNull(postConditions, "postConditions");
      optBits |= OPT_BIT_POST_CONDITIONS;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario_Process#postConditions() postConditions} to postConditions.
     * @param postConditions The value for postConditions
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("postConditions")
    public final Builder postConditions(java.util.Optional<? extends com.fhir.markdown> postConditions) {
      checkNotIsSet(postConditionsIsSet(), "postConditions");
      this.postConditions = postConditions.orElse(null);
      optBits |= OPT_BIT_POST_CONDITIONS;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario_Process#step() step} to step.
     * @param step The value for step
     * @return {@code this} builder for chained invocation
     */
    public final Builder step(java.util.List<com.fhir.ExampleScenario_Step> step) {
      checkNotIsSet(stepIsSet(), "step");
      this.step = java.util.Objects.requireNonNull(step, "step");
      optBits |= OPT_BIT_STEP;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario_Process#step() step} to step.
     * @param step The value for step
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("step")
    public final Builder step(java.util.Optional<? extends java.util.List<com.fhir.ExampleScenario_Step>> step) {
      checkNotIsSet(stepIsSet(), "step");
      this.step = step.orElse(null);
      optBits |= OPT_BIT_STEP;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario_Process#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for chained invocation
     */
    public final Builder title(java.lang.String title) {
      checkNotIsSet(titleIsSet(), "title");
      this.title = java.util.Objects.requireNonNull(title, "title");
      optBits |= OPT_BIT_TITLE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario_Process#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("title")
    public final Builder title(java.util.Optional<java.lang.String> title) {
      checkNotIsSet(titleIsSet(), "title");
      this.title = title.orElse(null);
      optBits |= OPT_BIT_TITLE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario_Process#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    public final Builder extension(java.util.List<com.fhir.Extension> extension) {
      checkNotIsSet(extensionIsSet(), "extension");
      this.extension = java.util.Objects.requireNonNull(extension, "extension");
      optBits |= OPT_BIT_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario_Process#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public final Builder extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension) {
      checkNotIsSet(extensionIsSet(), "extension");
      this.extension = extension.orElse(null);
      optBits |= OPT_BIT_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario_Process#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    public final Builder modifierExtension(java.util.List<com.fhir.Extension> modifierExtension) {
      checkNotIsSet(modifierExtensionIsSet(), "modifierExtension");
      this.modifierExtension = java.util.Objects.requireNonNull(modifierExtension, "modifierExtension");
      optBits |= OPT_BIT_MODIFIER_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario_Process#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public final Builder modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension) {
      checkNotIsSet(modifierExtensionIsSet(), "modifierExtension");
      this.modifierExtension = modifierExtension.orElse(null);
      optBits |= OPT_BIT_MODIFIER_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario_Process#preConditions() preConditions} to preConditions.
     * @param preConditions The value for preConditions
     * @return {@code this} builder for chained invocation
     */
    public final Builder preConditions(com.fhir.markdown preConditions) {
      checkNotIsSet(preConditionsIsSet(), "preConditions");
      this.preConditions = java.util.Objects.requireNonNull(preConditions, "preConditions");
      optBits |= OPT_BIT_PRE_CONDITIONS;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario_Process#preConditions() preConditions} to preConditions.
     * @param preConditions The value for preConditions
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("preConditions")
    public final Builder preConditions(java.util.Optional<? extends com.fhir.markdown> preConditions) {
      checkNotIsSet(preConditionsIsSet(), "preConditions");
      this.preConditions = preConditions.orElse(null);
      optBits |= OPT_BIT_PRE_CONDITIONS;
      return this;
    }

    /**
     * Builds a new {@link ExampleScenario_Process ExampleScenario_Process}.
     * @return An immutable instance of ExampleScenario_Process
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.ExampleScenario_Process build() {
      return new ImmutableExampleScenario_Process(id, description, postConditions, step, title, extension, modifierExtension, preConditions);
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean postConditionsIsSet() {
      return (optBits & OPT_BIT_POST_CONDITIONS) != 0;
    }

    private boolean stepIsSet() {
      return (optBits & OPT_BIT_STEP) != 0;
    }

    private boolean titleIsSet() {
      return (optBits & OPT_BIT_TITLE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean preConditionsIsSet() {
      return (optBits & OPT_BIT_PRE_CONDITIONS) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of ExampleScenario_Process is strict, attribute is already set: ".concat(name));
    }
  }
}
