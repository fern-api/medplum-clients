package com.fhir.types.fhir;

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
 * Immutable implementation of {@link Consent_Actor}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableConsent_Actor.builder()}.
 */
@Generated(from = "Consent_Actor", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableConsent_Actor implements Consent_Actor {
  private final Reference reference;
  private final @Nullable List<Extension> modifierExtension;
  private final CodeableConcept role;
  private final @Nullable List<Extension> extension;
  private final @Nullable String id;

  private ImmutableConsent_Actor(
      Reference reference,
      @Nullable List<Extension> modifierExtension,
      CodeableConcept role,
      @Nullable List<Extension> extension,
      @Nullable String id) {
    this.reference = reference;
    this.modifierExtension = modifierExtension;
    this.role = role;
    this.extension = extension;
    this.id = id;
  }

  /**
   * @return The value of the {@code reference} attribute
   */
  @JsonProperty("reference")
  @Override
  public Reference reference() {
    return reference;
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
   * @return The value of the {@code role} attribute
   */
  @JsonProperty("role")
  @Override
  public CodeableConcept role() {
    return role;
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
   * Copy the current immutable object by setting a value for the {@link Consent_Actor#reference() reference} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for reference
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableConsent_Actor withReference(Reference value) {
    if (this.reference == value) return this;
    Reference newValue = Objects.requireNonNull(value, "reference");
    return new ImmutableConsent_Actor(newValue, this.modifierExtension, this.role, this.extension, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Consent_Actor#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConsent_Actor withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableConsent_Actor(this.reference, newValue, this.role, this.extension, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Consent_Actor#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConsent_Actor withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableConsent_Actor(this.reference, value, this.role, this.extension, this.id);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Consent_Actor#role() role} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for role
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableConsent_Actor withRole(CodeableConcept value) {
    if (this.role == value) return this;
    CodeableConcept newValue = Objects.requireNonNull(value, "role");
    return new ImmutableConsent_Actor(this.reference, this.modifierExtension, newValue, this.extension, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Consent_Actor#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConsent_Actor withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableConsent_Actor(this.reference, this.modifierExtension, this.role, newValue, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Consent_Actor#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConsent_Actor withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableConsent_Actor(this.reference, this.modifierExtension, this.role, value, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Consent_Actor#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConsent_Actor withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableConsent_Actor(this.reference, this.modifierExtension, this.role, this.extension, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Consent_Actor#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConsent_Actor withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableConsent_Actor(this.reference, this.modifierExtension, this.role, this.extension, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableConsent_Actor} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableConsent_Actor
        && equalTo((ImmutableConsent_Actor) another);
  }

  private boolean equalTo(ImmutableConsent_Actor another) {
    return reference.equals(another.reference)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && role.equals(another.role)
        && Objects.equals(extension, another.extension)
        && Objects.equals(id, another.id);
  }

  /**
   * Computes a hash code from attributes: {@code reference}, {@code modifierExtension}, {@code role}, {@code extension}, {@code id}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + reference.hashCode();
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + role.hashCode();
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(id);
    return h;
  }

  /**
   * Prints the immutable value {@code Consent_Actor} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Consent_Actor{");
    builder.append("reference=").append(reference);
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    builder.append(", ");
    builder.append("role=").append(role);
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
  @Generated(from = "Consent_Actor", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Consent_Actor {
    @Nullable Reference reference;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable CodeableConcept role;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @JsonProperty("reference")
    public void setReference(Reference reference) {
      this.reference = reference;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("role")
    public void setRole(CodeableConcept role) {
      this.role = role;
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
    public Reference reference() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public CodeableConcept role() { throw new UnsupportedOperationException(); }
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
  static ImmutableConsent_Actor fromJson(Json json) {
    ImmutableConsent_Actor.Builder builder = ((ImmutableConsent_Actor.Builder) ImmutableConsent_Actor.builder());
    if (json.reference != null) {
      builder.reference(json.reference);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.role != null) {
      builder.role(json.role);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    return (ImmutableConsent_Actor) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Consent_Actor} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Consent_Actor instance
   */
  public static Consent_Actor copyOf(Consent_Actor instance) {
    if (instance instanceof ImmutableConsent_Actor) {
      return (ImmutableConsent_Actor) instance;
    }
    return ((ImmutableConsent_Actor.Builder) ImmutableConsent_Actor.builder())
        .reference(instance.reference())
        .modifierExtension(instance.modifierExtension())
        .role(instance.role())
        .extension(instance.extension())
        .id(instance.id())
        .build();
  }

  /**
   * Creates a builder for {@link Consent_Actor Consent_Actor}.
   * <pre>
   * ImmutableConsent_Actor.builder()
   *    .reference(com.fhir.types.fhir.Reference) // required {@link Consent_Actor#reference() reference}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Consent_Actor#modifierExtension() modifierExtension}
   *    .role(com.fhir.types.fhir.CodeableConcept) // required {@link Consent_Actor#role() role}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Consent_Actor#extension() extension}
   *    .id(String) // optional {@link Consent_Actor#id() id}
   *    .build();
   * </pre>
   * @return A new Consent_Actor builder
   */
  public static ReferenceBuildStage builder() {
    return new ImmutableConsent_Actor.Builder();
  }

  /**
   * Builds instances of type {@link Consent_Actor Consent_Actor}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Consent_Actor", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ReferenceBuildStage, RoleBuildStage, BuildFinal {
    private static final long INIT_BIT_REFERENCE = 0x1L;
    private static final long INIT_BIT_ROLE = 0x2L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x2L;
    private static final long OPT_BIT_ID = 0x4L;
    private long initBits = 0x3L;
    private long optBits;

    private @Nullable Reference reference;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable CodeableConcept role;
    private @Nullable List<Extension> extension;
    private @Nullable String id;

    private Builder() {
    }

    /**
     * Initializes the value for the {@link Consent_Actor#reference() reference} attribute.
     * @param reference The value for reference 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("reference")
    public final Builder reference(Reference reference) {
      checkNotIsSet(referenceIsSet(), "reference");
      this.reference = Objects.requireNonNull(reference, "reference");
      initBits &= ~INIT_BIT_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Consent_Actor#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Consent_Actor#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the value for the {@link Consent_Actor#role() role} attribute.
     * @param role The value for role 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("role")
    public final Builder role(CodeableConcept role) {
      checkNotIsSet(roleIsSet(), "role");
      this.role = Objects.requireNonNull(role, "role");
      initBits &= ~INIT_BIT_ROLE;
      return this;
    }

    /**
     * Initializes the optional value {@link Consent_Actor#extension() extension} to extension.
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
     * Initializes the optional value {@link Consent_Actor#extension() extension} to extension.
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
     * Initializes the optional value {@link Consent_Actor#id() id} to id.
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
     * Initializes the optional value {@link Consent_Actor#id() id} to id.
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
     * Builds a new {@link Consent_Actor Consent_Actor}.
     * @return An immutable instance of Consent_Actor
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Consent_Actor build() {
      checkRequiredAttributes();
      return new ImmutableConsent_Actor(reference, modifierExtension, role, extension, id);
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean referenceIsSet() {
      return (initBits & INIT_BIT_REFERENCE) == 0;
    }

    private boolean roleIsSet() {
      return (initBits & INIT_BIT_ROLE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Consent_Actor is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!referenceIsSet()) attributes.add("reference");
      if (!roleIsSet()) attributes.add("role");
      return "Cannot build Consent_Actor, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "Consent_Actor", generator = "Immutables")
  public interface ReferenceBuildStage {
    /**
     * Initializes the value for the {@link Consent_Actor#reference() reference} attribute.
     * @param reference The value for reference 
     * @return {@code this} builder for use in a chained invocation
     */
    RoleBuildStage reference(Reference reference);
  }

  @Generated(from = "Consent_Actor", generator = "Immutables")
  public interface RoleBuildStage {
    /**
     * Initializes the value for the {@link Consent_Actor#role() role} attribute.
     * @param role The value for role 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal role(CodeableConcept role);
  }

  @Generated(from = "Consent_Actor", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Consent_Actor#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link Consent_Actor#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link Consent_Actor#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link Consent_Actor#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link Consent_Actor#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(String id);

    /**
     * Initializes the optional value {@link Consent_Actor#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<String> id);

    /**
     * Builds a new {@link Consent_Actor Consent_Actor}.
     * @return An immutable instance of Consent_Actor
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Consent_Actor build();
  }
}
