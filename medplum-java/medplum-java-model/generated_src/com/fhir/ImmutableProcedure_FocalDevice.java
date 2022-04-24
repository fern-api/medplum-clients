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
 * Immutable implementation of {@link Procedure_FocalDevice}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableProcedure_FocalDevice.builder()}.
 */
@Generated(from = "Procedure_FocalDevice", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableProcedure_FocalDevice implements Procedure_FocalDevice {
  private final Reference manipulated;
  private final @Nullable String id;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable CodeableConcept action;

  private ImmutableProcedure_FocalDevice(
      Reference manipulated,
      @Nullable String id,
      @Nullable List<Extension> extension,
      @Nullable List<Extension> modifierExtension,
      @Nullable CodeableConcept action) {
    this.manipulated = manipulated;
    this.id = id;
    this.extension = extension;
    this.modifierExtension = modifierExtension;
    this.action = action;
  }

  /**
   * @return The value of the {@code manipulated} attribute
   */
  @JsonProperty("manipulated")
  @Override
  public Reference manipulated() {
    return manipulated;
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
   * @return The value of the {@code action} attribute
   */
  @JsonProperty("action")
  @Override
  public Optional<CodeableConcept> action() {
    return Optional.ofNullable(action);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Procedure_FocalDevice#manipulated() manipulated} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for manipulated
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableProcedure_FocalDevice withManipulated(Reference value) {
    if (this.manipulated == value) return this;
    Reference newValue = Objects.requireNonNull(value, "manipulated");
    return new ImmutableProcedure_FocalDevice(newValue, this.id, this.extension, this.modifierExtension, this.action);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Procedure_FocalDevice#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProcedure_FocalDevice withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableProcedure_FocalDevice(this.manipulated, newValue, this.extension, this.modifierExtension, this.action);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Procedure_FocalDevice#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProcedure_FocalDevice withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableProcedure_FocalDevice(this.manipulated, value, this.extension, this.modifierExtension, this.action);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Procedure_FocalDevice#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProcedure_FocalDevice withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableProcedure_FocalDevice(this.manipulated, this.id, newValue, this.modifierExtension, this.action);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Procedure_FocalDevice#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProcedure_FocalDevice withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableProcedure_FocalDevice(this.manipulated, this.id, value, this.modifierExtension, this.action);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Procedure_FocalDevice#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProcedure_FocalDevice withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableProcedure_FocalDevice(this.manipulated, this.id, this.extension, newValue, this.action);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Procedure_FocalDevice#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProcedure_FocalDevice withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableProcedure_FocalDevice(this.manipulated, this.id, this.extension, value, this.action);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Procedure_FocalDevice#action() action} attribute.
   * @param value The value for action
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProcedure_FocalDevice withAction(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "action");
    if (this.action == newValue) return this;
    return new ImmutableProcedure_FocalDevice(this.manipulated, this.id, this.extension, this.modifierExtension, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Procedure_FocalDevice#action() action} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for action
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProcedure_FocalDevice withAction(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.action == value) return this;
    return new ImmutableProcedure_FocalDevice(this.manipulated, this.id, this.extension, this.modifierExtension, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableProcedure_FocalDevice} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableProcedure_FocalDevice
        && equalTo((ImmutableProcedure_FocalDevice) another);
  }

  private boolean equalTo(ImmutableProcedure_FocalDevice another) {
    return manipulated.equals(another.manipulated)
        && Objects.equals(id, another.id)
        && Objects.equals(extension, another.extension)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(action, another.action);
  }

  /**
   * Computes a hash code from attributes: {@code manipulated}, {@code id}, {@code extension}, {@code modifierExtension}, {@code action}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + manipulated.hashCode();
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(action);
    return h;
  }

  /**
   * Prints the immutable value {@code Procedure_FocalDevice} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Procedure_FocalDevice{");
    builder.append("manipulated=").append(manipulated);
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (action != null) {
      builder.append(", ");
      builder.append("action=").append(action);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Procedure_FocalDevice", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Procedure_FocalDevice {
    @Nullable Reference manipulated;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<CodeableConcept> action = Optional.empty();
    boolean actionIsSet;
    @JsonProperty("manipulated")
    public void setManipulated(Reference manipulated) {
      this.manipulated = manipulated;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
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
    @JsonProperty("action")
    public void setAction(Optional<CodeableConcept> action) {
      this.action = action;
      this.actionIsSet = true;
    }
    @Override
    public Reference manipulated() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> action() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableProcedure_FocalDevice fromJson(Json json) {
    ImmutableProcedure_FocalDevice.Builder builder = ((ImmutableProcedure_FocalDevice.Builder) ImmutableProcedure_FocalDevice.builder());
    if (json.manipulated != null) {
      builder.manipulated(json.manipulated);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.actionIsSet) {
      builder.action(json.action);
    }
    return (ImmutableProcedure_FocalDevice) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Procedure_FocalDevice} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Procedure_FocalDevice instance
   */
  public static Procedure_FocalDevice copyOf(Procedure_FocalDevice instance) {
    if (instance instanceof ImmutableProcedure_FocalDevice) {
      return (ImmutableProcedure_FocalDevice) instance;
    }
    return ((ImmutableProcedure_FocalDevice.Builder) ImmutableProcedure_FocalDevice.builder())
        .manipulated(instance.manipulated())
        .id(instance.id())
        .extension(instance.extension())
        .modifierExtension(instance.modifierExtension())
        .action(instance.action())
        .build();
  }

  /**
   * Creates a builder for {@link Procedure_FocalDevice Procedure_FocalDevice}.
   * <pre>
   * ImmutableProcedure_FocalDevice.builder()
   *    .manipulated(com.fhir.Reference) // required {@link Procedure_FocalDevice#manipulated() manipulated}
   *    .id(String) // optional {@link Procedure_FocalDevice#id() id}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Procedure_FocalDevice#extension() extension}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Procedure_FocalDevice#modifierExtension() modifierExtension}
   *    .action(com.fhir.CodeableConcept) // optional {@link Procedure_FocalDevice#action() action}
   *    .build();
   * </pre>
   * @return A new Procedure_FocalDevice builder
   */
  public static ManipulatedBuildStage builder() {
    return new ImmutableProcedure_FocalDevice.Builder();
  }

  /**
   * Builds instances of type {@link Procedure_FocalDevice Procedure_FocalDevice}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Procedure_FocalDevice", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ManipulatedBuildStage, BuildFinal {
    private static final long INIT_BIT_MANIPULATED = 0x1L;
    private static final long OPT_BIT_ID = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x2L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x4L;
    private static final long OPT_BIT_ACTION = 0x8L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable Reference manipulated;
    private @Nullable String id;
    private @Nullable List<Extension> extension;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable CodeableConcept action;

    private Builder() {
    }

    /**
     * Initializes the value for the {@link Procedure_FocalDevice#manipulated() manipulated} attribute.
     * @param manipulated The value for manipulated 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("manipulated")
    public final Builder manipulated(Reference manipulated) {
      checkNotIsSet(manipulatedIsSet(), "manipulated");
      this.manipulated = Objects.requireNonNull(manipulated, "manipulated");
      initBits &= ~INIT_BIT_MANIPULATED;
      return this;
    }

    /**
     * Initializes the optional value {@link Procedure_FocalDevice#id() id} to id.
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
     * Initializes the optional value {@link Procedure_FocalDevice#id() id} to id.
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
     * Initializes the optional value {@link Procedure_FocalDevice#extension() extension} to extension.
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
     * Initializes the optional value {@link Procedure_FocalDevice#extension() extension} to extension.
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
     * Initializes the optional value {@link Procedure_FocalDevice#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Procedure_FocalDevice#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Procedure_FocalDevice#action() action} to action.
     * @param action The value for action
     * @return {@code this} builder for chained invocation
     */
    public final Builder action(CodeableConcept action) {
      checkNotIsSet(actionIsSet(), "action");
      this.action = Objects.requireNonNull(action, "action");
      optBits |= OPT_BIT_ACTION;
      return this;
    }

    /**
     * Initializes the optional value {@link Procedure_FocalDevice#action() action} to action.
     * @param action The value for action
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("action")
    public final Builder action(Optional<? extends CodeableConcept> action) {
      checkNotIsSet(actionIsSet(), "action");
      this.action = action.orElse(null);
      optBits |= OPT_BIT_ACTION;
      return this;
    }

    /**
     * Builds a new {@link Procedure_FocalDevice Procedure_FocalDevice}.
     * @return An immutable instance of Procedure_FocalDevice
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Procedure_FocalDevice build() {
      checkRequiredAttributes();
      return new ImmutableProcedure_FocalDevice(manipulated, id, extension, modifierExtension, action);
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean actionIsSet() {
      return (optBits & OPT_BIT_ACTION) != 0;
    }

    private boolean manipulatedIsSet() {
      return (initBits & INIT_BIT_MANIPULATED) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Procedure_FocalDevice is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!manipulatedIsSet()) attributes.add("manipulated");
      return "Cannot build Procedure_FocalDevice, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "Procedure_FocalDevice", generator = "Immutables")
  public interface ManipulatedBuildStage {
    /**
     * Initializes the value for the {@link Procedure_FocalDevice#manipulated() manipulated} attribute.
     * @param manipulated The value for manipulated 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal manipulated(Reference manipulated);
  }

  @Generated(from = "Procedure_FocalDevice", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Procedure_FocalDevice#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(String id);

    /**
     * Initializes the optional value {@link Procedure_FocalDevice#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<String> id);

    /**
     * Initializes the optional value {@link Procedure_FocalDevice#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link Procedure_FocalDevice#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link Procedure_FocalDevice#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link Procedure_FocalDevice#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link Procedure_FocalDevice#action() action} to action.
     * @param action The value for action
     * @return {@code this} builder for chained invocation
     */
    BuildFinal action(CodeableConcept action);

    /**
     * Initializes the optional value {@link Procedure_FocalDevice#action() action} to action.
     * @param action The value for action
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal action(Optional<? extends CodeableConcept> action);

    /**
     * Builds a new {@link Procedure_FocalDevice Procedure_FocalDevice}.
     * @return An immutable instance of Procedure_FocalDevice
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Procedure_FocalDevice build();
  }
}
