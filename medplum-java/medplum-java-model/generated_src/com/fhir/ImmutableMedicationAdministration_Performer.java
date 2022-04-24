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
 * Immutable implementation of {@link MedicationAdministration_Performer}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMedicationAdministration_Performer.builder()}.
 */
@Generated(from = "MedicationAdministration_Performer", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableMedicationAdministration_Performer
    implements MedicationAdministration_Performer {
  private final @Nullable String id;
  private final @Nullable CodeableConcept function;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<Extension> modifierExtension;
  private final Reference actor;

  private ImmutableMedicationAdministration_Performer(
      @Nullable String id,
      @Nullable CodeableConcept function,
      @Nullable List<Extension> extension,
      @Nullable List<Extension> modifierExtension,
      Reference actor) {
    this.id = id;
    this.function = function;
    this.extension = extension;
    this.modifierExtension = modifierExtension;
    this.actor = actor;
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
   * @return The value of the {@code function} attribute
   */
  @JsonProperty("function")
  @Override
  public Optional<CodeableConcept> function() {
    return Optional.ofNullable(function);
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
   * @return The value of the {@code actor} attribute
   */
  @JsonProperty("actor")
  @Override
  public Reference actor() {
    return actor;
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationAdministration_Performer#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationAdministration_Performer withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableMedicationAdministration_Performer(newValue, this.function, this.extension, this.modifierExtension, this.actor);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationAdministration_Performer#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationAdministration_Performer withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableMedicationAdministration_Performer(value, this.function, this.extension, this.modifierExtension, this.actor);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationAdministration_Performer#function() function} attribute.
   * @param value The value for function
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationAdministration_Performer withFunction(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "function");
    if (this.function == newValue) return this;
    return new ImmutableMedicationAdministration_Performer(this.id, newValue, this.extension, this.modifierExtension, this.actor);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationAdministration_Performer#function() function} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for function
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationAdministration_Performer withFunction(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.function == value) return this;
    return new ImmutableMedicationAdministration_Performer(this.id, value, this.extension, this.modifierExtension, this.actor);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationAdministration_Performer#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationAdministration_Performer withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableMedicationAdministration_Performer(this.id, this.function, newValue, this.modifierExtension, this.actor);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationAdministration_Performer#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationAdministration_Performer withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableMedicationAdministration_Performer(this.id, this.function, value, this.modifierExtension, this.actor);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationAdministration_Performer#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationAdministration_Performer withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableMedicationAdministration_Performer(this.id, this.function, this.extension, newValue, this.actor);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationAdministration_Performer#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationAdministration_Performer withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableMedicationAdministration_Performer(this.id, this.function, this.extension, value, this.actor);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MedicationAdministration_Performer#actor() actor} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for actor
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMedicationAdministration_Performer withActor(Reference value) {
    if (this.actor == value) return this;
    Reference newValue = Objects.requireNonNull(value, "actor");
    return new ImmutableMedicationAdministration_Performer(this.id, this.function, this.extension, this.modifierExtension, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMedicationAdministration_Performer} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMedicationAdministration_Performer
        && equalTo((ImmutableMedicationAdministration_Performer) another);
  }

  private boolean equalTo(ImmutableMedicationAdministration_Performer another) {
    return Objects.equals(id, another.id)
        && Objects.equals(function, another.function)
        && Objects.equals(extension, another.extension)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && actor.equals(another.actor);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code function}, {@code extension}, {@code modifierExtension}, {@code actor}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(function);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + actor.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code MedicationAdministration_Performer} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("MedicationAdministration_Performer{");
    if (id != null) {
      builder.append("id=").append(id);
    }
    if (function != null) {
      if (builder.length() > 35) builder.append(", ");
      builder.append("function=").append(function);
    }
    if (extension != null) {
      if (builder.length() > 35) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (modifierExtension != null) {
      if (builder.length() > 35) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (builder.length() > 35) builder.append(", ");
    builder.append("actor=").append(actor);
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "MedicationAdministration_Performer", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements MedicationAdministration_Performer {
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<CodeableConcept> function = Optional.empty();
    boolean functionIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Reference actor;
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("function")
    public void setFunction(Optional<CodeableConcept> function) {
      this.function = function;
      this.functionIsSet = true;
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
    @JsonProperty("actor")
    public void setActor(Reference actor) {
      this.actor = actor;
    }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> function() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Reference actor() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableMedicationAdministration_Performer fromJson(Json json) {
    ImmutableMedicationAdministration_Performer.Builder builder = ((ImmutableMedicationAdministration_Performer.Builder) ImmutableMedicationAdministration_Performer.builder());
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.functionIsSet) {
      builder.function(json.function);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.actor != null) {
      builder.actor(json.actor);
    }
    return (ImmutableMedicationAdministration_Performer) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link MedicationAdministration_Performer} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable MedicationAdministration_Performer instance
   */
  public static MedicationAdministration_Performer copyOf(MedicationAdministration_Performer instance) {
    if (instance instanceof ImmutableMedicationAdministration_Performer) {
      return (ImmutableMedicationAdministration_Performer) instance;
    }
    return ((ImmutableMedicationAdministration_Performer.Builder) ImmutableMedicationAdministration_Performer.builder())
        .id(instance.id())
        .function(instance.function())
        .extension(instance.extension())
        .modifierExtension(instance.modifierExtension())
        .actor(instance.actor())
        .build();
  }

  /**
   * Creates a builder for {@link MedicationAdministration_Performer MedicationAdministration_Performer}.
   * <pre>
   * ImmutableMedicationAdministration_Performer.builder()
   *    .id(String) // optional {@link MedicationAdministration_Performer#id() id}
   *    .function(com.fhir.CodeableConcept) // optional {@link MedicationAdministration_Performer#function() function}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link MedicationAdministration_Performer#extension() extension}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link MedicationAdministration_Performer#modifierExtension() modifierExtension}
   *    .actor(com.fhir.Reference) // required {@link MedicationAdministration_Performer#actor() actor}
   *    .build();
   * </pre>
   * @return A new MedicationAdministration_Performer builder
   */
  public static ActorBuildStage builder() {
    return new ImmutableMedicationAdministration_Performer.Builder();
  }

  /**
   * Builds instances of type {@link MedicationAdministration_Performer MedicationAdministration_Performer}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "MedicationAdministration_Performer", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ActorBuildStage, BuildFinal {
    private static final long INIT_BIT_ACTOR = 0x1L;
    private static final long OPT_BIT_ID = 0x1L;
    private static final long OPT_BIT_FUNCTION = 0x2L;
    private static final long OPT_BIT_EXTENSION = 0x4L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x8L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable String id;
    private @Nullable CodeableConcept function;
    private @Nullable List<Extension> extension;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Reference actor;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link MedicationAdministration_Performer#id() id} to id.
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
     * Initializes the optional value {@link MedicationAdministration_Performer#id() id} to id.
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
     * Initializes the optional value {@link MedicationAdministration_Performer#function() function} to function.
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
     * Initializes the optional value {@link MedicationAdministration_Performer#function() function} to function.
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
     * Initializes the optional value {@link MedicationAdministration_Performer#extension() extension} to extension.
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
     * Initializes the optional value {@link MedicationAdministration_Performer#extension() extension} to extension.
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
     * Initializes the optional value {@link MedicationAdministration_Performer#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MedicationAdministration_Performer#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the value for the {@link MedicationAdministration_Performer#actor() actor} attribute.
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
     * Builds a new {@link MedicationAdministration_Performer MedicationAdministration_Performer}.
     * @return An immutable instance of MedicationAdministration_Performer
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public MedicationAdministration_Performer build() {
      checkRequiredAttributes();
      return new ImmutableMedicationAdministration_Performer(id, function, extension, modifierExtension, actor);
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean functionIsSet() {
      return (optBits & OPT_BIT_FUNCTION) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean actorIsSet() {
      return (initBits & INIT_BIT_ACTOR) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of MedicationAdministration_Performer is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!actorIsSet()) attributes.add("actor");
      return "Cannot build MedicationAdministration_Performer, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "MedicationAdministration_Performer", generator = "Immutables")
  public interface ActorBuildStage {
    /**
     * Initializes the value for the {@link MedicationAdministration_Performer#actor() actor} attribute.
     * @param actor The value for actor 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal actor(Reference actor);
  }

  @Generated(from = "MedicationAdministration_Performer", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link MedicationAdministration_Performer#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(String id);

    /**
     * Initializes the optional value {@link MedicationAdministration_Performer#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<String> id);

    /**
     * Initializes the optional value {@link MedicationAdministration_Performer#function() function} to function.
     * @param function The value for function
     * @return {@code this} builder for chained invocation
     */
    BuildFinal function(CodeableConcept function);

    /**
     * Initializes the optional value {@link MedicationAdministration_Performer#function() function} to function.
     * @param function The value for function
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal function(Optional<? extends CodeableConcept> function);

    /**
     * Initializes the optional value {@link MedicationAdministration_Performer#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link MedicationAdministration_Performer#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link MedicationAdministration_Performer#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link MedicationAdministration_Performer#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Builds a new {@link MedicationAdministration_Performer MedicationAdministration_Performer}.
     * @return An immutable instance of MedicationAdministration_Performer
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    MedicationAdministration_Performer build();
  }
}