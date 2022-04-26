package com.medplum.types.fhir;

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
 * Immutable implementation of {@link ImagingStudy_Performer}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableImagingStudy_Performer.builder()}.
 */
@Generated(from = "ImagingStudy_Performer", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableImagingStudy_Performer implements ImagingStudy_Performer {
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable CodeableConcept function;
  private final Reference actor;
  private final @Nullable List<Extension> extension;
  private final @Nullable String id;

  private ImmutableImagingStudy_Performer(
      @Nullable List<Extension> modifierExtension,
      @Nullable CodeableConcept function,
      Reference actor,
      @Nullable List<Extension> extension,
      @Nullable String id) {
    this.modifierExtension = modifierExtension;
    this.function = function;
    this.actor = actor;
    this.extension = extension;
    this.id = id;
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
   * @return The value of the {@code function} attribute
   */
  @JsonProperty("function")
  @Override
  public Optional<CodeableConcept> function() {
    return Optional.ofNullable(function);
  }

  /**
   * @return The value of the {@code actor} attribute
   */
  @JsonProperty("actor")
  @Override
  public Reference actor() {
    return actor;
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImagingStudy_Performer#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImagingStudy_Performer withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableImagingStudy_Performer(newValue, this.function, this.actor, this.extension, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImagingStudy_Performer#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImagingStudy_Performer withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableImagingStudy_Performer(value, this.function, this.actor, this.extension, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImagingStudy_Performer#function() function} attribute.
   * @param value The value for function
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImagingStudy_Performer withFunction(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "function");
    if (this.function == newValue) return this;
    return new ImmutableImagingStudy_Performer(this.modifierExtension, newValue, this.actor, this.extension, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImagingStudy_Performer#function() function} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for function
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImagingStudy_Performer withFunction(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.function == value) return this;
    return new ImmutableImagingStudy_Performer(this.modifierExtension, value, this.actor, this.extension, this.id);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ImagingStudy_Performer#actor() actor} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for actor
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableImagingStudy_Performer withActor(Reference value) {
    if (this.actor == value) return this;
    Reference newValue = Objects.requireNonNull(value, "actor");
    return new ImmutableImagingStudy_Performer(this.modifierExtension, this.function, newValue, this.extension, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImagingStudy_Performer#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImagingStudy_Performer withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableImagingStudy_Performer(this.modifierExtension, this.function, this.actor, newValue, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImagingStudy_Performer#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImagingStudy_Performer withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableImagingStudy_Performer(this.modifierExtension, this.function, this.actor, value, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImagingStudy_Performer#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImagingStudy_Performer withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableImagingStudy_Performer(this.modifierExtension, this.function, this.actor, this.extension, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImagingStudy_Performer#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImagingStudy_Performer withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableImagingStudy_Performer(this.modifierExtension, this.function, this.actor, this.extension, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableImagingStudy_Performer} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableImagingStudy_Performer
        && equalTo((ImmutableImagingStudy_Performer) another);
  }

  private boolean equalTo(ImmutableImagingStudy_Performer another) {
    return Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(function, another.function)
        && actor.equals(another.actor)
        && Objects.equals(extension, another.extension)
        && Objects.equals(id, another.id);
  }

  /**
   * Computes a hash code from attributes: {@code modifierExtension}, {@code function}, {@code actor}, {@code extension}, {@code id}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(function);
    h += (h << 5) + actor.hashCode();
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(id);
    return h;
  }

  /**
   * Prints the immutable value {@code ImagingStudy_Performer} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("ImagingStudy_Performer{");
    if (modifierExtension != null) {
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (function != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("function=").append(function);
    }
    if (builder.length() > 23) builder.append(", ");
    builder.append("actor=").append(actor);
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "ImagingStudy_Performer", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ImagingStudy_Performer {
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<CodeableConcept> function = Optional.empty();
    boolean functionIsSet;
    @Nullable Reference actor;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("function")
    public void setFunction(Optional<CodeableConcept> function) {
      this.function = function;
      this.functionIsSet = true;
    }
    @JsonProperty("actor")
    public void setActor(Reference actor) {
      this.actor = actor;
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
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> function() { throw new UnsupportedOperationException(); }
    @Override
    public Reference actor() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
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
  static ImmutableImagingStudy_Performer fromJson(Json json) {
    ImmutableImagingStudy_Performer.Builder builder = ((ImmutableImagingStudy_Performer.Builder) ImmutableImagingStudy_Performer.builder());
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.functionIsSet) {
      builder.function(json.function);
    }
    if (json.actor != null) {
      builder.actor(json.actor);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    return (ImmutableImagingStudy_Performer) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ImagingStudy_Performer} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ImagingStudy_Performer instance
   */
  public static ImagingStudy_Performer copyOf(ImagingStudy_Performer instance) {
    if (instance instanceof ImmutableImagingStudy_Performer) {
      return (ImmutableImagingStudy_Performer) instance;
    }
    return ((ImmutableImagingStudy_Performer.Builder) ImmutableImagingStudy_Performer.builder())
        .modifierExtension(instance.modifierExtension())
        .function(instance.function())
        .actor(instance.actor())
        .extension(instance.extension())
        .id(instance.id())
        .build();
  }

  /**
   * Creates a builder for {@link ImagingStudy_Performer ImagingStudy_Performer}.
   * <pre>
   * ImmutableImagingStudy_Performer.builder()
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link ImagingStudy_Performer#modifierExtension() modifierExtension}
   *    .function(com.medplum.types.fhir.CodeableConcept) // optional {@link ImagingStudy_Performer#function() function}
   *    .actor(com.medplum.types.fhir.Reference) // required {@link ImagingStudy_Performer#actor() actor}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link ImagingStudy_Performer#extension() extension}
   *    .id(String) // optional {@link ImagingStudy_Performer#id() id}
   *    .build();
   * </pre>
   * @return A new ImagingStudy_Performer builder
   */
  public static ActorBuildStage builder() {
    return new ImmutableImagingStudy_Performer.Builder();
  }

  /**
   * Builds instances of type {@link ImagingStudy_Performer ImagingStudy_Performer}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "ImagingStudy_Performer", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ActorBuildStage, BuildFinal {
    private static final long INIT_BIT_ACTOR = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1L;
    private static final long OPT_BIT_FUNCTION = 0x2L;
    private static final long OPT_BIT_EXTENSION = 0x4L;
    private static final long OPT_BIT_ID = 0x8L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable List<Extension> modifierExtension;
    private @Nullable CodeableConcept function;
    private @Nullable Reference actor;
    private @Nullable List<Extension> extension;
    private @Nullable String id;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ImagingStudy_Performer#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ImagingStudy_Performer#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ImagingStudy_Performer#function() function} to function.
     * @param function The value for function
     * @return {@code this} builder for chained invocation
     */
    public final Builder function(CodeableConcept function) {
      checkNotIsSet(functionIsSet(), "function");
      this.function = Objects.requireNonNull(function, "function");
      optBits |= OPT_BIT_FUNCTION;
      return this;
    }

    /**
     * Initializes the optional value {@link ImagingStudy_Performer#function() function} to function.
     * @param function The value for function
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("function")
    public final Builder function(Optional<? extends CodeableConcept> function) {
      checkNotIsSet(functionIsSet(), "function");
      this.function = function.orElse(null);
      optBits |= OPT_BIT_FUNCTION;
      return this;
    }

    /**
     * Initializes the value for the {@link ImagingStudy_Performer#actor() actor} attribute.
     * @param actor The value for actor 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("actor")
    public final Builder actor(Reference actor) {
      checkNotIsSet(actorIsSet(), "actor");
      this.actor = Objects.requireNonNull(actor, "actor");
      initBits &= ~INIT_BIT_ACTOR;
      return this;
    }

    /**
     * Initializes the optional value {@link ImagingStudy_Performer#extension() extension} to extension.
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
     * Initializes the optional value {@link ImagingStudy_Performer#extension() extension} to extension.
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
     * Initializes the optional value {@link ImagingStudy_Performer#id() id} to id.
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
     * Initializes the optional value {@link ImagingStudy_Performer#id() id} to id.
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
     * Builds a new {@link ImagingStudy_Performer ImagingStudy_Performer}.
     * @return An immutable instance of ImagingStudy_Performer
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImagingStudy_Performer build() {
      checkRequiredAttributes();
      return new ImmutableImagingStudy_Performer(modifierExtension, function, actor, extension, id);
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean functionIsSet() {
      return (optBits & OPT_BIT_FUNCTION) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean actorIsSet() {
      return (initBits & INIT_BIT_ACTOR) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of ImagingStudy_Performer is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!actorIsSet()) attributes.add("actor");
      return "Cannot build ImagingStudy_Performer, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "ImagingStudy_Performer", generator = "Immutables")
  public interface ActorBuildStage {
    /**
     * Initializes the value for the {@link ImagingStudy_Performer#actor() actor} attribute.
     * @param actor The value for actor 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal actor(Reference actor);
  }

  @Generated(from = "ImagingStudy_Performer", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link ImagingStudy_Performer#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link ImagingStudy_Performer#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link ImagingStudy_Performer#function() function} to function.
     * @param function The value for function
     * @return {@code this} builder for chained invocation
     */
    BuildFinal function(CodeableConcept function);

    /**
     * Initializes the optional value {@link ImagingStudy_Performer#function() function} to function.
     * @param function The value for function
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal function(Optional<? extends CodeableConcept> function);

    /**
     * Initializes the optional value {@link ImagingStudy_Performer#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link ImagingStudy_Performer#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link ImagingStudy_Performer#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(String id);

    /**
     * Initializes the optional value {@link ImagingStudy_Performer#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<String> id);

    /**
     * Builds a new {@link ImagingStudy_Performer ImagingStudy_Performer}.
     * @return An immutable instance of ImagingStudy_Performer
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    ImagingStudy_Performer build();
  }
}
