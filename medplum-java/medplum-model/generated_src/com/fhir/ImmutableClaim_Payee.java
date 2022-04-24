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
 * Immutable implementation of {@link Claim_Payee}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableClaim_Payee.builder()}.
 */
@Generated(from = "Claim_Payee", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableClaim_Payee implements Claim_Payee {
  private final @Nullable List<Extension> extension;
  private final @Nullable String id;
  private final @Nullable List<Extension> modifierExtension;
  private final CodeableConcept type;
  private final @Nullable Reference party;

  private ImmutableClaim_Payee(
      @Nullable List<Extension> extension,
      @Nullable String id,
      @Nullable List<Extension> modifierExtension,
      CodeableConcept type,
      @Nullable Reference party) {
    this.extension = extension;
    this.id = id;
    this.modifierExtension = modifierExtension;
    this.type = type;
    this.party = party;
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public CodeableConcept type() {
    return type;
  }

  /**
   * @return The value of the {@code party} attribute
   */
  @JsonProperty("party")
  @Override
  public Optional<Reference> party() {
    return Optional.ofNullable(party);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim_Payee#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_Payee withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableClaim_Payee(newValue, this.id, this.modifierExtension, this.type, this.party);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim_Payee#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim_Payee withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableClaim_Payee(value, this.id, this.modifierExtension, this.type, this.party);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim_Payee#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_Payee withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableClaim_Payee(this.extension, newValue, this.modifierExtension, this.type, this.party);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim_Payee#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_Payee withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableClaim_Payee(this.extension, value, this.modifierExtension, this.type, this.party);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim_Payee#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_Payee withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableClaim_Payee(this.extension, this.id, newValue, this.type, this.party);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim_Payee#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim_Payee withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableClaim_Payee(this.extension, this.id, value, this.type, this.party);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Claim_Payee#type() type} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for type
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableClaim_Payee withType(CodeableConcept value) {
    if (this.type == value) return this;
    CodeableConcept newValue = Objects.requireNonNull(value, "type");
    return new ImmutableClaim_Payee(this.extension, this.id, this.modifierExtension, newValue, this.party);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim_Payee#party() party} attribute.
   * @param value The value for party
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_Payee withParty(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "party");
    if (this.party == newValue) return this;
    return new ImmutableClaim_Payee(this.extension, this.id, this.modifierExtension, this.type, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim_Payee#party() party} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for party
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim_Payee withParty(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.party == value) return this;
    return new ImmutableClaim_Payee(this.extension, this.id, this.modifierExtension, this.type, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableClaim_Payee} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableClaim_Payee
        && equalTo((ImmutableClaim_Payee) another);
  }

  private boolean equalTo(ImmutableClaim_Payee another) {
    return Objects.equals(extension, another.extension)
        && Objects.equals(id, another.id)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && type.equals(another.type)
        && Objects.equals(party, another.party);
  }

  /**
   * Computes a hash code from attributes: {@code extension}, {@code id}, {@code modifierExtension}, {@code type}, {@code party}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + type.hashCode();
    h += (h << 5) + Objects.hashCode(party);
    return h;
  }

  /**
   * Prints the immutable value {@code Claim_Payee} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Claim_Payee{");
    if (extension != null) {
      builder.append("extension=").append(extension);
    }
    if (id != null) {
      if (builder.length() > 12) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (modifierExtension != null) {
      if (builder.length() > 12) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (builder.length() > 12) builder.append(", ");
    builder.append("type=").append(type);
    if (party != null) {
      builder.append(", ");
      builder.append("party=").append(party);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Claim_Payee", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Claim_Payee {
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable CodeableConcept type;
    @Nullable Optional<Reference> party = Optional.empty();
    boolean partyIsSet;
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
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("type")
    public void setType(CodeableConcept type) {
      this.type = type;
    }
    @JsonProperty("party")
    public void setParty(Optional<Reference> party) {
      this.party = party;
      this.partyIsSet = true;
    }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public CodeableConcept type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> party() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableClaim_Payee fromJson(Json json) {
    ImmutableClaim_Payee.Builder builder = ((ImmutableClaim_Payee.Builder) ImmutableClaim_Payee.builder());
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.type != null) {
      builder.type(json.type);
    }
    if (json.partyIsSet) {
      builder.party(json.party);
    }
    return (ImmutableClaim_Payee) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Claim_Payee} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Claim_Payee instance
   */
  public static Claim_Payee copyOf(Claim_Payee instance) {
    if (instance instanceof ImmutableClaim_Payee) {
      return (ImmutableClaim_Payee) instance;
    }
    return ((ImmutableClaim_Payee.Builder) ImmutableClaim_Payee.builder())
        .extension(instance.extension())
        .id(instance.id())
        .modifierExtension(instance.modifierExtension())
        .type(instance.type())
        .party(instance.party())
        .build();
  }

  /**
   * Creates a builder for {@link Claim_Payee Claim_Payee}.
   * <pre>
   * ImmutableClaim_Payee.builder()
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Claim_Payee#extension() extension}
   *    .id(String) // optional {@link Claim_Payee#id() id}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Claim_Payee#modifierExtension() modifierExtension}
   *    .type(com.fhir.CodeableConcept) // required {@link Claim_Payee#type() type}
   *    .party(com.fhir.Reference) // optional {@link Claim_Payee#party() party}
   *    .build();
   * </pre>
   * @return A new Claim_Payee builder
   */
  public static TypeBuildStage builder() {
    return new ImmutableClaim_Payee.Builder();
  }

  /**
   * Builds instances of type {@link Claim_Payee Claim_Payee}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Claim_Payee", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements TypeBuildStage, BuildFinal {
    private static final long INIT_BIT_TYPE = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x1L;
    private static final long OPT_BIT_ID = 0x2L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x4L;
    private static final long OPT_BIT_PARTY = 0x8L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable List<Extension> extension;
    private @Nullable String id;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable CodeableConcept type;
    private @Nullable Reference party;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Claim_Payee#extension() extension} to extension.
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
     * Initializes the optional value {@link Claim_Payee#extension() extension} to extension.
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
     * Initializes the optional value {@link Claim_Payee#id() id} to id.
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
     * Initializes the optional value {@link Claim_Payee#id() id} to id.
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
     * Initializes the optional value {@link Claim_Payee#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Claim_Payee#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the value for the {@link Claim_Payee#type() type} attribute.
     * @param type The value for type 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("type")
    public final Builder type(CodeableConcept type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = Objects.requireNonNull(type, "type");
      initBits &= ~INIT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim_Payee#party() party} to party.
     * @param party The value for party
     * @return {@code this} builder for chained invocation
     */
    public final Builder party(Reference party) {
      checkNotIsSet(partyIsSet(), "party");
      this.party = Objects.requireNonNull(party, "party");
      optBits |= OPT_BIT_PARTY;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim_Payee#party() party} to party.
     * @param party The value for party
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("party")
    public final Builder party(Optional<? extends Reference> party) {
      checkNotIsSet(partyIsSet(), "party");
      this.party = party.orElse(null);
      optBits |= OPT_BIT_PARTY;
      return this;
    }

    /**
     * Builds a new {@link Claim_Payee Claim_Payee}.
     * @return An immutable instance of Claim_Payee
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Claim_Payee build() {
      checkRequiredAttributes();
      return new ImmutableClaim_Payee(extension, id, modifierExtension, type, party);
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean partyIsSet() {
      return (optBits & OPT_BIT_PARTY) != 0;
    }

    private boolean typeIsSet() {
      return (initBits & INIT_BIT_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Claim_Payee is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!typeIsSet()) attributes.add("type");
      return "Cannot build Claim_Payee, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "Claim_Payee", generator = "Immutables")
  public interface TypeBuildStage {
    /**
     * Initializes the value for the {@link Claim_Payee#type() type} attribute.
     * @param type The value for type 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal type(CodeableConcept type);
  }

  @Generated(from = "Claim_Payee", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Claim_Payee#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link Claim_Payee#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link Claim_Payee#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(String id);

    /**
     * Initializes the optional value {@link Claim_Payee#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<String> id);

    /**
     * Initializes the optional value {@link Claim_Payee#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link Claim_Payee#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link Claim_Payee#party() party} to party.
     * @param party The value for party
     * @return {@code this} builder for chained invocation
     */
    BuildFinal party(Reference party);

    /**
     * Initializes the optional value {@link Claim_Payee#party() party} to party.
     * @param party The value for party
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal party(Optional<? extends Reference> party);

    /**
     * Builds a new {@link Claim_Payee Claim_Payee}.
     * @return An immutable instance of Claim_Payee
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Claim_Payee build();
  }
}
