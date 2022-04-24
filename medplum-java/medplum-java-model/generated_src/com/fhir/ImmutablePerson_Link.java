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
 * Immutable implementation of {@link Person_Link}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutablePerson_Link.builder()}.
 */
@Generated(from = "Person_Link", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutablePerson_Link implements Person_Link {
  private final @Nullable List<Extension> extension;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Person_linkAssurance assurance;
  private final @Nullable String id;
  private final Reference target;

  private ImmutablePerson_Link(
      @Nullable List<Extension> extension,
      @Nullable List<Extension> modifierExtension,
      @Nullable Person_linkAssurance assurance,
      @Nullable String id,
      Reference target) {
    this.extension = extension;
    this.modifierExtension = modifierExtension;
    this.assurance = assurance;
    this.id = id;
    this.target = target;
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
   * @return The value of the {@code assurance} attribute
   */
  @JsonProperty("assurance")
  @Override
  public Optional<Person_linkAssurance> assurance() {
    return Optional.ofNullable(assurance);
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
   * @return The value of the {@code target} attribute
   */
  @JsonProperty("target")
  @Override
  public Reference target() {
    return target;
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Person_Link#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePerson_Link withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutablePerson_Link(newValue, this.modifierExtension, this.assurance, this.id, this.target);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Person_Link#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePerson_Link withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutablePerson_Link(value, this.modifierExtension, this.assurance, this.id, this.target);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Person_Link#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePerson_Link withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutablePerson_Link(this.extension, newValue, this.assurance, this.id, this.target);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Person_Link#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePerson_Link withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutablePerson_Link(this.extension, value, this.assurance, this.id, this.target);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Person_Link#assurance() assurance} attribute.
   * @param value The value for assurance
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePerson_Link withAssurance(Person_linkAssurance value) {
    @Nullable Person_linkAssurance newValue = Objects.requireNonNull(value, "assurance");
    if (this.assurance == newValue) return this;
    return new ImmutablePerson_Link(this.extension, this.modifierExtension, newValue, this.id, this.target);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Person_Link#assurance() assurance} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for assurance
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePerson_Link withAssurance(Optional<? extends Person_linkAssurance> optional) {
    @Nullable Person_linkAssurance value = optional.orElse(null);
    if (this.assurance == value) return this;
    return new ImmutablePerson_Link(this.extension, this.modifierExtension, value, this.id, this.target);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Person_Link#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePerson_Link withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutablePerson_Link(this.extension, this.modifierExtension, this.assurance, newValue, this.target);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Person_Link#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePerson_Link withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutablePerson_Link(this.extension, this.modifierExtension, this.assurance, value, this.target);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Person_Link#target() target} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for target
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePerson_Link withTarget(Reference value) {
    if (this.target == value) return this;
    Reference newValue = Objects.requireNonNull(value, "target");
    return new ImmutablePerson_Link(this.extension, this.modifierExtension, this.assurance, this.id, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutablePerson_Link} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePerson_Link
        && equalTo((ImmutablePerson_Link) another);
  }

  private boolean equalTo(ImmutablePerson_Link another) {
    return Objects.equals(extension, another.extension)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(assurance, another.assurance)
        && Objects.equals(id, another.id)
        && target.equals(another.target);
  }

  /**
   * Computes a hash code from attributes: {@code extension}, {@code modifierExtension}, {@code assurance}, {@code id}, {@code target}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(assurance);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + target.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code Person_Link} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Person_Link{");
    if (extension != null) {
      builder.append("extension=").append(extension);
    }
    if (modifierExtension != null) {
      if (builder.length() > 12) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (assurance != null) {
      if (builder.length() > 12) builder.append(", ");
      builder.append("assurance=").append(assurance);
    }
    if (id != null) {
      if (builder.length() > 12) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (builder.length() > 12) builder.append(", ");
    builder.append("target=").append(target);
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Person_Link", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Person_Link {
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Person_linkAssurance> assurance = Optional.empty();
    boolean assuranceIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Reference target;
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
    @JsonProperty("assurance")
    public void setAssurance(Optional<Person_linkAssurance> assurance) {
      this.assurance = assurance;
      this.assuranceIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("target")
    public void setTarget(Reference target) {
      this.target = target;
    }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Person_linkAssurance> assurance() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Reference target() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutablePerson_Link fromJson(Json json) {
    ImmutablePerson_Link.Builder builder = ((ImmutablePerson_Link.Builder) ImmutablePerson_Link.builder());
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.assuranceIsSet) {
      builder.assurance(json.assurance);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.target != null) {
      builder.target(json.target);
    }
    return (ImmutablePerson_Link) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Person_Link} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Person_Link instance
   */
  public static Person_Link copyOf(Person_Link instance) {
    if (instance instanceof ImmutablePerson_Link) {
      return (ImmutablePerson_Link) instance;
    }
    return ((ImmutablePerson_Link.Builder) ImmutablePerson_Link.builder())
        .extension(instance.extension())
        .modifierExtension(instance.modifierExtension())
        .assurance(instance.assurance())
        .id(instance.id())
        .target(instance.target())
        .build();
  }

  /**
   * Creates a builder for {@link Person_Link Person_Link}.
   * <pre>
   * ImmutablePerson_Link.builder()
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Person_Link#extension() extension}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Person_Link#modifierExtension() modifierExtension}
   *    .assurance(com.fhir.Person_linkAssurance) // optional {@link Person_Link#assurance() assurance}
   *    .id(String) // optional {@link Person_Link#id() id}
   *    .target(com.fhir.Reference) // required {@link Person_Link#target() target}
   *    .build();
   * </pre>
   * @return A new Person_Link builder
   */
  public static TargetBuildStage builder() {
    return new ImmutablePerson_Link.Builder();
  }

  /**
   * Builds instances of type {@link Person_Link Person_Link}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Person_Link", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements TargetBuildStage, BuildFinal {
    private static final long INIT_BIT_TARGET = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x2L;
    private static final long OPT_BIT_ASSURANCE = 0x4L;
    private static final long OPT_BIT_ID = 0x8L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable List<Extension> extension;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Person_linkAssurance assurance;
    private @Nullable String id;
    private @Nullable Reference target;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Person_Link#extension() extension} to extension.
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
     * Initializes the optional value {@link Person_Link#extension() extension} to extension.
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
     * Initializes the optional value {@link Person_Link#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Person_Link#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Person_Link#assurance() assurance} to assurance.
     * @param assurance The value for assurance
     * @return {@code this} builder for chained invocation
     */
    public final Builder assurance(Person_linkAssurance assurance) {
      checkNotIsSet(assuranceIsSet(), "assurance");
      this.assurance = Objects.requireNonNull(assurance, "assurance");
      optBits |= OPT_BIT_ASSURANCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Person_Link#assurance() assurance} to assurance.
     * @param assurance The value for assurance
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("assurance")
    public final Builder assurance(Optional<? extends Person_linkAssurance> assurance) {
      checkNotIsSet(assuranceIsSet(), "assurance");
      this.assurance = assurance.orElse(null);
      optBits |= OPT_BIT_ASSURANCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Person_Link#id() id} to id.
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
     * Initializes the optional value {@link Person_Link#id() id} to id.
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
     * Initializes the value for the {@link Person_Link#target() target} attribute.
     * @param target The value for target 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("target")
    public final Builder target(Reference target) {
      checkNotIsSet(targetIsSet(), "target");
      this.target = Objects.requireNonNull(target, "target");
      initBits &= ~INIT_BIT_TARGET;
      return this;
    }

    /**
     * Builds a new {@link Person_Link Person_Link}.
     * @return An immutable instance of Person_Link
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Person_Link build() {
      checkRequiredAttributes();
      return new ImmutablePerson_Link(extension, modifierExtension, assurance, id, target);
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean assuranceIsSet() {
      return (optBits & OPT_BIT_ASSURANCE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean targetIsSet() {
      return (initBits & INIT_BIT_TARGET) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Person_Link is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!targetIsSet()) attributes.add("target");
      return "Cannot build Person_Link, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "Person_Link", generator = "Immutables")
  public interface TargetBuildStage {
    /**
     * Initializes the value for the {@link Person_Link#target() target} attribute.
     * @param target The value for target 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal target(Reference target);
  }

  @Generated(from = "Person_Link", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Person_Link#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link Person_Link#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link Person_Link#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link Person_Link#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link Person_Link#assurance() assurance} to assurance.
     * @param assurance The value for assurance
     * @return {@code this} builder for chained invocation
     */
    BuildFinal assurance(Person_linkAssurance assurance);

    /**
     * Initializes the optional value {@link Person_Link#assurance() assurance} to assurance.
     * @param assurance The value for assurance
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal assurance(Optional<? extends Person_linkAssurance> assurance);

    /**
     * Initializes the optional value {@link Person_Link#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(String id);

    /**
     * Initializes the optional value {@link Person_Link#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<String> id);

    /**
     * Builds a new {@link Person_Link Person_Link}.
     * @return An immutable instance of Person_Link
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Person_Link build();
  }
}