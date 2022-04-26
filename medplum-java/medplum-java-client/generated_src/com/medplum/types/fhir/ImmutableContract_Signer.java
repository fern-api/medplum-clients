package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link Contract_Signer}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableContract_Signer.builder()}.
 */
@Generated(from = "Contract_Signer", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableContract_Signer implements Contract_Signer {
  private final List<Signature> signature;
  private final Coding type;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable String id;
  private final Reference party;

  private ImmutableContract_Signer(
      List<Signature> signature,
      Coding type,
      @Nullable List<Extension> extension,
      @Nullable List<Extension> modifierExtension,
      @Nullable String id,
      Reference party) {
    this.signature = signature;
    this.type = type;
    this.extension = extension;
    this.modifierExtension = modifierExtension;
    this.id = id;
    this.party = party;
  }

  /**
   * @return The value of the {@code signature} attribute
   */
  @JsonProperty("signature")
  @Override
  public List<Signature> signature() {
    return signature;
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public Coding type() {
    return type;
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
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<String> id() {
    return Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code party} attribute
   */
  @JsonProperty("party")
  @Override
  public Reference party() {
    return party;
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link Contract_Signer#signature() signature}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Signer withSignature(Signature... elements) {
    List<Signature> newValue = createUnmodifiableList(false, createSafeList(Arrays.asList(elements), true, false));
    return new ImmutableContract_Signer(newValue, this.type, this.extension, this.modifierExtension, this.id, this.party);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link Contract_Signer#signature() signature}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of signature elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Signer withSignature(Iterable<? extends Signature> elements) {
    if (this.signature == elements) return this;
    List<Signature> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableContract_Signer(newValue, this.type, this.extension, this.modifierExtension, this.id, this.party);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Contract_Signer#type() type} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for type
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableContract_Signer withType(Coding value) {
    if (this.type == value) return this;
    Coding newValue = Objects.requireNonNull(value, "type");
    return new ImmutableContract_Signer(this.signature, newValue, this.extension, this.modifierExtension, this.id, this.party);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_Signer#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Signer withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableContract_Signer(this.signature, this.type, newValue, this.modifierExtension, this.id, this.party);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_Signer#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_Signer withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableContract_Signer(this.signature, this.type, value, this.modifierExtension, this.id, this.party);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_Signer#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Signer withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableContract_Signer(this.signature, this.type, this.extension, newValue, this.id, this.party);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_Signer#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_Signer withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableContract_Signer(this.signature, this.type, this.extension, value, this.id, this.party);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_Signer#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Signer withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableContract_Signer(this.signature, this.type, this.extension, this.modifierExtension, newValue, this.party);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_Signer#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Signer withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableContract_Signer(this.signature, this.type, this.extension, this.modifierExtension, value, this.party);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Contract_Signer#party() party} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for party
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableContract_Signer withParty(Reference value) {
    if (this.party == value) return this;
    Reference newValue = Objects.requireNonNull(value, "party");
    return new ImmutableContract_Signer(this.signature, this.type, this.extension, this.modifierExtension, this.id, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableContract_Signer} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableContract_Signer
        && equalTo((ImmutableContract_Signer) another);
  }

  private boolean equalTo(ImmutableContract_Signer another) {
    return signature.equals(another.signature)
        && type.equals(another.type)
        && Objects.equals(extension, another.extension)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(id, another.id)
        && party.equals(another.party);
  }

  /**
   * Computes a hash code from attributes: {@code signature}, {@code type}, {@code extension}, {@code modifierExtension}, {@code id}, {@code party}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + signature.hashCode();
    h += (h << 5) + type.hashCode();
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + party.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code Contract_Signer} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Contract_Signer{");
    builder.append("signature=").append(signature);
    builder.append(", ");
    builder.append("type=").append(type);
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    builder.append(", ");
    builder.append("party=").append(party);
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Contract_Signer", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Contract_Signer {
    @Nullable List<Signature> signature = Collections.emptyList();
    @Nullable Coding type;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Reference party;
    @JsonProperty("signature")
    public void setSignature(List<Signature> signature) {
      this.signature = signature;
    }
    @JsonProperty("type")
    public void setType(Coding type) {
      this.type = type;
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
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("party")
    public void setParty(Reference party) {
      this.party = party;
    }
    @Override
    public List<Signature> signature() { throw new UnsupportedOperationException(); }
    @Override
    public Coding type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Reference party() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableContract_Signer fromJson(Json json) {
    ImmutableContract_Signer.Builder builder = ((ImmutableContract_Signer.Builder) ImmutableContract_Signer.builder());
    if (json.signature != null) {
      builder.addAllSignature(json.signature);
    }
    if (json.type != null) {
      builder.type(json.type);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.party != null) {
      builder.party(json.party);
    }
    return (ImmutableContract_Signer) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Contract_Signer} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Contract_Signer instance
   */
  public static Contract_Signer copyOf(Contract_Signer instance) {
    if (instance instanceof ImmutableContract_Signer) {
      return (ImmutableContract_Signer) instance;
    }
    return ((ImmutableContract_Signer.Builder) ImmutableContract_Signer.builder())
        .addAllSignature(instance.signature())
        .type(instance.type())
        .extension(instance.extension())
        .modifierExtension(instance.modifierExtension())
        .id(instance.id())
        .party(instance.party())
        .build();
  }

  /**
   * Creates a builder for {@link Contract_Signer Contract_Signer}.
   * <pre>
   * ImmutableContract_Signer.builder()
   *    .addSignature|addAllSignature(com.medplum.types.fhir.Signature) // {@link Contract_Signer#signature() signature} elements
   *    .type(com.medplum.types.fhir.Coding) // required {@link Contract_Signer#type() type}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link Contract_Signer#extension() extension}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link Contract_Signer#modifierExtension() modifierExtension}
   *    .id(String) // optional {@link Contract_Signer#id() id}
   *    .party(com.medplum.types.fhir.Reference) // required {@link Contract_Signer#party() party}
   *    .build();
   * </pre>
   * @return A new Contract_Signer builder
   */
  public static TypeBuildStage builder() {
    return new ImmutableContract_Signer.Builder();
  }

  /**
   * Builds instances of type {@link Contract_Signer Contract_Signer}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Contract_Signer", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements TypeBuildStage, PartyBuildStage, BuildFinal {
    private static final long INIT_BIT_TYPE = 0x1L;
    private static final long INIT_BIT_PARTY = 0x2L;
    private static final long OPT_BIT_EXTENSION = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x2L;
    private static final long OPT_BIT_ID = 0x4L;
    private long initBits = 0x3L;
    private long optBits;

    private final List<Signature> signature = new ArrayList<Signature>();
    private @Nullable Coding type;
    private @Nullable List<Extension> extension;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable String id;
    private @Nullable Reference party;

    private Builder() {
    }

    /**
     * Adds one element to {@link Contract_Signer#signature() signature} list.
     * @param element A signature element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addSignature(Signature element) {
      this.signature.add(Objects.requireNonNull(element, "signature element"));
      return this;
    }

    /**
     * Adds elements to {@link Contract_Signer#signature() signature} list.
     * @param elements An array of signature elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addSignature(Signature... elements) {
      for (Signature element : elements) {
        this.signature.add(Objects.requireNonNull(element, "signature element"));
      }
      return this;
    }


    /**
     * Adds elements to {@link Contract_Signer#signature() signature} list.
     * @param elements An iterable of signature elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllSignature(Iterable<? extends Signature> elements) {
      for (Signature element : elements) {
        this.signature.add(Objects.requireNonNull(element, "signature element"));
      }
      return this;
    }

    /**
     * Initializes the value for the {@link Contract_Signer#type() type} attribute.
     * @param type The value for type 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("type")
    public final Builder type(Coding type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = Objects.requireNonNull(type, "type");
      initBits &= ~INIT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_Signer#extension() extension} to extension.
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
     * Initializes the optional value {@link Contract_Signer#extension() extension} to extension.
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
     * Initializes the optional value {@link Contract_Signer#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Contract_Signer#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Contract_Signer#id() id} to id.
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
     * Initializes the optional value {@link Contract_Signer#id() id} to id.
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
     * Initializes the value for the {@link Contract_Signer#party() party} attribute.
     * @param party The value for party 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("party")
    public final Builder party(Reference party) {
      checkNotIsSet(partyIsSet(), "party");
      this.party = Objects.requireNonNull(party, "party");
      initBits &= ~INIT_BIT_PARTY;
      return this;
    }

    /**
     * Builds a new {@link Contract_Signer Contract_Signer}.
     * @return An immutable instance of Contract_Signer
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Contract_Signer build() {
      checkRequiredAttributes();
      return new ImmutableContract_Signer(createUnmodifiableList(true, signature), type, extension, modifierExtension, id, party);
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean typeIsSet() {
      return (initBits & INIT_BIT_TYPE) == 0;
    }

    private boolean partyIsSet() {
      return (initBits & INIT_BIT_PARTY) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Contract_Signer is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!typeIsSet()) attributes.add("type");
      if (!partyIsSet()) attributes.add("party");
      return "Cannot build Contract_Signer, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "Contract_Signer", generator = "Immutables")
  public interface TypeBuildStage {
    /**
     * Initializes the value for the {@link Contract_Signer#type() type} attribute.
     * @param type The value for type 
     * @return {@code this} builder for use in a chained invocation
     */
    PartyBuildStage type(Coding type);
  }

  @Generated(from = "Contract_Signer", generator = "Immutables")
  public interface PartyBuildStage {
    /**
     * Initializes the value for the {@link Contract_Signer#party() party} attribute.
     * @param party The value for party 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal party(Reference party);
  }

  @Generated(from = "Contract_Signer", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Adds one element to {@link Contract_Signer#signature() signature} list.
     * @param element A signature element
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addSignature(Signature element);

    /**
     * Adds elements to {@link Contract_Signer#signature() signature} list.
     * @param elements An array of signature elements
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addSignature(Signature... elements);

    /**
     * Adds elements to {@link Contract_Signer#signature() signature} list.
     * @param elements An iterable of signature elements
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addAllSignature(Iterable<? extends Signature> elements);

    /**
     * Initializes the optional value {@link Contract_Signer#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link Contract_Signer#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link Contract_Signer#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link Contract_Signer#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link Contract_Signer#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(String id);

    /**
     * Initializes the optional value {@link Contract_Signer#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<String> id);

    /**
     * Builds a new {@link Contract_Signer Contract_Signer}.
     * @return An immutable instance of Contract_Signer
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Contract_Signer build();
  }

  private static <T> List<T> createSafeList(Iterable<? extends T> iterable, boolean checkNulls, boolean skipNulls) {
    ArrayList<T> list;
    if (iterable instanceof Collection<?>) {
      int size = ((Collection<?>) iterable).size();
      if (size == 0) return Collections.emptyList();
      list = new ArrayList<>();
    } else {
      list = new ArrayList<>();
    }
    for (T element : iterable) {
      if (skipNulls && element == null) continue;
      if (checkNulls) Objects.requireNonNull(element, "element");
      list.add(element);
    }
    return list;
  }

  private static <T> List<T> createUnmodifiableList(boolean clone, List<T> list) {
    switch(list.size()) {
    case 0: return Collections.emptyList();
    case 1: return Collections.singletonList(list.get(0));
    default:
      if (clone) {
        return Collections.unmodifiableList(new ArrayList<>(list));
      } else {
        if (list instanceof ArrayList<?>) {
          ((ArrayList<?>) list).trimToSize();
        }
        return Collections.unmodifiableList(list);
      }
    }
  }
}
