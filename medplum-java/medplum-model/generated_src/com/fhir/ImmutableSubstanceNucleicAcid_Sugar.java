package com.fhir;

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
 * Immutable implementation of {@link SubstanceNucleicAcid_Sugar}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSubstanceNucleicAcid_Sugar.builder()}.
 */
@Generated(from = "SubstanceNucleicAcid_Sugar", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableSubstanceNucleicAcid_Sugar implements SubstanceNucleicAcid_Sugar {
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable List<Extension> extension;
  private final @Nullable String name;
  private final @Nullable Identifier identifier;
  private final @Nullable String residueSite;
  private final @Nullable String id;

  private ImmutableSubstanceNucleicAcid_Sugar(
      @Nullable List<Extension> modifierExtension,
      @Nullable List<Extension> extension,
      @Nullable String name,
      @Nullable Identifier identifier,
      @Nullable String residueSite,
      @Nullable String id) {
    this.modifierExtension = modifierExtension;
    this.extension = extension;
    this.name = name;
    this.identifier = identifier;
    this.residueSite = residueSite;
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
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code name} attribute
   */
  @JsonProperty("name")
  @Override
  public Optional<String> name() {
    return Optional.ofNullable(name);
  }

  /**
   * @return The value of the {@code identifier} attribute
   */
  @JsonProperty("identifier")
  @Override
  public Optional<Identifier> identifier() {
    return Optional.ofNullable(identifier);
  }

  /**
   * @return The value of the {@code residueSite} attribute
   */
  @JsonProperty("residueSite")
  @Override
  public Optional<String> residueSite() {
    return Optional.ofNullable(residueSite);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceNucleicAcid_Sugar#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceNucleicAcid_Sugar withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableSubstanceNucleicAcid_Sugar(newValue, this.extension, this.name, this.identifier, this.residueSite, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceNucleicAcid_Sugar#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceNucleicAcid_Sugar withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableSubstanceNucleicAcid_Sugar(value, this.extension, this.name, this.identifier, this.residueSite, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceNucleicAcid_Sugar#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceNucleicAcid_Sugar withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableSubstanceNucleicAcid_Sugar(this.modifierExtension, newValue, this.name, this.identifier, this.residueSite, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceNucleicAcid_Sugar#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceNucleicAcid_Sugar withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableSubstanceNucleicAcid_Sugar(this.modifierExtension, value, this.name, this.identifier, this.residueSite, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceNucleicAcid_Sugar#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceNucleicAcid_Sugar withName(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "name");
    if (Objects.equals(this.name, newValue)) return this;
    return new ImmutableSubstanceNucleicAcid_Sugar(this.modifierExtension, this.extension, newValue, this.identifier, this.residueSite, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceNucleicAcid_Sugar#name() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceNucleicAcid_Sugar withName(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.name, value)) return this;
    return new ImmutableSubstanceNucleicAcid_Sugar(this.modifierExtension, this.extension, value, this.identifier, this.residueSite, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceNucleicAcid_Sugar#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceNucleicAcid_Sugar withIdentifier(Identifier value) {
    @Nullable Identifier newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableSubstanceNucleicAcid_Sugar(this.modifierExtension, this.extension, this.name, newValue, this.residueSite, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceNucleicAcid_Sugar#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceNucleicAcid_Sugar withIdentifier(Optional<? extends Identifier> optional) {
    @Nullable Identifier value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableSubstanceNucleicAcid_Sugar(this.modifierExtension, this.extension, this.name, value, this.residueSite, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceNucleicAcid_Sugar#residueSite() residueSite} attribute.
   * @param value The value for residueSite
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceNucleicAcid_Sugar withResidueSite(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "residueSite");
    if (Objects.equals(this.residueSite, newValue)) return this;
    return new ImmutableSubstanceNucleicAcid_Sugar(this.modifierExtension, this.extension, this.name, this.identifier, newValue, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceNucleicAcid_Sugar#residueSite() residueSite} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for residueSite
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceNucleicAcid_Sugar withResidueSite(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.residueSite, value)) return this;
    return new ImmutableSubstanceNucleicAcid_Sugar(this.modifierExtension, this.extension, this.name, this.identifier, value, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceNucleicAcid_Sugar#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceNucleicAcid_Sugar withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableSubstanceNucleicAcid_Sugar(this.modifierExtension, this.extension, this.name, this.identifier, this.residueSite, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceNucleicAcid_Sugar#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceNucleicAcid_Sugar withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableSubstanceNucleicAcid_Sugar(this.modifierExtension, this.extension, this.name, this.identifier, this.residueSite, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSubstanceNucleicAcid_Sugar} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSubstanceNucleicAcid_Sugar
        && equalTo((ImmutableSubstanceNucleicAcid_Sugar) another);
  }

  private boolean equalTo(ImmutableSubstanceNucleicAcid_Sugar another) {
    return Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(extension, another.extension)
        && Objects.equals(name, another.name)
        && Objects.equals(identifier, another.identifier)
        && Objects.equals(residueSite, another.residueSite)
        && Objects.equals(id, another.id);
  }

  /**
   * Computes a hash code from attributes: {@code modifierExtension}, {@code extension}, {@code name}, {@code identifier}, {@code residueSite}, {@code id}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(name);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(residueSite);
    h += (h << 5) + Objects.hashCode(id);
    return h;
  }

  /**
   * Prints the immutable value {@code SubstanceNucleicAcid_Sugar} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("SubstanceNucleicAcid_Sugar{");
    if (modifierExtension != null) {
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (extension != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (name != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("name=").append(name);
    }
    if (identifier != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (residueSite != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("residueSite=").append(residueSite);
    }
    if (id != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("id=").append(id);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "SubstanceNucleicAcid_Sugar", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements SubstanceNucleicAcid_Sugar {
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<String> name = Optional.empty();
    boolean nameIsSet;
    @Nullable Optional<Identifier> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<String> residueSite = Optional.empty();
    boolean residueSiteIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("name")
    public void setName(Optional<String> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<Identifier> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("residueSite")
    public void setResidueSite(Optional<String> residueSite) {
      this.residueSite = residueSite;
      this.residueSiteIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> name() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Identifier> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> residueSite() { throw new UnsupportedOperationException(); }
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
  static ImmutableSubstanceNucleicAcid_Sugar fromJson(Json json) {
    ImmutableSubstanceNucleicAcid_Sugar.Builder builder = ImmutableSubstanceNucleicAcid_Sugar.builder();
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.residueSiteIsSet) {
      builder.residueSite(json.residueSite);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    return (ImmutableSubstanceNucleicAcid_Sugar) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link SubstanceNucleicAcid_Sugar} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable SubstanceNucleicAcid_Sugar instance
   */
  public static SubstanceNucleicAcid_Sugar copyOf(SubstanceNucleicAcid_Sugar instance) {
    if (instance instanceof ImmutableSubstanceNucleicAcid_Sugar) {
      return (ImmutableSubstanceNucleicAcid_Sugar) instance;
    }
    return ImmutableSubstanceNucleicAcid_Sugar.builder()
        .modifierExtension(instance.modifierExtension())
        .extension(instance.extension())
        .name(instance.name())
        .identifier(instance.identifier())
        .residueSite(instance.residueSite())
        .id(instance.id())
        .build();
  }

  /**
   * Creates a builder for {@link SubstanceNucleicAcid_Sugar SubstanceNucleicAcid_Sugar}.
   * <pre>
   * ImmutableSubstanceNucleicAcid_Sugar.builder()
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link SubstanceNucleicAcid_Sugar#modifierExtension() modifierExtension}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link SubstanceNucleicAcid_Sugar#extension() extension}
   *    .name(String) // optional {@link SubstanceNucleicAcid_Sugar#name() name}
   *    .identifier(com.fhir.Identifier) // optional {@link SubstanceNucleicAcid_Sugar#identifier() identifier}
   *    .residueSite(String) // optional {@link SubstanceNucleicAcid_Sugar#residueSite() residueSite}
   *    .id(String) // optional {@link SubstanceNucleicAcid_Sugar#id() id}
   *    .build();
   * </pre>
   * @return A new SubstanceNucleicAcid_Sugar builder
   */
  public static ImmutableSubstanceNucleicAcid_Sugar.Builder builder() {
    return new ImmutableSubstanceNucleicAcid_Sugar.Builder();
  }

  /**
   * Builds instances of type {@link SubstanceNucleicAcid_Sugar SubstanceNucleicAcid_Sugar}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "SubstanceNucleicAcid_Sugar", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x2L;
    private static final long OPT_BIT_NAME = 0x4L;
    private static final long OPT_BIT_IDENTIFIER = 0x8L;
    private static final long OPT_BIT_RESIDUE_SITE = 0x10L;
    private static final long OPT_BIT_ID = 0x20L;
    private long optBits;

    private @Nullable List<Extension> modifierExtension;
    private @Nullable List<Extension> extension;
    private @Nullable String name;
    private @Nullable Identifier identifier;
    private @Nullable String residueSite;
    private @Nullable String id;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link SubstanceNucleicAcid_Sugar#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link SubstanceNucleicAcid_Sugar#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link SubstanceNucleicAcid_Sugar#extension() extension} to extension.
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
     * Initializes the optional value {@link SubstanceNucleicAcid_Sugar#extension() extension} to extension.
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
     * Initializes the optional value {@link SubstanceNucleicAcid_Sugar#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    public final Builder name(String name) {
      checkNotIsSet(nameIsSet(), "name");
      this.name = Objects.requireNonNull(name, "name");
      optBits |= OPT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceNucleicAcid_Sugar#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("name")
    public final Builder name(Optional<String> name) {
      checkNotIsSet(nameIsSet(), "name");
      this.name = name.orElse(null);
      optBits |= OPT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceNucleicAcid_Sugar#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    public final Builder identifier(Identifier identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = Objects.requireNonNull(identifier, "identifier");
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceNucleicAcid_Sugar#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("identifier")
    public final Builder identifier(Optional<? extends Identifier> identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = identifier.orElse(null);
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceNucleicAcid_Sugar#residueSite() residueSite} to residueSite.
     * @param residueSite The value for residueSite
     * @return {@code this} builder for chained invocation
     */
    public final Builder residueSite(String residueSite) {
      checkNotIsSet(residueSiteIsSet(), "residueSite");
      this.residueSite = Objects.requireNonNull(residueSite, "residueSite");
      optBits |= OPT_BIT_RESIDUE_SITE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceNucleicAcid_Sugar#residueSite() residueSite} to residueSite.
     * @param residueSite The value for residueSite
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("residueSite")
    public final Builder residueSite(Optional<String> residueSite) {
      checkNotIsSet(residueSiteIsSet(), "residueSite");
      this.residueSite = residueSite.orElse(null);
      optBits |= OPT_BIT_RESIDUE_SITE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceNucleicAcid_Sugar#id() id} to id.
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
     * Initializes the optional value {@link SubstanceNucleicAcid_Sugar#id() id} to id.
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
     * Builds a new {@link SubstanceNucleicAcid_Sugar SubstanceNucleicAcid_Sugar}.
     * @return An immutable instance of SubstanceNucleicAcid_Sugar
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public SubstanceNucleicAcid_Sugar build() {
      return new ImmutableSubstanceNucleicAcid_Sugar(modifierExtension, extension, name, identifier, residueSite, id);
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean residueSiteIsSet() {
      return (optBits & OPT_BIT_RESIDUE_SITE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of SubstanceNucleicAcid_Sugar is strict, attribute is already set: ".concat(name));
    }
  }
}
